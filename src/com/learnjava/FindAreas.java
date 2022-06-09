package com.learnjava;

abstract class Figure{
    double dim1;
    double dim2;

    Figure(double a, double b){
        dim1 = a;
        dim2 = b;
    }

    abstract double area();
}

class Rectangle extends Figure{
    Rectangle(double a, double b){
        super(a, b);
    }

    // Override area
    double area(){
        System.out.println("Area for rectangle");
        return dim1 * dim2;
    }
}

class Triangle extends Figure{
    Triangle(double a, double b){
        super(a, b);
    }

    // Override area for Triangle
    double area(){
        System.out.println("Area for triangle");
        return (dim1 * dim2)/2;
    }
}

public class FindAreas {
    public static void main(String[] args) {
//        Figure f = new Figure(10,10); // Illegal Now!
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);

        Figure figRef; // This is ok as no object is created

        figRef = r;
        System.out.println("Area is " + figRef.area());

        figRef = t;
        System.out.println("Area is " + figRef.area());
    }
}
