package com.learnjava;

class Box5{
    double width;
    double height;
    double depth;

    // Construct clone of an object
    Box5(Box5 ob){ // Pass object to constructor
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // Constructor used when all dimensions specified
    Box5(double w, double h, double d){
        width = w;
        depth = d;
        height = h;
    }

    // Constructor used when no dimensions are specified
    Box5(){
        width = -1; // -1 used to indicate uninitialized box
        height = -1;
        depth = -1;
    }

    // Constructor used when cube is created
    Box5(double len){
        width = height = depth = len;
    }

    // Compute and return volume
    double volume(){
        return width * depth * height;
    }
}

public class OverloadCons2 {
    public static void main(String[] args) {
        // Create boxes using various constructors
        Box5 myBox1 = new Box5(10, 20, 15);
        Box5 myBox2 = new Box5();
        Box5 myBox3 = new Box5(7);

        Box5 myClone = new Box5(myBox1);

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

        // Get volume of clone
        vol = myClone.volume();
        System.out.println("Volume of myClone is " + vol);
    }
}
