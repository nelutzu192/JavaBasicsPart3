package com.skillbrain.curs_3_partea2;

public class DemoAnimal {

    public static void main(String[] args){

        Animal a = new Urs();
        a.eat();
        a.walk();
        a.hunt();

        a = new Caine();
        a.eat();
        a.walk();
        a.hunt();

    }
}
