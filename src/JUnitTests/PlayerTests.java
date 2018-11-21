package JUnitTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Card;
import model.Player;

class PlayerTests {
	private Player SUT;

	@BeforeEach
	private void setUpPlayer() {
		SUT = new Player();
	}

	@Test
	public void getScore_WhenCreated_Has0Score() {
		int actual = SUT.getScore();
		int expected = 0;

		assertEquals(expected, actual);
	}

	@Test
	public void getCount_WhenCreated_Has0Count() {
		int actual = SUT.getCount();
		int expected = 0;

		assertEquals(expected, actual);
	}

	@Test
	public void count_Once_CountIncreasesBy1() {
		SUT.count();
		int actual = SUT.getCount();
		int expected = 1;

		assertEquals(expected, actual);
	}

	@Test
	public void count_FourTimes_ShouldBeResetToOneInsteadOfFour() {
		for (int i = 0; i < 4; i++) {
			SUT.count();
		}
		int actual = SUT.getCount();
		int expected = 1;

		assertEquals(expected, actual);
	}

	@Test
	public void checkCard_Once_ScoreIncreasesBy1() {
		SUT.checkCard(new StubCard(1));
		int actual = SUT.getScore();
		int expected = 1;

		assertEquals(expected, actual);
	}

	@Test
	public void checkCard_ReturnsStubCardValue() {
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
