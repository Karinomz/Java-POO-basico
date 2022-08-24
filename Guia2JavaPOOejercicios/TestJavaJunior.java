/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia2JavaPOOejercicios;

import java.util.Scanner;

/**
 *
 * @author Omar
 */
public class TestJavaJunior {
    public static void main(String[] args) {
        double moneda,cambio,dolar;
        String nombremoneda;
        Scanner leer = new Scanner(System.in);
        System.out.println("Moneda que tienes");
        nombremoneda=leer.nextLine();
        System.out.println("Cuantos "+nombremoneda+ " equivale a un dolar?");
        dolar=leer.nextDouble();
        System.out.println("Cuantos "+nombremoneda+" tienes?");
        moneda=leer.nextDouble();
        cambio=moneda/dolar;

        System.out.println(nombremoneda+" es igual a "+cambio+" dolares");
   
    }
}
