/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia2JavaPOOejercicios;

import ServidorGuia2JavaPOO.ServidorEjercicio7Java;
import guia2javapoo.entidades.Persona;

/**
 *
 * @author Omar
 */
public class Ejercicio7Guia2Java {
    public static void main (String []args){
        ServidorEjercicio7Java se= new ServidorEjercicio7Java();
        Persona p1 = se.crearPersona();
        Persona p2 = se.crearPersona();
        Persona p3 = se.crearPersona();
        Persona p4 = se.crearPersona();
        
        System.out.println("Comprobando métodos");
        
        se.calcularIMC(p1);
        se.mayorEdad(p1);
        se.calcularIMC(p2);
        se.mayorEdad(p2);
        se.calcularIMC(p3);
        se.mayorEdad(p3);
        se.calcularIMC(p4);
        se.mayorEdad(p4);
        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        
        
        
    }
}
