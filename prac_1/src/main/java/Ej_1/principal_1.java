package Ej_1;
/*
Escribe un programa que tome 3 números enteros introducidos por el usuario mediante el teclado y
determine cuántos de dichos números son diferentes, el promedio, la suma de todos, el producto del
mayor por el menor y si el número restante es divisible por 3.
*/

import java.util.Scanner;

public class principal_1 {
    public static void main(String[] args) {
        int cant = 3;
        int[] num = new int[cant];
        int suma = 0;
        int diferentes = 0;

        Scanner lector = new Scanner(System.in);

        for (int i = 0; i < cant; i++) {
            System.out.print("Ingrese el valor " + (i + 1) + ": "); // sout para escribir mas rapido
            num[i] = lector.nextInt();
            suma += num[i];
        }
        // for (int i = 0; i < num.length; i++)
        for (int j : num) {
            if (num[0] != j) {
                diferentes++;
            }
        }

        double promedio = 0.0;
        promedio = suma / (double)cant;

        int mayor = num[0];
        int menor = num[0];

        for (int i = 0; i < cant; i++){
            if (mayor < num[i]) {
                mayor = num[i];
            }else if (menor > num[i]){
                menor = num[i];
            }
        }
        System.out.println("Mayor " + mayor);
        System.out.println("Menor " + menor);

        int producto = mayor * menor;

        // el restante es la suma de todos menos el mayor y el menor
        int restante = suma - mayor - menor;

        System.out.println("Diferentes: " + diferentes);
        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
        System.out.println("Producto Mayor * Menor: " + producto);
        System.out.println("¿El restante (" + restante + ") es divisible por 3?: " + (restante % 3 == 0));

        lector.close();
    }
}