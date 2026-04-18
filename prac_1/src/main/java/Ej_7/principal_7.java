package Ej_7;
/*
Escribe el programa para un juego que consista en averiguar un número. El programa nos indicará
cada vez si el número introducido es mayor o menor que la constante almacenada que tendremos
que averiguar. Cuando se descubre el numero mostrara un mensaje de felicitación.
 */
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class principal_7 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numRandom = ThreadLocalRandom.current().nextInt(1, 101);;

        System.out.println("\t\tBIENVENIDO!");
        System.out.println("Tienes que ingresar numeros a eleccion");
        System.out.println("hasta adivinar el numero!");

        int num;
        int intentos = 5;

        do{
            System.out.print("Ingrese un numero: ");
            num = sc.nextInt();

            if (num < numRandom) {
                System.out.println("El numero que ingresaste es menor al numero ramdon");
            }else if (num > numRandom){
                System.out.println("El numero que ingresaste es mayor al numero ramdon");
            }
            intentos--;

        }while((num != numRandom) && (intentos != 0));

        if(num == numRandom){
            System.out.println("Felicidades has acertado!");
        }else {
            System.out.println("Que mal, el numero era: " + numRandom );
        }
        sc.close();
    }
}
