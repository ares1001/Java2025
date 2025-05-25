package com.techlab.inicio.clase2;
import java.util.Scanner;


public class SaludoPersonalizado {
    public static void main(String[] args) {

       System.out.println("Hola, ingresa tu nombre  ");
        //System.out.println("como estas ?");

    Scanner entrada = new Scanner(System.in);

    String datoUsuario = entrada.nextLine();

        System.out.println(datoUsuario);
        System.out.println("como estas ?" + datoUsuario);

    }


}
