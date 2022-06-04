package com.learnjava;
class methodOverloadingMaths{
    int add(int x, int y){
        return(x+y);
    }
    int add(){
        return(0);
    }
    double add(double x, double y){
        return(x+y);
    }
    String add(String x, String y){
        return(x+y);
    }
}

public class Main {
    public static void main(String[] args) {
        methodOverloadingMaths MathTest;
        MathTest = new methodOverloadingMaths();

        // MathTest.add(); Output - 0
        System.out.println(MathTest.add());

        // MathTest.add(4,5); Output - 9
        System.out.println(MathTest.add(4,5));

        // MathTest.add(4.5,4.5); Output - 9.0
        System.out.println(MathTest.add(4.5,4.5));

        // MathTest.add("Hello, ", "I am Java"); Output - Hello, I am Java
        System.out.println(MathTest.add("Hello, ", "I am Java"));
    }
}
