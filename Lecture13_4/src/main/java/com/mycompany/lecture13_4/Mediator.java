package com.mycompany.lecture13_4;

public interface Mediator {
    void register(Colleague colleague);
    void unregister(Colleague colleague);
}
