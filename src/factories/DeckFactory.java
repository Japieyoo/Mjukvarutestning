package factories;

import java.util.ArrayList;

import model.Card;

public class DeckFactory {
	public DeckFactory() {

	}

	public ArrayList<Card> getDeck(String s) {
		ArrayList<Card> stubArrayList = new ArrayList<Card>();
		ArrayList<Card> cardArrayList = new ArrayList<Card>();
		if (s.equalsIgnoreCase("StubFullDeck")) {
			for (int i = 0; i < 4; i++) {
				for (int j = 1; j <= 13; j++) {
					stubArrayList.add(new StubCard(j));
				}
			}
			return stubArrayList;
		} else if (s.equalsIgnoreCase("StubEmptyDeck")) {
			return stubArrayList;
		} else {
			for (int i = 0; i < 4; i++) {
				for (int j = 1; j <= 13; j++) {
					cardArrayList.add(new Card(j));
				}
			}
		}
		return cardArrayList;
	}

	private class StubCard extends Card {
		private StubCard(int i) {
			super(i);
		}

	}
}
