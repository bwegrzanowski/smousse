package com.example.smousse.model;

import java.util.List;

public class HandValuer {
    private static final int target = 7;

    private HandValuer() {
    }

    public static int value(List<Card> cards) {
        if (cards.isEmpty()) {
            return 0;
        }
        int value = 0;
        for (Card c : cards) {
            value += c.getRank().getValue();
        }
        return value;
    }
}
