package com.skillbrain.abstract_classes;
// Java Program to Illustrate Concept of
// Abstract Class

//There is common code between rectangle and circle, so go with abstract class

// Importing required classes

// Class 1
// Helper abstract class
abstract class Shape {

    // Declare fields
    String objectName = " ";

    // Constructor of this class
    Shape(String name) {
        this.objectName = name;
    }

    // Method
    // Non-abstract methods
    // Having as default implementation
    public void moveTo(int x, int y) {
        System.out.println(this.objectName + " "
                + "has been moved to"
                + " x = " + x + " and y = " + y);
    }

    // Method 2
    // Abstract methods which will be
    // implemented by its subclass(es)
    abstract public double area();
    abstract public void draw();
}