/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServidorGuia2JavaPOO;

import guia2javapoo.entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author Omar
 */
public class ServidorEjercicio1Java {
    
    public Libro altaLibro() {
    
    // instanciamos un objeto de tipo libro // 
         Libro l1 = new Libro (); 
         
    // Lleno los atributos //
        
       Scanner leer = new Scanner (System.in);
       System.out.println("Ingrese el titulo del libro: ");
       l1.setTitulo(leer.nextLine());
       System.out.println("Ingrese el nombre del autor: ");
       l1.setAutor(leer.nextLine());
       System.out.println("Ingrese la cantidad de paginas del libro: ");
       l1.setPags(leer.nextInt());
       System.out.println("Ingrese el numero ISBN: ");
       l1.setISBN(leer.nextInt());
       
       return l1;
       
    }
    
}
