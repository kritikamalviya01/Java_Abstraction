package com.kritika.finalConcepts;

public class classA {
    final float PI = 3.17f;

    public static void main(String[] args) {
        classA A = new classA();
//       Cannot change PI value because PI is final
//        A.PI = 10;
        System.out.println(A.PI);
    }

    final void hello(){
        System.out.println("Hello World");
    }

}
