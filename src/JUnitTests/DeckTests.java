package JUnitTests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import factories.DeckFactory;
import model.Card;
import model.Deck;

class DeckTests {
	Deck d;
	ArrayList<Card> stubDeck;

	public void setUpDeck() {
		stubDeck = getFullStubDeck();
		d = new Deck(stubDeck);
	}

	public void setUpEmptyDeck() {
		stubDeck = getEmptyStubDeck();
		d = new Deck(stubDeck);
	}

	@Test
	public void getSize_FullDeck_Return52() {
		setUpDeck();
		int actual = d.getSize();
		int expected = 52;
		assertEquals(expected, actual);
	}

	@Test
	public void getDeck_CallingFactory_Verify() {
		DeckFactory DC = mock(DeckFactory.class);
		DC.getDeck();
		verify(DC).getDeck();
	}

	@Test
	public void Shuffle_CallingShuffle_Verify() {
		Deck d = mock(Deck.class);
		d.shuffle();
		verify(d).shuffle();

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

		for (Card c : d.getDeck()) {
			iteratedList.add(c);
		}
		boolean isEqual = stubDeck.equals(iteratedList);
		assertTrue(isEqual);
	}

	@Test
	public void DrawCard_CheckDeckSizeDecrease_Return51() {
		setUpDeck();
		d.drawCard();
		int expected = 51;
		int actual = d.getSize();
		assertEquals(expected, actual);
	}

	@Test
	public void DrawCard_CheckReturnType_ReturnCard() {
		boolean instanceOfCard = false;
		setUpDeck();
		if (d.drawCard() instanceof Card) {
			instanceOfCard = true;
		}
		assertTrue(instanceOfCard);
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
