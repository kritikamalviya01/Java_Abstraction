package com.kritika.interfaces;

public class Honda implements Car{

    @Override
    public void start() {
        System.out.println("Start Honda");
    }

    @Override
    public void stop() {
        System.out.println("Stop Honda");
    }
}
