package com.skillbrain.curs_3_partea2;

public class Urs implements Animal{


    @Override
    public void eat() {
        System.out.println("Eu sunt un urs si mananc miere");
    }

    @Override
    public void walk() {
        System.out.println("Sunt urs si ma plimb in padure");

    }

    @Override
    public void hunt() {
        System.out.println("Sunt urs si vanez animale");

    }
}
