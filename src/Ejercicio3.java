
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADSI-455508
 */
public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        
        int arreglo[];
        int mayor=0;
        int posicion=0;
        int tamano;
        
        System.out.println("Ingrese el tamaño del vector:");
        tamano=leer.nextInt();
        
        arreglo=new int[tamano];
        
        for (int i = 0; i < tamano; i++) {
            
            System.out.println("Ingrese un valor: ");
            arreglo[i]= leer.nextInt();
        }
        Arrays.sort(arreglo);
        
        for (int i = 0; i < tamano; i++) {
            
            if (i==0) {
                
                mayor=arreglo[i];
                posicion=0;
            }
            
            if(arreglo[i]>mayor){
                
                mayor=arreglo[i];
                posicion=i;
            }
        }
        System.out.println(" El mayor del vector es: " +mayor+ " La posicion: " +posicion);
    }
        
            
}
