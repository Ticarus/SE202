package com.mycompany.lecture6_1;

public class SocialMediaContext {
    ISocialMediaStrategy smStrategy;
    
    public void setSocialmediaStrategy(ISocialMediaStrategy smStrategy){
        this.smStrategy = smStrategy;
    }
    
    public void connect(String name){
        smStrategy.connectTo(name);
    }
}
