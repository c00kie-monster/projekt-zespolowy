package reviewer.handlers;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

import reviewer.views.SampleView;
import reviwer.model.CodeReviewModel;
import reviwer.model.Review;

/**
 * Główna klasa odpowiadająca za działanie wtyczki. 
 */
public class MainHandler extends AbstractHandler {
	/**
	 * Ścieżka do projektu.
	 */
	private String workspacePath;
	
	/**
	 * Model.
	 */
	private CodeReviewModel model;
	
	/**
	 * Konstruktor.
	 */
	public MainHandler() {
		workspacePath = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
		model = new CodeReviewModel();
	}
	
	/**
	 * Główna metoda odpowiedzialna za działanie wtyczki.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		ISelection selection = page.getSelection();
		File selectedFile = this.getSelectedFile(selection);
		Collection<Review> reviews;
		
		if (selectedFile == null) {
			MessageDialog.openError(window.getShell(), "Unsupported file", "Code Review Tool doesn't support selected file.");
			return null;
		}
		
		if (selectedFile.isDirectory()) {
			model.setProjectFiles(selectedFile);
			reviews = model.reviewProject();
		} else {
			Review review = model.reviewFile(selectedFile);
			reviews = new ArrayList<>(1);
			reviews.add(review);
		}

		try {
			SampleView view = (SampleView) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView(SampleView.ID);
			view.setReviewResult(workspacePath, reviews);
		} catch (PartInitException e) {
			MessageDialog.openError(window.getShell(), "View error", "Cannot show the score in Review View.");
			e.printStackTrace();
		}
		
		return null;
	}
	
	/**
	 * Metoda zwraca plik na podstawie zaznaczonego elementu w eksploratorze.
	 * W przypadku gdy plik nie jest folderem, lub plikiem źródłowym zwrócony zostanie null;
	 * @param selection - element zaznaczony w eksploratorze.
	 * @return plik w przypadku folderu lub pliku wykonwalnego; null w każdym innym wypadku.
	 */
	private File getSelectedFile(final ISelection selection) {
		String path = "";
		
		if (selection == null || (path = getSelectedItemPath(selection)) == null || !model.isDirectory(path) || model.isSourceFile(path))
			return null;
		else
			return new File(path);
	}
	
	/**
	 * @param selection - wybrany element w oknie eksploratora.
	 * @return zwraca bezwględną scieżkę do wybranego elementu. 
	 */
	private String getSelectedItemPath(final ISelection selection) {
		if (!(selection instanceof IStructuredSelection))
			return null;
		
		IStructuredSelection ss = (IStructuredSelection) selection;
		Object element = ss.getFirstElement();

		if (!(element instanceof IAdaptable))
			return null;

		IAdaptable adaptable = (IAdaptable) element;
		Object adapter = adaptable.getAdapter(IResource.class);
		return  workspacePath + ((IResource) adapter).getFullPath().toString();
	}
}
