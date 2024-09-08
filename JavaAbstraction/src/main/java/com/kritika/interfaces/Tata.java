package com.kritika.interfaces;

public class Tata implements Car{
    @Override
    public void start() {
        System.out.println("Start Tata");
    }

    @Override
    public void stop() {
        System.out.println("Stop Tata");
    }
}
