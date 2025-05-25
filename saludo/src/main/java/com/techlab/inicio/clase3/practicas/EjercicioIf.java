package com.techlab.inicio.clase3.practicas;

import java.util.Scanner;

public class EjercicioIf {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la cantidad que desea comprar: ");
        int cantidad = entrada.nextInt();

        if( cantidad > 100){
            System.out.println("Tienes un descuento especial");
        }
        else{
            System.out.println("Gracias por su compra");
        }
    }
}
