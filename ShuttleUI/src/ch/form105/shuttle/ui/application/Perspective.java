package ch.form105.shuttle.ui.application;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;


public class Perspective implements IPerspectiveFactory {

	public static final String ID = "ShuttleUI.perspective";
	
	public void createInitialLayout(IPageLayout layout) {
		/*String editorArea = layout.getEditorArea();
		layout.setEditorAreaVisible(true);
		layout.setFixed(false);
		
		layout.addStandaloneView(View.ID,  false, IPageLayout.LEFT, 1.0f, editorArea);*/
	
		ShuttleLayoutManager planningLayout = new ShuttleLayoutManager();
        planningLayout.createLayout(layout, ID);
	
	
	
	}

}
