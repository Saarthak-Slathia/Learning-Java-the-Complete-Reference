package com.learnjava;

class A3{
    int i, j;

    A3(int a, int b){
      i = a;
      j = b;
    }

    // Display i and j
    void show(){
        System.out.println("i and j: " + i + " " + j);
    }
}

// Create a subclass by extending A
class B3 extends A3{
    int k;

    B3(int a, int b, int c){
        super(a, b);
        k = c;
    }

    // Display k, this overrides show in A
    void show(){
        System.out.println("k: " + k);
    }
}

public class Override {
    public static void main(String[] args) {
        B3 subOb = new B3(1,2,3);

        subOb.show(); // calls show in B
    }
}
