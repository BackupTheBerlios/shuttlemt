package ch.form105.shuttle.ui.view.project;

import java.io.File;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

import ch.form105.shuttle.ui.ImageFactory;

public class ProjectLabelProvider implements ILabelProvider {

	public void addListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub

	}

	public void dispose() {
		// TODO Auto-generated method stub

	}

	public boolean isLabelProperty(Object element, String property) {
		// TODO Auto-generated method stub
		return false;
	}

	public void removeListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub

	}

	public Image getImage(Object element) {
		if (element instanceof IProject) {
			return ImageFactory.getImage("IMG_TOURNAMENT_PROJECT_SMALL");
		};
		if (element.equals("Player Import")) {
			return ImageFactory.getImage("IMG_IMPORT_USER");
		}
		
		
		return null;
	}

	public String getText(Object element) {
		
		if (element instanceof IProject) {
			return ((IProject)element).getName();
		};
		
		if (element instanceof File) {
			return ((File) element).getName();
		};
		
		// TODO Auto-generated method stub
		return element.toString();
	}

}
