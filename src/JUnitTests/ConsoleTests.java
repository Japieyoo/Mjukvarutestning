package JUnitTests;

import static org.junit.Assert.assertEquals;
import view.Console;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class ConsoleTests {

	@AfterEach
	public void flush() {
		System.out.flush();
		PrintStream old = System.out;
		System.setOut(old);
	}

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
