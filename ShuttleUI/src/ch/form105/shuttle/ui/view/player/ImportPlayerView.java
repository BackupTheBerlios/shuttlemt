package ch.form105.shuttle.ui.view.player;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.part.ViewPart;

import ch.form105.shuttle.base.importer.CSVLoaderInput;
import ch.form105.shuttle.base.importer.Importer;
import ch.form105.shuttle.base.importer.PlayerMapDeclaration;

public class ImportPlayerView extends ViewPart {

	public static final String ID = "ShuttleUI.PlayerView"; //$NON-NLS-1$
	
	static Logger log = Logger.getLogger(ImportPlayerView.class);
	
	private Table table;
	public TableViewer tableViewer;
	private Object[] input;
	private Object[] header;
	
	private IFile iFile;

	@Override
	public void createPartControl(Composite parent) {		
		tableViewer = createViewer(parent);
	}

	@Override
	public void setFocus() {
		tableViewer.getControl().setFocus();

	}

	private void createViewerComponent(final TableViewer tableViewer) {

		// sorter.setSortingField(1);

		table = tableViewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		TableColumn col;
		for (int i = 0; i < header.length; i++) {
			final int j = i;
			col = new TableColumn(table, SWT.NONE, i);
			col.setText(header[i].toString());
			col.setWidth(100);

			// adding Listener for sorting
			if (j == 0 || j == 1) {
				col.addSelectionListener(new SelectionAdapter() {
					public void widgetSelected(SelectionEvent e) {
						final ImportPlayerSorter sorter = new ImportPlayerSorter(
								j);
						tableViewer.setSorter(sorter);
					}
				});
			}

		}
	}

	private TableViewer createViewer(Composite parent) {
		tableViewer = new TableViewer(parent, SWT.FULL_SELECTION | SWT.BORDER);
		tableViewer.setLabelProvider(new ImportPlayerLabelProvider());
		tableViewer.setContentProvider(new ImportPlayerContentProvider());
		return tableViewer;

	}

	/**
	 * Declare the input. Getting the object from the importer.
	 *
	 */
	private void getImport() {
		//TODO set a variable for import file
		//TODO add a serverside service
		PlayerMapDeclaration mapper = new PlayerMapDeclaration();
		
		CSVLoaderInput loader;
		try {
			loader = new CSVLoaderInput(iFile.getContents());
			Importer importer = new Importer(loader, mapper);
			importer.doImport();
			input = importer.getElements();
			header = importer.getHeader();
		} catch (CoreException e) {
			log.error(e, e);
			
		}
		
	}
	
	
	public void setFile(IFile file) {
		this.iFile = file;
		
	}
	
	public IFile getFile() {
		return iFile;
	}
	
	public void init() {
		
		getImport();
		
		createViewerComponent(tableViewer);
		tableViewer.setInput(input);
		tableViewer.setInput(input);
	}
	

}
