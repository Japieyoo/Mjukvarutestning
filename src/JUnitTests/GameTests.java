package JUnitTests;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Deck;
import model.Game;
import model.Player;

class GameTests {
	private Player p;
	private Deck d;
	private Game g;

	@BeforeEach
	public void setUpGame() {
		p = mock(Player.class);
		d = mock(Deck.class);
		g = new Game(p, d);
	}

	@Test
	public void playGame_SameCountAsCardValue_ReturnFalse() {
		when(p.getCount()).thenReturn(1);
		when(p.checkCard(null)).thenReturn(1);

		assertFalse(g.playGame(p, d));

	}

	@Test
	public void playGame_DifferentCountAsCardValue_ReturnTrue() {
		when(p.getCount()).thenReturn(3);
		when(p.checkCard(null)).thenReturn(1);

		assertTrue(g.playGame(p, d));

	}
}
