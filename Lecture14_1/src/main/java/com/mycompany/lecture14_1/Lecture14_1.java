package com.mycompany.lecture14_1;

public class Lecture14_1 {

    public static void main(String[] args) {
        IComponent hardDisk = new Leaf("Hard Disk", 2000);
        IComponent ram = new Leaf("RAM", 3000);
        IComponent cpu = new Leaf("CPU", 2000);
        IComponent mouse = new Leaf("Mouse", 2000);
        IComponent keyboard = new Leaf("Keyboard", 2000);
        
        //Creating Composite Objects
        Composite motherBoard = new Composite("MotherBoard");
        Composite cabinet = new Composite("Cabinet");
        Composite peripherals = new Composite("Peripherals");
        Composite computer = new Composite("Computer");
        
        //Creating Tree Structures i.e. Adding Child Components inside the Composite Component
        
        //Adding CPU and RAM in Mother Board
        motherBoard.addComponent(cpu);
        motherBoard.addComponent(ram);
        
        //Adding Mother Board and Hard Disk in Cabinet
        cabinet.addComponent(motherBoard);
        cabinet.addComponent(hardDisk);
        
        //Adding Mouse and Keyboard in peripherals
        peripherals.addComponent(mouse);
        peripherals.addComponent(keyboard);
        
        //Adding Cabinet and Peripherals in Computer
        computer.addComponent(cabinet);
        computer.addComponent(peripherals);
        
        //To Display the Price of the Computer i.e. it will display the Price of all components
        System.out.println("Price of Computer Composite Components");
        computer.displayPrice();
        
        //To display the Price of the Keyboard
        System.out.println("\nPrice of Keyboard Child or Leaf Component:");
        keyboard.displayPrice();
        
        //To display the Price of the Cabinet
        System.out.println("\nPrice of Cabinet Composite Component:");
        cabinet.displayPrice();
    }
}