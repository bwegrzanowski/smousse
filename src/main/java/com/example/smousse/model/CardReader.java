package com.example.smousse.model;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Arrays.stream;
import static java.util.stream.Collectors.toList;

public class CardReader {

    public static List<Card> toCardList(String cards) {
        return stream(cards.split(" ")).map(CardReader::fromString).collect(toList());
    }

    public static Card fromString(String name) {
        assertValidFormat(name.toUpperCase());
        return new Card(Rank.getRank(String.valueOf(name.charAt(0))), Suit.getSuit(String.valueOf(name.charAt(1))));
    }

    private static boolean assertValidFormat(String card) {
        if (card.equals("")) {
            return true;
        }
        List<Character> ranks = asList('A', '2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K');
        List<Character> suits = asList('C', 'S', 'D', 'H');
        if (card.length() != 2 || !ranks.contains(card.charAt(0)) || !suits.contains(card.charAt(1))) {
            return false;
        }
        return true;
    }
}
