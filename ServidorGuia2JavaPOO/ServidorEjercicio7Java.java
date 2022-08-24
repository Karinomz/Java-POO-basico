/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServidorGuia2JavaPOO;

import guia2javapoo.entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Omar
 */
public class ServidorEjercicio7Java {
    Scanner leer = new Scanner(System.in);
    Persona p1 = new Persona();
    public Persona crearPersona(){
        System.out.println("Ingrese su nombre");
        p1.setNombre(leer.nextLine());
        System.out.println("Ingrese su edad");
        p1.setEdad(leer.nextInt());
        
        System.out.println("Ingrese su sexo");
        System.out.println("H : Hombre , M : Mujer , O : Otro");
        String sexo = leer.nextLine();
        do{
            sexo=leer.nextLine();
            
            if(sexo.equals("m")){
                System.out.println("Mujer");
            }
            if(sexo.equals("h")){
                System.out.println("Hombre");
            }
            if(sexo.equals("o")){
                System.out.println("Otro");
            }
            
            if(!sexo.equals("m") && !sexo.equals("h") && !sexo.equals("o")){
                System.out.println("Invalido");
            }
            
        }while(!sexo.equals("m") && !sexo.equals("h") && !sexo.equals("o"));
        
        
        
        System.out.println("Ingrese su peso");
        p1.setPeso(leer.nextDouble());
        System.out.println("Ingrese su altura");
        p1.setAltura(leer.nextDouble());
        return p1;
    }
    
    public void calcularIMC(Persona p1){
        // Peso ideal > 20 = Debajo de su peso ideal / La funcion devuelve un -1
        // Peso ideal >= 20 y <=25 = Esta en su peso ideal / La funcion devuelve un 0
        // Peso ideal > 25 = Tiene sobrepeso / La funcion devuelve 1
        
        p1.setPesoIdeal(p1.getPeso()/Math.pow(p1.getAltura(), 2));
        if(p1.getPesoIdeal()<20){
            p1.setIMC(-1);
            System.out.println("El IMC de esta persona es de ("+p1.getIMC()+"), significando que esta por debajo de su peso ideal");
        }
        if(p1.getPesoIdeal()>25){
            p1.setIMC(1);
            System.out.println("El IMC de esta persona es de ("+p1.getIMC()+"), significando que esta en sobrepeso");
        }
        if(p1.getPesoIdeal()>=20 && p1.getPesoIdeal()<=25){
            p1.setIMC(0);
            System.out.println("El IMC de esta persona es de ("+p1.getIMC()+"), significando que esta en su peso ideal");
        }   

    }
    
    public void mayorEdad(Persona p1){
        if(p1.getEdad()>=18){  
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }
    }
    
}