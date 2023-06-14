package com.mycompany.lecture14_1;

import java.util.ArrayList;

public class Composite implements IComponent{
    public String name;
    
    //The Object is used to hold all the child components of a composite components
    ArrayList<IComponent> components = new ArrayList<IComponent>();
    
    //The Constructor takes the Composite name as the input parameter
    public Composite(String name){
        this.name = name;
    }
    
    //The following method is used to add Child Components inside the Composite Component
    public void addComponent(IComponent component){
        components.add(component);
    }
    
    //Display the Price of Composite Components
    public void displayPrice(){
        for(IComponent component : components){
            //Delegates the work to the actual leaf object or child components
            component.displayPrice();
        }
    }
}
