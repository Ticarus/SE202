package com.mycompany.lecture13_4;

public class Lecture13_4 {

    public static void main(String[] args) {
        Mediator mediator = new NetworkMediator();
        ComputerColleague colleague1 = new ComputerColleague(mediator,"Eagle");
        ComputerColleague colleague2 = new ComputerColleague(mediator,"Ostrich");
        ComputerColleague colleague3 = new ComputerColleague(mediator,"Penguin");
        mediator.register(colleague1);
        mediator.register(colleague2);
        mediator.register(colleague3);
        mediator.unregister(colleague1);
    }
}
