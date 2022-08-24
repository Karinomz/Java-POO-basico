/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServidorGuia2JavaPOO;

import guia2javapoo.entidades.Circunferencia;
import java.util.Scanner;

public class ServidorEjercicio2Java {
    
    private Scanner leer = new Scanner (System.in);
    
    public Circunferencia crearCircunferencia() {
        

        Circunferencia c1 = new Circunferencia();
        
        return c1;
    }

    public void Calculos(Circunferencia c1){
        System.out.println("Introducir radio: ");
        double radio1 = leer.nextDouble();
        double perimetro1,area1;
        area1=Math.PI*Math.pow(radio1, 2);
        perimetro1=Math.PI*radio1*2;

        System.out.println("El area y perimetro de la circunferencia es "+area1+ " y " +perimetro1);
    }

}
