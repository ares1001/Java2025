package com.techlab.inicio.clase3.practicas;

import java.util.Scanner;

public class EstructurasDeControl {
    public static void main(String[] args) {


        //Condicionales IF
    String rol = "invitado";

    if (rol == "admin"){
        System.out.println("Puedes ingresar a todo el sistema");
    }
        if (rol == "admin"){
            System.out.println("Puedes ingresar a todo el sistema");
        }
        else{
        System.out.println("tienes que esperar que te asignen un rol");
    }
    if ( rol == "admin"){
        System.out.println("puedes ingresar a cualquier parte del sistema");
    }
     else if(rol == "invitado") {
        System.out.println(" solo puedes acceder a la app en forma de visitante");

    } else {
        System.out.println("Tienes que esperar que te asignen un rol");
    }
        System.out.println(" FINAL DEL PROGRAMA");
    }
}
