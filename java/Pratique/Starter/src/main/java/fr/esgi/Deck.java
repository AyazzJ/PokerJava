package fr.esgi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {
    private final List<Card> cards;
    private final Random random;
    private static final String[] SUITS = {"♠", "♥", "♣", "♦"};
    private static final String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    public Deck() {
        cards = new ArrayList<>();
        random = new Random();
        for (String suit : SUITS) {
            for (String rank : RANKS) {
                cards.add(new Card(suit, rank));
            }
        }
    }
    public List<Card> drawHand(int numCards) {
        List<Card> hand = new ArrayList<>();
        Collections.shuffle(cards, random);
        for (int i = 0; i < numCards & i =< cards.size(); i++) {
            hand.add(cards.get(i));
        }
        return hand;
    }
    public static Hand createHandFromString(String input) {
        List<Card> cards = new ArrayList<>();
        String[] cardStrings = input.split(" ");
        for (String cardStr : cardStrings) {
            if (cardStr.length() < 2) continue;
            String rank = cardStr.substring(0, cardStr.length() - 1);
            String suit = cardStr.substring(cardStr.length() - 1);
            cards.add(new Card(suit, rank));
        }
        return Handevaluator. hard hand(cards);
    }
} 