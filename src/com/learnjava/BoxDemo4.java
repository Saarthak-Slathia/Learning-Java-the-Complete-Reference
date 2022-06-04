package com.learnjava;

class Box{
    double width;
    double height;
    double depth;

    // Compute and return value
    double volume(){
        return width * height * depth;
    }
}

public class BoxDemo4 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();

        double vol;

        // Assign values to myBox1's instance variables
        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.depth = 15;

        // Assign different values to myBox2's instance variables
        myBox2.width = 3;
        myBox2.height = 6;
        myBox2.depth = 9;

        // Get volume of first box
        vol = myBox1.volume();
        System.out.println("Volume is " + vol);

        // Get volume of second box
        vol = myBox2.volume();
        System.out.println("Volume is " + vol);
    }
}
