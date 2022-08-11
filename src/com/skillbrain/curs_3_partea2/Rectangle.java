package com.skillbrain.curs_3_partea2;

public class Rectangle implements Shape{

    int lungime, latime;

    //constructor
    Rectangle(int lungime, int latime){
        this.lungime = lungime;
        this.latime = latime;
    }

    @Override
    public void draw() {
        System.out.println("Desenam un dreptunghi");
    }

    @Override
    public double area() {
        return (double)(lungime*latime);
    }
}
