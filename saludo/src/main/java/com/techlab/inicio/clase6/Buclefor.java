package com.techlab.inicio.clase6;

import com.techlab.inicio.practicas.p5.Producto;

import java.util.ArrayList;

public class Buclefor {
    public static void main(String[] args) {
        ArrayList<String> productos = new ArrayList<>();

        productos.add("a");
        productos.add("b");
        productos.add("c");
        productos.add("d");

        for (int i = 0; i < productos.size() ; i++) {
            String producto = productos.get(i);
            System.out.println("Producto " + producto);
        }

        for (String producto : productos) {
            System.out.println("Producto " + producto);


        }
    }
}
