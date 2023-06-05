package com.mycompany.lecture9;

public class TestBankAccount {
    public TestBankAccount(){
        BankAccountFacade testBank = new BankAccountFacade(987, 1234);
        testBank.withdrawCash(50);
        testBank.withdrawCash(900);
        testBank.depositCash(200);
    }
}
