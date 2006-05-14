package ch.form105.shuttle.ui.view.project;






import org.apache.log4j.Logger;
import org.eclipse.core.internal.resources.Project;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;

public class Tournaments {
	
	private static final Logger log = Logger.getLogger(Tournaments.class);

	Project[] projects;
	IFolder playerSection;
	IFolder clubSection;
	
	public Tournaments() {
		IWorkspaceRoot wsRoot = ResourcesPlugin.getWorkspace().getRoot();
		projects = (Project[]) wsRoot.getProjects();
		
	}
	
	private void initialize(Project project) {
			playerSection = project.getFolder("player");
			clubSection = project.getFolder("club");
			try {
				playerSection.create(false, true, null);
			} catch (CoreException e) {
				e.printStackTrace();
			}
	}
	
	
	
	

}
