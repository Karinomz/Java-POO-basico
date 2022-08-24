/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServidorGuia2JavaPOO;

import guia2javapoo.entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Omar
 */
public class ServidorEjercicio4 {
    
    public Rectangulo crearRectangulo(){
        Scanner leer = new Scanner(System.in);
        Rectangulo r1 = new Rectangulo();
        
        /* Llenar Atributos */
        System.out.println("Ingrese el tamaño de la base");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el tamaño de la altura");
        int num2 = leer.nextInt();
        
        r1.setAltura(num2);
        r1.setBase(num1);
        r1.setSuperficie(num1*num2);
        r1.setPerimetro(Math.pow(num2+num1, 2));
        
        System.out.println("Superficie del rectangulo = "+r1.getSuperficie());
        System.out.println("Perimetro del rectangulo = "+r1.getPerimetro());
        
        return r1;
}
}
