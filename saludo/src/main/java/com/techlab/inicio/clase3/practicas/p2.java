package com.techlab.inicio.clase3.practicas;

import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int precioArroz = 2000;
        System.out.println("Te damos la bienvendida a nuestra tienda de arroz ");
        System.out.println("Ingresa tu nombre");
        String nombreUsuario = entrada.nextLine();
        System.out.println("Cada kilo de arroz cuesta " + precioArroz);
        System.out.println("cuantos kilos de arroz deseas comprar ? ");
        int cantidadDeArroz = entrada.nextInt();
        int total = precioArroz * cantidadDeArroz;
        System.out.println(nombreUsuario + ", el costo total seria " + total);
    }
}
