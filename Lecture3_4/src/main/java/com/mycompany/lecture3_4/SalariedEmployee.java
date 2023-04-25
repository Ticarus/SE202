package com.mycompany.lecture3_4;

public class SalariedEmployee extends Employee{
    private double weeklySalary;
    
    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary){
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }
    
    public void setWeeklySalary(double weeklySalary){
        if(weeklySalary > 0.0){
            this.weeklySalary = weeklySalary;
        }else{
            this.weeklySalary = 0.0;
        }
    }
    
    public double getWeeklySalary(){
        return weeklySalary;
    }
    
    //calculate earnings;override abstract method earnings in Employee
    public double earnings(){
        return weeklySalary;
    }
    
    public String toString(){
        return "Salaried Employee: " + super.toString() + " weekly salary " + weeklySalary;
    }
}
