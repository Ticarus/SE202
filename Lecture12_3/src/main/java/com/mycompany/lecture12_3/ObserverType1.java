package com.mycompany.lecture12_3;

public class ObserverType1 implements Observer{
    String nameOfObserver;
    
    public ObserverType1(String name){
        nameOfObserver = name;
    }
    
    public void update(int updatedValue){
        System.out.println(nameOfObserver + " has received an alert: Updated myValue in Subject is: " + updatedValue);
    }
}
