/*
Una compañía tiene cuatro vendedores que venden cinco productos distintos.
 Al finalizar la jornada laboral, cada vendedor pasa una nota por cada tipo de producto vendido.
 Cada nota contiene lo siguiente:
a) El número del vendedor
b) El número del producto
c) El valor total de ese producto vendido en ese día
Así, cada vendedor pasa entre 0 y 5 notas de venta por día.
 Suponga que está disponible la información sobre todas las notas del mes pasado.
  Escriba una aplicación que lea toda esta información para las ventas del último mes y que
  resuma las ventas totales por vendedor, y por producto. Todos los totales deben guardarse en el
  vector bidimensional ventas.

Después de procesar toda la información del mes pasado, muestre los resultados en formato tabular,
en donde cada columna represente a un vendedor específico y cada fila simboliza un producto.
Saque el total de cada fila para obtener las ventas totales de cada producto durante el último mes.
 Calcule el total de cada columna para sacar las ventas totales de cada vendedor durante el último mes.
 Su impresión tabular debe incluir estos totales cruzados a la derecha de las filas totalizadas,
 y en la parte inferior de las columnas totalizadas.
 */
package EJ_7;

public class ControlVentas {
    private static final int FILAS_PRODUCTOS = 5;
    private static final int COLUMNAS_VENDEDORES = 4;

    private double[][] ventas;

    public ControlVentas() {
        this.ventas = new double[FILAS_PRODUCTOS][COLUMNAS_VENDEDORES];
    }

    public boolean registrarNota(int numVendedor, int numProducto, double monto) {
        if (numVendedor < 1 || numVendedor > COLUMNAS_VENDEDORES) {
            return false;
        }
        if (numProducto < 1 || numProducto > FILAS_PRODUCTOS) {
            return false;
        }
        if (monto < 0) {
            return false;
        }

        // el num del producto/vendedor lo uso como indice del arreglo
        this.ventas[numProducto - 1][numVendedor - 1] += monto;
        return true;
    }

    /*
    Muestra en formato tabular las ventas por producto y vendedor,
    incluyendo los totales de fila (por producto), de columna (por vendedor)
    y el total general cruzado.
     */
    public void mostrarResumen() {
        System.out.println("\nRESUMEN MENSUAL DE VENTAS:");

        // encabezado de la tabla "Vendedores"
        System.out.printf("%-15s", "Producto / Vend");
        for (int v = 1; v <= COLUMNAS_VENDEDORES; v++) {
            System.out.printf("%-15s", "Vendedor " + v);
        }
        System.out.printf("%-15s%n", "Total Producto");
        System.out.println("------------------------------------------------------");

        // acumulador de totales por columna (vendedor)
        double[] totalPorVendedor = new double[COLUMNAS_VENDEDORES];
        double totalGeneral = 0;
        // por filas
        for (int p = 0; p < FILAS_PRODUCTOS; p++) {
            System.out.printf("Producto %-6d", (p + 1));
            double totalFilaProducto = 0;

            // por columnas
            for (int v = 0; v < COLUMNAS_VENDEDORES; v++) {
                double monto = this.ventas[p][v];
                System.out.printf("$%-14.2f", monto);

                totalFilaProducto += monto;
                totalPorVendedor[v] += monto;
            }

            // Muestra total a la derecha de la fila
            System.out.printf("$%-14.2f%n", totalFilaProducto);
            totalGeneral += totalFilaProducto;
        }

        System.out.println("------------------------------------------------------");

        //Totales por vendedor
        System.out.printf("%-15s", "Total Vendedor");
        for (int v = 0; v < COLUMNAS_VENDEDORES; v++) {
            System.out.printf("$%-14.2f", totalPorVendedor[v]);
        }

        // Total cruzado global
        System.out.printf("$%-14.2f%n", totalGeneral);
        System.out.println("=================================================\n");
    }
}
