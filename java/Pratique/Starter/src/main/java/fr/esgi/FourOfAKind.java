package fr.esgi;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FourOfAKind extends Hand {
    public FourOfAKind(List<Card> cards) {
        super(cards);
        this.name = "Four of a Kind";
        this.rank = 8;
        evaluate();
    }
    @Override
    public void evaluate() {
        Map<String, Integer> rankCount = new HashMap<>();
        for (Card card : cards) {
            rankCount.put(card.getRank(), rankCount.getOrDefault(card.getRank(), 0) + 1);
        }
        boolean foundFour = false;
        for (int count : rankCount.values()) {
            if (count == 4) {
                foundFour = true;
                break;
            }
        }
        if (!foundFour) {
            this.rank = 1;
            this.name = "High Card";
        }
    }
} 