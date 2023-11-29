package dispenser;

import java.util.Scanner;

public class DispenserApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display the available drinks and prices
        System.out.println("Water = 55 Lek, Cola = 80 Lek");
        System.out.print("What would you like to drink? (Enter 1 for Water, 2 for Cola): ");
        int choice = scanner.nextInt();

        // Validate the user's drink choice
        if (choice != 1 && choice != 2) {
            System.out.println("Incorrect input, please try again!");
            System.exit(0);
        }

        // Determine the chosen beverage and its price
        String beverage = (choice == 1) ? "Water" : "Cola";
        int price = (choice == 1) ? 55 : 80;

        // Initialize a transaction with the chosen beverage and price
        Transaction transaction = new Transaction(beverage, price);

        // Display the initial balance due
        System.out.println("Balance due " + (price - transaction.getBalance()) + " Lek");

        // Loop to handle coin insertion until the balance is sufficient
        while (transaction.getBalance() < price) {
            System.out.print("Insert coin (5, 10, 20, 50, 100): ");
            int coin = scanner.nextInt();

            // Check if the inserted coin denomination is valid
            if (isValidCoin(coin)) {
                // Update the transaction with the inserted coin and display the updated balance
                transaction.insertCoin(coin);
                transaction.displayBalance();
            } else {
                System.out.println("Invalid coin denomination. Please insert a valid coin.");
            }
        }

        // Process the transaction and display the outcome
        transaction.processTransaction();

        // Display the individual coins inserted
        System.out.println("You inserted: " + transaction.getCoinsInserted());

        scanner.close();
    }

    // Check if the coin denomination is valid (5, 10, 20, 50, 100)
    private static boolean isValidCoin(int coin) {
        return coin == 5 || coin == 10 || coin == 20 || coin == 50 || coin == 100;
    }
}