package JUnitTests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import model.Card;

class CardTests {

	@Test
	public void Constructor_Int_ShouldNotThrow() {
		boolean thrown = true;
		try {
			Card c = new Card(1);
		} catch (Exception e) {
			thrown = false;
		}

		assertTrue(thrown);
	}
}
