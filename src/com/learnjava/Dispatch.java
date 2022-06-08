package com.learnjava;

class A4{
    void callMe(){
        System.out.println("Inside A's callMe");
    }
}

class B4 extends A4{
    void callMe(){
        System.out.println("Inside B's callMe");
    }
}

class C2 extends B4{
    void callMe(){
        System.out.println("Inside C's callMe");
    }
}

public class Dispatch {
    public static void main(String[] args) {
        A4 a = new A4();
        B4 b = new B4();
        C2 c = new C2();

        A4 r; // Obtain a reference of type A4

        r = a;
        r.callMe();

        r = b;
        r.callMe();

        r = c;
        r.callMe();
    }
}
