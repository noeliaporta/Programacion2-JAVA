package Ej_8;
/*
Escribe un programa que ingrese un número entero positivo N y luego N números enteros e
imprima la suma de los números que se encuentran entre el mayor de los N números leídos y el
menor de los N números leídos.
 */
import java.util.Scanner;

public class principal_8 {
    static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numN;

        do {
            System.out.print("Ingrese la cantidad de numeros que desee: ");
            numN = lector.nextInt();
        }while (numN <= 0);

        int[] numeros = new int[numN];

        int posMax = 0;
        int posMin = 0;

        for (int i = 0; i < numN; i++) {
            System.out.print("[" + (i + 1) + "] Ingrese valor: ");
            numeros[i] = lector.nextInt();

            if (numeros[i] > numeros[posMax]) posMax = i;
            if (numeros[i] < numeros[posMin]) posMin = i;
        }

        int inicio = Math.min(posMax, posMin);
        int fin = Math.max(posMax, posMin);

        int suma = 0;

        for (int i = inicio; i <= fin; i++) {
            suma += numeros[i];
        }

        System.out.println("Suma del rango: " + suma);

        lector.close();

    }
}
