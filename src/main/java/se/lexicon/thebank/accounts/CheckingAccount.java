package se.lexicon.thebank.accounts;

public class CheckingAccount extends Account {
    
    private final double monthlyFee;
    
    public CheckingAccount(String holder, double balance, double monthlyFee) {
        super(holder, balance);
        this.monthlyFee = monthlyFee;
    }
    
    @Override
    public void processMonth() {
        withdraw(monthlyFee);
        IO.println(String.format("%s: monthly fee charged",  getHolder()));
    }
}
