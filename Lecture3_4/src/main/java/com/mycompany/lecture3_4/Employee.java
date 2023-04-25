package com.mycompany.lecture3_4;

public abstract class Employee {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    
    public Employee(String firstName, String lastName, String socialSecurityNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public String getSocailSecurityNumber(){
        return socialSecurityNumber;
    }
    
    public String toString(){
        return "Name: " + firstName + "SSN: " + socialSecurityNumber;
    }
    
    //abstract method must be overridden by concrete subclasses 
    public abstract double earnings();  //no implementation here
}
