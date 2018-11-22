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
	private Console SUT;
	private ByteArrayOutputStream baos;
	private PrintStream testStream;
	private Player p;

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
		String expected = "Welcome to 123!\nPress P to play.\n";

		assertEquals(expected, baos.toString());
	}

	@Test
	public void displayLoosingMessage_ReturnStringWithMessage() {
		p = mock(Player.class);
		when(p.getScore()).thenReturn(5);
		SUT.displayLoosingMessage(5);
		String expected = "\nYou lost.\nYour score was 5/52";

		assertEquals(expected, baos.toString());
	}

	@Test
	public void displayWinningMessage_ReturnStringWithMessage() {
		SUT.displayWinningMessage();
		String expected = "\nYou won.";

		assertEquals(expected, baos.toString());
	}

	@Test
	public void displayCardValue_ReturnMessageWithCardValue() {
		p = mock(Player.class);
		when(p.checkCard(null)).thenReturn(1);
		SUT.displayCardValue(p.checkCard(null));
		String expected = " Card value: " + 1;

		assertEquals(expected, baos.toString());
	}

	@Test
	public void displayCount_ReturnMessageWithCount() {
		p = mock(Player.class);
		when(p.getCount()).thenReturn(1);
		SUT.displayCount(p.getCount());
		String expected = "\nCount: " + 1;

		assertEquals(expected, baos.toString());
	}
}
