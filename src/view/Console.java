package view;

public class Console {
	public Console() {

	}

	public void displayWelcomeMessage() {
		System.out.print("Welcome to 123!\nPress P to play.");

	}

	public void displayLoosingMessage() {
		System.out.print("You lost.");

	}

	public void displayWinningMessage() {
		System.out.print("You won.");

	}

	public void displayCardValue(int checkCard) {
		System.out.print("Card value: " + checkCard);

	}

	public void displayCount(int count) {
		System.out.print("Count: " + count);

	}
}
