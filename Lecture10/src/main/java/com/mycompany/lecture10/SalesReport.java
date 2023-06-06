package com.mycompany.lecture10;

public class SalesReport extends Report{
    public SalesReport(IReportFormat ReportFormat){
        super(ReportFormat);
    }
    
    public void display(){
        System.out.println("Sales Report");
        ReportFormat.generate();
    }
}
