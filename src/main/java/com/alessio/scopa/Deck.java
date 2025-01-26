package com.alessio.scopa;

import java.util.ArrayList;
import java.util.Collections;

public abstract class Deck {
    protected final ArrayList<Card> cards; // List of cards in the deck

    // Constructor
    public Deck() {
        this.cards = new ArrayList<>();
        initializeDeck(); // Abstract method to be implemented in derived classes
    }

    // Abstract method for initializing deck
    protected abstract void initializeDeck();

    // Shuffles the deck
    public void shuffleDeck() {
        Collections.shuffle(cards);
        Collections.shuffle(cards);
        Collections.shuffle(cards);
    }

    // Draws a card from deck
    public Card drawCard() {
        if (cards.isEmpty()) {
            throw new IllegalStateException("The deck is empty!");
        }
        return cards.remove(0); // Removes and returns first card of deck
    }

    // Resets the deck (empties, reinitializes and shuffles)
    public void resetDeck() {
        cards.clear();
        initializeDeck();
        shuffleDeck();
    }

    // Number of remaining cards
    public int remainingCards() {
        return cards.size();
    }

    // Debug method to print the deck
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Card Card : cards) {
            sb.append(Card).append("\n");
        }
        return sb.toString();
    }
}

/*
// Method for initialize deck with all the 40 neapolitan cards
private void initializeDeck() {
    String[] suits = {"Cups", "Coins", "Swords", "Clubs"};
    for (String suit : suits) {
        for (int value = 1; value <= 10; value++) {
            cards.add(new Card(value, suit));
        }
    }
    }*/