package com.techlab.inicio.clase4;

public class EjercicioFormatoTexto {
    public static void main(String[] args) {
        //Dada una cadena  " te CHAi ", formateala para que quede " Te Chai",
        //"te CHAI"-> "te chai"
        //sacar los espacios // - > " te chai"
        // primer letra de cada palabra en mayuscula -> " Te Chai"
        // "   aRGENTINA CAMpeon del MUNdo"->[ "aRGENTINA", "CAMpeon", "del", "MUNdo"]

        String textoOriginal = " te CHAi ";
        String resultado = textoOriginal.toLowerCase();
        resultado = resultado.trim();

        // esto funciona para una palabra
        resultado = resultado.toUpperCase().charAt(0) + resultado.substring(1);
        int indiceC = resultado.indexOf("c");
            //             "Te"                           // "C"                                                       77#hai"

        resultado = resultado.substring(0,indiceC) + resultado.substring(indiceC).toUpperCase().charAt(0) + resultado.substring(indiceC +1);



        System.out.println(resultado);

    }
}
