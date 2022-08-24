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
public class Cuenta {
    /* Atributos */
    
    private int numeroCuenta;
    private long DNIcliente;
    private double saldoActual;
    private double ingreso;
    private int cuenta;
    private double retirar;
    private double extraccionRapida;
    
    /* Constructores */

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, long DNIcliente, double saldoActual, double ingreso, int cuenta, double retirar, double extraccionRapida) {
        this.numeroCuenta = numeroCuenta;
        this.DNIcliente = DNIcliente;
        this.saldoActual = saldoActual;
        this.ingreso = ingreso;
        this.cuenta = cuenta;
        this.retirar = retirar;
        this.extraccionRapida = extraccionRapida;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDNIcliente() {
        return DNIcliente;
    }

    public void setDNIcliente(long DNIcliente) {
        this.DNIcliente = DNIcliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getIngreso() {
        return ingreso;
    }

    public void setIngreso(double ingreso) {
        this.ingreso = ingreso;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public double getRetirar() {
        return retirar;
    }

    public void setRetirar(double retirar) {
        this.retirar = retirar;
    }

    public double getExtraccionRapida() {
        return extraccionRapida;
    }

    public void setExtraccionRapida(double extraccionRapida) {
        this.extraccionRapida = extraccionRapida;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", DNIcliente=" + DNIcliente + ", saldoActual=" + saldoActual + ", ingreso=" + ingreso + ", cuenta=" + cuenta + ", retirar=" + retirar + ", extraccionRapida=" + extraccionRapida + '}';
    }
    
    
    
}
