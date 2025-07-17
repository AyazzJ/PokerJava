package fr.esgi;

import java.util.List;

public class HandEvaluator {
    public static Hand evaluate(List<Card> cards) {
        RoyalFlush royalFlush = new RoyalFlush(cards);
        if (royalFlush.rank == 10) return royalFlush;
        StraightFlush straightFlush = new StraightFlush(cards);
        if (straightFlush.rank == 9) return straightFlush;
        FourOfAKind fourOfAKind = new FourOfAKind(cards);
        if (fourOfAKind.rank == 8) return fourOfAKind;
        FullHouse fullHouse = new FullHouse(cards);
        if (fullHouse.rank == 7) return fullHouse;
        Flush flush = new Flush(cards);
        if (flush.rank == 6) return flush;
        Straight straight = new Straight(cards);
        if (straight.rank == 5) return straight;
        ThreeOfAKind threeOfAKind = new ThreeOfAKind(cards);
        if (threeOfAKind.rank == 4) return threeOfAKind;
        TwoPair twoPair = new TwoPair(cards);
        if (twoPair.rank == 3) return twoPair;
        Pair pair = new Pair(cards);
        if (pair.rank == 2) return pair;
        return new HighCard(cards);
    }
} 