package JUnitTests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import model.Card;
import model.Deck;

class DeckTests {
	Deck d;

	@Test
	public void getSize_FullDeck_Return52() {
		ArrayList<Card> stubDeck = getFullStubDeck();

		d = new Deck(stubDeck);
		int actual = d.getSize();
		int expected = 52;
		assertEquals(expected, actual);
	}

	@Test
	public void Constructor_CreateAnEmptyDeck_ShouldThrowError() {
		ArrayList<Card> stubDeck = getEmptyStubDeck();
		boolean thrown = false;

		try {
			d = new Deck(stubDeck);
		} catch (Exception e) {
			thrown = true;
		}

		assertTrue(thrown);
	}

	@Test
	public void getDeck_IteratedListIsEqualToStubDeck_ReturnTrue() {
		ArrayList<Card> iteratedList = new ArrayList<Card>();
		ArrayList<Card> stubDeck = getFullStubDeck();
		d = new Deck(stubDeck);
		for (Card c : d.getDeck()) {
			iteratedList.add(c);
		}
		boolean isEqual = stubDeck.equals(iteratedList);
		assertTrue(isEqual);
	}

	private class StubCard extends Card {
		public StubCard(int i) {
			super(i);

		}
	}

	private ArrayList<Card> getFullStubDeck() {
		ArrayList<Card> stubArrayList = new ArrayList<Card>();
		for (int i = 0; i < 4; i++) {
			for (int j = 1; j <= 13; j++) {
				stubArrayList.add(new StubCard(j));
			}
		}
		return stubArrayList;
	}

	private ArrayList<Card> getEmptyStubDeck() {
		ArrayList<Card> stubArrayList = new ArrayList<Card>();
		return stubArrayList;
	}
}
