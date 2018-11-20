package model;

public class Card {

	public Card(int i) {
		if (i > 13 || i < 1) {
			throw new IllegalArgumentException();
		}
	}

}
