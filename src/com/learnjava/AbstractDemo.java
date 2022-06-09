package com.learnjava;

abstract class A5{
    abstract void callMe();

    // Concrete methods in abstract classes
    void callMeToo(){
        System.out.println("This is a concrete method");
    }
}

class B5 extends A5{
    void callMe(){
        System.out.println("B's implementation of callMe");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        B5 b = new B5();
        b.callMe();
        b.callMeToo();
    }
}
