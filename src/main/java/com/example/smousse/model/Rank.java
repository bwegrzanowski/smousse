package com.example.smousse.model;

public enum Rank {
    ACE("A", 1), TWO("2", 2), THREE("3", 3), FOUR("4", 4), FIVE("5", 5), SIX("6", 6), SEVEN("7", 7), EIGHT("8", 8), NINE("9", 9), TEN("T", 10), JACK("J", 10), QUEEN("Q", 10), KING("K", 10);

    private final String name;
    private int value;

    Rank(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public static Rank getRank(String name) {
        for (Rank r : values()) {
            if (r.name.equals(name)) {
                return r;
            }
        }
        return null;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return name;
    }
}
