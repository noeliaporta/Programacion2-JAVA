package Ej_3;

import java.util.Scanner;
/*
Escribe un programa que calcule el factorial de n donde n es un número entero mayor o igual que
cero dado por el usuario.
 */
public class principal_3 {
    public static void main(String[] args) {
        int n = 0;

        Scanner lector = new Scanner(System.in);

        do {
            System.out.print("Ingrese un número mayor o igual a 0: ");
            n = lector.nextInt();

            if (n < 0) {
                System.out.println("Error: El número debe ser positivo.");
            }
        } while (n < 0);

        // uso long porque me permite guardar mas cantidad de digitos (20)
        // si uso int con números mayores a 12, se produciría un "overflow" (desbordamiento),
        // que me puede devolver un error o un numero negativo
        long factorial = 1;

        for(int i = n; i > 0; i--){
            factorial *= i;

            if(i != 1){
                System.out.print(i + "X");
            } else {
                System.out.println(i + " = " + factorial);
            }
        }

        lector.close();
    }

}
