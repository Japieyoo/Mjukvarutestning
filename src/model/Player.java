package model;

public class Player {
	private int score = 0;
	private int count = 0;
	private Card latestCard = null;

	public int getScore() {
		return score;
	}

	public int checkCard(Card card) {
		latestCard = card;
		score++;
		return card.getValue();
	}

	public int getCount() {
		return count;
	}

	public void count() {
		if (count == 3) {
			count = 1;
		} else {
			count++;
		}

	}

	public Card getLatestCard() {
		return latestCard;
	}
}
