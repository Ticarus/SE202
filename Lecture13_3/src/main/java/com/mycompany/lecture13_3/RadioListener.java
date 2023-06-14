package com.mycompany.lecture13_3;

public class RadioListener {
    private final String name;
    private final RadioStation station;
    
    public RadioListener(String name, RadioStation station){
        this.name = name;
        this.station = station;
        station.tuneIn(this);
    }
    
    public void callIn(String discussion){
        station.call(this,discussion);
    }
    
    public void listen(String discussion){
        System.out.println(getName() + " heard " + discussion + " on the radio.");
    }
    
    public String getName(){
        return name;
    }
}