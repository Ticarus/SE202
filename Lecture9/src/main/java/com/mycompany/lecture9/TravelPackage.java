package com.mycompany.lecture9;

public class TravelPackage {
    private Flight f;
    private Transfer t;
    private Hotel h;
    
    public TravelPackage(){
        f = new Flight();
        t = new Transfer();
        h = new Hotel();
    }
    
    public void reserve(){
        f.reserveFlight();
        t.reserveTransfer();
        h.reserveHotel();
    }
}
