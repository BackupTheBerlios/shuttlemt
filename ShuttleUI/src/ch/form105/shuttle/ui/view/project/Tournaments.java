package ch.form105.shuttle.ui.view.project;






import org.apache.log4j.Logger;
import org.eclipse.core.internal.resources.Project;
import org.eclipse.core.internal.resources.ProjectDescription;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;

public class Tournaments {
	
	private static final Logger log = Logger.getLogger(Tournaments.class);

	Project[] projects;
	IFolder playerSection;
	IFolder clubSection;
	IWorkspace workspace;
	
	public Tournaments() {
		workspace = ResourcesPlugin.getWorkspace();
		
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

	/**
	 * @return Returns the projects.
	 */
	public Project[] getProjects() {
		IWorkspaceRoot wsRoot = ResourcesPlugin.getWorkspace().getRoot();
		projects = (Project[]) wsRoot.getProjects();
		return projects;
	}

	/**
	 * @param projects The projects to set.
	 */
	public void setProjects(Project[] projects) {
		this.projects = projects;
	}
	
	public void createProject(String projectName, String comment) {
		final IProject project = workspace.getRoot().getProject(projectName);
		ProjectDescription proDesc = new ProjectDescription();
		proDesc.setComment(comment);
		try {
			
			project.create(proDesc, null);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deleteProject(String projectName, boolean deleteContent, boolean force) {
		final IProject project = workspace.getRoot().getProject(projectName);
		try {
			project.delete(deleteContent, force, null);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	

}
