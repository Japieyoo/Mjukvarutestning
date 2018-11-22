package JUnitTests;

import static org.junit.Assert.assertEquals;
import view.Console;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Player;

class ConsoleTests {
	Console SUT;
	ByteArrayOutputStream baos;
	PrintStream testStream;
	Player p;

	@BeforeEach
	public void setup() {
		SUT = new Console();
		baos = new ByteArrayOutputStream();
		testStream = new PrintStream(baos);
		System.setOut(testStream);
	}

	@AfterEach
	public void flush() {
		System.out.flush();
		PrintStream oldStream = System.out;
		System.setOut(oldStream);
	}

	@Test
	public void displayWelcomeMessage_ReturnStringWithMessage() {
		SUT.displayWelcomeMessage();
		String expected = "Welcome to 123!\nPress P to play.";

		assertEquals(expected, baos.toString());
	}

	@Test
	public void displayLoosingMessage_ReturnStringWithMessage() {
		SUT.displayLoosingMessage();
		String expected = "You lost.";

		assertEquals(expected, baos.toString());
	}

	@Test
	public void displayWinningMessage_ReturnStringWithMessage() {
		SUT.displayWinningMessage();
		String expected = "You won.";

		assertEquals(expected, baos.toString());
	}

	@Test
	public void displayCardCalue_ReturnMessageWithCardValue() {
		p = mock(Player.class);
		when(p.checkCard(null)).thenReturn(1);
		SUT.displayCardValue(p.checkCard(null));
		String expected = "Card value: " + 1;

		assertEquals(expected, baos.toString());
	}
}
