package com.mycompany.lecture6_1;

public class TwitterStrategy implements ISocialMediaStrategy{
    public void connectTo(String friendName){
        System.out.println("Connecting with " + friendName + " through Twitter");
    }
}
