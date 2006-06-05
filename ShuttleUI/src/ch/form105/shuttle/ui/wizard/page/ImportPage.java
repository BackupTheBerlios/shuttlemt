package ch.form105.shuttle.ui.wizard.page;

import org.apache.log4j.Logger;
import org.eclipse.core.internal.resources.Resource;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

import ch.form105.shuttle.ui.application.DefaultPreferences;
import ch.form105.shuttle.ui.i18n.MainMessages;
import ch.form105.shuttle.ui.i18n.wizard.Messages;

public class ImportPage extends WizardPage {

	private static final Logger log = Logger.getLogger(ImportPage.class);
	private Text playerNameField;
	private Text clubNameField;
	private Button playerSelectButton;
	private Button clubSelectButton;
	private Composite parent;
	private String playerFilePath;
	private String clubFilePath;
	private String playerFileName;
	private String clubFileName;

	public ImportPage() {
		super("ChoosePlayerFilePage");
		setPageComplete(false);
		setTitle(Messages.getString("NewProjectWizard.importPage.title"));
		setMessage(Messages
				.getString("NewProjectWizard.importPage.message"));

	}

	public void createControl(final Composite parent) {
		this.parent = parent;
		// project specification group
		// Composite projectGroup = new Composite(parent, SWT.NONE);
		Composite group = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		group.setLayout(layout);
		group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		// ======================= create the player selection
		Label playerFileLabel = new Label(group, SWT.NONE);
		playerFileLabel.setText(Messages
				.getString("NewProjectWizard.importPage.player.label"));
		playerFileLabel.setFont(parent.getFont());

		// new project name entry field
		playerNameField = new Text(group, SWT.BORDER);
		playerNameField.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		playerNameField.setFont(parent.getFont());

		playerNameField.addListener(SWT.Modify, nameModifyListener);

		setControl(group);

		playerSelectButton = new Button(group, SWT.RIGHT);
		playerSelectButton.setText(MainMessages.getString("SelectButton"));

		playerSelectButton.addListener(SWT.Selection, playerSelectionListener);
		
		//=============== create the club selection
		Label clubFileLabel = new Label(group, SWT.NONE);
		clubFileLabel.setText(Messages
				.getString("NewProjectWizard.importPage.club.label"));
		clubFileLabel.setFont(parent.getFont());

		// new club selection name entry field
		clubNameField = new Text(group, SWT.BORDER);
		clubNameField.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		clubNameField.setFont(parent.getFont());

		clubNameField.addListener(SWT.Modify, nameModifyListener);

		setControl(group);

		clubSelectButton = new Button(group, SWT.RIGHT);
		clubSelectButton.setText(MainMessages.getString("SelectButton"));

		clubSelectButton.addListener(SWT.Selection, clubSelectionListener);
		

	}

	private Listener nameModifyListener = new Listener() {
		public void handleEvent(Event e) {
			validatePage();
		}
	};

	private Listener playerSelectionListener = new Listener() {
		public void handleEvent(Event e) {
			FileDialog fileDialog = new FileDialog(parent.getShell(),
					SWT.SINGLE);
			// TODO use name from default preference
			fileDialog.setFileName(DefaultPreferences.IMPORT_PLAYER_FILENAME.name());
			fileDialog.setFilterExtensions(new String[] { "*.sb", "*.*" });

			playerFilePath = fileDialog.open();
			log.debug("File that has been choosen: " + playerFilePath);
			if (playerFilePath != null) {
				playerNameField.setText(playerFilePath);
				playerFileName = fileDialog.getFileName();
			}

			validatePage();
		}
	};
	
	private Listener clubSelectionListener = new Listener() {
		public void handleEvent(Event e) {
			FileDialog fileDialog = new FileDialog(parent.getShell(),
					SWT.SINGLE);
			// TODO use name from default preference
			fileDialog.setFileName(DefaultPreferences.IMPORT_CLUB_FILENAME.name());
			fileDialog.setFilterExtensions(new String[] { "*.sb", "*.*" });

			clubFilePath = fileDialog.open();
			log.debug("File that has been choosen: " + clubFilePath);
			if (clubFilePath != null) {
				clubNameField.setText(clubFilePath);
				clubFileName = fileDialog.getFileName();
			}

			validatePage();
		}
	};

	private void validatePage() {
		if (playerNameField.getText().length() < 1) {
			setErrorMessage(Messages.getString("NewProjectWizard.importPage.player.errormessage"));
			setPageComplete(false);
			return;
		}
		
		if (clubNameField.getText().length() < 1) {
			setErrorMessage(Messages.getString("NewProjectWizard.importPage.club.errormessage"));
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
	}
	
	/**
	 * Getting the choosen file path
	 * @return The file path
	 */
	public String getPlayerFilePath() {
		return playerNameField.getText();
	}
	
	/**
	 * Getting the choosen file path
	 * @return The file path
	 */
	public String getClubFilePath() {
		return clubNameField.getText();
	}
	
	/**
	 * Get the name of the file
	 * @return The file name
	 */
	public String getPlayerFileName() {
		return playerFileName;
	}
	
	/**
	 * Get the name of the file
	 * @return The file name
	 */
	public String getClubFileName() {
		return clubFileName;
	}

}
