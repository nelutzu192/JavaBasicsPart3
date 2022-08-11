package com.skillbrain.static_in_java;

public class ExemplifyStaticInJava {

    public static void main (String[] args){

        /*exemplificare variabila statica
        ca sa accesam o variabila statica, nu e nevoie sa instantiem un obiect, se face direct din Clasa
         */
        System.out.println(StaticInJava.variabilaStatica);

        /*
        pentru a accesa variabila publica, e nevoie sa instantiem un obiect de tioul clasei
        pe s nu avem variabila statica, doar pe cea publica
         */
        StaticInJava s = new StaticInJava();
        System.out.println(s.variabilaPublica);

        //la fel si cu metodele

    }

}
