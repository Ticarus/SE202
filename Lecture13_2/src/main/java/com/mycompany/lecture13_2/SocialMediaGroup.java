package com.mycompany.lecture13_2;

public interface SocialMediaGroup {
    //Contract method for sending notification massages
    public void sendMessage(String msg, Subscriber user);
    
    //Contract method for add Subscriber
    void addSubscriber(Subscriber user);
}
