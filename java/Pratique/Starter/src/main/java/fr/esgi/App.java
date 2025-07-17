package fr.esgi;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to Simple Poker Game!");
        Deck deck = new Deck();
        int rounds = 5;
        for (int round = 1; round <= rounds; round++) {
            System.out.println("\nRound " + round);
            System.out.println("---------");
            Hand player1Hand = HandEvaluator.evaluate(deck.drawHand(5));
            Hand player2Hand = HandEvaluator.evaluate(deck.drawHand(5));
            System.out.println("Player 1: " + player1Hand);
            System.out.println("Player 2: " + player2Hand);
            int comparison = player1Hand.compareTo(player2Hand);
            if (comparison > 0) {
                System.out.println("Player 1 wins!");
            } else if (comparison < 0) {
                System.out.println("Player 2 wins!");
            } else {
                System.out.println("It's a tie!");
            }
        }
    }
} 