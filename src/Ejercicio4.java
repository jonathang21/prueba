

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);

        int vector[];
        double contador[];
        int i = 0;
        int tamano;
        
        System.out.println("Ingrese el tamaño del vector:");
        tamano=Leer.nextInt();
        
        vector = new int[tamano];
        contador = new double[tamano];


        for (i = 0; i < tamano; i++) {
            System.out.println("Ingrese valor : ");
            vector[i] = Leer.nextInt();
        }
        for (i = 0; i < tamano; i++) {
            contador[i] = Math.pow(vector[i], 2);

        }
        for (i = 0; i < tamano; i++) {
            System.out.println("vector original: " + vector[i]);
            System.out.println("vector resultante: " + contador[i]);
        }

    }
}
