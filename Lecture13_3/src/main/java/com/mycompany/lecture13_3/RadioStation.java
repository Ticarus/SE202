package com.mycompany.lecture13_3;

import java.util.ArrayList;

public class RadioStation {
    private final double frequency;
    private final ArrayList<RadioListener> listeners = new ArrayList<>();
    private RadioListener currentListener;
    
    public RadioStation(double frequency){
        this.frequency = frequency;
    }
    
    public void tuneIn(RadioListener newListener){
        listeners.add(newListener);
    }
    
    public void call(RadioListener listener, String discussion){
        System.out.println("Welcome back, this is talk radio station " + frequency + ",and we're here to answer your questions!");
        System.out.println("Let's take a call from " + listener.getName() + ". " + listener.getName() + " welcome to the show!");
        System.out.println(listener.getName() + " says: " + discussion + "\n");
        currentListener = listener;
        discussion = "I am " + listener.getName() + " " + discussion;
        broadcast(discussion);
    }
    
    private void broadcast(String discussion){
        for(RadioListener listener : listeners){
            if(listener != currentListener){
                listener.listen(discussion);
            }
        }
    }
}