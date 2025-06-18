package com.techlab.inicio.clase3.practicas;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class BuclesYListas {
    public static void main(String[] args) {
        String nombre = "talento tech";
        String [] letrasArray = {"t","a","l", "e", "n", "t", "o"};
        ArrayList<String> letras = new ArrayList<>();
        letras.addAll(Arrays.stream(letrasArray).collect(Collectors.toList()));
        System.out.println(nombre);

        /* for (int i = 0; i < nombre.length(); i++) {
            char caracter = nombre.charAt(i);
            System.out.println(caracter);

        } */
        // buvle para array
        /*for (int i = 0; i < letrasArray.length; i++) {
            String caracter = letrasArray[i];
            System.out.println(caracter);

        }*/

        for (int i = 0; i < letras.size() ; i++) {
            String letra = letras.get(i);
            System.out.println(letra);

        }
    }
}
