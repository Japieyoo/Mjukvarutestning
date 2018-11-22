package view;

public class Console {
	public Console() {

	}

	public void displayWelcomeMessage() {
		System.out.println("Welcome to 123!\nPress P to play.");

	}

	public void displayLoosingMessage() {
		System.out.println("You lost.");

	}

	public void displayWinningMessage() {
		System.out.println("You won.");

	}

	public void displayCardValue(int checkCard) {
		System.out.println("Card value: " + checkCard);

	}

	public void displayCount(int count) {
		System.out.println("Count: " + count);

	}
}
