package ch.form105.shuttle.ui.view.player;

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
	private Table table;
	public TableViewer tableViewer;
	private Object[] input;
	private Object[] header;

	@Override
	public void createPartControl(Composite parent) {
		getImport();

		tableViewer = createViewer(parent);
		createViewerComponent(tableViewer);
		tableViewer.setInput(input);

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
		PlayerMapDeclaration mapper = new PlayerMapDeclaration();
		CSVLoaderInput loader = new CSVLoaderInput();
		Importer importer = new Importer(loader, mapper);
		importer.doImport();
		input = importer.getElements();
		header = importer.getHeader();
	}

}
