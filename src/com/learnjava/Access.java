package com.learnjava;

// This program contains an AccessViolation error and won't compile

class A1{
    int i; // Public by default
    private int j; // Private to A

    void setIJ(int x, int y){
        i = x;
        j = y;
    }
}

// A's j is not accessible here
class B1 extends A1{
    int total;

    void sum(){
        total = i + j; // Error! j is not known here
    }
}

public class Access {
    public static void main(String[] args) {
        B1 subOb = new B1();

        subOb.setIJ(10,12);

        subOb.sum();
        System.out.println("Sum is " + subOb.total);
    }
}
