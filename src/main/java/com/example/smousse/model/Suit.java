package com.example.smousse.model;

public enum Suit {
    HEARTS("h"),
    DIAMONDS("d"),
    CLUBS("c"),
    SPADES("s");

    private final String name;

    Suit(String name) {
        this.name = name;
    }

    public static Suit getSuit(String name) {
        for (Suit s : values()) {
            if (s.name.equalsIgnoreCase(name)) {
                return s;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return name;
    }
}
