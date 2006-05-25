package ch.form105.shuttle.ui.wizard.page;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;

import ch.form105.shuttle.base.generated.tournament.Game;
import ch.form105.shuttle.base.helper.Constants;

public class SetProjectTypePage extends WizardPage {

	private Button button1;

	private Button button2;

	private Button button3;

	private Button button4;

	private Button button5;

	private ArrayList games = new ArrayList();

	public SetProjectTypePage() {
		super("SetNamePage");
		setPageComplete(false);
		setTitle("Describe the project");
		setMessage("Create a project by name and description");

	}

	public void createControl(Composite parent) {
		// project specification group
		Composite projectGroup = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 1;
		projectGroup.setLayout(layout);
		projectGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		button1 = new Button(projectGroup, SWT.CHECK);
		button1.setText("Men Single");
		button1.addListener(SWT.Selection, nameModifyListener);

		button2 = new Button(projectGroup, SWT.CHECK);
		button2.setText("Men Double");
		button2.addListener(SWT.Selection, nameModifyListener);

		button3 = new Button(projectGroup, SWT.CHECK);
		button3.setText("Women Single");
		button3.addListener(SWT.Selection, nameModifyListener);

		button4 = new Button(projectGroup, SWT.CHECK);
		button4.setText("Women Double");
		button4.addListener(SWT.Selection, nameModifyListener);

		button5 = new Button(projectGroup, SWT.CHECK);
		button5.setText("Mixed");
		button5.addListener(SWT.Selection, nameModifyListener);

		setControl(projectGroup);
	}

	private Listener nameModifyListener = new Listener() {
		public void handleEvent(Event e) {
			validatePage();
		}

	};


	private void validatePage() {
		if (! isButtonChecked()) {
			setErrorMessage("Please make at least one selection");
			setPageComplete(false);
			return;
		}
		setErrorMessage(null);
		setPageComplete(true);
		
		if (getNextPage() == null) {
			setMessage("Press Finish to create a project");
		} else {
			setMessage("Press Next");
		}
		
		games.clear();
		
		if (button1.getSelection()) {
			createGame(Constants.MENSINGLE, button1);
		}

		if (button2.getSelection()) {
			createGame(Constants.MENDOUBLE, button2);
		}

		if (button3.getSelection()) {
			createGame(Constants.WOMENSINGLE, button3);
		}

		if (button4.getSelection()) {
			createGame(Constants.WOMENDOUBLE, button4);
		}

		if (button5.getSelection()) {
			createGame(Constants.MIXED, button5);
		}
		
		

	}

	public void createGame(String id, Button button) {
		Game game = new Game();
		game.setTypeId(id);
		game.setActive(true);
		game.setName(button.getText());
		games.add(game);
	}

	private boolean isButtonChecked() {
		if (!button1.getSelection() && !button2.getSelection()
				&& !button3.getSelection() && !button4.getSelection()
				&& !button5.getSelection()) {
			return false;
		}
		return true;
	}

	public Collection<Game> getGames() {
		return games;
	}

}
