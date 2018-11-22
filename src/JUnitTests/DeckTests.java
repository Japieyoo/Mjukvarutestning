package JUnitTests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import factories.DeckFactory;
import model.Card;
import model.Deck;

class DeckTests {
	Deck SUT;
	ArrayList<Card> stubDeck;

	public void setUpDeck() {
		stubDeck = getFullStubDeck();
		SUT = new Deck(stubDeck);
	}

	public void setUpEmptyDeck() {
		stubDeck = getEmptyStubDeck();
		SUT = new Deck(stubDeck);
	}

	@Test
	public void getSize_FullDeck_Return52() {
		setUpDeck();
		int actual = SUT.getSize();
		int expected = 52;
		assertEquals(expected, actual);
	}

	@Test
	public void getDeck_CreateADeckWithFactory() {
		DeckFactory DC = mock(DeckFactory.class);
		when(DC.getDeck()).thenReturn(getFullStubDeck());
		SUT = new Deck(DC.getDeck());
	}

	@Test
	public void Shuffle_100000Times_AtMostOneFail() {
		int[] unshuffled13Cards = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
		Deck SUT = new Deck(getFullStubDeck());
		double samePrePostOrder = 0;
		double loopTimes = 100000;
		boolean acceptedRatio = false;

		for (int i = 0; i < loopTimes; i++) {
			SUT = new Deck(getFullStubDeck());
			for (int j = 0; j < 39; j++) { // Draws 39 cards from the deck, leaving 13 unique cards (value 1-13).
				SUT.drawCard();
			}
			SUT.shuffle();
			int count = 0;
			int sameSpot = 0;
			for (Card c : SUT.getDeck()) {
				if (c.getValue() == unshuffled13Cards[count++]) {
					sameSpot++;
				}
			}
			if (sameSpot == 13) {
				samePrePostOrder++;
			}
		}

		if (samePrePostOrder <= 1) {
			acceptedRatio = true;
		}

		assertTrue(acceptedRatio);

	}

	@Test
	public void Constructor_CreateAnEmptyDeck_ShouldThrowError() {
		boolean thrown = false;

		try {
			setUpEmptyDeck();
		} catch (Exception e) {
			thrown = true;
		}

		assertTrue(thrown);
	}

	@Test
	public void getDeck_IteratedListIsEqualToStubDeck_ReturnTrue() {
		ArrayList<Card> iteratedList = new ArrayList<Card>();
		setUpDeck();

		for (Card c : SUT.getDeck()) {
			iteratedList.add(c);
		}
		boolean isEqual = stubDeck.equals(iteratedList);
		assertTrue(isEqual);
	}

	@Test
	public void DrawCard_CheckDeckSizeDecrease_Return51() {
		setUpDeck();
		SUT.drawCard();
		int expected = 51;
		int actual = SUT.getSize();
		assertEquals(expected, actual);
	}

	@Test
	public void DrawCard_CheckReturnType_ReturnCard() {
		boolean instanceOfCard = false;
		setUpDeck();
		if (SUT.drawCard() instanceof Card) {
			instanceOfCard = true;
		}
		assertTrue(instanceOfCard);
	}

	private class StubCard extends Card {
		public StubCard(int i) {
			super(i);

		}
	}

	// Helper-methods
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
