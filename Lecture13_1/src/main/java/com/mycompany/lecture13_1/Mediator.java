package com.mycompany.lecture13_1;

public interface Mediator {
    public void registerLight(Light2 light);
    public void unregisterLight(Light2 light);
    public void notifyMediator(Light2 light);
}
