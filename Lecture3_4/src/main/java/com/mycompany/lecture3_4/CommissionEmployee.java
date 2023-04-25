package com.mycompany.lecture3_4;

public class CommissionEmployee extends Employee{
    private double grossSales;  //gross weekly sales
    private double commissionRate;  //commission percentage
    
    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate){
        super(firstName, lastName, socialSecurityNumber);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }
    
    public void setGrossSales(double grossSales){
        if(grossSales > 0.0){
            this.grossSales = grossSales;
        }
    }
    
    public double getGrossSales(){
        return grossSales;
    }
    
    public void setCommissionRate(double commissionRate){
        if(commissionRate > 0.0 && commissionRate < 1.0){
            this.commissionRate = commissionRate;
        }
    }
    
    public double getCommissionRate(){
        return commissionRate;
    }
    
    public double earnings(){
        return commissionRate * grossSales;
    }
    
    public String toString(){
        return "Commission Employee: " + super.toString() + " gross sales" + grossSales + " commision rate " + commissionRate;
    }
}
