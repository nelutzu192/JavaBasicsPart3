package com.skillbrain.abstract_classes;

//main driver class - for testing purposes

public class ExemplifyAbstractClasses {

    // Main driver method
    public static void main(String[] args) {
        // Creating the Object of Rectangle class
        // and using shape class reference.

        //creating the objects of Circle type
        Shape rect = new Rectangle(2, 3, "Rectangle");

        System.out.println("Area of rectangle: "
                + rect.area());

        rect.moveTo(1, 2);

        System.out.println(" ");

        // Creating the Objects of circle class
        Shape circle = new Circle(2, "Circle");

        System.out.println("Area of circle: "
                + circle.area());

        circle.moveTo(2, 4);
    }

}
