package com.skillbrain.curs_3_partea2;

public class Caine implements Animal{


    @Override
    public void eat() {
        System.out.println("Eu sunt caine si mananc oase");
    }

    @Override
    public void walk() {
        System.out.println("Eu sunt caine si  ma plimb in lesa");

    }

    @Override
    public void hunt() {
        System.out.println("Eu sunt caine si nu vanez");

    }
}
