package com.mycompany.lecture12_1;

import java.util.ArrayList;

public class RedDress implements Observable{
    //List of users registered for notification
    private ArrayList<Observer> users = new ArrayList<Observer>();

    //state of dress
    private boolean inStock = true;
    
    //getter for inStock
    public boolean isInStock(){
        return inStock;
    }
    
    //setter for inStock
    public void setInStock(boolean inStock){
        this.inStock = inStock;
        notifyObserver();
    }
    
    @Override
    public void addObserver(Observer o){
        users.add(o);
    }
    
    @Override
    public void removeObserver(Observer o){
        users.remove(o);
    }
    
    @Override
    public void notifyObserver(){
        //notify all the users
        for(Observer user : users){
            user.update();
        }
    }
}
