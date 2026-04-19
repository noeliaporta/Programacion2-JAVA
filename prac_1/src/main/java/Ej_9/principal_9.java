package Ej_9;
/*
Escribe una aplicación que reciba del usuario el radio de un círculo como un entero, y que imprima
el diámetro de la circunferencia y el área del círculo mediante el uso del valor de punto flotante
3.14159 para PI.
 También puede utilizar la constante predefinida Math.PI para el valor. Esta
constante es más precisa que el valor 3.14159. La clase Math se define en el paquete java.lang. Las
clases en este paquete se importan de manera automática, por lo que no necesita importar la clase
Math mediante la instrucción import para usarla. Use las siguientes fórmulas (r es el radio):
diámetro = 2 r
circunferencia = 2 * PI * r
área = PI * r2
 */
import java.util.Scanner;

public class principal_9 {
    public static void main(String[] args) {
        int radio;
        int diametro;

        Scanner lector = new Scanner(System.in);

        do {
            System.out.print("Ingrese el radio de un circulo (valor entero): ");
            radio = lector.nextInt();
            if (radio <= 0) System.out.println("El radio debe ser mayor a cero.");
        } while (radio <= 0);

        // el diámetro de la circunferencia
        diametro = 2 * radio;

        // y el área del círculo
        // double area = Math.PI * radio * radio;
        // Math.pow() hace la potencia
        double area = Math.PI * Math.pow(radio, 2);

        double circunferencia = 2 * Math.PI * radio;

        System.out.println("Radio: " + radio);
        System.out.println("Diámetro: " + diametro);
        System.out.println("Circunferencia (perímetro): " + circunferencia);
        System.out.println("Área del círculo: " + area);

        lector.close();

    }
}
