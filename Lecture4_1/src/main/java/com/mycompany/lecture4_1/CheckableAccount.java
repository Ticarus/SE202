package com.mycompany.lecture4_1;

public class CheckableAccount extends BankAccount implements Checkable{
    public CheckableAccount(String numberIn, String nameIn){
        super(numberIn, nameIn);
    }
    
    public boolean check(){
        if(getAccountNumber().length() != 8){
            return false;
        }
        
        for(int i = 0 ; i <= 7 ; i++){
            if(!Character.isDigit(getAccountNumber().charAt(i))){
                return false;
            }
        }
        return true;
    }
}
