package model;

public class Game {

	private Player p;
	private Deck d;

	public Game(Player player, Deck deck) {
		p = player;
		d = deck;
		d.shuffle();
	}

	public boolean playGame() {
		Card drawnCard = d.drawCard();
		p.count();
		if (p.getCount() == p.checkCard(drawnCard)) {
			return false;
		}
		return true;
	}
}
