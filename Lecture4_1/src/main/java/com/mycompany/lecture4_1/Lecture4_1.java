package com.mycompany.lecture4_1;

public class Lecture4_1 {

    public static void main(String[] args) {
        pizza_ex();
    }
    //---------------------------------------------------------------------------
    public static void matter_ex(){
        CubeMatter cube = new CubeMatter(1, 3);
        SphereMatter sphere = new SphereMatter(1, 3);
        
        System.out.println("Cube: \n" + "=>Density: " + cube.getDensity() + "\n=>Volume: " + cube.getVolume() + "\n=>Mass: " + cube.getMass());
        System.out.println("Sphere: \n" + "=>Density: " + sphere.getDensity() + "\n=>Volume: " + sphere.getVolume() + "\n=>Mass: " + sphere.getMass());
    }
    //---------------------------------------------------------------------------
    public static void account_ex(){
        CheckableAccount account1 = new CheckableAccount("12345678", "Smith");  //valid
        CheckableAccount account2 = new CheckableAccount("S1234567", "Patel");  //invalid, must contain digits only
        CheckableAccount account3 = new CheckableAccount("1234567", "Adewale");  //invalid, must be 8 characters long
        
        System.out.println("account1 is " + checkValidity(account1));
        System.out.println("account2 is " + checkValidity(account2));
        System.out.println("account3 is " + checkValidity(account3));
    }
    
    public static String checkValidity(Checkable objectIn){
        if(objectIn.check()){
            return "valid";
        }else{
            return "invalid";
        }
    } 
    //---------------------------------------------------------------------------
    public static void pizza_ex(){
        new Lecture4_1().run();
    }
    
    public static void run(){
        Pizza round = new Pizza(3.99, new Circle(2.5));
        Pizza rect = new Pizza(4.99, new Rectangle(6, 4));
        PizzaDeal pd = new PizzaDeal();
        System.out.println(round.toString() + " is a better deal than " + rect.toString() + " : " + pd.betterDeal(round, rect));
    }
    //---------------------------------------------------------------------------
}
