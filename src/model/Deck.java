package model;

import java.util.ArrayList;

public class Deck {
	public ArrayList<Card> deckArray = new ArrayList<Card>();

	public Deck(ArrayList<Card> deckArray) {
		this.deckArray = deckArray;
	}

	public int getSize() {
		return deckArray.size();
	}
}