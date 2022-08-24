/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2javapoo.entidades;

/**
 *
 * @author Omar
 */
public class Persona {
    private String nombre;
    private int edad;
    private double peso;
    private double altura;
    private boolean esMayor;
    private String sexo;
    private double pesoIdeal;
    private int IMC;

    public Persona() {
    }

    public Persona(String nombre, int edad, double peso, double altura, String sexo, double pesoIdeal, int IMC) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.sexo = sexo;
        this.pesoIdeal = pesoIdeal;
        this.IMC = IMC;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPesoIdeal() {
        return pesoIdeal;
    }

    public void setPesoIdeal(double pesoIdeal) {
        this.pesoIdeal = pesoIdeal;
    }

    public int getIMC() {
        return IMC;
    }

    public void setIMC(int IMC) {
        this.IMC = IMC;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", altura=" + altura + ", esMayor=" + esMayor + ", sexo=" + sexo + ", pesoIdeal=" + pesoIdeal + ", IMC=" + IMC + '}';
        
    }
    
    
}
