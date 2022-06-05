package com.learnjava;

class Test1{
    int a; // default access
    public int b; // public access
    private int c; // private access

    // Methods to access c
    void setC(int i){
        c = i;
    }
    int getC(){
        return c;
    }
}

public class AccessTest {
    public static void main(String[] args) {
        Test1 ob = new Test1();

        // a and b may be accessed directly
        ob.a = 10;
        ob.b = 20;

        // This is not ok and will cause an error
//        ob.c = 100;

        // You must access c through its methods
        ob.setC(100);
        int valueOfC = ob.getC();
        System.out.println(valueOfC);
    }
}
