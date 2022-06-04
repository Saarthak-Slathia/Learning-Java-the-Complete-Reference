package com.learnjava;

class Box1{
    double width;
    double height;
    double depth;

    // Compute and return value
    double volume(){
        return width * height * depth;
    }

    // Sets dimension of the box
    void setDim(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
}

public class BoxDemo5 {
    public static void main(String[] args) {
        Box1 myBox1 = new Box1();
        Box1 myBox2 = new Box1();

        double vol;

        // Initialize each box's variables
        myBox1.setDim(10,20,15);
        myBox2.setDim(3,6,9);

        // Get volume of first box
        vol = myBox1.volume();
        System.out.println("Volume is " + vol);

        // Get volume of second box
        vol = myBox2.volume();
        System.out.println("Volume is " + vol);
    }
}
