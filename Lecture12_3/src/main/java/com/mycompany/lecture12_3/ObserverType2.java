package com.mycompany.lecture12_3;

public class ObserverType2 implements Observer{
    String nameOfObserver;
    
    public ObserverType2(String name){
        nameOfObserver = name;
    }
    
    public void update(int updatedValue){
        System.out.println(nameOfObserver + " has received an alert: The current value of myValue is Subject is: " + updatedValue);
    }
}
