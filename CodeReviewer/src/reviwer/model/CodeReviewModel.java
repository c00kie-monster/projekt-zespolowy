package reviwer.model;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CodeReviewModel {
	public static final String SOURCE_FILE = ".c";
	private String projectName;
	private Collection<File> projectFiles;
	
	public String getProjectName() {
		return projectName;
	}
	
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Collection<File> getProjectFiles() {
		return projectFiles;
	}
	
	/**
	 * Metoda przeszukuje zadany folder i wybiera z niego pliki nadające się do oceny.
	 */
	public void setProjectFiles(File directory) {
		if (directory.isDirectory())
			this.projectFiles = this.getFilesFromDirectory(directory);
	}	

	/**
	 * Metoda slużąca do oceny całego projektu. 
	 * Przed wywołaniem należy ustawić pliki do oceny.
	 */
	public Collection<Review> reviewProject(){
		List<Review> reviews = new ArrayList<>();
		for (File f : projectFiles) {
			Review r = new Review();
			r.setFilename(f.getName());
			r.setRating("90%");
			reviews.add(r);
		}
		return reviews;
	}
	
	/**
	 * Metoda służąca do oceny pojedynczego pliku.
	 */
	public Review reviewFile(File file) {
		/*
		 * TODO
		 */
		return new Review();
	}
	
	/**
	 * Metoda zwraca kolekcję plików źródłowych z danego folderu i z folderów w nim zagnieżdżonych.
	 * @param directory - przeszukiwany folder.
	 * @return kolekcja plików źródłowych znajdujących się w danym folderze.
	 */
	public Collection<File> getFilesFromDirectory(final File directory) {
		List<File> files = new ArrayList<>();
		for (File f : directory.listFiles()) {
			if (f.isDirectory()) {
				Collection<File> extractedFiles = getFilesFromDirectory(f);
				files.addAll(extractedFiles);
			} else if(isSourceFile(f.getAbsolutePath())){
				files.add(f);
			}
		}
		return files;
	}
	
	/**
	 * Metoda zwraca informacje czy zadany plik jest plikiem źródłowym
	 * @param path ścieżka bezwględna do pliku
	 * @return <code>true</code> - w przypadku gdy plik jest plikiem źródłowym; <br>
	 * <code>false</code> - w przeciwnym wypadku.
	 */
	public boolean isSourceFile(final String path) {
		if (path == null)
			return false;
		if (isDirectory(path))
			return false;
		
		String type = path.substring(path.lastIndexOf('.'));
		return CodeReviewModel.SOURCE_FILE.equals(type);
	}
	
	/**
	 * Metoda zwraca informacje czy zadany plik jest folderem.
	 * @param path ścieżka bezwględna do pliku
	 * @return <code>true</code> - w przypadku gdy jest to folder; <br>
	 * <code>false</code> - w przeciwnym wypadku.
	 */
	public boolean isDirectory(final String path) {
		if (path == null)
			return false;
		return path.lastIndexOf('.') == -1;
	}
}