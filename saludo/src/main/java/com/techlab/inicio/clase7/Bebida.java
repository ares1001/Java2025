/*
 * Copyright (c) 2025. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.techlab.inicio.clase7;



public class Bebida extends Producto {
    private int volumeMl;



    public Bebida(String nombre, double precio, int volumeMl){
        super(nombre, precio);
        this.volumeMl = volumeMl;

    }

    @Override
    public void mostrarInfo(){

       super.mostrarInfo();
       this.nuevoMetodo();
        System.out.println("Volumen: " + this.volumeMl);
    }

    public void nuevoMetodo(){
        System.out.println("nuevo metodo");
    }
}
