package se.lexicon.thebank.accounts;

public abstract class Account {
    private String holder;
    private double balance;
    
    public Account(String holder, double balance) {
        this.holder = holder;
        this.balance = balance;
    }
    
    public String getHolder() {
        return holder;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    
    public void printSummary() {
        IO.println(String.format("%-20s: %s", "Account holder", holder));
        IO.println(String.format("%-20s: %s", "Balance", balance));
    }

    public abstract void processMonth();
    
}
