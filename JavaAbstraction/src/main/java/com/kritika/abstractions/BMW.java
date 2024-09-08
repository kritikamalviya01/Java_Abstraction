package com.kritika.abstractions;

public abstract class BMW {

    public void commonFunc(){
        System.out.println("Inside Common Function");
    }

    abstract void accelerate();

    // We can also create main method in Abstract class
    public static void main(String[] args) {
        System.out.println("Inside main method of abstract class");
    }
}
