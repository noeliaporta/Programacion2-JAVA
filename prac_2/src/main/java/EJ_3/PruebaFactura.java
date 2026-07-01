package EJ_3;

public class PruebaFactura {
    public static void main(String[] args){

        Factura factura = new Factura(1, 100, "Martillo", 3, 1500);
        System.out.println("Factura N°: " + factura.getNumFactura());
        System.out.println("Artículo N°: " + factura.getNumArticulo());
        System.out.println("Descripción: " + factura.getDescripcion());

        System.out.println("Monto total: " + factura.obtenerMontoFactura());

    }
}
