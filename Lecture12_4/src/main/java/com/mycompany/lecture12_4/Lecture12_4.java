package com.mycompany.lecture12_4;

public class Lecture12_4 {

    public static void main(String[] args) {
        TopicEnrollment javaTopic = new TopicEnrollment();
        javaTopic.subscribeObserver(new Subscriber("Mike"));
        javaTopic.subscribeObserver(new Subscriber("Chris"));
        javaTopic.subscribeObserver(new Subscriber("Jeff"));
        javaTopic.addTopic("Arrays");
        javaTopic.addTopic("Objects");
    }
}
