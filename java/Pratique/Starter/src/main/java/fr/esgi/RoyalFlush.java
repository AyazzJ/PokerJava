package fr.esgi;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RoyalFlush extends Hand {
    public RoyalFlush(List<Card> cards) {
        super(cards);
        this.name = "Royal Flush";
        this.rank = 10;
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
        cards.sort(Comparator.comparingInt(Card::getValue));
        boolean isRoyal = cards.get(0).getValue() == 10 &&
                          cards.get(1).getValue() == 11 &&
                          cards.get(2).getValue() == 12 &&
                          cards.get(3).getValue() == 13 &&
                          cards.get(4).getValue() == 14;
        if (!(isFlush && isRoyal)) {
            this.rank = 1;
            this.name = "High Card";
        }
    }
} 