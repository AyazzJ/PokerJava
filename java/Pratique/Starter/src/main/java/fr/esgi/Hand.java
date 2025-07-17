package fr.esgi;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand implements Comparable<Hand> {
    protected List<Card> cards;
    protected int rank;
    protected String name;
    public Hand(List<Card> cards) {
        this.cards = new ArrayList<>(cards);
    }
    public abstract void evaluate();
    @Override
    public int compareTo(Hand other) {
        if (this.rank != other.rank) {
            return Integer.compare(this.rank, other.rank);
        }
        return Integer.compare(getHighestCard().getValue(), other.getHighestCard().getValue());
    }
    protected Card getHighestCard() {
        Card highest = cards.get(0);
        for (Card card : cards) {
            if (card.getValue() > highest.getValue()) {
                highest = card;
            }
        }
        return highest;
    }
    @Override
    public String toString() {
        return name + ": " + cards;
    }
} 