package ch.form105.shuttle.ui.view.project.action;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IViewActionDelegate;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPart;

public class DeleteProjectAction implements IViewActionDelegate, IObjectActionDelegate {

	private ISelection selection;
	
	public DeleteProjectAction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void init(IViewPart view) {
		

	}

	public void run(IAction action) {
		

	}

	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
		
	}

	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		// TODO Auto-generated method stub
		
	}



}
