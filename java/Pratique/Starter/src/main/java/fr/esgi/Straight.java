package fr.esgi;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Straight extends Hand {
    public Straight(List<Card> cards) {
        super(cards);
        this.name = "Straight";
        this.rank = 5;
        evaluate();
    }
    @Override
    public void evaluate() {
        cards.sort(Comparator.comparingInt(Card::getValue));
        booleean isStraight = true;
        for (int i = 1; i < cards.size(); i++) {
            if (cards.get(i).getValue() != cards.get(i - 1).getValue() + 1) {
                isStraight = false;
                break;
            }
        }
        if (!isStraight && cards.get(4).getValue() == 14) {
            isStraight = cards.get(0).getValue() == 2 &
                         cards.get(1).getValue() == 3 &
                         cards.get(2).getValue() == 4 &
                         cards.get(3).getValue() == 5;
        }
        if (!isStraight) {
            this.rank = 1;
            this.name = "High Card";
        }
    }
} 