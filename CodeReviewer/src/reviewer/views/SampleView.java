package reviewer.views;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.DrillDownAdapter;
import org.eclipse.ui.part.ViewPart;

import reviwer.model.CodeReviewModel;
import reviwer.model.Review;
import reviwer.model.Warning;


public class SampleView extends ViewPart {

	/**
	 * ID widoku.
	 */
	public static final String ID = "test.views.SampleView";

	private TreeViewer viewer;
	private DrillDownAdapter drillDownAdapter;
	private TreeParent invisibleRoot;
	
	class TreeObject implements IAdaptable {
		private String name;
		private TreeParent parent;
		
		public TreeObject(String name) {
			this.name = name;
		}
		public String getName() {
			return name;
		}
		public void setParent(TreeParent parent) {
			this.parent = parent;
		}
		public TreeParent getParent() {
			return parent;
		}
		public String toString() {
			return getName();
		}
		public Object getAdapter(Class key) {
			return null;
		}
	}
	
	class TreeParent extends TreeObject {
		private ArrayList children;
		private boolean isRoot;
		
		public TreeParent(String name) {
			super(name);
			children = new ArrayList();
		}
		
		public void addChild(TreeObject child) {
			children.add(child);
			child.setParent(this);
		}
		
		public void removeChild(TreeObject child) {
			children.remove(child);
			child.setParent(null);
		}
		
		public TreeObject [] getChildren() {
			return (TreeObject [])children.toArray(new TreeObject[children.size()]);
		}
		
		public boolean hasChildren() {
			return children.size()>0;
		}

		public boolean isRoot() {
			return isRoot;
		}

		public void setRoot(boolean isRoot) {
			this.isRoot = isRoot;
		}		
	}

	class ViewContentProvider implements IStructuredContentProvider, 
										   ITreeContentProvider {
		
		public void inputChanged(Viewer v, Object oldInput, Object newInput) {
		}
		public void dispose() {
		}
		public Object[] getElements(Object parent) {
			if (parent.equals(getViewSite())) {
				if (invisibleRoot==null) 
					invisibleRoot = new TreeParent(""); 
				return getChildren(invisibleRoot);
			}
			return getChildren(parent);
		}
		public Object getParent(Object child) {
			if (child instanceof TreeObject) {
				return ((TreeObject)child).getParent();
			}
			return null;
		}
		public Object [] getChildren(Object parent) {
			if (parent instanceof TreeParent) {
				return ((TreeParent)parent).getChildren();
			}
			return new Object[0];
		}
		public boolean hasChildren(Object parent) {
			if (parent instanceof TreeParent)
				return ((TreeParent)parent).hasChildren();
			return false;
		}
	}

	class ViewLabelProvider extends LabelProvider {

		public String getText(Object obj) {
			return obj.toString();
		}
		
		public Image getImage(Object obj) {
			String imageKey = ISharedImages.IMG_OBJS_WARN_TSK;
			if (obj instanceof TreeParent)
				if(((TreeParent) obj).isRoot())
					imageKey = ISharedImages.IMG_OBJ_FOLDER;
				else
					imageKey = ISharedImages.IMG_OBJ_FILE;
			return PlatformUI.getWorkbench().getSharedImages().getImage(imageKey);
		}
	}
	
	class NameSorter extends ViewerSorter {
	}

	/**
	 * The constructor.
	 */
	public SampleView() {
	}

	/**
	 * Metoda powołująca widok do życia.
	 */
	public void createPartControl(Composite parent) {
		viewer = new TreeViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		drillDownAdapter = new DrillDownAdapter(viewer);
		viewer.setContentProvider(new ViewContentProvider());
		viewer.setLabelProvider(new ViewLabelProvider());
		viewer.setSorter(new NameSorter());
		viewer.setInput(getViewSite());

		PlatformUI.getWorkbench().getHelpSystem().setHelp(viewer.getControl(), "CodeReviewTool.viewer");
	}

	public void setFocus() {
		viewer.getControl().setFocus();
	}
	
	/**
	 * Metoda wyświetla wynik oceny projektu lub pojedynczego pliku.
	 * @param projectName - nazwa projektu dla ktorego prowadzona byla ocena.
	 * @param reviews - Lista ocen dla kazdego pliku w projekcie.
	 */
	public void setReviewResult(String projectName, Collection<Review> reviews) {
		TreeParent root = new TreeParent(projectName);
		root.setRoot(true);
		
		for (Review review : reviews) {
			TreeParent parent = new TreeParent(review.getFilename() + " (" + review.getRating() + ")");
			for (Warning warning : review.getWarnings()) {
				TreeObject child = new TreeObject("Line: " + warning.getLineNumber() + " - " + warning.getCommentary());
				parent.addChild(child);
			}
			root.addChild(parent);
		}
		
		invisibleRoot = new TreeParent("");
		invisibleRoot.addChild(root);
		
		viewer.setContentProvider(new ViewContentProvider());
		viewer.refresh();
	}
}