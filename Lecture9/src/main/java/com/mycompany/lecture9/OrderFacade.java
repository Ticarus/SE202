package com.mycompany.lecture9;

public class OrderFacade {
    Waiter w;
    Kitchen k;
    
    public OrderFacade(){
        w = new Waiter();
        k = new Kitchen();
    }
    
    public void orderFood(){
        w.takeOrder();
        w.takeOrderToCook();
        k.cookFood();
        k.signalReady();
        w.serveCustomer();
    }
}
