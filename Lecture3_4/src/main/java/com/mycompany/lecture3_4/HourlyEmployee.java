package com.mycompany.lecture3_4;

public class HourlyEmployee extends Employee{
    private double wage;  //wage per hour
    private double hours;  //hours worked for week
    
    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours){
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hours = hours;
    }
    
    public void setWage(double wage){
        if(wage > 0.0){
            this.wage = wage;
        }
    }
    
    public double getWage(){
        return wage;
    }
    
    public void setHours(double hours){
        if(hours > 0.0 && hours < 168.0){
            this.hours = hours;
        }
    }
    
    public double getHours(){
        return hours;
    }
    
    //calculate earnings;override abstract method earnings in Employee
    public double earnings(){
        if(getHours() <= 40.0){  //no-overtime
            return wage * hours;
        }else{
            return 40 * wage + (hours - 40) * wage * 1.5;
        }  
    }
    
    public String toString(){
        return "Hourly Employee: " + super.toString() + " hourly wage " + wage + " hours worked " + hours;
    }
}
