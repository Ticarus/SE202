package com.mycompany.lecture13_2;

import java.util.ArrayList;

public class LearnAndShareGroup implements SocialMediaGroup{
    private ArrayList<Subscriber> subscribers;
    
    public LearnAndShareGroup(){
        this.subscribers = new ArrayList<>();
    }
    
    @Override
    public void addSubscriber(Subscriber subscriber){
        this.subscribers.add(subscriber);
    }
    
    @Override
    public void sendMessage(String msg, Subscriber senderSubscriber){
        for(Subscriber subscriber : this.subscribers){
            //Sender should not receive message.
            if(subscriber != senderSubscriber){
                subscriber.receive(msg);
            }
        }
    }
}
