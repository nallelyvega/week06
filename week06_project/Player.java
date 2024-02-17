package week06_project;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private List<Card> hand;
	private int score;
	private String name;

	// Constructor
	public Player(String name) {
		this.hand = new ArrayList<>();
		this.score = 0;
		this.name = name;
	}

	// Method to describe the player and their hand
	public void describe() {
		System.out.println("Player " + name);
		System.out.println("Score: " + score);
		System.out.println("Hand:");
		for (Card card : hand) {
			card.describe();
		}
	}

	// Method to flip the top card of the hand
	public Card flip() {
		if (hand.isEmpty()) {
			System.out.println("Hand is empty.");
			return null;
		}
		return hand.remove(0);
	}

	// Method to draw a card from the deck
	public void draw(Deck deck) {
		Card drawnCard = deck.draw();
		if (drawnCard != null) {
			hand.add(drawnCard);
		}
	}

	// Method to increment the player's score
	public void incrementScore() {
		score++;
	}

	public int getScore() {
		return score;
	}
}
