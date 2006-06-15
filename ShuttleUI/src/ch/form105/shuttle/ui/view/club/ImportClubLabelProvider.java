package ch.form105.shuttle.ui.view.club;

import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

import ch.form105.shuttle.base.generated.players.Player;

public class ImportClubLabelProvider extends LabelProvider implements ITableLabelProvider {

	public Image getColumnImage(Object element, int columnIndex) {
		return null;
	}

	public String getColumnText(Object element, int columnIndex) {
		Object[] objects = (Object[]) element;
		switch (columnIndex) {
		case 0: return (String) objects[0];
		case 1: return (String) objects[1];
		}
		return null;
	}

}
