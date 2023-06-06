package com.mycompany.lecture10;

public class EmployeePerformanceReport extends Report{
    public EmployeePerformanceReport(IReportFormat ReportFormat){
        super(ReportFormat);
    }
    
    public void display(){
        System.out.println("Performance reported");
        ReportFormat.generate();
    }
}
