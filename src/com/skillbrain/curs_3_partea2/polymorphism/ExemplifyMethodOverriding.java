package com.skillbrain.curs_3_partea2.polymorphism;

public class ExemplifyMethodOverriding {

    public static void main(String[] args){

        Banca banca;

        banca = new BancaTransilvania();
        System.out.println("Rata dobanzii la BT: " + banca.obtineRataDobanzii());

        banca = new BancaComerciala();
        System.out.println("Rata dobanzii la BCR: " + banca.obtineRataDobanzii());

        banca = new Reiffeisen();
        System.out.println("Rata dobanzii la Reifeisen: " + banca.obtineRataDobanzii());
    }


}
