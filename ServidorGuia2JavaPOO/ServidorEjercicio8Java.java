/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServidorGuia2JavaPOO;

import guia2javapoo.entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author Omar
 */
public class ServidorEjercicio8Java {
    Scanner leer = new Scanner(System.in);
    Cadena cadena1 = new Cadena();
    
    public int mostrarVocales(){
        int cantVocales=0;
        
        for (int i = 0; i <cadena1.getLongitud(); i++) {
            if(cadena1.getFrase().toLowerCase().charAt(i)== 'a'||cadena1.getFrase().charAt(i)== 'e'||cadena1.getFrase().charAt(i)== 'i'||cadena1.getFrase().charAt(i)== 'o'||cadena1.getFrase().charAt(i)== 'u'){
                cantVocales++;
            }
        }
        
        return cantVocales; 
    }
    
    public void invertirFrase(){
        String fraseInvertida="";
        for (int i = cadena1.getLongitud(); i >= 0; i--) {
            fraseInvertida+=cadena1.getFrase().charAt(i);
        }
        
        System.out.println("Resultado de frase invertida: "+fraseInvertida);
    }
    public int vecesRepetido(String letra){
        int cantVecesRepetido = 0;
        
        for (int i = 0; i < cadena1.getLongitud(); i++) {
            if(cadena1.getFrase().substring(i, i).equals(letra)){
                cantVecesRepetido++;
            }
        }
        return cantVecesRepetido;
    }
    
    public boolean contiene(String letra){
        boolean contieneLetra=false; 
        for (int i = 0; i <cadena1.getLongitud(); i++) {
            if(cadena1.getFrase().substring(i, i).equals(letra)){
                contieneLetra=true;
            }
        }
    return contieneLetra;
    }
    
}
