package week06_project;

public class App {

	public static void main(String[] args) {

		// Instantiate a Deck and Two Players
		Deck deck1 = new Deck();
		Deck deck2 = new Deck();
		Player player1 = new Player("Player 1");
		Player player2 = new Player("Player 2");

		// Shuffle the deck
		deck1.shuffle();
		deck2.shuffle();

		// Iterate 52 times, drawing cards for each player
		for (int i = 0; i < 52; i++) {
			player1.draw(deck1);
			player2.draw(deck2);
		}

		// Iterate 26 times, flipping cards for each player
		for (int i = 0; i < 26; i++) {
			Card card1 = player1.flip();
			Card card2 = player2.flip();

			System.out.println("Player 1's card: ");
			card1.describe();
			System.out.println("Player 2's card: ");
			card2.describe();

			if (card1.getValue() > card2.getValue()) {
				player1.incrementScore();
				System.out.println("Player 1 receives a point!");
			} else if (card1.getValue() < card2.getValue()) {
				player2.incrementScore();
				System.out.println("Player 2 receives a point!");
			} else {
				System.out.println("its a tie! No point awarded.");
			}
		}

		// compare final score
		int player1Score = player1.getScore();
		int player2Score = player2.getScore();

		// Print final score and determine the winner
		System.out.println("Final score - player1: " + player1Score + ", Player 2: " + player2Score);
		if (player1Score > player2Score) {
			System.out.println("Player 1 wins!");
		} else if (player2Score > player1Score) {
			System.out.println("Player 2 wins!");
		} else {
			System.out.println("It's a draw!");
		}
	}
}
