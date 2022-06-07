package com.nvrviews.structural.facade;

import java.util.HashMap;
import java.util.Map;

public class AccountRepository {
    private Map<Long, BankAccount> accounts = new HashMap<>();

    public AccountRepository() {
        this.accounts.put(1L, new BankAccount(1, "Rajesh", 200000));
        this.accounts.put(2L, new BankAccount(2, "kalyani", 300000));
    }

    public BankAccount getAccount(long accountNo){
        return this.accounts.get(accountNo);
    }

    public void updateAccounts(BankAccount account){
        this.accounts.put(account.getAccountNumber(), account);
    }
}
