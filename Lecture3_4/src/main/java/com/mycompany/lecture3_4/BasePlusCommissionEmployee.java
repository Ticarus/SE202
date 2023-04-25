package com.mycompany.lecture3_4;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;
    
    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary){
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }
    
    public void setBaseSalary(double baseSalary){
        if(baseSalary > 0.0){
            this.baseSalary = baseSalary;
        }
    }
    
    public double getBaseSalary(){
        return baseSalary;
    }
    
    public double earnings(){
        return baseSalary + super.earnings();
    }
    
    public String toString(){
        return "Base plus commission: " + super.toString() + " base salary " + baseSalary;
    }
}
