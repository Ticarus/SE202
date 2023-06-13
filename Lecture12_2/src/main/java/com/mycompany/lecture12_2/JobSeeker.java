package com.mycompany.lecture12_2;

public class JobSeeker implements Observer{
    private String name;
    
    public JobSeeker(String name){
        this.name = name;
    }
    
    public void update(Subject s){
        System.out.println(this.name + " got notified!");
        //print job list
        System.out.println(s);
    }
}
