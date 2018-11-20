package model;

public class Card {
	private int value;

	public Card(int i) {
		if (i > 13 || i < 1) {
			throw new IllegalArgumentException();
		}
		value = i;
	}

	public int getValue() {
		return value;
	}

}
