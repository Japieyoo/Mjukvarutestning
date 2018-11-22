package JUnitTests;

import static org.junit.Assert.assertEquals;
import view.Console;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConsoleTests {
	Console SUT;
	ByteArrayOutputStream baos;
	PrintStream ps;

	@BeforeEach
	public void setup() {
		SUT = new Console();
		baos = new ByteArrayOutputStream();
		ps = new PrintStream(baos);
		System.setOut(ps);
	}

	@AfterEach
	public void flush() {
		System.out.flush();
		PrintStream old = System.out;
		System.setOut(old);
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
}
