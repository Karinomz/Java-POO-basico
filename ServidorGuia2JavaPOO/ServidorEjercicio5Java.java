
package ServidorGuia2JavaPOO;

import guia2javapoo.entidades.Cuenta;
import java.util.Scanner;


public class ServidorEjercicio5Java {
    public Cuenta crearCuenta(){
    Scanner leer = new Scanner(System.in);
    Cuenta c1 = new Cuenta();
    
    /* Llenar Atributos */
    
    System.out.println("Ingrese numero de cuenta: ");
    c1.setNumeroCuenta(leer.nextInt());
    System.out.println("Ingrese numero de DNI:");
    c1.setDNIcliente(leer.nextLong());
    c1.setSaldoActual(100000);
    System.out.println("Su saldo actual es de = "+c1.getSaldoActual());
    int opinion = 0;

         do{ 
   
          System.out.println(" ");
          
          System.out.println("MENU");
          System.out.println("1. Ingresar dinero ");
          System.out.println("2. Retirar dinero ");
          System.out.println("3. Extraccion rapida ");
          System.out.println("4. Consultar Saldo ");
          System.out.println("5. Consultar Datos ");
          System.out.println("6. Salir del Menu ");
         
          System.out.println(" ");
          
          System.out.println("¿Que accion le gustaria realizar? ");
          opinion=leer.nextInt();
    
 
          
            if (opinion>=1 && opinion<=5){ 
            
                    if(opinion==1){
                        System.out.print("Por favor, digite la cantidad dinero que desea ingresar: ");
                        c1.setIngreso(leer.nextDouble());
                        c1.setSaldoActual(c1.getSaldoActual()+c1.getIngreso());
                        System.out.println("Su saldo actual es de "+c1.getSaldoActual());
                        System.out.println("");
                    }
                    
                    if(opinion==2){
                        System.out.println("Por favor, digite la cantidad de dinero que desea retirar: ");
                        c1.setRetirar(leer.nextDouble());
                        
                            if(c1.getRetirar()<c1.getSaldoActual()){
                                c1.setSaldoActual(c1.getSaldoActual()-c1.getRetirar());
                                System.out.println("Su saldo actual es de "+c1.getSaldoActual());
                                System.out.println("");
                            }else{
                                System.out.println("Saldo insuficiente");
                                System.out.println("");
                            }
                    }
                  
                    if(opinion==3){
                        System.out.println("Usted a seleccionado Extraccion rapida");
                        System.out.println("Usted a extraido "+c1.getSaldoActual()*0.2);
                        System.out.println("");
                        c1.setSaldoActual(c1.getSaldoActual()*0.8);
                        System.out.println("Su saldo actual es de "+c1.getSaldoActual());
                        System.out.println("");
                    }
                  
                    if(opinion==4){
                        System.out.println("Su saldo actual es de "+c1.getSaldoActual());
                    }
                    
                    if(opinion==5){
                        System.out.println("Numero de cuenta: "+c1.getNumeroCuenta());
                        System.out.println("Numero de DNI: "+c1.getDNIcliente());
                    }
                          
             
            } /** if **/
        
            if(opinion==6){
                System.out.println("Usted a seleccionado salir del menu.");
            }
            
           
        
        }while (opinion!=6);
    
    
    return c1;
    
    }
    
}
