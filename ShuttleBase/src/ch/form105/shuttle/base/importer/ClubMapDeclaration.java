package ch.form105.shuttle.base.importer;

import java.util.ArrayList;
import java.util.HashMap;

import ch.form105.shuttle.base.Messages;
import ch.form105.shuttle.base.generated.players.Classifier;
import ch.form105.shuttle.base.generated.players.Player;
import ch.form105.shuttle.base.generated.players.types.SexType;

public class ClubMapDeclaration extends Mapper {

	ArrayList header = new ArrayList();
	ArrayList clubs = new ArrayList();
	
	LoaderInput loaderInput;

	

	// 0. NR - USED
	// 1. NAME - USED
	
	public void mapRow(Object[] elements) {
		
		clubs.add(elements);
		
	}
	
	public Object[] getHeader(){
		header.add(Messages.getString("ClubMapDeclaration.haeder.name.number")); //$NON-NLS-1$
		header.add(Messages.getString("ClubMapDeclaration.haeder.name.name")); //$NON-NLS-1$
		return header.toArray();
	}

	public void map() {
		Object[] elements = loaderInput.getInput();
		for (int i = 0; i < elements.length; i++) {
			mapRow((Object[]) elements[i]);
		}
	}

	public Object[] getResult() {
		return clubs.toArray();
	}

	public void setLoaderInput(LoaderInput input) {
		this.loaderInput = input;
	}
	
	

}
