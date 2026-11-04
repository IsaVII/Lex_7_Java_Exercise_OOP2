package se.lexicon.thebank.accounts;

public class SavingsAccount extends Account {
    
    private final double interestRate;
    
    public SavingsAccount(String holder, double balance, double interestRate) {
        super(holder, balance);
        this.interestRate = interestRate;
    }
    
    @Override
    public void processMonth() {
        
    }
}
