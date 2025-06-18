package com.techlab.inicio.clase5;

public class Cliente {
    String nombre ;
    String email;
    int edad;

    public Cliente(){}
        public Cliente(String nombre, String email){
            this.nombre = nombre;
            this.email = email;
            this.edad= 40;
        }

        void mostrarDatos (){
            System.out.println("informe:");
            System.out.printf("el cliente %s tiene registrado como email la siguiente direccion : %s y tiene %s años", this.nombre, this.email, this.edad);
        }
    }

