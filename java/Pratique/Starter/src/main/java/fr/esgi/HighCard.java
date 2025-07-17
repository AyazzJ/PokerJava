package fr.esgi;

import java.util.List;

public class HighCard extends Hand {
    public HighCard(List<Card> cards) {
        super(cards);
        this.name = "High Card";
        this.rank = 1;
        evaluate();
    }
    @Override
    public void evaluate() {
    }
} 