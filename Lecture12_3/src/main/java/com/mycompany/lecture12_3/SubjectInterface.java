package com.mycompany.lecture12_3;

public interface SubjectInterface {
    void register(Observer anObserver);
    
    void unregister(Observer anObserver);
    
    void notifyRegisteredUsers(int notifiedValue);
}
