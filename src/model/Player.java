package model;

public class Player {
	private int score = 0;

	public int getScore() {
		return score;
	}

	public void drawCard() {
		score++;

	}

	public int checkCard(Card card) {
		return card.getValue();
	}

}
