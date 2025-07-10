/*
 * Copyright (c) 2025. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.techlab.inicio.practicas.p6;



import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido();

        agregarProductosAPedido(pedido1);

        double total = pedido1.calcularTotal();

        System.out.println(" lo que debe pagar es " + total);
    }
    public static void  agregarProductosAPedido(Pedido pedido){
        Producto monitor = new Producto("monitor", 2000);
        //monitor.agregarDescuento(20);
        monitor.setCantidad(10);
        Producto microfono = new Producto("microfono", 4000);
         //microfono.agregarDescuento(30);
      Producto webcam = new Producto("webcam", 1000);
        //webcam.agregarDescuento(15);


        pedido.agregarProducto(monitor);
        pedido.agregarProducto(microfono);
       pedido.agregarProducto(webcam);


    }
}
