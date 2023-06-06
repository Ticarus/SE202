package com.mycompany.lecture10;

public class TestComputer {
    public TestComputer(){
        Computer myComputer = new PC(new WindowsOS());
        myComputer.startup(); 
        if(myComputer.canMoveComputer()){
            System.out.println("Moving computer to a new location");
        }
        
        myComputer.browseInternet("https://google.com");
        
        Computer myComputer2 = new Laptop(new MacOS());
        myComputer2.startup();
        if(myComputer2.canMoveComputer()){
            System.out.println("Moving computer to a new location");
        }
        
        myComputer2.browseInternet("https://google.com");
    }    
}
