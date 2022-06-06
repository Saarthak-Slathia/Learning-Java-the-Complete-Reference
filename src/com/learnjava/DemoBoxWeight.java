package com.learnjava;

class Box6{
    double width;
    double height;
    double depth;

    // Construct clone of an object
    Box6(Box6 ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box6(){
        width = -1;
        height = -1;
        depth = -1;
    }

    // Constructor when all dimensions are specified
    Box6(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    // Constructor when cube is created
    Box6(double len){
        width = height = depth = len;
    }

    // Compute and return volume
    double volume(){
        return width * height * depth;
    }
}

// Here Box is extended to include weight
class BoxWeight extends Box6{
    double weight; // Weight of the box

    // Constructor for BoxWeight
    BoxWeight(double w, double h, double d, double m){
        width = w;
        height = h;
        depth = d;
        weight = m;
    }

}

public class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight myBox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight myBox2 = new BoxWeight(2,3,4,0.076);

        double vol;

        vol = myBox1.volume();
        System.out.println("Volume of myBox1 is " + vol);
        System.out.println("Weight of myBox1 is " + myBox1.weight);
        System.out.println();

        vol = myBox2.volume();
        System.out.println("Volume of myBox2 is " + vol);
        System.out.println("Weight of myBox2 is " + myBox2.weight);
        System.out.println();
    }
}
