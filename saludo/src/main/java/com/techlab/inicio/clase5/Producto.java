package com.techlab.inicio.clase5;

public class Producto {

        // Descripcion
        String nombre;
        double precio;
        int stock;


        //constructores
    public Producto(){}

    public Producto(String nombre , double precio){
        this.nombre = nombre;
        this.precio = precio;
        this.stock  = 20;

    }
        //funcionamiento(metodos)
        void descontarStock(){
            // el comportamiento
            System.out.println("descontar stock ...");
        }
        void reporteProducto(){
            System.out.println(" el producto " + nombre + " tiene un valor unitario de " +precio + " pesos ");
        }
        double precioConDescuento(){
            return precio - precio * 0.2;
        }

    }

