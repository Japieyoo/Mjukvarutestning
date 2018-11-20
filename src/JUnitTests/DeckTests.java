package JUnitTests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import factories.DeckFactory;
import model.Card;
import model.Deck;

class DeckTests {

	@Test
	public void Constructor_FullDeck_ShouldReturnADeckWith52StubCards() {
		DeckFactory factory = new DeckFactory();
		ArrayList<Card> stubDeck = factory.getFullStubDeck();

		Deck d = new Deck(stubDeck);
		int actual = d.deckArray.size();
		int expected = 52;

		assertEquals(expected, actual);
	}

	@Test
	public void getSize_FullDeck_ReturnSize52() {
		DeckFactory factory = new DeckFactory();
		ArrayList<Card> stubDeck = factory.getFullStubDeck();

		Deck d = new Deck(stubDeck);
		int actual = d.getSize();
		int expected = 52;
		assertEquals(expected, actual);
	}
}
