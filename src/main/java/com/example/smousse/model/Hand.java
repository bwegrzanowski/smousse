package com.example.smousse.model;

import java.util.List;

public class Hand {
    private List<Card> cards;
    private int value;

    public Hand(List<Card> cards) {
        this.cards = cards;
        this.value = HandValuer.value(this.cards);
    }

    public List<Card> getCards() {
        return cards;
    }

    public int getValue() {
        return value;
    }
}
