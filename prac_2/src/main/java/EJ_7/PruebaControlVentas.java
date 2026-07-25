package EJ_7;

import java.util.Scanner;

public class PruebaControlVentas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ControlVentas resumen = new ControlVentas();

        System.out.println("SISTEMA DE REGISTRO DE NOTAS DE VENTA:");
        System.out.println("Instrucciones: Ingrese los datos de cada nota");
        System.out.println("Para finalizar la carga e imprimir el resumen ingrese 0 como num de vendedor\n");

        while (true) {
            System.out.print("Ingrese Nº de Vendedor (1 a 4) [0 para terminar]: ");
            int vendedor = entrada.nextInt();

            if (vendedor == 0) {
                break; // Salir del bucle
            }

            System.out.print("Ingrese Nº de Producto (1 a 5): ");
            int producto = entrada.nextInt();

            System.out.print("Ingrese el monto total vendido ($): ");
            double monto = entrada.nextDouble();

            boolean exito = resumen.registrarNota(vendedor, producto, monto);

            if (exito) {
                System.out.println("-> Nota registrada con éxito.\n");
            } else {
                System.out.println("-> Error: Datos de vendedor (1-4), producto (1-5) o monto inválidos. Intente de nuevo.\n");
            }
        }

        resumen.mostrarResumen();

        entrada.close();
    }
}