package se.lexicon;

import se.lexicon.thebank.Bank;
import se.lexicon.thebank.accounts.CheckingAccount;
import se.lexicon.thebank.accounts.LoanAccount;
import se.lexicon.thebank.accounts.SavingsAccount;

public class Main {
    void main() {
    
        //Bank 
        Bank bank = new Bank("Lexicon Bank");
        bank.addAccount(new SavingsAccount("Xemnas", 1000, 0.02));
        bank.addAccount(new CheckingAccount("Saix", 500, 25));
        bank.addAccount(new LoanAccount("Axel", 5000, 0.03));
        
        bank.printAllSummaries();
        bank.processAllAccounts();
        bank.printAllSummaries();
    }
}
