package com.mycompany.lecture11;

public class FileExampleTest {
    public FileExampleTest(){
        AdvancedImageViewer x = new PngShower();
        x.showFile("q1");
        AdvancedImageViewer y = new JpgShower();
        y.showFile("q2");
        AdvancedImageViewer z = new ImageAdapter(new TiffShower());
        z.showFile("q3");
    }
}
