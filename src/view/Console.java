package view;

public class Console {
	public Console() {

	}

	public void displayWelcomeMessage() {
		System.out.print("Welcome to 123!\nPress P to play.\n");

	}

	public void displayLoosingMessage(int score) {
		System.out.print("\nYou lost.\nYour score was " + score + "/52");

	}

	public void displayWinningMessage() {
		System.out.print("\nYou won.");

	}

	public void displayCardValue(int checkCard) {
		System.out.print(" Card value: " + checkCard);

	}

	public void displayCount(int count) {
		System.out.print("\nCount: " + count);

	}
}
