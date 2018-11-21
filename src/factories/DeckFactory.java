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

}
