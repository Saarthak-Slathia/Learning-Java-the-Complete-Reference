package com.learnjava;

class Box2{
    double width;
    double height;
    double depth;

    // This is the constructor for the Box
    Box2(){
        System.out.println("Constructing Box...");
        width = 10;
        height = 10;
        depth = 10;
    }

    // Compute and return value
    double volume(){
        return width * height * depth;
    }
}

public class BoxDemo6 {
    public static void main(String[] args) {
        // Declare, allocate and initialize box objects
        Box2 myBox1 = new Box2();
        Box2 myBox2 = new Box2();

        double vol;

        // Get volume of first box
        vol = myBox1.volume();
        System.out.println("Volume is " + vol);

        // Get volume of second box
        vol = myBox2.volume();
        System.out.println("Volume is " + vol);
    }
}
