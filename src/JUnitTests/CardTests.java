package JUnitTests;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import model.Card;

class CardTests {
	Card c;
	

	private void setUp(int i) {
		c = new Card(i);
	}
	
	@Test
	public void Constructor_Int_ShouldNotThrow() {
		boolean thrown = true;
		try {
			setUp(1);
		} catch (Exception e) {
			thrown = false;
		}

		assertTrue(thrown);
	}
}
