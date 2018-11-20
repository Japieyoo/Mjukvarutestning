package JUnitTests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import factories.DeckFactory;
import model.Card;
import model.Deck;

class DeckTests {

	@Test
	public void getSize_FullDeck_Return52() {
		DeckFactory factory = new DeckFactory();
		ArrayList<Card> stubDeck = factory.getFullStubDeck();

		Deck d = new Deck(stubDeck);
		int actual = d.getSize();
		int expected = 52;
		assertEquals(expected, actual);
	}
	
	@Test
	public void Constructor_EmptyDeck_ShouldThrowError() {
		DeckFactory factory = new DeckFactory();
		ArrayList<Card> stubDeck = factory.getEmptyStubDeck();
		boolean thrown = false;
		
		try {
			Deck d = new Deck(stubDeck);
		} catch (Exception e) {
			thrown = true;
		}

		assertTrue(thrown);
	}
}
