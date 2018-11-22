package model;

public class Game {

	private Player p;
	private Deck d;

	public Game(Player player, Deck deck) {
		p = player;
		d = deck;
		d.shuffle();
	}

}
