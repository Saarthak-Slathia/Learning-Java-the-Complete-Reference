package com.learnjava;

class A{
    int i, j;

    void showIJ(){
        System.out.println("i and j are: " + i + " " + j);
    }
}

// Create a subclass of A
class B extends A{
    int k;

    void showK(){
        System.out.println("k is: " + k);
    }
    void sum(){
        System.out.println("i+j+k: " + (i+j+k));
    }
}

public class SimpleInheritance {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();

        // The superclass may be used by itself
        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Contents of superOb: ");
        superOb.showIJ();
        System.out.println();

        // The subclass has access to all the public members of its superclass
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("Contents of subOb: ");
        subOb.showIJ();
        subOb.showK();
        System.out.println();

        System.out.println("Sum of i, j and k in subOb: ");
        subOb.sum();
    }
}
