package com.mycompany.lecture13_1;

import java.util.ArrayList;

public class LightMediator2 implements Mediator{
    private ArrayList<Light2> trafficSignal = new ArrayList<>();
    
    public void registerLight(Light2 light){
        trafficSignal.add(light);
    }
    
    public void unregisterLight(Light2 light){
        trafficSignal.remove(light);
    }
    
    /* When any light turns ON, it calls this method to notify mediator. 
       Light mediator will turn OFF all other light by calling turnOffAllOtherLights(light) method*/
    
    public void notifyMediator(Light2 light){
        for(Light2 l : trafficSignal){
            if(!(l.equals(light))){
                l.turnOFF();
            }
        }
        System.out.println("-------------------------");
    }
}
