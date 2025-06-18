package com.techlab.inicio.clase3.practicas;

import java.util.ArrayList;
import java.util.Arrays;


public class Listas {
    public static void main(String[] args) {
        //Listas en java
         String nombre = "talento tech" ;
         nombre.charAt(0);// -> t
        nombre.charAt(1);
        nombre.charAt(10);
        int ultimoIndice = nombre.length() - 1;
        nombre.charAt(ultimoIndice);


        //Array

        String [] letrasArray ={"t", "a" , "l", "e", "n", "t", "o"};
        String letra1 = letrasArray[0];
        String letra2 = letrasArray[2];
        String letra3 =letrasArray[6];
        int ultimoIndiceArray = letrasArray.length - 1;
        String ultimaLetra= letrasArray[ultimoIndiceArray];
        //ArrayList

        ArrayList<String> letras = new ArrayList<>();
        letras.addAll(Arrays.stream(letrasArray).toList());
        System.out.println(letras);
        letras.get(0);
        letras.get(1);
        letras.get(2);
        int ultimoIndiceList = letras.size() - 1;
        System.out.println(ultimoIndiceList);


        letras.add(" ");
        letras.add("t");
        letras.add("e");

        System.out.println(letras);


    }
}
