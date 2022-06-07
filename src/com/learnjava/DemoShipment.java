package com.learnjava;

class Box8{
    private double width;
    private double height;
    private double depth;

    // Construct clone of an object
    Box8(Box8 ob){
        ob.width = width;
        ob.height = height;
        ob.depth = depth;
    }

    // Constructor when all dimensions are specified
    Box8(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    // Constructor when no dimensions are specified
    Box8(){
        width = -1;
        height = -1;
        depth = -1;
    }

    // Constructor when cube is created
    Box8(double len){
        width = height = depth = len;
    }

    // Compute and return volume
    double volume(){
        return width * height * depth;
    }
}

// Add BoxWeight
class BoxWeight2 extends Box8{
    double weight; // weight of box

    // Construct clone of an object
    BoxWeight2(BoxWeight2 ob){
        super(ob);
        weight = ob.weight;
    }

    // Constructor when all dimensions are specified
    BoxWeight2(double w, double h, double d, double m){
        super(w, h, d);
        weight = m;
    }

    // Constructor when no dimensions are specified
    BoxWeight2(){
        super();
        weight = -1;
    }

    // Constructor when cube is created
    BoxWeight2(double len, double w){
        super(len);
        weight = w;
    }
}

// Add Shipment costs
class Shipment extends BoxWeight2{
    double cost;

    // Construct clone of an object
    Shipment(Shipment ob){
        super(ob);
        cost = ob.cost;
    }

    // Constructor when all dimensions are specified
    Shipment(double w, double h, double d, double m, double c){
        super(w, h, d, m);
        cost = c;
    }

    // Default constructor
    Shipment(){
        super();
        cost = -1;
    }

    // Constructor when cube is created
    Shipment(double len, double w, double c){
        super(len, w);
        cost = c;
    }
}

public class DemoShipment {
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.076, 1.28);

        double vol;

        vol = shipment1.volume();
        System.out.println("Volume of shipment1 is " + vol);
        System.out.println("Weight of shipment1 is " + shipment1.weight);
        System.out.println("Shipping cost: $" + shipment1.cost);

        vol = shipment2.volume();
        System.out.println("Volume of shipment2 is " + vol);
        System.out.println("Weight of shipment2 is " + shipment2.weight);
        System.out.println("Shipping cost: $" + shipment2.cost);
    }
}
