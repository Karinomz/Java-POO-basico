/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia2JavaPOOejercicios;

import ServidorGuia2JavaPOO.ServidorEjercicio9Java;
import guia2javapoo.entidades.Matematica;
import java.util.Scanner;

/**
 *
 * @author Omar
 */
public class Ejercicio9Guia2Java {
    public static void main (String [] args){
        Scanner leer = new Scanner(System.in);
        ServidorEjercicio9Java se = new ServidorEjercicio9Java();
        Matematica m1 = se.crearMamematica();
        se.calcularPotencia();
        se.calcularRaiz();
    }
}
