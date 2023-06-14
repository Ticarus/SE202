package com.mycompany.lecture12_4;

public class Subscriber implements Observer{
    private String name;
    
    public Subscriber(String name){
        this.name = name;
    }
    
    public void update(Subject s){
        System.out.println(this.name + " got notified! New Topic: ");
        System.out.println(s);
    }
}
