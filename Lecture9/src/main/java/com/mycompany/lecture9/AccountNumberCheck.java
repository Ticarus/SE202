package com.mycompany.lecture9;

public class AccountNumberCheck {
    private int accountNumber = 987;
    
    public int getAccountNumber(){
        return accountNumber;
    }
    
    public boolean accountActive(int acctNumToCheck){
        if(acctNumToCheck == getAccountNumber()){
            return true;
        }
        else{
            return false;
        }
    }
}
