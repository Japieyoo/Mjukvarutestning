package factories;

import java.util.ArrayList;

import model.Card;

public class DeckFactory {
	public DeckFactory() {

	}

	public ArrayList<Card> getDeck() {
		ArrayList<Card> cardArrayList = new ArrayList<Card>();

		for (int i = 0; i < 4; i++) {
			for (int j = 1; j <= 13; j++) {
				cardArrayList.add(new Card(j));
			}
		}
		return cardArrayList;
	}

	public ArrayList<Card> getFullStubDeck() {
		ArrayList<Card> stubArrayList = new ArrayList<Card>();
		for (int i = 0; i < 4; i++) {
			for (int j = 1; j <= 13; j++) {
				stubArrayList.add(new StubCard(j));
			}
		}
		return stubArrayList;
	}

	public ArrayList<Card> getEmptyStubDeck() {
		ArrayList<Card> stubArrayList = new ArrayList<Card>();
		return stubArrayList;
	}

	private class StubCard extends Card {
		private StubCard(int i) {
			super(i);
		}

	}
}