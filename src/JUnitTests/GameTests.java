package JUnitTests;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import model.Deck;
import model.Game;
import model.Player;

class GameTests {
	@Test
	public void playGame_SameCountAsCardValue_ReturnFalse() {
		Player p = mock(Player.class);
		Deck d = mock(Deck.class);
		Game g = new Game(p, d);
		when(p.getCount()).thenReturn(1);
		when(p.checkCard(null)).thenReturn(1);

		assertFalse(g.playGame(p, d));

	}

	@Test
	public void playGame_DifferentCountAsCardValue_ReturnTrue() {
		Player p = mock(Player.class);
		Deck d = mock(Deck.class);
		Game g = new Game(p, d);
		when(p.getCount()).thenReturn(3);
		when(p.checkCard(null)).thenReturn(1);

		assertTrue(g.playGame(p, d));

	}
}
