package se.lexicon.thebank.accounts;

public abstract class Account {
    private String holder;
    private double balance;
    
    public Account(String holder, double balance) {
        //reject a blank holder name or a negative balance
        if (holder == null || holder.trim().isEmpty()) {
            throw new IllegalArgumentException("Account holder name cannot be blank");
        }
        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }
        
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
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        
        balance += amount;
    }
    
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds for withdrawal");
        }
        
        balance -= amount;
    }
    
    public void printSummary() {
        IO.println(String.format("%-15s | Balance: %s kr",  holder, balance));
    }

    public abstract void processMonth();
    
}
