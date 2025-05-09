package com.pluralsight;

import java.util.Scanner;

public class CardApp {
static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Enter name for Player 1: ");
        String name1 = myScanner.nextLine().trim();
        while (name1.isEmpty()) {
            System.out.println("Name cannot be empty. Please try again.");
            System.out.print("Enter name for Player 1: ");
            name1 = myScanner.nextLine().trim();
        }
        Player player1 = new Player(name1, new Hand());

        System.out.print("Enter name for Player 2: ");
        String name2 = myScanner.nextLine().trim();
        while (name2.isEmpty()) {
            System.out.println("Name cannot be empty. Please try again.");
            System.out.print("Enter name for Player 2: ");
            name2 = myScanner.nextLine().trim();
        }
        Player player2 = new Player(name2, new Hand());

        // Create and shuffle the deck
        Deck deck = new Deck();
        deck.shuffle();

        // Deal 2 cards to each player's hand
        for (int i = 0; i < 2; i++) {
            player1.getHand().deal(deck.deal());
            player2.getHand().deal(deck.deal());
        }

        // Optional: Print hands and hand values
        System.out.println(player1.getName() + "'s hand: " + player1.getHand());
        System.out.println(player2.getName() + "'s hand: " + player2.getHand());
        System.out.println(player1.getName() + "'s total: " + player1.getHand().getValue());
        System.out.println(player2.getName() + "'s total: " + player2.getHand().getValue());

        // Determine winner
        int value1 = player1.getHand().getValue();
        int value2 = player2.getHand().getValue();

        if (value1 > 21 && value2 > 21) {
            System.out.println("Both players busted. No winner.");
        } else if (value1 > 21) {
            System.out.println(player2.getName() + " wins!");
        } else if (value2 > 21) {
            System.out.println(player1.getName() + " wins!");
        } else if (value1 > value2) {
            System.out.println(player1.getName() + " wins!");
        } else if (value2 > value1) {
            System.out.println(player2.getName() + " wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }
    }






