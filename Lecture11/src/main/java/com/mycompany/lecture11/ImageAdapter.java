package com.mycompany.lecture11;

public class ImageAdapter implements AdvancedImageViewer{
    ImageViewer imageViewer;
    
    public ImageAdapter(ImageViewer imageViewer){
        this.imageViewer = imageViewer;
    }
    
    public void showFile(String fileName){
        imageViewer.show(fileName);
    }
}
