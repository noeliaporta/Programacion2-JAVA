package Ej_5;

import java.util.Scanner;

/*
Escribe un programa que escriba la tabla de multiplicar de cualquier número entero dado por el
usuario, entre 1 y 10.
 */
public class principal_5 {
    static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int num;

        do {
            System.out.print("Ingrese un numero para saber su tabla de multiplicar: ");
            num = lector.nextInt();
        } while (num <= 0);

        int multi = num;

        for (int i = 1; i <= 10; i++) {
            multi = num * i;
            System.out.println(num + " X " + i + " = " + multi);
        }

        lector.close();
    }
}
