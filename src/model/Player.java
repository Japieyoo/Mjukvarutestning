package model;

public class Player {
	private int score = 0;

	public int getScore() {
		return score;
	}

	public int checkCard(Card card) {
		score++;
		return card.getValue();
	}

}
