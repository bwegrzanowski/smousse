package com.example.smousse.model;

import static java.util.Objects.requireNonNull;

public final class Card {
    private final Rank rank;
    private final Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = requireNonNull(rank);
        this.suit = requireNonNull(suit);
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return "Card{" + rank + suit + '}';
    }
}
