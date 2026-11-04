package se.lexicon.thebank;

import se.lexicon.thebank.accounts.Account;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private List<Account> accounts;
    
    public Bank(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }
    
    public void addAccount(Account account) {
        accounts.add(account);
    }
    
    public void processAllAccounts() {
        for (Account account : accounts) {
            account.processMonth();
        }
    }
    
    public void printAllSummaries() {
        for (Account account : accounts) {
            account.printSummary();
        }
    }
}
