package com.techlab.inicio.practicas.p5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Producto> carrito = obtenerProductos();
        calcularTotalProductos(carrito);
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el producto a buscar : ");
        String busqueda = entrada.nextLine();


        ArrayList<Producto> productosEncontrados = new ArrayList<>();
        for (Producto producto : carrito){
            if (producto.contieneNombre(busqueda)){
                productosEncontrados.add(producto);
            }
        }

         if (productosEncontrados.isEmpty()){
          System.out.printf("no  encontramos productos que coincidan con <%s>" , busqueda);

        } else {
     System.out.println("PRODUCTOS ENCONTRADOS : ");
     for(Producto producto : productosEncontrados){
         producto.print();
     }

 }
    }
    public static  ArrayList<Producto> obtenerProductos(){
        ArrayList<Producto> carrito = new ArrayList<>();

        Producto monitor = new Producto("monitor", 2000);
        monitor.agregarDescuento(20);
        monitor.agregarCantidad(9);
        Producto microfono = new Producto("microfono", 4000);
        microfono.agregarDescuento(30);
        Producto webcam = new Producto("webcam", 1000);
        webcam.agregarDescuento(15);


        carrito.add(monitor);
        carrito.add(microfono);
        carrito.add(webcam);

        return carrito;
    }

    public static void calcularTotalProductos(ArrayList<Producto> carrito){
        double costoTotal = 0;

        for (Producto producto : carrito) {

            producto.print();

            costoTotal += producto.calcularPrecioTotal();

        }
        System.out.println(" el costo total es " + costoTotal);
    }
}


