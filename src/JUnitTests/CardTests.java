package JUnitTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Card;

class CardTests {
	Card c;

	@Test
	public void Constructor_AnIntOver13_ShouldThrow() {
		boolean thrown = false;
		try {
			c = new Card(14);
		} catch (Exception e) {
			thrown = true;
		}

		assertTrue(thrown);
	}

	@Test
	public void Constructor_AnIntUnder1_ShouldThrow() {
		boolean thrown = false;
		try {
			c = new Card(0);
		} catch (Exception e) {
			thrown = true;
		}

		assertTrue(thrown);
	}

	@Test
	public void getValue_CardValue1To13_ShouldReturnTrue() {
		boolean correctNumber = true;
		for (int i = 1; i <= 13; i++) {
			c = new Card(i);
			if (c.getValue() != i) {
				correctNumber = false;
			}
		}

		assertTrue(correctNumber);

	}
}
