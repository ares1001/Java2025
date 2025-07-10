package com.techlab.inicio.practicas.p5;

public class Producto {
    String nombre;
    double precio;
    int stock;
    int cantidad;
    double descuento;




    public Producto(String nombreProducto, double precio) {
        this.nombre = nombreProducto;
        this.precio = precio;
        this.cantidad = 1;
        this.stock = 20;
        this.descuento = 0;

    }


    public void actualizarPrecio(double precio){
        if ( precio >= 1 && precio <=10000){
            this.precio = precio;
        } else{
            System.out.println("ERROR");
        }
    }
    void print() {
        System.out.println("*********** ");
        System.out.println("* Nombre : " + this.nombre);
        System.out.println("* Precio: " + this.precio);
        System.out.println("* Stock: " + this.stock);
        System.out.println("************");
    }

    void printName() {
        System.out.println("Producto " + this.nombre);
    }

    public void agregarDescuento(double descuento){
        this.descuento = descuento;
    }

    boolean contieneNombre(String busqueda){
         return this.nombre.contains(busqueda);
    }

    public double calcularPrecioTotal() {
        double precioSinDescuento = this.precio * this.cantidad;
        double descuento = 1 - ((double) this.descuento /100);

        return precioSinDescuento  * descuento;
    }

    void agregarCantidad(int cantidad){
        this.cantidad += cantidad;
    }


}