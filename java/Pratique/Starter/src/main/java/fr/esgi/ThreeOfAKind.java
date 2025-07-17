package fr.esgi;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThreeOfAKind extends Hand {
    public ThreeOfAKind(List<Card> cards) {
        super(cards);
        this.name = "Three of a Kind";
        this.rank = 4;
        evaluate();
    }
    @Override
    public void evaluate() {
        Map<String, Integer> rankCount = new HashMap<>();
        for (Card card : cards) {
            rankCount.put(card.getRank(), rankCount.getOrDefault(card.getRank(), 0) + 1);
        }
        boolean foundThree = false;
        for (int count : rankCount.values()) {
            if (count == 3) {
                foundThree = true;
                break;
            }
        }
        if (!foundThree) {
            this.rank = 1;
            this.name = "High Card";
        }
    }
} 