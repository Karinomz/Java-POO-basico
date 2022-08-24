/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2javapoo.entidades;

import java.util.Arrays;

/**
 *
 * @author Omar
 */
public class ArregloEjercicio10 {
    private double arrays1[] = new double[50];
    private double arrays2[] = new double[20];

    public ArregloEjercicio10() {
    }

    public double[] getArrays1() {
        return arrays1;
    }

    public void setArrays1(double[] arrays1) {
        this.arrays1 = arrays1;
    }

    public double[] getArrays2() {
        return arrays2;
    }

    public void setArrays2(double[] arrays2) {
        this.arrays2 = arrays2;
    }
    
    public void LlenarVector(){
        // Arrays.fill(array1, Math.random());
        for (int i = 0; i < arrays1.length; i++) {
            arrays1[i] = Math.random()*10;
        }
    }
    
        public String mostrarVector1() {
        return Arrays.toString(arrays1);

    }
    public String mostrarVector2() {
        return Arrays.toString(arrays2);

    }

    public void ordenarVector() {
     Arrays.sort(arrays1);  
    }
    
    
}
