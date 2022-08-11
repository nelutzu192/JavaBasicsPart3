package com.skillbrain.curs_3_partea2;

public class Circle implements Shape{

    double pi = 3.14;

    int radius;

    //constructor
    Circle (int radius){
        this.radius=radius;
    }

    @Override
    public void draw() {
        System.out.println("Desenam un cerc");

    }

    @Override
    public double area() {

        return (double)(pi*radius*radius);
    }
}
