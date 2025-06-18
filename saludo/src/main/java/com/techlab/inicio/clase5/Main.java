package com.techlab.inicio.clase5;

public class Main {
    public static void main(String[] args) {
        Producto teclado = new Producto("teclado", 20000);


        teclado.descontarStock();

        double precio = teclado.precioConDescuento();
        System.out.println("precio final " + precio);

        teclado.reporteProducto();

        Producto mouse = new Producto();
        /*mouse.nombre= "Ergo m";
        mouse.precio=10000;
        mouse.stock=10;
        mouse.precioConDescuento();*/

        mouse.reporteProducto();

        Cliente cliente = new Cliente("Ariel", "ari@gmail.com");
        cliente.mostrarDatos();
        Cliente cliente2 = new Cliente("Pablo", "peg@a.com");
        cliente2.mostrarDatos();

    }
}
