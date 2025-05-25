package com.techlab.inicio.clase3;
import java.util.Scanner;

public class EntradaSalida {
    public static void main(String[] args) {
        //ENTRADA DE DATOS 
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese su nombre de usuario");
        // siempre genera un String
        String nombre = entrada.nextLine();
        
        System.out.println("Nombre de Usuario: " + nombre);

        System.out.println("Ingrese su edad :");
        int edad = entrada.nextInt();

        System.out.println("ingrese su profesion");
        entrada.nextLine(); // guarda el enter
        String profesion = entrada.nextLine();


        System.out.println("Bienvenido " + nombre + " usted tiene " + edad + "años, y es " + profesion);
        
        //Ariel (enter)
        //48(entar)//
    }
}
