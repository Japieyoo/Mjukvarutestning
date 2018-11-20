package JUnitTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Card;

class CardTests {
	Card c;

	@Test
	public void Constructor_IntBetween1And13_ShouldNotThrow() {
		boolean thrown = true;
		try {
			c = new Card(1);
		} catch (Exception e) {
			thrown = false;
		}

		assertTrue(thrown);
	}

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
	public void getValue_CardValue1_ShouldReturn1() {
		c = new Card(1);
		int actual = c.getValue();
		int expected = 1;

		assertEquals(expected, actual);
	}
	
	@Test
	public void getValue_CardValue2_ShouldReturn2() {
		c = new Card(2);
		int actual = c.getValue();
		int expected = 2;

		assertEquals(expected, actual);
	}
}
