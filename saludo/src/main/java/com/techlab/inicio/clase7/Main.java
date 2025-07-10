/*
 * Copyright (c) 2025. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.techlab.inicio.clase7;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Super Clase
        Producto producto = new Producto("Producto", 20);
        producto.mostrarInfo();

        // Sub Clase
        Bebida bebida = new Bebida("Bebida", 20, 200);
        bebida.mostrarInfo();

        // Sub Clase
        Comida comida = new Comida("Comida", 20,50);
        comida.mostrarInfo();

        ArrayList<Producto> productos = new ArrayList<>();

        productos.add(producto);
        productos.add(bebida);
        productos.add(comida);


        for (Producto productoFor : productos){
            productoFor.mostrarInfo();
if(productoFor instanceof Bebida){
    ((Bebida) productoFor).nuevoMetodo();
    Bebida bebida1 = (Bebida) productoFor;
    bebida1.nuevoMetodo();
}
        }
    }
}
