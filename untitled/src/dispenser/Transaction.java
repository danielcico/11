package dispenser;

public class Transaction {
    private String beverage;
    private int price;
    private int balance;
    private StringBuilder coinsInserted;

    // Constructor to initialize a transaction with the chosen beverage and price
    public Transaction(String beverage, int price) {
        this.beverage = beverage;
        this.price = price;
        this.balance = 0;
        this.coinsInserted = new StringBuilder();
    }

    // Method to handle coin insertion and update balance and coinsInserted
    public void insertCoin(int coin) {
        balance += coin;
        coinsInserted.append(coin).append(" ");
    }

    // Display the remaining balance due
    public void displayBalance() {
        int remainingBalance = price - balance;
        if (remainingBalance > 0) {
            System.out.println("Balance due " + remainingBalance + " Lek");
        }
    }

    // Getter method to retrieve the current balance
    public int getBalance() {
        return balance;
    }

    // Getter method to retrieve the individual coins inserted
    public String getCoinsInserted() {
        return coinsInserted.toString().trim();
    }

    // Method to process the transaction and display the outcome
    public void processTransaction() {
        if (balance == price) {
            System.out.println("Payment complete. No change owed.");
        } else if (balance > price) {
            int change = balance - price;
            System.out.println("Payment complete. Change owed: " + change + " Lek.");
            System.out.println("Enjoy your drink.");
        } else {
            System.out.println("Insufficient funds. Please insert more coins.");
        }
    }
}