import java.util.Scanner;

import factories.DeckFactory;
import model.Deck;
import model.Game;
import model.Player;
import view.*;

public class Program {

	public static void main(String[] args) throws InterruptedException {
		Scanner scan = new Scanner(System.in);
		Console c = new Console();
		DeckFactory df = new DeckFactory();
		Player p = new Player();
		Deck d = new Deck(df.getDeck());
		Game g = new Game(p, d);

		c.displayWelcomeMessage();
		if (scan.nextLine().toUpperCase().equals("P")) {
			scan.close();
			while (g.playGame()) {
				Thread.sleep(1000);
				c.displayCount(p.getCount());
				Thread.sleep(2000);
				c.displayCardValue(p.getLatestCard().getValue());
				if (p.getCount() == 52) {
					c.displayWinningMessage();
					System.exit(-1);
				}
			}
		}
		c.displayCount(p.getCount());
		c.displayCardValue(p.getLatestCard().getValue());
		c.displayLoosingMessage(p.getScore());
		System.exit(-1);
	}
}