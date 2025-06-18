package com.techlab.inicio.clase3.practicas;

public class GrupoDeDatos {
    public static void main(String[] args) {
       /* String : dato inmutable
                ArrayList:Lista flexible
                        Array: lista estatica*/

        String textoEjemplo = "mensaje en formato String 123";
        int indiceBusqueda = textoEjemplo.indexOf("e" + " ");
        System.out.println(indiceBusqueda);
        String nombre = "ariel";
        String apellido= "galeppi";
        nombre = nombre.toUpperCase().charAt(0) + nombre.substring(1);
        apellido = apellido.toUpperCase().charAt(0) + apellido.substring(1);
        String nombreCompleto = nombre + " " + apellido;
        System.out.println(nombreCompleto);// * nombre.toUpperCase().chartAt(0);
        // transforma el nombre a mayusculas -> ARIEL
        // y de eso se obtiene el primer caracter -> A
        //nombre.substring(1)

        System.out.println(nombre);
        // System.out.println(textoEjemplo.toLowerCase());
        System.out.println(textoEjemplo);

        String[] palabras =nombreCompleto.split(" "); // -> ["Ariel" , " Galeppi"]

        String url = "https://www.airbnb.es/rooms/1149367064211000759?adults=1&category_tag=Tag%3A8535&enable_m3_private_room=true&photo_id=1899371341&search_mode=regular_search&check_in=2024-11-01&check_out=2024-11-11&source_impression_id=p3_1728902140_P3RszFZLPnwc7obY&previous_page_section_name=1000&federated_search_id=4f4b3ac8-8e66-48c1-baee-a3584f464590&modal=PHOTO_TOUR_SCROLLABLE";
        String[] parteUrl = url.split( "/");
        int indicefinal = parteUrl.length -1;
        String primerElemento = parteUrl[0];

        String segundoElemento = parteUrl[1];
        String recursoFinal = parteUrl[indicefinal];
        System.out.println(recursoFinal);
    }
}
