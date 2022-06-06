package com.learnjava;

class Box7{
    private final double width;
    private final double height;
    private final double depth;

    // Construct clone of an object
    Box7(Box7 ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // Constructor when all dimensions are specified
    Box7(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    // Constructor when no dimensions are specified
    Box7(){ // -1 to indicate an uninitialised object
        width = -1;
        height = -1;
        depth = -1;
    }

    // Constructor when cube is created
    Box7(double len){
        width = height = depth = len;
    }

    // Compute and return volume
    double vol(){
        return height * depth * width;
    }
}

// BoxWeight now fully implements all constructors
class BoxWeight1 extends Box7{
    double weight; // Weight of the box

    // Construct clone of an object
    BoxWeight1(BoxWeight1 ob){
        super(ob);
        weight = ob.weight;
    }

    // Constructor when all dimensions are specified
    BoxWeight1(double w, double h, double d, double m){
        super(w, h, d);
        weight = m;
    }

    // Default Constructor
    BoxWeight1(){
        super();
        weight = -1;
    }

    // Constructor when cube is created
    BoxWeight1(double len, double m){
        super(len);
        weight = m;
    }
}

public class DemoSuper {
    public static void main(String[] args) {
        BoxWeight1 myBox1 = new BoxWeight1(10, 20, 15, 34.3);
        BoxWeight1 myBox2 = new BoxWeight1(2, 3, 4, 0.076);
        BoxWeight1 myBox3 = new BoxWeight1(); // Default
        BoxWeight1 myCube = new BoxWeight1(3,2);
        BoxWeight1 myClone = new BoxWeight1(myBox1);

        double vol;

        // myBox1
        vol = myBox1.vol();
        System.out.println("Volume of myBox1 is " + vol);
        System.out.println("Weight of myBox1 is " + myBox1.weight);
        System.out.println();

        // myBox2
        vol = myBox2.vol();
        System.out.println("Volume of myBox2 is " + vol);
        System.out.println("Weight of myBox2 is " + myBox2.weight);
        System.out.println();

        // myBox3
        vol = myBox3.vol();
        System.out.println("Volume of myBox3 is " + vol);
        System.out.println("Weight of myBox3 is " + myBox3.weight);
        System.out.println();

        // myCube
        vol = myCube.vol();
        System.out.println("Volume of myCube is " + vol);
        System.out.println("Weight of myCube is " + myCube.weight);
        System.out.println();

        // myClone
        vol = myClone.vol();
        System.out.println("Volume of myClone is " + vol);
        System.out.println("Weight of myClone is " + myClone.weight);
        System.out.println();
    }
}
