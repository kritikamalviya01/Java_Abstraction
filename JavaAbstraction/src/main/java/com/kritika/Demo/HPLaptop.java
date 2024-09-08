package com.kritika.Demo;

public abstract class HPLaptop implements TouchLaptop{

    @Override
    public void scroll(){
        System.out.println("Scroll from HPLaptop");
    }
}
