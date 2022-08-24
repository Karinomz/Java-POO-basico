/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia2JavaPOOejercicios;

import guia2javapoo.entidades.ArregloEjercicio10;
import java.util.Arrays;

/**
 *
 * @author Omar
 */
public class Ejercicio10Guia2Java {
    public static void main(String[] args) {
        ArregloEjercicio10 vector = new ArregloEjercicio10();
        vector.LlenarVector();
        System.out.println(vector.mostrarVector1());
        vector.ordenarVector();
        System.out.println(vector.mostrarVector1());
        vector.setArrays2(Arrays.copyOf(vector.getArrays1(), 20));//Rellena el array 2 con los del array 1
        Arrays.fill(vector.getArrays2(), 10, vector.getArrays2().length, 0.5); // Usa solamente los primeros 10 elementos
        System.out.println(vector.mostrarVector2());
    
    }
}
