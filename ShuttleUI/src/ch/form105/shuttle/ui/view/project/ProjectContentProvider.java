package ch.form105.shuttle.ui.view.project;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import ch.form105.shuttle.ui.Constants;



public class ProjectContentProvider implements ITreeContentProvider {

	public void dispose() {
		// TODO Auto-generated method stub

	}

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// TODO Auto-generated method stub

	}

	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IProject) {
			IProject project = (IProject)parentElement;
			IFile file = project.getFile(Constants.TOURNAMENT_FILE_NAME);
			return new IFile[] {file};
		}
		return null;
	}

	public Object getParent(Object element) {
		System.out.println("parent object: "+element);
		return null;
	}

	public boolean hasChildren(Object element) {
		
		if (element instanceof IProject) {
			IProject project = (IProject)element;
			IFile file = project.getFile(Constants.TOURNAMENT_FILE_NAME);
			return file.exists();
		}
		return false;
		
	}

	public Object[] getElements(Object inputElement) {
		System.out.println(inputElement);
		if (inputElement instanceof IProject[]) {
			return (Object[])inputElement;
		}
		
		if (inputElement instanceof IFile) {
			System.out.println("isntance");
		}
		
		return null;
	}

}
