package guia2javapoo.entidades;

public class Cafetera {
    /* Atributos */
    private int capacidadMaximaCafetera;
    private int cantidadActualCafetera;
    private int capacidadMaximaTaza;
    private int cantidadActualTaza;

    public Cafetera() {
    }

    public Cafetera(int capacidadMaximaCafetera, int cantidadActualCafetera, int capacidadMaximaTaza, int cantidadActualTaza) {
        this.capacidadMaximaCafetera = capacidadMaximaCafetera;
        this.cantidadActualCafetera = cantidadActualCafetera;
        this.capacidadMaximaTaza = capacidadMaximaTaza;
        this.cantidadActualTaza = cantidadActualTaza;
    }

    public int getCapacidadMaximaCafetera() {
        return capacidadMaximaCafetera;
    }

    public void setCapacidadMaximaCafetera(int capacidadMaximaCafetera) {
        this.capacidadMaximaCafetera = capacidadMaximaCafetera;
    }

    public int getCantidadActualCafetera() {
        return cantidadActualCafetera;
    }

    public void setCantidadActualCafetera(int cantidadActualCafetera) {
        this.cantidadActualCafetera = cantidadActualCafetera;
    }

    public int getCapacidadMaximaTaza() {
        return capacidadMaximaTaza;
    }

    public void setCapacidadMaximaTaza(int capacidadMaximaTaza) {
        this.capacidadMaximaTaza = capacidadMaximaTaza;
    }

    public int getCantidadActualTaza() {
        return cantidadActualTaza;
    }

    public void setCantidadActualTaza(int cantidadActualTaza) {
        this.cantidadActualTaza = cantidadActualTaza;
    }

    @Override
    public String toString() {
        return "Cafetera{" + "capacidadMaximaCafetera=" + capacidadMaximaCafetera + ", cantidadActualCafetera=" + cantidadActualCafetera + ", capacidadMaximaTaza=" + capacidadMaximaTaza + ", cantidadActualTaza=" + cantidadActualTaza + '}';
    }    
}
