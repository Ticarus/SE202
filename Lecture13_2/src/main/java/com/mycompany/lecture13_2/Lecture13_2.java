package com.mycompany.lecture13_2;

public class Lecture13_2 {

    public static void main(String[] args) {
        SocialMediaGroup mediator = new LearnAndShareGroup();
        
        Subscriber sub1 = new SubscriberImpl(mediator, "John");
        Subscriber sub2 = new SubscriberImpl(mediator, "Smith");
        Subscriber sub3 = new SubscriberImpl(mediator, "Greg");
        Subscriber sub4 = new SubscriberImpl(mediator, "Devin");
        
        mediator.addSubscriber(sub1);
        mediator.addSubscriber(sub2);
        mediator.addSubscriber(sub3);
        mediator.addSubscriber(sub4);
        
        sub1.send("Learn Design Patterns");
    }
}
