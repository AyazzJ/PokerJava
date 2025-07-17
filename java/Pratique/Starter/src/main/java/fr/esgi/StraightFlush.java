package fr.esgi;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StraightFlush extends Hand {
    public StraightFlush(List<Card> cards) {
        super(cards);
        this.name = "Straight Flush";
        this.rank = 9;
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
        boolean isStraight = true;
        for (int i = 1; i < cards.size(); i++) {
            if (cards.get(i).getValue() != cards.get(i - 1).getValue() + 1) {
                isStraight = false;
                break;
            }
        }
        if (!isStraight && cards.get(4).getValue() == 14) {
            isStraight = cards.get(0).getValue() == 2 &&
                         cards.get(1).getValue() == 3 &&
                         cards.get(2).getValue() == 4 &&
                         cards.get(3).getValue() == 5;
        }
        if (!(isFlush && isStraight)) {
            this.rank = 1;
            this.name = "High Card";
        }
    }
} 