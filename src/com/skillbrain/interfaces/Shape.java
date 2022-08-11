package com.skillbrain.interfaces;

// Java Program to Illustrate Concept of Interface

//What if we don’t have any common code between rectangle and circle then go with the interface.

// Importing I/O classes
import java.io.*;

// Interface
interface Shape {

    // Abstract methods only
    void draw();
    double area();
}