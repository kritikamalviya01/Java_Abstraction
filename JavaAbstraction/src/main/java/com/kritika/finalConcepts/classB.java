package com.kritika.finalConcepts;

// if classB become final than we cannot extend classB
public class classB extends classA{
    public static void main(String[] args) {
        classA a = new classA();
        a.hello();
    }

    // Cannot override hello because it's final
//    void hello(){
//        System.out.println("jff");
//    }
}
