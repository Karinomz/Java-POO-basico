/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServidorGuia2JavaPOO;

import guia2javapoo.entidades.Matematica;
import java.util.Scanner;

/**
 *
 * @author Omar
 */
public class ServidorEjercicio9Java {
    Matematica m1 = new Matematica();
    Scanner scan = new Scanner(System.in);
    
    public Matematica crearMamematica(){
        Double numero1, numero2;
        numero1=Math.random()*50;
        numero2=Math.random()*50;
        m1.setNum1(numero1);
        m1.setNum2(numero2);
        System.out.println("El numero aleatorio designado es "+m1.getNum1()+" y "+m1.getNum2());
        System.out.println("El valor absoluto de ambos es "+ Math.round(m1.getNum1())+" y "+Math.round(m1.getNum2()));

        
        return m1;
    }
    
    public Matematica calcularPotencia(){
        double potencia;
        if (m1.getNum1()>=m1.getNum2()) {
            potencia=Math.pow(Math.round(m1.getNum1()),Math.round(m1.getNum2()));
            System.out.println(Math.round(m1.getNum1())+" elevado a "+Math.round(m1.getNum2())+" es igual a "+potencia);
        }else{
            potencia=Math.pow(Math.round(m1.getNum2()),Math.round(m1.getNum1()));
            System.out.println(Math.round(m1.getNum2())+" elevado a "+Math.round(m1.getNum1())+" es igual a "+potencia);
                }
    
        
        return m1;
    }
    
    public Matematica calcularRaiz(){
        double raiz;
        if (m1.getNum1()<=m1.getNum2()) {
            raiz=Math.sqrt(Math.round(m1.getNum1()));
            System.out.println("La raiz cuadrada de "+m1.getNum1()+" es igual a "+raiz);
        }else{
            raiz=Math.sqrt(Math.round(m1.getNum2()));
            System.out.println("La raiz cuadrada de "+m1.getNum2()+" es igual a "+raiz);
        }
    
        return m1;
    }
}
