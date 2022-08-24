/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia2JavaPOOejercicios;

import ServidorGuia2JavaPOO.ServidorEjercicio2Java;
import guia2javapoo.entidades.Circunferencia;

/**
 *
 * @author Omar
 */
public class Ejercicio2Guia2Java {
    public static void main (String[]args){
        ServidorEjercicio2Java se = new ServidorEjercicio2Java();
        Circunferencia c1 = se.crearCircunferencia();
        se.Calculos(c1);
        
    
    }
}
