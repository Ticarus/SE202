package com.mycompany.lecture9;

public class CarFacade {
    CarAccessories accessories;
    CarBody body;
    CarEngine engine;
    CarModel model;
    
    public CarFacade(){
        this.accessories = new CarAccessories();
        this.body = new CarBody();
        this.engine = new CarEngine();
        this.model = new CarModel();
    }
    
    public void createCar(){
        System.out.println("********** Creating a Car **********\n");
        accessories.setCarAccessories();
        body.setCarBody();
        engine.setCarEngine();
        model.setCarModel();
        System.out.println("\n********** Created a Car **********\n");
    }
}
