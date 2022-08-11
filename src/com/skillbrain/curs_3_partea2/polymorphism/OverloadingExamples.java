package com.skillbrain.curs_3_partea2.polymorphism;

public class OverloadingExamples {

    //metoda cu 2 parametri de tip int
    static int multiply(int a, int b){
        return a*b;
    }

    //aceeasi metoda dar cu 2 parametri de tip DOUBLE
    static double multiply(double a, double b){
        return a*b;
    }

    //aceeasi metoda dar cu 3 paramentri
    static double multiply(double a, double b, double c){
        return a*b*c;
    }


}
