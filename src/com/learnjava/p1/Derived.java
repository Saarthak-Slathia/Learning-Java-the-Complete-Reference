package com.learnjava.p1;

class Derived extends Protection{
    Derived(){
        System.out.println("Derived constructor");
        System.out.println("n = " + n);
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}