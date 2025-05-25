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
    int numeroTabla= entrada.nextInt();

    for (int i = 1; i<= 10; i++){
        System.out.println(numeroTabla + " x " + i + " = " + (numeroTabla *i));
    }

    int j = 1;
    while(j <= 10){
        System.out.println(numeroTabla + " X " + j +"=" + (numeroTabla * j));
                j = j+ 1;
    }
    }
}
