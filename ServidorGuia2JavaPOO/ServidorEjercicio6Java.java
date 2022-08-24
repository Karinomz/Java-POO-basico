package ServidorGuia2JavaPOO;

import guia2javapoo.entidades.Cafetera;
import java.util.Scanner;

public class ServidorEjercicio6Java {
    Scanner leer = new Scanner(System.in);
    Cafetera c1 = new Cafetera();
    
    public Cafetera llenarCafetera(){
        System.out.println("Por favor, indique la capacidad maxima de la cafetera: ");
        c1.setCapacidadMaximaCafetera(leer.nextInt());
        c1.setCantidadActualCafetera(c1.getCapacidadMaximaCafetera());
        System.out.println("La capacidad maxima de la cafetera es de "+c1.getCapacidadMaximaCafetera()+" litros");
  
        
        return c1; 
    }
    
    public void servirTaza(Cafetera c1){
        System.out.println("Indique la capacidad maxima de su taza");
        c1.setCapacidadMaximaTaza(leer.nextInt());
        c1.setCantidadActualTaza(0);
        int opinion = 0;
        
          do{ 
   
          System.out.println(" ");
          
          System.out.println("MENU");
          System.out.println("1. Llenar taza  ");
          System.out.println("2. Salir ");
          System.out.println("********");
          
          System.out.println("¿Que accion le gustaria realizar? ");
          opinion=leer.nextInt();
          
          if(opinion==1){
              if(c1.getCantidadActualCafetera()>=c1.getCapacidadMaximaTaza()){
                    c1.setCantidadActualCafetera(c1.getCantidadActualCafetera()-c1.getCapacidadMaximaTaza());
                    c1.setCantidadActualTaza(c1.getCapacidadMaximaTaza());
                    System.out.println("Su taza esta llena , con un total de "+c1.getCantidadActualTaza()+" litros");  
              }
              
              if(c1.getCantidadActualCafetera()<c1.getCapacidadMaximaTaza()){
                    c1.setCantidadActualTaza(c1.getCantidadActualCafetera());
                    System.out.println("Su taza esta cargada con un total de "+c1.getCantidadActualTaza());
              }
                         
          }
                    
          if(opinion!=1 && opinion!=2){
              System.out.println("Opcion incorrecta");
          }
        
        }while (opinion!=2);
     
        
        
    }
    
    public void vaciarCafetera(Cafetera c1){
        c1.setCantidadActualCafetera(0);
        System.out.println("La cantidad actual de cafe es de "+c1.getCantidadActualCafetera());
        
    }
    
    public void agregarCafe(Cafetera c1){
        int agregar=0;
        do{
        
        System.out.println("Indique la cantidad de cafe que desea ingresar en la cafetera");
            agregar=leer.nextInt();
        if(agregar<=c1.getCapacidadMaximaCafetera()){
            c1.setCantidadActualCafetera(agregar);
            System.out.println("Se agregado cafe en la maquina con un total de "+agregar+" litros");
        }else{
            System.out.println("La cantidad que desea ingresar en la cafetera es superior a su capacidad maxima");
            System.out.println("Por favor, vuelve a ingresar otra cantidad");
        }
        
        }while (agregar>c1.getCapacidadMaximaCafetera());
       
    }
    
}
