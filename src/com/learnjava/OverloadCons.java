package com.learnjava;

class Box4{
    double width;
    double height;
    double depth;

    // Constructor when all dimensions are specified
    Box4(double w, double h, double d){
        width = w;
        depth = d;
        height = h;
    }

    // Constructor used when no dimensions are specified
    Box4(){
        width = -1; // -1 used to indicate uninitialized box
        height = -1;
        depth = -1;
    }

    // Constructor used when cube is specified
    Box4(double len){
        width = height = depth = len;
    }

    // Compute and return volume
    double volume(){
        return width * depth * height;
    }
}

public class OverloadCons {
    public static void main(String[] args) {
        // Create boxes using various constructors
        Box4 myBox1 = new Box4(10, 20, 15);
        Box4 myBox2 = new Box4();
        Box4 myBox3 = new Box4(7);

        double vol;

        // Get volume of first box
        vol = myBox1.volume();
        System.out.println("Volume of myBox1 is " + vol);

        // Get volume of second box
        vol = myBox2.volume();
        System.out.println("Volume of myBox2 is " + vol);

        // Get volume of cube
        vol = myBox3.volume();
        System.out.println("Volume of myBox3 is " + vol);
    }
}
