package com.mycompany.lecture13_4;

public abstract class Colleague {
    protected Mediator mediator;
    private String name;
    
    public Colleague(Mediator mediator, String name){
        this.mediator = mediator;
        this.name = name;
    }
    
    public String toString(){
        return name;
    }
    
    public abstract void receiveRegisterNotification(Colleague colleague);
    public abstract void receiveUnRegisterNotification(Colleague colleague);
}
