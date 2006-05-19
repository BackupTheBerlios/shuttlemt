package ch.form105.shuttle.ui.view.project.page;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.internal.ide.IDEWorkbenchMessages;

public class SetNamePage extends WizardPage {
	
	private Text nameField;
	private String defaultFieldValue;

	public SetNamePage() {
		super("SetNamePage");

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
        projectLabel.setText(IDEWorkbenchMessages.WizardNewProjectCreationPage_nameLabel);
        projectLabel.setFont(parent.getFont());

        // new project name entry field
        nameField = new Text(projectGroup, SWT.BORDER);
        GridData data = new GridData(GridData.FILL_HORIZONTAL);
        nameField.setLayoutData(data);
        nameField.setFont(parent.getFont());

        // Set the initial value first before listener
        // to avoid handling an event during the creation.
        if (defaultFieldValue != null)
            nameField.setText(defaultFieldValue);
        nameField.addListener(SWT.Modify, nameModifyListener);
	    
	    
	    setControl(projectGroup);
		
	}
	
	private Listener nameModifyListener = new Listener() {
        public void handleEvent(Event e) {
            boolean valid = isValid();
            setPageComplete(valid);
        }
    };
    
    protected boolean isValid() {
    	return true;
    }

}
