package ch.form105.shuttle.ui.view.project;

import java.util.ArrayList;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import ch.form105.shuttle.base.model.Projects;

public class ProjectContentProvider implements ITreeContentProvider {

	public void dispose() {
		// TODO Auto-generated method stub

	}

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// TODO Auto-generated method stub

	}

	public Object[] getChildren(Object parentElement) {
		System.out.println("getChildren");
		return null;
	}

	public Object getParent(Object element) {
		System.out.println("parent object: "+element);
		return null;
	}

	public boolean hasChildren(Object element) {
		System.out.println("hasChildren: "+element);
		return false;
	}

	public Object[] getElements(Object inputElement) {
		
		if (inputElement instanceof Projects) {
			ArrayList projectNodes = ((ArrayList) ((Projects)inputElement).getProjects().clone());
			projectNodes.add("Player Import");
			return projectNodes.toArray();
		}
		Object[] object = new Object[0];
		return object;
	}

}
