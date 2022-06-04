package com.learnjava;

class Box3{
    double width;
    double height;
    double depth;

    // Constructor for Box3
    Box3(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    // Compute and return value
    double volume(){
        return width * height * depth;
    }
}

public class BoxDemo7 {
    public static void main(String[] args) {
        // Declare, allocate and initialize Box Objects
        Box3 myBox1 = new Box3(10, 20, 15);
        Box3 myBox2 = new Box3(3, 6, 9);

        double vol;

        // Get volume of first box
        vol = myBox1.volume();
        System.out.println("Volume is " + vol);

        // Get volume of second box
        vol = myBox2.volume();
        System.out.println("Volume is " + vol);
    }
}
