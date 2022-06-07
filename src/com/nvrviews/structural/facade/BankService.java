package com.nvrviews.structural.facade;

public class BankService {
    AccountRepository repo = new AccountRepository();

    public double getBalance(long accountNumber){
        return repo.getAccount(accountNumber).getBalance();
    }

    private boolean checkAvailableBalance(double availableBalance, double amount){
        return availableBalance >= amount;
    }

    public void withdrawAmount(long accountNumber, double amount){
        BankAccount a = repo.getAccount(accountNumber);

        if(checkAvailableBalance(a.getBalance(), amount)){
            a.setBalance(a.getBalance() - amount);
            repo.updateAccounts(a);
        }

        System.out.println(a);
    }

    public void depositAmount(long accountNumber, double amount){
        BankAccount a = repo.getAccount(accountNumber);
        a.setBalance(a.getBalance() + amount);
        repo.updateAccounts(a);

        System.out.println(a);
    }

    public void getAccountSummary(long accountNumber){
        BankAccount a = repo.getAccount(accountNumber);
        System.out.println(a);
    }

}
