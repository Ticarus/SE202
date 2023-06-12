package com.mycompany.lecture11;

public class WebDriverAdapter implements WebDriver{
    IEDriver ieDriver;
    
    public WebDriverAdapter(IEDriver ieDriver){
        this.ieDriver = ieDriver;
    }
    
    public void getElement(){
        ieDriver.findElement();
    }
    
    public void selectElement(){
        ieDriver.clickElement();
    }
}
