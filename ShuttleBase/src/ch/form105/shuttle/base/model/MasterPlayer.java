package ch.form105.shuttle.base.model;

import java.util.ArrayList;

import ch.form105.shuttle.base.generated.players.Player;

public class MasterPlayer {
	
	private ArrayList <Player> players = new ArrayList<Player>();

	
	public MasterPlayer() {
		players.ensureCapacity(2);
	}
	
	public void addPlayer(Player player) {
		players.add(player);
	}
	
	public Object[] getPlayers() {
		return players.toArray();
	}
	
	
}
