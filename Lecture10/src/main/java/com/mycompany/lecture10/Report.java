package com.mycompany.lecture10;

public abstract class Report {
    public IReportFormat ReportFormat;
    
    public Report(IReportFormat ReportFormat){
        this.ReportFormat = ReportFormat;
    }
    
    public abstract void display();
}
