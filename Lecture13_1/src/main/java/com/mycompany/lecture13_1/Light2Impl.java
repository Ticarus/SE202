package com.mycompany.lecture13_1;

public class Light2Impl extends Light2{
    public Light2Impl(String color,LightMediator2 LightMediator){
        super(color, LightMediator);
    }
    
    //Turns ON the light and notify mediator for the same
    public void turnON(){
        state = true;
        System.out.printf("%s is turned %s \n", this, state);
        LightMediator.notifyMediator(this);
    }
    
    //Turn OFF the light 
    public void turnOFF(){
        state = false;
        System.out.printf("%s is turned %s \n", this, state);
    }
}
