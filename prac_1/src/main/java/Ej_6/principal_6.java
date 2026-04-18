package Ej_6;

import java.util.Scanner;

/*
Escribe un programa que calcule la suma de todos los números múltiplos de 5 comprendidos entre
dos enteros positivos leídos por teclado
 */
public class principal_6 {
    static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int num1;
        int num2;

        do {
            System.out.print("Ingrese el primer numero ");
            num1 = lector.nextInt();
            System.out.print("Ingrese el segundo numero ");
            num2 = lector.nextInt();
        } while (num1 <= 0);

        int max = Math.max(num1, num2);
        int min  = Math.min(num1, num2);
        int suma = 0;

        for (int i = min; i <= max; i++){
            if(i % 5 == 0){
                suma += i;
            }
            min++;
        }

        System.out.println("Resultado: " + suma);

        lector.close();
    }
}
