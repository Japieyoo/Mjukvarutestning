package JUnitTests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import factories.DeckFactory;
import model.Card;

class DeckFactoryTests {

	@Test
	public void getDeck_ReturnCardArrayList() {
		DeckFactory SUT = new DeckFactory();
		ArrayList<Card> actual = SUT.getDeck();

		assertTrue(actual instanceof ArrayList);
	}

	@Test
	public void getDeck_Return52SizedArrayList() {
		DeckFactory SUT = new DeckFactory();
		int actual = SUT.getDeck().size();
		int expected = 52;

		assertEquals(expected, actual);
	}

}
