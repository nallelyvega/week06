package week06_project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> cards;

	// Constructor
	public Deck() {
		// Initialize the list of cards
		cards = new ArrayList<>();
		// Populate the deck of cards
		populateDeck();
	}

	// Method to populate the deck with cards
	private void populateDeck() {
		String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
		String[] names = { "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen",
				"King", "Ace" };

		for (String suit : suits) {
			for (int value = 2; value <= 14; value++) {
				String name = names[value - 2] + " of " + suit;
				cards.add(new Card(value, name));
			}
		}
	}

	// Method to shuffle the cards
	public void shuffle() {
		Collections.shuffle(cards);
	}

	// Method to draw a card from the deck
	public Card draw() {
		if (cards.isEmpty()) {
			System.out.println("No cards left in the deck.");
		}
		return cards.remove(0);
	}
}
