package com.mycompany.lecture10;

public class Motoren extends Car{
    public Motoren(Product product, String carType){
        super(product, carType);
    }
    
    public void assemble(){
        System.out.println("Motoren");
        System.out.println("Assembling " + product.productName() + " for " + carType);
    }
    
    public void produceProduct(){
        System.out.println("Motoren");
        product.produce();
        System.out.println("Modifing product " + product.productName() + " according to -" + carType);
    }
}
