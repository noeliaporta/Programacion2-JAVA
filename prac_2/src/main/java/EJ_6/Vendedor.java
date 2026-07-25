/*
El sector de ventas online de notebooks Lenovo paga a sus vendedores mediante comisiones.
Los vendedores reciben $2000 por semana, más el 6% de sus ventas brutas durante esa semana.
Por ejemplo, un vendedor que vende $50000 de mercancía en una semana, recibe $2000 más el 6% de $50000,
o un total de $5000. Usted acaba de recibir una lista de los artículos vendidos por cada vendedor.
Los valores de estos artículos son los siguientes:

Articulo                     Valor
     1                              $ 7239.99
     2                             $ 9129.75
     3                             $ 6899.95
     4                            $ 13150.89

Desarrolle una aplicación en JAVA que reciba como entrada los artículos vendidos por un vendedor
durante cada día de la última semana, y que calcule y muestre los ingresos de ese vendedor.
No hay límite en cuanto al número de artículos que un representante puede vender.
 */
package EJ_6;

public class Vendedor {
    private static final double BASE_SEMANAL = 2000.0;
    private static final double PORCENTAJE_COMISION = 0.06;

    private static final double PRECIO_ART_1 = 7239.99;
    private static final double PRECIO_ART_2 = 9129.75;
    private static final double PRECIO_ART_3 = 6899.95;
    private static final double PRECIO_ART_4 = 13150.89;

    private double totalVentasBrutas;

    public Vendedor() {
        this.totalVentasBrutas = 0.0;
    }

    public boolean registrarVenta(int numeroArticulo, int cantidad) {
        if (cantidad <= 0) {
            return false;
        }

        double precio = 0;
        switch (numeroArticulo) {
            case 1: precio = PRECIO_ART_1; break;
            case 2: precio = PRECIO_ART_2; break;
            case 3: precio = PRECIO_ART_3; break;
            case 4: precio = PRECIO_ART_4; break;
            default:
                return false; // artículo invalido
        }

        this.totalVentasBrutas += precio * cantidad;
        return true;
    }

    public double getTotalVentasBrutas() {
        return totalVentasBrutas;
    }

    public double calcularComision() {
        return totalVentasBrutas * PORCENTAJE_COMISION;
    }

    public double calcularIngresosTotales() {
        return BASE_SEMANAL + calcularComision();
    }
}
