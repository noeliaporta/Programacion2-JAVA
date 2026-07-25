package EJ_6;

import java.util.Scanner;

public class PruebaVendedor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Vendedor vendedor = new Vendedor();

        System.out.println("SISTEMA DE CALCULO DE COMISIONES - LENOVO");
        System.out.println("Precios de artículos:");
        System.out.println(" 1 - $7239.99");
        System.out.println(" 2 - $9129.75");
        System.out.println(" 3 - $6899.95");
        System.out.println(" 4 - $13150.89");
        System.out.println("----------------------------------------------");

        int articulo;

        // Bucle para cargar artículos sin límite
        do {
            System.out.print("Ingrese nº de artículo vendido (1-4) o 0 para terminar: ");
            articulo = entrada.nextInt();

            if (articulo >= 1 && articulo <= 4) {
                System.out.print("Ingrese la cantidad vendida de este artículo: ");
                int cantidad = entrada.nextInt();

                if (vendedor.registrarVenta(articulo, cantidad)) {
                    System.out.println("Venta registrada correctamente\n");
                } else {
                    System.out.println("Cantidad invalida\n");
                }
            } else if (articulo != 0) {
                System.out.println("Numero de artículo no valido\n");
            }

        } while (articulo != 0);

        // Resumen de ganancias
        System.out.println("\n RESUMEN SEMANAL:");
        System.out.printf("Total Ventas Brutas: $%.2f%n", vendedor.getTotalVentasBrutas());
        System.out.printf("Comisión (6%%):       $%.2f%n", vendedor.calcularComision());
        System.out.printf("Sueldo Base:         $2000.00%n");
        System.out.printf("Ingresos Totales:    $%.2f%n", vendedor.calcularIngresosTotales());
        entrada.close();
    }
}