
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADSI-455508
 */
public class Ejercicio6 {
 
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        
        int arreglo[];
        int i;
        int inverso[];
        int tamano;
        System.out.println("Ingrese el tamaño del vector");
        tamano=leer.nextInt();
        
        arreglo=new int[tamano];
        inverso=new int[tamano];
        
        
        for (i=0;i<tamano;i++){
            
            System.out.println("Ingrese el valor de la posicion: " + i + ":");
            arreglo[i]=leer.nextInt();
        }
        
        int cont=tamano-1;
        
        for (i = 0; i < tamano; i++) {
            
            inverso[i]=arreglo[cont];
            cont--;
        }
        for ( i = 0; i < tamano; i++) {
            
            System.out.println("Vector inverso valor: " + inverso[i]);
        }
    }
  
}
