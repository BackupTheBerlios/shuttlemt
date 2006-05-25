package ch.form105.shuttle.ui.action;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IViewActionDelegate;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPart;

import ch.form105.shuttle.ui.ShuttleUIPlugin;

public class DeleteProjectAction implements IViewActionDelegate, IObjectActionDelegate {

	private ISelection selection;
	
	public DeleteProjectAction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void init(IViewPart view) {
		
	}

	public void run(IAction action) {
		Object object = ((StructuredSelection) selection).getFirstElement();
		IProject project = (IProject) object;
		IWorkspaceRoot wsRoot = ResourcesPlugin.getWorkspace().getRoot();
		wsRoot.getProject();
		try {
			Shell shell = ShuttleUIPlugin.getDefault().getWorkbench().getActiveWorkbenchWindow().getShell();
			if (MessageDialog.openConfirm(shell, "title", "message")) {
				((IProject) object).delete(true, true, null);
			}
			
		} catch (CoreException e) {
			
			e.printStackTrace();
		}
		
		

	}

	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
		
	}

	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		// TODO Auto-generated method stub
		
	}



}
