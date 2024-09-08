package com.kritika.Demo;

public class Test {
    public static void main(String[] args) {
        DellNoteBook dellLaptop = new DellNoteBook();
        dellLaptop.click();
        dellLaptop.scroll();

        HPLaptop hpLaptop = new HPNoteBook();
        hpLaptop.scroll();
        hpLaptop.click();

        System.out.println();

        DellLatitude dell = new DellLatitude();
        dell.click();
        dell.scroll();
    }
}
