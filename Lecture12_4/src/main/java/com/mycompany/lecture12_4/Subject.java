package com.mycompany.lecture12_4;

public interface Subject {
    public void subscribeObserver(Observer o);
    public void unSubscribeObserver(Observer o);
    public void notifyAllObservers();
}
