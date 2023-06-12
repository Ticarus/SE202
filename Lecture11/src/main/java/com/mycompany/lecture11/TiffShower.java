package com.mycompany.lecture11;

public class TiffShower implements ImageViewer{
    public void show(String fileName){
        System.out.println("Showing tiff. file Name: " + fileName);
    }
}
