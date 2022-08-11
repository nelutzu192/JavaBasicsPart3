package com.skillbrain.super_keyword;

public class Person {

    String name = "";

//    Person(){
//        System.out.println("Constructorul clasei Person");
//
//    }

    Person(String name){
        this.name = name;
        System.out.println("Nume: " + this.name);

    }
}
