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
public class Operacion {
    /* Atributos */
    private double nunero1;
    private double numero2;
    private double sumar;
    private double restar;
    private double multi;
    private double dividir;
    
    /* Constructor Vacio */
    public Operacion() {
    }
   
    /* Constructor con Parametros */

    public Operacion(double nunero1, double numero2, double sumar, double restar, double multi, double dividir) {
        this.nunero1 = nunero1;
        this.numero2 = numero2;
        this.sumar = sumar;
        this.restar = restar;
        this.multi = multi;
        this.dividir = dividir;
    }

    public double getNunero1() {
        return nunero1;
    }

    public void setNunero1(double nunero1) {
        this.nunero1 = nunero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public double getSumar() {
        return sumar;
    }

    public void setSumar(double sumar) {
        this.sumar = sumar;
    }

    public double getRestar() {
        return restar;
    }

    public void setRestar(double restar) {
        this.restar = restar;
    }

    public double getMulti() {
        return multi;
    }

    public void setMulti(double multi) {
        this.multi = multi;
    }

    public double getDividir() {
        return dividir;
    }

    public void setDividir(double dividir) {
        this.dividir = dividir;
    }

    @Override
    public String toString() {
        return "Operacion{" + "nunero1=" + nunero1 + ", numero2=" + numero2 + ", sumar=" + sumar + ", restar=" + restar + ", multi=" + multi + ", dividir=" + dividir + '}';
    }

}
