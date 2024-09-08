package com.kritika.abstractions;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       ThirdSeries thirdSeries = new ThirdSeries();
       thirdSeries.accelerate();
       thirdSeries.commonFunc();

       FiveSeries fiveSeries = new FiveSeries();
       fiveSeries.commonFunc();
       fiveSeries.accelerate();
    }
}