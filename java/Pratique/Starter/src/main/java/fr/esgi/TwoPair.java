package fr.esgi;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoPair extends Hand {
    public TwoPair(List<Card> cards) {
        super(cards);
        this.name = "Two Pair";
        this.rank = 3;
        evaluate();
    }
    @Override
    public void evaluate() {
        Map<String, Integer> rankCount = new HashMap<>();
        for (Card card : cards) {
            rankCount.put(card.getRank(), rankCount.getOrDefault(card.getRank(), 0) + 1);
        }
        int pairs = 0;
        for (int count : rankCount.values()) {
            if (count == 2) {
                pairs++;
            }
        }
        if (pairs < 2) {
            this.rank = 1;
            this.name = "High Card";
        }
    }
} 