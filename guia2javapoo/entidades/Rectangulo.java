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
public class Rectangulo {
    
     /* Atributos */
    
    private int base;
    private int altura;
    private double superficie;
    private double perimetro;
    private int dibujo;
    
    /* Constructores*/

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura, double superficie, double perimetro, int dibujo) {
        this.base = base;
        this.altura = altura;
        this.superficie = superficie;
        this.perimetro = perimetro;
        this.dibujo = dibujo;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public int getDibujo() {
        return dibujo;
    }

    public void setDibujo(int dibujo) {
        this.dibujo = dibujo;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + ", superficie=" + superficie + ", perimetro=" + perimetro + ", dibujo=" + dibujo + '}';
    }
    
    
    
}
