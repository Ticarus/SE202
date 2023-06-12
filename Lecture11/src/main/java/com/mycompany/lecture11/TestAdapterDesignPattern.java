package com.mycompany.lecture11;

public class TestAdapterDesignPattern {
    public TestAdapterDesignPattern(){
        ChromeDriver a = new ChromeDriver();
        a.getElement();
        a.selectElement();
        
        IEDriver e = new IEDriver();
        e.findElement();
        e.clickElement();
        
        WebDriver wID = new WebDriverAdapter(e);
        wID.getElement();
        wID.selectElement();
    }
}
