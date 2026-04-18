package Ej_4;

import java.util.Scanner;

/*
Escribe un programa que escriba todos los divisores de un número n entero positivo introducido por
el usuario
 */
public class principal_4 {
    static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int num;

        do {
            System.out.print("Ingrese un numero entero positivo: ");
            num = lector.nextInt();
        }while (num <= 0);

        System.out.print("Los divisores de " +  num + " son:");

        for(int i = num; i > 0 ; i--){
            if(num % i == 0){
                System.out.print(" " + i);
            }
        }
        lector.close();
    }
}
