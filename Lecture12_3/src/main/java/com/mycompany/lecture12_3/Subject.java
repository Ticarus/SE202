package com.mycompany.lecture12_3;

import java.util.ArrayList;

public class Subject implements SubjectInterface{
    private int flag;
    ArrayList<Observer> observerList = new ArrayList<Observer>();
    
    public int getFlag(){
        return flag;
    }
    
    public void setFlag(int flag){
        this.flag = flag;
        //Flag value changed. So notify registered users/observers.
        notifyRegisteredUsers(flag);
    }
    
    public void register(Observer anObserver){
        observerList.add(anObserver);
    }
    
    public void unregister(Observer anObserver){
        observerList.remove(anObserver);
    }
    
    public void notifyRegisteredUsers(int updatedValue){
        for(Observer observer : observerList){
            observer.update(updatedValue);
        }
    }
}
