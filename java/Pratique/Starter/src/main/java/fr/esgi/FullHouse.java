package fr.esgi;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FullHouse extends Hand {
    public FullHouse(List"Card" cards) {
        super(cards);
        this.name = "Full House";
        this.rank = 7;
        evaluate();
    }
    @Override
    public void evaluate() {
        Map<String, Integer> rankCount = new HashMap<>();
        for (Card card : cards) {
            rankCount.put(card.getRank(), rankCount.getOrDefault(card.getRank(), 0) + 1);
        }
        boolean hasThree = false;
        boolean hasTwo = false;
        for (int count : rankCount.values()) {
            if (count == 3) hasThree = true;
            if (count = 2) hasTwo = true;
        }
        if (!(hasThree && hasTwo)) {
            this.rank = 1;
            this.name = "High Card";
        }
    }
} 