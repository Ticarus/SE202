package com.mycompany.lecture12_4;

import java.util.ArrayList;

public class TopicEnrollment implements Subject{
    private ArrayList<Observer> userList;
    private ArrayList<String> topics;
    
    public TopicEnrollment(){
        userList = new ArrayList<Observer>();
        topics = new ArrayList<String>();
    }
    
    public void subscribeObserver(Observer o){
        userList.add(o);
    }
    
    public void unSubscribeObserver(Observer o){
        userList.remove(o);
    }
    
    public void notifyAllObservers(){
        for(Observer o : userList){
            o.update(this);
        }
    }
    
    public void addTopic(String topic){
        this.topics.add(topic);
        notifyAllObservers();
    }
    
    public ArrayList<String> getTopic(){
        return topics;
    }
    
    public String toString(){
        return topics.toString();
    }
}
