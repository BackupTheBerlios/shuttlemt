/**
 * (c) Copyright Mirasol Op'nWorks Inc. 2002, 2003. 
 * http://www.opnworks.com
 * Created on Apr 2, 2003 by lgauthier@opnworks.com
 * 
 */

package ch.form105.shuttle.ui.view.club;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;

import ch.form105.shuttle.base.generated.players.Player;

/**
 * Sorter for the ImportPlayerView that displays items of type

 */
public class ImportClubSorter extends ViewerSorter {

	// Criteria that the instance uses
	private int criteria;

	/**
	 * Creates a resource sorter that will use the given sort criteria.
	 * 
	 * @param criteria
	 *            the sort criterion to use: one of <code>NAME</code> or
	 *            <code>TYPE</code>
	 */
	public ImportClubSorter(int criteria) {
		super();
		this.criteria = criteria;
	}

	/*
	 * (non-Javadoc) Method declared on ViewerSorter.
	 */
	public int compare(Viewer viewer, Object o1, Object o2) {


		Player player1 = (Player) o1;
		Player player2 = (Player) o2;

		switch (criteria) {
		case 0:
			o1 = player1.getId();
			o2 = player2.getId();
			return collator.compare(o1, o2);
		
		case 1:
			o1 = player1.getSirname();
			o2 = player2.getSirname();
			return collator.compare(o1, o2);
			
		default:
			return 0;
		}
	}


	public int getCriteria() {
		return criteria;
	}

	public void setCriteria(int criteria) {
		this.criteria = criteria;
	}

}
