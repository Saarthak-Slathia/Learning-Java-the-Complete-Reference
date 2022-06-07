package com.learnjava;

// Create a superclass
class A2{
    A2(){
        System.out.println("Inside A's Constructor");
    }
}

// Create a subclass by extending A
class B2 extends A2{
    B2(){
        System.out.println("Inside B's Constructor");
    }
}

// Create another subclass by extending B
class C extends B2{
    C(){
        System.out.println("Inside C's constructor");
    }
}

public class CallingCons {
    public static void main(String[] args) {
        C c = new C();
    }
}
