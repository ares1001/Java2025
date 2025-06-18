package com.techlab.inicio.clase4;

import java.sql.SQLOutput;

public class FormatoTextoGenerado {
    public static void main(String[] args) {
        //Dada una cadena  " te CHAi ", formateala para que quede " Te Chai",
        //"te CHAI"-> "te chai"
        //sacar los espacios // - > " te chai"
        // primer letra de cada palabra en mayuscula -> " Te Chai"
        // "   aRGENTINA CAMpeon del MUNdo"->[ "aRGENTINA", "CAMpeon", "del", "MUNdo"]

        String textoOriginal = " te CHAi Argentina CAMPEOn dEl muNDO";
        String textoMinuscula = textoOriginal.toLowerCase();
        String textSinEspacios = textoMinuscula.trim();
        //dividimos en palabas el texto
        String[] palabras =textSinEspacios.split(" ");
        String resultado = "";

        for (int i = 0; i < palabras.length ; i++) {
            String palabra = palabras[i];
            resultado +=palabra.toUpperCase().charAt(0) + palabra.substring(1) + " ";
            System.out.println(palabra);


        }

        // esto funciona para una



        System.out.println(resultado);
        System.out.println("Longitud palabra :" + resultado.length());

        System.out.println("Pirmer Letra : " + resultado.charAt(0));
        System.out.println("contiene chai ?" + resultado.contains("Chai"));
    }
}
