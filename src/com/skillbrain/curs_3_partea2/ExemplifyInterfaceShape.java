package com.skillbrain.curs_3_partea2;

public class ExemplifyInterfaceShape {

    public static void main(String[] args){

        //cream un obiect de tip dreptunghi
        Shape rectangle = new Rectangle(2,4);

        //calculam aria dreptunghi
        System.out.println("Arie dreptunghi: " + rectangle.area());

        //desenam un dreptunghi
        rectangle.draw();


        Shape circle = new Circle(10);

        //calculam arie cerc:
        System.out.println("Arie cerc: " + circle.area());

        //desenam un cerc:
        circle.draw();
    }
}
