package com.mycompany.lecture12_1;

public class User implements Observer{
    private Observable observable = null;
    
    public User(Observable observable){
        this.observable = observable;
    }
    
    @Override
    public void update(){
        buyDress();
        unsubscribe();
    }
    
    public void buyDress(){
        System.out.println("Got my new Red Dress");
    }
    
    public void unsubscribe(){
        observable.removeObserver(this);
    }
}
