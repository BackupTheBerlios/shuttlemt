package ch.form105.shuttle.ui.view.player;

import java.util.HashMap;

import org.apache.log4j.Logger;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.part.ViewPart;

import ch.form105.shuttle.base.importer.Importer;

public class ImportPlayerView extends ViewPart {

	public static final String ID = "ShuttleUI.PlayerView"; //$NON-NLS-1$
	
	static Logger log = Logger.getLogger(ImportPlayerView.class);
	
	private Table table;
	public TableViewer tableViewer;
	private Object[] input;
	private Object[] header;
	
	private Importer importer;
	private Importer clubs;
	
	private HashMap<Integer, String> clubMap = new HashMap<Integer, String>();

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
		tableViewer.setLabelProvider(new ImportPlayerLabelProvider(clubMap));
		tableViewer.setContentProvider(new ImportPlayerContentProvider());
		return tableViewer;

	}

	
	public void setClub(Importer clubImport) {
		this.clubs = clubImport;
		//convert to Hashmap
		Object[] elements = clubImport.getElements();
		for (int i = 0; i < elements.length; i++) {
			Object[] lines = (Object[]) elements[i];
			
			clubMap.put(new Integer((String) lines[0]), (String) lines[1]);
		}
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
