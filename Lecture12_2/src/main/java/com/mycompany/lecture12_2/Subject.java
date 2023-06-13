package com.mycompany.lecture12_2;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyAllObservers();
}
