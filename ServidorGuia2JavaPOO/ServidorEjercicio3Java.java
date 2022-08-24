/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServidorGuia2JavaPOO;

import guia2javapoo.entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author Omar
 */
public class ServidorEjercicio3Java {
    public Operacion crearOperacion(){
        Scanner leer = new Scanner(System.in);
    /* Instanciar */
    
        Operacion o1 = new Operacion();
    
    /* Llenar Atributos */
        System.out.println("Ingrese el primer numero");
        double num1 = leer.nextDouble();
        System.out.println("Ingrese el segundo numero");
        double num2 = leer.nextDouble();
        
        o1.setNunero1(num1);
        o1.setNumero2(num2);
        o1.setSumar(num1+num2);
        o1.setRestar(num1-num2);
        o1.setMulti(num1*num2);
        o1.setDividir(num1/num2);
        System.out.println("Suma = " +o1.getSumar() );
        System.out.println("Resta = " +o1.getRestar() );
        System.out.println("Multiplicacion = " +o1.getMulti() );
        System.out.println("Division = " +o1.getDividir() );
        
        
        
        return o1;
    
    }
}
