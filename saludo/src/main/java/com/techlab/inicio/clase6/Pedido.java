package com.techlab.inicio.clase6;

import java.util.ArrayList;

public class Pedido {
    private ArrayList<Producto> productos;

    public Pedido(){
        productos = new ArrayList<>();
    }

    public void addProducto(Producto p){
        this.productos.add(p);
    }

public double calcularCostoTotal(){
    double total = 0;
    for(Producto producto : this.productos){
        total += producto.getPrecio();

}
    return total;
    }
}
