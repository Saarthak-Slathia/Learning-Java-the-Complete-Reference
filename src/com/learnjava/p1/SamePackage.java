package com.learnjava.p1;

class SamePackage {
    SamePackage(){
        Protection p = new Protection();
        System.out.println("SamePackage constructor");
        System.out.println("n = " + p.n);
        System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
    }
}
