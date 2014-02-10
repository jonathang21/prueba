

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner Leer = new Scanner(System.in);
        int vector[];
        int i;
        double promedio = 0;
        double mayores = 0;
        int acumulador = 0;
        int tamano;
          
        System.out.println("Ingrese el tamaño del vector:");
        tamano=Leer.nextInt();

        
        vector = new int[tamano];
      

        for (i = 0; i < tamano; i++) {
            System.out.println("Ingrese el valor al vector");
            vector[i] = Leer.nextInt();
            acumulador = acumulador + vector[i];
        }
        promedio = acumulador / 15;
        for (i = 0; i < 15; i++) {
            if (vector[i] > promedio) {
                mayores = mayores + 1;
            }
        }
        System.out.println("El promedio es: " + promedio);
        System.out.println("Los mayores son: " + mayores);


    }
}
