package com.learnjava;

class OverloadDemo{
    void test(){
        System.out.println("No parameters");
    }

    // Overload test for two integer parameters
    void test(int a, int b){
        System.out.println("a and b: " + a + " " + b);
    }

    // Overload test for a double parameter
    void test(double a){
        System.out.println("Inside test(double) a:  " + a);
    }
}

public class Overload {
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        int i = 88;

        ob.test();
        ob.test(10, 20);

        ob.test(i); // This will invoke test(double)
        ob.test(123.2); // This will invoke test(double)
    }
}
