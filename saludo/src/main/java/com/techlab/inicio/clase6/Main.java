package com.techlab.inicio.clase6;

public class Main {
    public static void main(String[] args) {
        Producto producto = new Producto();
        System.out.println(producto.getNombre());
        producto.setNombre("     ");
        System.out.println(producto.getNombre());
    }
}
