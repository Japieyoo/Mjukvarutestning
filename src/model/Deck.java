package model;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	private ArrayList<Card> deckArray = new ArrayList<Card>();

	public Deck(ArrayList<Card> deckArray) {
		if (deckArray.size() != 52) {
			throw new IllegalArgumentException();
		}
		this.deckArray = deckArray;
	}

	public int getSize() {
		return deckArray.size();
	}

	public Iterable<Card> getDeck() {
		return deckArray;
	}

	public Card drawCard() {
		return deckArray.remove(0);

	}

	public void shuffle() {
		Collections.shuffle(deckArray);

	}
}