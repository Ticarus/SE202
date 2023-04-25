package com.mycompany.lecture4_1;

public class BankAccount {
    private String accountNumber;
    private String accountName;
    protected double balance;
    
    public BankAccount(String accountNumber, String accountName){
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        balance = 0.0;
    }
    
    public BankAccount(String accountNumber, String accountName, double balance){
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }
    
    public String getAccountNumber(){
        return accountNumber;
    }
    
    public String getAccountName(){
        return accountName;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public void deposit(double amountIn){
        balance += amountIn;
    }
    
    public boolean withdraw(double amountIn){
        if(amountIn > balance){
            return false;
        }else{
            balance -= amountIn;
        }
        return true;
    }
}
