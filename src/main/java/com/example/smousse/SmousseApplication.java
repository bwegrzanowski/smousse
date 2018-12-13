package com.example.smousse;

import com.example.smousse.model.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static java.util.Arrays.asList;

@SpringBootApplication
public class SmousseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmousseApplication.class, args);

		Rank rank = Rank.getRank("9");
		Suit suit = Suit.getSuit("c");
		Card card = new Card(rank, suit);

		Hand hand = new Hand(asList(card, card, card));

		System.out.println(card);
		System.out.println(HandValuer.value(asList(card, card, card)));
		System.out.println(hand.getValue());

	}
}
