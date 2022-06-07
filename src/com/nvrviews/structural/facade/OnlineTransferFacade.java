package com.nvrviews.structural.facade;

public class OnlineTransferFacade {
    private BankService service = new BankService();

    public void transferAmount(long sourceAcc, long destAccount, double amount){
        service.getAccountSummary(sourceAcc);
        service.getAccountSummary(destAccount);
        System.out.println("--------------------------------------------------");
        service.withdrawAmount(sourceAcc, amount);
        service.depositAmount(destAccount, amount);
    }


}
