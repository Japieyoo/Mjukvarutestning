package JUnitTests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import model.Player;

class PlayerTests {

	@Test
	public void getScore_WhenCreated_Has0Score() {
		Player SUT = new Player();
		int actual = SUT.getScore();
		int expected = 0;

		assertEquals(expected, actual);
	}

}
