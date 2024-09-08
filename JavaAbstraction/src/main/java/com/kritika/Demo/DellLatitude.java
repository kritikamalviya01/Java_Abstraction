package com.kritika.Demo;

public class DellLatitude extends DellNoteBook{

    @Override
    public void scroll() {
        super.scroll();
        System.out.println("Scroll in Latitude");
    }

    @Override
    public void click() {
        super.click();
        System.out.println("Click in Latitude");
    }
}
