package com.mycompany.lecture12_2;

import java.util.ArrayList;

public class HeadHunter implements Subject{
    //define a list of users, such as Mike, Bill, etc.
    private ArrayList<Observer> userList;
    private ArrayList<String> jobs;
    
    public HeadHunter(){
        userList = new ArrayList<Observer>();
        jobs = new ArrayList<String>();
    }
    
    public void registerObserver(Observer o){
        userList.add(o);
    }
    
    public void removeObserver(Observer o){
        userList.remove(o);
    }
    
    public void notifyAllObservers(){
        for(Observer o : userList){
            o.update(this);
        }
    }
    
    public void addJob(String job){
        this.jobs.add(job);
        notifyAllObservers();
    }
    
    public ArrayList<String> getJobs(){
        return jobs;
    }
    
    public String toString(){
        return jobs.toString();
    }
}
