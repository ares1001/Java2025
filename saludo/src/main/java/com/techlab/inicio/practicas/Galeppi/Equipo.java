/*
 * Copyright (c) 2025. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.techlab.inicio.practicas.Galeppi;

import java.util.ArrayList;

public class Equipo {
   private ArrayList<Equipo> materiales ;

   public Equipo(){
       materiales = new ArrayList<>();
   }
   public void agregarMateriales(Equipo material){
       this.materiales.add(material);

   }
}
