package com.mycompany.lecture13_1;

public abstract class Light2 {
    protected String color;
    protected LightMediator2 LightMediator;
    protected boolean state;
    
    Light2(String color, LightMediator2 LightMediator){
        this.color = color;
        this.LightMediator = LightMediator;
        LightMediator.registerLight(this);
    }
    
    public abstract void turnON();
    public abstract void turnOFF();
    
    public boolean equals(Object obj){
        Light2 light = (Light2) obj;
        return color.equals(light.color);
    }
    
    public String toString(){
        return color;
    }
}
