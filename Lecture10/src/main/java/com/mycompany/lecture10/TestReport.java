package com.mycompany.lecture10;

public class TestReport {
    public TestReport(){
        IReportFormat f1 = new WebFormat();
        IReportFormat f2 = new DesktopFormat();
        
        Report r1 = new SalesReport(f1);
        r1.display();
        
        Report r2 = new SalesReport(f2);
        r2.display();
        
        Report r3 = new EmployeePerformanceReport(f1);
        r3.display();
        
        Report r4 = new EmployeePerformanceReport(f2);
        r4.display();
    }
}
