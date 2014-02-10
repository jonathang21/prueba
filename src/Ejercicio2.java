

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        float vectorA[];
        float vectorB[];
        float vectorC[];
        int i = 0;
        int tamano;
        
        System.out.println("Ingrese el tamaño del vector:");
        tamano=Leer.nextInt();

        vectorA = new float[tamano];
        vectorB = new float[tamano];
        vectorC = new float[tamano];

        for (i = 0; i < tamano; i++) {
            System.out.println("Ingrese el valor del vector A:\n");
            vectorA[i] = Leer.nextInt();
        }
        for (i = 0; i < tamano; i++) {
            System.out.println("Ingrese el valor del sector B:\n");
            vectorB[i] = Leer.nextInt();
        }
        for (i = 0; i < tamano; i++) {
            vectorC[i] = vectorA[i] + vectorB[i];
            System.out.println("La posicion:" + i + " " + "El resultado es:" + vectorC[i]);
        }

    }
}
