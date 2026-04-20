package Ej_11;
/*
Escribe una aplicación que reciba como entrada un entero que contenga sólo dígitos 0 y 1 (es decir,
un entero binario), y que imprima su equivalente decimal. [Sugerencia: use los operadores residuo y
división para elegir los dígitos del número binario uno a la vez, de derecha a izquierda. En el
sistema numérico binario, el dígito más a la derecha tiene un valor posicional de 1, el siguiente
dígito a la izquierda tiene un valor posicional de 2, luego 4, luego 8, etcétera. El equivalente
decimal del número binario 1101 es 1 * 1 + 0 * 2 + 1 * 4 + 1 * 8 = 13].
 */
import java.util.Scanner;

public class principal_11 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String binario ;

        do{
            System.out.print("Ingrese un valor binario: ");
            binario = lector.next();
            // expresión regular (Regex)
            // ^[01]+$ significa: "Desde el inicio al fin, solo acepta caracteres 0 o 1"
        }while(!binario.matches("^[01]+$"));

        System.out.println("Binario ingresado " + binario);

        long numBinario = Long.parseLong(binario);
        long decimal = 0;
        int potencia = 0;

        while (numBinario != 0) {
            //Agarro el último dígito (el de la derecha)
            long ultimoDigito = numBinario % 10;

            // si es un 1, sumo la potencia de 2 correspondiente
            if (ultimoDigito == 1) {
                decimal += Math.pow(2, potencia);
            }

            // "Eliminamo" el ultimo digito del número
            numBinario = numBinario / 10;

            // aumento la potencia
            potencia++;
        }

        System.out.println("El equivalente decimal es: " + decimal);
        lector.close();
    }
}
