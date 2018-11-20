package model;

public class Card {

	public Card(int i) {
		if (i > 13) {
			throw new IllegalArgumentException();
		}
	}

}
