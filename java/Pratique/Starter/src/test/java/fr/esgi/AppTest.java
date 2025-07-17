package fr.esgi;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    public void testCreateHandFromString() {
        String input = "A♠ K♥ Q♣ J♦ 10♠";
        Hand hand = Deck.createHandFromString(input);
        assertNotNull(hand);
        assertEquals("High Card", hand.toString().split(":")[0]);
    }
    
    @Test
    public void testCompareHands() {
        // Create two hands where one is clearly better
        Hand hand1 = Deck.createHandFromString("A♠ K♥ Q♣ J♦ 10♠");  // Ace high
        Hand hand2 = Deck.createHandFromString("K♠ Q♥ J♣ 10♦ 9♠");  // King high
        
        assertTrue(hand1.compareTo(hand2) > 0);  // hand1 should win
    }

    @Test
    public void testDetectPair() {
        Hand hand = Deck.createHandFromString("A♠ A♥ Q♣ J♦ 10♠");
        assertEquals("Pair", hand.toString().split(":")[0]);
    }

    @Test
    public void testDetectTwoPair() {
        Hand hand = Deck.createHandFromString("A♠ A♥ Q♣ Q♦ 10♠");
        assertEquals("Two Pair", hand.toString().split(":")[0]);
    }

    @Test
    public void testDetectThreeOfAKind() {
        Hand hand = Deck.createHandFromString("A♠ A♥ A♣ J♦ 10♠");
        assertEquals("Three of a Kind", hand.toString().split(":")[0]);
    }

    @Test
    public void testDetectStraight() {
        Hand hand = Deck.createHandFromString("6♠ 7♥ 8♣ 9♦ 10♠");
        assertEquals("Straight", hand.toString().split(":")[0]);
    }

    @Test
    public void testDetectFlush() {
        Hand hand = Deck.createHandFromString("2♠ 5♠ 7♠ 9♠ J♠");
        assertEquals("Flush", hand.toString().split(":")[0]);
    }

    @Test
    public void testDetectFullHouse() {
        Hand hand = Deck.createHandFromString("A♠ A♥ A♣ J♦ J♠");
        assertEquals("Full House", hand.toString().split(":")[0]);
    }

    @Test
    public void testDetectFourOfAKind() {
        Hand hand = Deck.createHandFromString("A♠ A♥ A♣ A♦ 10♠");
        assertEquals("Four of a Kind", hand.toString().split(":")[0]);
    }

    @Test
    public void testDetectStraightFlush() {
        Hand hand = Deck.createHandFromString("6♠ 7♠ 8♠ 9♠ 10♠");
        assertEquals("Straight Flush", hand.toString().split(":")[0]);
    }

    @Test
    public void testDetectRoyalFlush() {
        Hand hand = Deck.createHandFromString("10♠ J♠ Q♠ K♠ A♠");
        assertEquals("Royal Flush", hand.toString().split(":")[0]);
    }

    @Test
    public void testHandComparison() {
        Hand royalFlush = Deck.createHandFromString("10♠ J♠ Q♠ K♠ A♠");
        Hand straightFlush = Deck.createHandFromString("6♠ 7♠ 8♠ 9♠ 10♠");
        Hand fourOfAKind = Deck.createHandFromString("A♠ A♥ A♣ A♦ 10♠");
        Hand fullHouse = Deck.createHandFromString("A♠ A♥ A♣ J♦ J♠");
        Hand flush = Deck.createHandFromString("2♠ 5♠ 7♠ 9♠ J♠");
        Hand straight = Deck.createHandFromString("6♠ 7♥ 8♣ 9♦ 10♠");
        Hand threeOfAKind = Deck.createHandFromString("A♠ A♥ A♣ J♦ 10♠");
        Hand twoPair = Deck.createHandFromString("A♠ A♥ Q♣ Q♦ 10♠");
        Hand pair = Deck.createHandFromString("A♠ A♥ Q♣ J♦ 10♠");
        Hand highCard = Deck.createHandFromString("A♠ K♥ Q♣ J♦ 9♠");

        assertTrue(royalFlush.compareTo(straightFlush) > 0);
        assertTrue(straightFlush.compareTo(fourOfAKind) > 0);
        assertTrue(fourOfAKind.compareTo(fullHouse) > 0);
        assertTrue(fullHouse.compareTo(flush) > 0);
        assertTrue(flush.compareTo(straight) > 0);
        assertTrue(straight.compareTo(threeOfAKind) > 0);
        assertTrue(threeOfAKind.compareTo(twoPair) > 0);
        assertTrue(twoPair.compareTo(pair) > 0);
        assertTrue(pair.compareTo(highCard) > 0);
    }
} 