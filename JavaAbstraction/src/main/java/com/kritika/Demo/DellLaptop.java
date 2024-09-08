package com.kritika.Demo;

public abstract class DellLaptop implements TouchLaptop{

    @Override
    public void scroll() {
        System.out.println("Scroll from DellLaptop");
    }

}
