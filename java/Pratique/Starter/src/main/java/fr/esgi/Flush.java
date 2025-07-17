package fr.esgi;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Flush extends Hand {
    public Flush(List<Card> cards) {
        super(cards);
        this.name = "Flush";
        this.rank = 6;
        evaluate();
    }

    @Override
    public void evaluate() {
        Map<String, Integer> suitCount = new HashMap<>();
        for (Card card : cards) {
            suitCount.put(card.getSuit(), suitCount.getOrDefault(card.getSuit(), 0) + 1);
        }
        boolean isFlush = false;
        for (int count : suitCount.values()) {
            if (count == 5) {
                isFlush = true;
                break;
            }
        }
        if (!isFlush) {
            this.rank = 1;
            this.name = "High Card";
        }
    }
}

