package reviwer.model;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Klasa reprezentuje ocenę kodu zawartego w pliku.
 */
public class Review {
	/**
	 * Nazwa pliku.
	 */
	private String filename;
	
	/**
	 * Ocena.
	 */
	private String rating;
	
	/**
	 * Kolekcja błędów
	 */
	private Collection<Warning> warnings;
	
	/**
	 * Konstruktor;
	 */
	public Review() {
		warnings = new ArrayList<>();
	}
	
	/**
	 * Zwraca nazwę pliku poddanego ocenie. 
	 */
	public String getFilename() {
		return filename;
	}
	
	/**
	 * Ustawia nazwę pliku poddanego ocenie. 
	 */
	public void setFilename(String filename) {
		this.filename = filename;
	}
	
	/**
	 * Pobiera kolekcję błędów optymalizacyjnych. 
	 */
	public Collection<Warning> getWarnings() {
		return warnings;
	}
	
	/**
	 * Ustawia kolekcję błędów optymalizacyjnych. 
	 */
	public void setWarnings(Collection<Warning> errors) {
		this.warnings = errors;
	}
	
	/**
	 * Pobiera ocenę pliku. 
	 */
	public String getRating() {
		return rating;
	}
	
	/**
	 * Ustawia ocenę pliku. 
	 */
	public void setRating(String rating) {
		this.rating = rating;
	}
}