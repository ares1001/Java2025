/*
 * Copyright (c) 2025. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.techlab.inicio.practicas.p6;

import java.util.ArrayList;

public class Pedido {
    private ArrayList<Producto> productos;


    public Pedido(){
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto){
        this.productos.add(producto);
    }

    public double calcularTotal(){
        double total =0;
                for (Producto producto: this.productos){
                    total += producto.calcularPrecioTotal();
                }
                return  total;
    }

}
