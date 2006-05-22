package ch.form105.shuttle.ui.wizard;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResourceStatus;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.osgi.util.NLS;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.internal.ide.IDEWorkbenchPlugin;
import org.eclipse.ui.internal.wizards.newresource.ResourceMessages;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;

import ch.form105.shuttle.ui.ImageFactory;
import ch.form105.shuttle.ui.i18n.wizard.Messages;
import ch.form105.shuttle.ui.wizard.page.SetNamePage;
import ch.form105.shuttle.ui.wizard.page.SetProjectTypePage;

public class NewProjectWizard extends Wizard implements INewWizard{

	public static final String id = "ShuttleUI.newProjectWizard";
	
	private WizardNewProjectCreationPage mainPage;
	private SetNamePage page1;
	private SetProjectTypePage page2;
	
	public NewProjectWizard() {
		super();
		setWindowTitle(Messages.getString("NewProjectWizard.windowTitle")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
		setDefaultPageImageDescriptor(ImageFactory.getImageDescriptor("IMG_CREATE_PROJECT_WIZARD_PAGE"));
		
	}
	
	public void addPages() {
		page1 = new SetNamePage();
		page2 = new SetProjectTypePage();
		addPage(page1);
		addPage(page2);
	    
	    
	  }
	
	@Override
	public boolean performFinish() {
		IProject project = page1.getProject();
		try {
			project.create(null);
		} catch (CoreException e) {
			e.printStackTrace();
		}
		return true;
	}

	public void init(IWorkbench workbench, IStructuredSelection selection) {
	}

}
