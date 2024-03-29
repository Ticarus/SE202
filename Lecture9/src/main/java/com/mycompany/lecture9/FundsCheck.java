package com.mycompany.lecture9;

public class FundsCheck {
    private double cashInAccount = 1000;
    
    public double getCashInAccount(){
        return cashInAccount;
    }
    
    public void decreaseCashInAccount(double cashWithdrawn){
        cashInAccount -= cashWithdrawn;
    }
    
    public void increaseCashInAccount(double cashDeposited){
        cashInAccount += cashDeposited;
    }
    
    public boolean haveEnoughMoney(double cashToWithdrawal){
        if(cashToWithdrawal > getCashInAccount()){
            System.out.println("error you don't have enough money");
            System.out.println("current money: " + getCashInAccount());
            return false;
        }
        else{
            decreaseCashInAccount(cashToWithdrawal);
            System.out.println("Withdrawal completed: current money is " + getCashInAccount());
            return true;
        }
    }
    
    public void makeDeposit(double cashToDeposit){
        increaseCashInAccount(cashToDeposit);
        System.out.println("Deposite completed: current money is " + getCashInAccount());
    }
}
