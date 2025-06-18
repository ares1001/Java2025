package com.techlab.inicio.clase3.practicas;

import java.util.Scanner;

public class Bucles {
    public static void main(String[] args) {
        /*Scanner entrada = new Scanner(System.in);
        int precio = 1000;
        int cantidad ;
        int saldo = 5000;

while (saldo > 0){

    System.out.println("saldo actual : " + saldo);
    //comprar cosas
     System.out.println("Cantidad a comprar: ");
    cantidad = entrada.nextInt();

    saldo = saldo - (precio *  cantidad);
}
        System.out.println("mensaje final, fuera del bucle");*/

        Scanner entrada = new Scanner(System.in);

        System.out.println("ingrese el numero que quiere ver la tabla ");
        System.out.println("Bucle For");
        int numeroTabla= entrada.nextInt();

    for (int i = 1; i<= 10; i+=5){
        System.out.println(numeroTabla + " x " + i + " = " + (numeroTabla *i));
    }
        System.out.println("Bucle WHILE");
    int j = 10;
    while(j <= 100){
        System.out.println(numeroTabla + " X " + j +"=" + (numeroTabla * j));
                j = j+ 3;
    }
    }
}
