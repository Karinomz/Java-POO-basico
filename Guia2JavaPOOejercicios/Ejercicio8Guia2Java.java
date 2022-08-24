/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia2JavaPOOejercicios;

import ServidorGuia2JavaPOO.ServidorEjercicio8Java;
import guia2javapoo.entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author Omar
 */
public class Ejercicio8Guia2Java {
    public static void main (String [] args){
        Scanner leer = new Scanner(System.in);    
        Cadena cadena1 = new Cadena();
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        cadena1.setFrase(frase);
        cadena1.setLongitud(frase.length());
        System.out.println(cadena1.getFrase()+" y " + cadena1.getLongitud());
        
        ServidorEjercicio8Java se = new ServidorEjercicio8Java();
        
          
    }
}
