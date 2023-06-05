package com.mycompany.lecture9;
//Facade Design Pattern
public class Lecture9 {

    public static void main(String[] args) {
        ex5();
    }
    
    public static void ex1(){
        User user = new User();
    }
    
    public static void ex2(){
        TestCarFacade test = new TestCarFacade();
    }
    
    public static void ex3(){
        TestBankAccount test = new TestBankAccount();
    }
    
    public static void ex4(){
        TestFacade t = new TestFacade();
    }
    
    public static void ex5(){
        TestRestaurantFacade t = new TestRestaurantFacade();
    }
}
