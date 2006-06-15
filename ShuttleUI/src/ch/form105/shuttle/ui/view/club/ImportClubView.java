package ch.form105.shuttle.ui.view.club;

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

public class ImportClubView extends ViewPart {

	public static final String ID = "ShuttleUI.ClubView"; //$NON-NLS-1$
	
	static Logger log = Logger.getLogger(ImportClubView.class);
	
	private Table table;
	public TableViewer tableViewer;
	private Object[] input;
	private Object[] header;
	
	Importer importer;

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
						final ImportClubSorter sorter = new ImportClubSorter(
								j);
						tableViewer.setSorter(sorter);
					}
				});
			}

		}
	}

	private TableViewer createViewer(Composite parent) {
		tableViewer = new TableViewer(parent, SWT.FULL_SELECTION | SWT.BORDER);
		tableViewer.setLabelProvider(new ImportClubLabelProvider());
		tableViewer.setContentProvider(new ImportClubContentProvider());
		return tableViewer;

	}

	

	
	public void init() {		
		createViewerComponent(tableViewer);
		tableViewer.setInput(input);

	}
	
	public void setInput(Importer importer) {
		this.importer = importer;
		input = importer.getElements();
		header = importer.getHeader();
	}
	

}
