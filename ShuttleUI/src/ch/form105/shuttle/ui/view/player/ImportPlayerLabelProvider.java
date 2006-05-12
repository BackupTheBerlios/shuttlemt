package ch.form105.shuttle.ui.view.player;

import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

import ch.form105.shuttle.base.generated.players.Player;

public class ImportPlayerLabelProvider extends LabelProvider implements ITableLabelProvider {

	public Image getColumnImage(Object element, int columnIndex) {
		return null;
	}

	public String getColumnText(Object element, int columnIndex) {
		Player player = (Player) element;
		switch (columnIndex) {
		case 0: return player.getId();
		case 1: return player.getSirname();
		case 2: return player.getName();
		case 3: return player.getSex().toString();
		case 4: return Integer.toString(player.getClubnr());
		case 5: return player.getBirthday();
		case 6: return new Integer(player.getClassifier().getSingle()).toString();
		case 7: return new Integer(player.getClassifier().getDouble()).toString();
		case 8: return new Integer(player.getClassifier().getMixed()).toString();
		}
		return null;
	}

}
