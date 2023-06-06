package com.mycompany.lecture10;

public class TestBridgePattern {
    public TestBridgePattern(){
        Product product = new CentralLocking("Central Locking System");
        Product product2 = new GearLocking("Gear Locking System");
    
        Car car = new BigWheel(product, "Big Wheel xz model");
        car.produceProduct();
        car.assemble();
        car.printDetails();
        System.out.println();
        
        car = new BigWheel(product2, "Big Wheel xz model");
        car.produceProduct();
        car.assemble();
        car.printDetails();
        System.out.println();
        
        car = new Motoren(product, "Motoren lm model");
        car.produceProduct();
        car.assemble();
        car.printDetails();
        System.out.println();
        
        car = new Motoren(product2, "Motoren lm model");
        car.produceProduct();
        car.assemble();
        car.printDetails();
    }
}
