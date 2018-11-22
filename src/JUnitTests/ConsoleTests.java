package JUnitTests;

import static org.junit.Assert.assertEquals;
import view.Console;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.LinkedList;

import org.junit.jupiter.api.Test;

class ConsoleTests {

	@Test
	public void displayWelcomeMessage_ReturnStringWithMessage() {
		Console SUT = new Console();
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		System.setOut(ps);
		SUT.displayWelcomeMessage();
		String expected = "Welcome to 123!\nPress P to play.";

		assertEquals(expected, baos.toString());

	}
}
