package com.mycompany.lecture13_4;

public class ComputerColleague extends Colleague{
    public ComputerColleague(Mediator mediator, String name){
        super(mediator, name);
    }
    
    public void receiveRegisterNotification(Colleague colleague){
        System.out.println("New Computer register event with name:" + colleague + ":received@" + this);
        //Send further messages to this new Colleague from now onwards
    }
    
    public void receiveUnRegisterNotification(Colleague colleague){
        System.out.println("Computer left unregister event with name:" + colleague + ":received@" + this);
        //Do not send further messagesto this Colleague from now onwards
    }
}
