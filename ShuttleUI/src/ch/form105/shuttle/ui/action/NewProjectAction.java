package ch.form105.shuttle.ui.action;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IViewActionDelegate;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchWizard;

import ch.form105.shuttle.ui.ShuttleUIPlugin;
import ch.form105.shuttle.ui.wizard.NewProjectWizard;

public class NewProjectAction implements IViewActionDelegate {

	public NewProjectAction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void init(IViewPart view) {
		// TODO Auto-generated method stub

	}

	public void run(IAction action) {
		IWorkbenchWizard wizard = new NewProjectWizard();
		wizard.init(ShuttleUIPlugin.getDefault().getWorkbench(), null);
		WizardDialog dialog = new WizardDialog(ShuttleUIPlugin.getDefault()
				.getWorkbench().getActiveWorkbenchWindow().getShell(), wizard);
		dialog.open();
		
		

	}

	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub

	}

}
