package ch.form105.shuttle.base.importer;

import java.util.ArrayList;

import ch.form105.shuttle.base.Messages;
import ch.form105.shuttle.base.generated.players.Classifier;
import ch.form105.shuttle.base.generated.players.Player;
import ch.form105.shuttle.base.generated.players.Players;
import ch.form105.shuttle.base.generated.players.types.SexType;

public class PlayerMapDeclaration extends Mapper {

	ArrayList header = new ArrayList();
	Players players = new Players();
	Player player = new Player();
	LoaderInput loaderInput;

	

	// 0. LIZNR - USED
	// 1. NAME - USED
	// 2. VORNAME - USED
	// 3. STRASSE
	// 4. PLZ
	// 5. ORT
	// 6. SEX - USED
	// 7. ALTER
	// 8. CLUB_NR - USED
	// 9. TEL_P
	// 10. TEL_G
	// 11. EMAIL
	// 12. GEBURTSTAG - USED
	// 13. KL_E - USED
	// 14. KL_D - USED
	// 15. KL_M - USED
	public void mapRow(Object[] elements) {
		// LIZNR;NAME;VORNAME;STRASSE;PLZ;ORT;SEX;ALTER;CLUB_NR;TEL_P;TEL_G;EMAIL;GEBURTSTAG;KL_E;KL_D;KL_M
		Player player = new Player();
		player.setId(elements[0].toString());
		
		player.setSirname(elements[1].toString());
		
		player.setName(elements[2].toString());
		
		
		
		if (elements[6].toString().equals("M")) { //$NON-NLS-1$
			player.setSex(SexType.M);
		}		
		if (elements[6].toString().equals("W")) { //$NON-NLS-1$
			player.setSex(SexType.W);
		}
		
		
		player.setClubnr(Integer.parseInt(elements[8].toString()));
		
		player.setBirthday(elements[12].toString());
		

		
		Classifier classifier = new Classifier();

		classifier.setSingle(Integer.parseInt(elements[13].toString()));

		

		// Classifier double
		
		classifier.setDouble(Integer.parseInt(elements[14].toString()));
		
		

		// Classifier mixed
		
		classifier.setMixed(Integer.parseInt(elements[15].toString()));
		player.setClassifier(classifier);
		
		// adding player to the players list
		players.addPlayer(player);
	}
	
	public Object[] getHeader(){
		header.add(Messages.getString("PlayerMapDeclaration.haeder.name.license")); //$NON-NLS-1$
		header.add(Messages.getString("PlayerMapDeclaration.haeder.name.sirname")); //$NON-NLS-1$
		header.add(Messages.getString("PlayerMapDeclaration.haeder.name.name")); //$NON-NLS-1$
		header.add(Messages.getString("PlayerMapDeclaration.haeder.name.gender")); //$NON-NLS-1$
		header.add(Messages.getString("PlayerMapDeclaration.haeder.name.club")); //$NON-NLS-1$
		header.add(Messages.getString("PlayerMapDeclaration.haeder.name.birthday")); //$NON-NLS-1$
		header.add(Messages.getString("PlayerMapDeclaration.haeder.name.classSinge")); //$NON-NLS-1$
		header.add(Messages.getString("PlayerMapDeclaration.haeder.name.classDouble")); //$NON-NLS-1$
		header.add(Messages.getString("PlayerMapDeclaration.haeder.name.classMixed")); //$NON-NLS-1$
		return header.toArray();
	}

	public void map() {
		Object[] elements = loaderInput.getInput();
		for (int i = 0; i < elements.length; i++) {
			mapRow((Object[]) elements[i]);
		}
	}

	public Object[] getResult() {
		return players.getPlayer();
	}

	public void setLoaderInput(LoaderInput input) {
		this.loaderInput = input;
	}
	
	

}
