package JUnitTests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import model.Card;
import model.Player;

class PlayerTests {
	Player SUT;

	private void setUpPlayer() {
		SUT = new Player();
	}

	@Test
	public void getScore_WhenCreated_Has0Score() {
		setUpPlayer();
		int actual = SUT.getScore();
		int expected = 0;

		assertEquals(expected, actual);
	}

	@Test
	public void drawCard_Once_ScoreIncreasesBy1() {
		setUpPlayer();
		SUT.drawCard();
		int actual = SUT.getScore();
		int expected = 1;

		assertEquals(expected, actual);
	}

	@Test
	public void checkCard_ReturnsStubCardValue() {
		setUpPlayer();
		SUT.drawCard();
		int actual = SUT.checkCard(new StubCard(1));
		int expected = 1;

		assertEquals(expected, actual);
	}

	private class StubCard extends Card {
		public StubCard(int i) {
			super(i);

		}

		@Override
		public int getValue() {
			return 1;
		}
	}
}
