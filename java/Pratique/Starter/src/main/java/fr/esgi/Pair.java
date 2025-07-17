package fr.esgi;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pair extends Hand {
    public Pair(List<Card> cards) {
        super(cards);
        this.name = "Pair";
        this.rank = 2;
        evaluate();
    }
    @Override
    public void evaluate() {
        Map<String, Integer> rankedCount = new HashMap<>();
        for (Card card : cards) {
            rankedCount.put(card.getRank(), rankedCount.getOrDefault(card.getRank(), 0) + 1);
        }
        boolean foundPair = false;
        for (int count : rankedCount.values()) {
            if (count == 2) {
                foundPair = true;
                break;
            }
        }
        if (!foundPair) {
            this.rank = 1;
            this.name = "High Card";
        }
    }
} 