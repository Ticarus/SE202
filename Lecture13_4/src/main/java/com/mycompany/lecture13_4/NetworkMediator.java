package com.mycompany.lecture13_4;

import java.util.ArrayList;

public class NetworkMediator implements Mediator{
    ArrayList<Colleague> colleagues = new ArrayList<Colleague>();
    
    public NetworkMediator(){
        
    }
    
    public void register(Colleague colleague){
        colleagues.add(colleague);
        for(Colleague other : colleagues){
            if(other != colleague){
                other.receiveRegisterNotification(colleague);
            }
        }
    }
    
    public void unregister(Colleague colleague){
        colleagues.remove(colleague);
        for(Colleague other : colleagues){
            other.receiveUnRegisterNotification(colleague);
        }
    }
}
