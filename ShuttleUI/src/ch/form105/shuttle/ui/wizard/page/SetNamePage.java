package ch.form105.shuttle.ui.wizard.page;

import org.eclipse.core.internal.resources.ProjectDescription;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

import ch.form105.shuttle.ui.i18n.wizard.Messages;

public class SetNamePage extends WizardPage {
	
	private Text nameField;
	private Text descField;
	private IProject project;
	private IProjectDescription projectDesc;

	public SetNamePage() {
		super("SetNamePage");
		setPageComplete(false);
		setTitle("Describe the project");
		setMessage("Create a project by name and description");

	}

	public void createControl(Composite parent) {
//		 project specification group
        Composite projectGroup = new Composite(parent, SWT.NONE);
        GridLayout layout = new GridLayout();
        layout.numColumns = 2;
        projectGroup.setLayout(layout);
        projectGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
	    
        // new project label
        Label projectLabel = new Label(projectGroup, SWT.NONE);
        projectLabel.setText(Messages.getString("NewProjectWizard.projectLabel"));
        projectLabel.setFont(parent.getFont());

        
        // new project name entry field
        nameField = new Text(projectGroup, SWT.BORDER);
        GridData data = new GridData(GridData.FILL_HORIZONTAL);
        nameField.setLayoutData(data);
        nameField.setFont(parent.getFont());

        nameField.addListener(SWT.Modify, nameModifyListener);
	    
	    
	    setControl(projectGroup);
		
	    //	  new description label
        Label descLabel = new Label(projectGroup, SWT.NONE);
        descLabel.setText(Messages.getString("NewProjectWizard.projectDescriptionLabel"));
        descLabel.setFont(parent.getFont());
	    
	    
	    //	  new project name entry field
        descField = new Text(projectGroup, SWT.BORDER);
        descField.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        descField.setFont(parent.getFont());

        descField.addListener(SWT.Modify, nameModifyListener);
	    
	}
	
	private Listener nameModifyListener = new Listener() {
        public void handleEvent(Event e) {
        	
        	validatePage();
            
        }

		
    };
    
    protected boolean isValid() {
    	return true;
    }
    
    private void validatePage() {
		if (nameField.getText().length() < 1) {
			setErrorMessage("A project name is required");
			setPageComplete(false);
			return;
		}
		if (descField.getText().length() < 1) {
			setErrorMessage("A project description is required");
			setPageComplete(false);
			return;
		}
		setErrorMessage(null);
		if (getNextPage() == null) {
			setMessage("Press Finish to create a project");
		} else {
			setMessage("Press Next");
		}
		setPageComplete(true);
		
		projectDesc = new ProjectDescription();
		projectDesc.setName(nameField.getText());
		projectDesc.setComment(descField.getText());
		
		
		
		
		
	}
    
    
    public IProjectDescription getProjectDesc() {
    	return projectDesc;
    }
    
    

}
