

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        int vector[];
        int positivos = 0;
        int negativos = 0;
        int neutros = 0;
        int contpos = 0;
        int contneg = 0;
        int contneu = 0;
        int i = 0;
        int tamano;
        
        System.out.println("Ingrese el tamaño del vector: ");
        tamano=Leer.nextInt();

        vector = new int[tamano];

        for (i = 0; i < tamano; i++) {
            System.out.println("Ingrese valor:");
            vector[i] = Leer.nextInt();

            if (vector[i] == 0) {
                contneu++;
                neutros = vector[i];
            } else {
            }
            if (vector[i] < 0) {
                contneg++;
                negativos = negativos + vector[i];

            } else {
            }
            if (vector[i] > 0) {
                contpos++;
                positivos = positivos + vector[i];

            }


        }
        System.out.println("El número de neutros es:" + contneu);
        System.out.println("El número de negativos es:" + contneg);
        System.out.println("La suma de los negativos es:" + negativos);
        System.out.println("El número de positivos es:" + contpos);
        System.out.println("La suma de los positivos es:" + positivos);
    }
}
