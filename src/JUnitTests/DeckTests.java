package JUnitTests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import factories.DeckFactory;
import model.Card;
import model.Deck;

class DeckTests {
	Deck d;
	DeckFactory factory;

	@BeforeEach
	public void setUp() {
		factory = new DeckFactory();
	}

	@Test
	public void getSize_FullDeck_Return52() {
		ArrayList<Card> stubDeck = factory.getFullStubDeck();

		d = new Deck(stubDeck);
		int actual = d.getSize();
		int expected = 52;
		assertEquals(expected, actual);
	}

	@Test
	public void Constructor_EmptyDeck_ShouldThrowError() {
		ArrayList<Card> stubDeck = factory.getEmptyStubDeck();
		boolean thrown = false;

		try {
			d = new Deck(stubDeck);
		} catch (Exception e) {
			thrown = true;
		}

		assertTrue(thrown);
	}
}
