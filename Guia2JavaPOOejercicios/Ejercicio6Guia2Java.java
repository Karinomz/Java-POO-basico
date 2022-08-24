package Guia2JavaPOOejercicios;

import ServidorGuia2JavaPOO.ServidorEjercicio6Java;
import guia2javapoo.entidades.Cafetera;

public class Ejercicio6Guia2Java {
    public static void main (String [] args){
        ServidorEjercicio6Java se = new ServidorEjercicio6Java();
        Cafetera c1 = se.llenarCafetera();
        se.servirTaza(c1);
        se.vaciarCafetera(c1);
        se.agregarCafe(c1);
    }
}