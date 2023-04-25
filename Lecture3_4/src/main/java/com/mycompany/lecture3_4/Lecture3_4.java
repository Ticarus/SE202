package com.mycompany.lecture3_4;

public class Lecture3_4 {

    public static void main(String[] args) {
        //create subclass objects
        SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000, .06);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 5000, 0.04, 300);
        
        System.out.println("Employees processed individually:");
        System.out.println(salariedEmployee + " earned " + salariedEmployee.earnings());
        System.out.println(hourlyEmployee + " earned " + hourlyEmployee.earnings());
        System.out.println(commissionEmployee + " earned " + commissionEmployee.earnings());
        System.out.println(basePlusCommissionEmployee + " earned " + basePlusCommissionEmployee.earnings());
        
        //Create four-element Employee array
        Employee[] employees = new Employee[4];
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;
        
        //generically process each element in array employees
        for(int i = 0 ; i < employees.length ; i++){
            System.out.println(employees[i]); //invokes toString
            //determine whether element is a BasePlusCommissionEmployee 
            if(employees[i] instanceof BasePlusCommissionEmployee){
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee)(employees[i]);
                employee.setBaseSalary(1.10 * employee.getBaseSalary());
                System.out.println("Updated: " + employee.getBaseSalary());
            }
            System.out.println("Earned: " + employees[i].earnings());
        }
    }
}
