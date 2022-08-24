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
public class Libro {
    
    /* Atributos */
    
    private String titulo;
    private String autor;
    private int pags;
    private int ISBN;
    
    
    /* Constructor vacio */
    
    public Libro(){
         
        
    }

    /* Constructores por parametros */
    
    public Libro(String titulo, String autor, int pags, int ISBN) {
        
        this.titulo = titulo;
        this.autor = autor;
        this.pags = pags;
        this.ISBN = ISBN;
    }

    /* Metodos */
    
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPags() {
        return pags;
    }

    public void setPags(int pags) {
        this.pags = pags;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
    
    @Override
    public String toString(){
        return "El libro "+titulo+", con el ISBN "+ISBN+", escrito por "+autor+", "
                + "tiene un total de "+pags+" paginas. ";
        
    } 
    

    
}