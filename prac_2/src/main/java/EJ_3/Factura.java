/*
Cree una clase llamada Factura, que una ferretería podría utilizar para representar una factura para un artículo vendido en la tienda.
Una Factura debe incluir un número de factura,
un número de articulo,
la descripción del articulo,
la cantidad de artículos de ese tipo que se van a comprar
y el precio por artículo.
Su clase debe tener un constructor que inicialice las variables de instancia.
Proporcione los métodos get y set para cada variable de instancia.
Además, proporcione un método llamado obtenerMontoFactura,
que calcule el monto de la factura (es decir, que multiplique la cantidad por el precio por artículo)
y después lo devuelva como un valor double.
Si la cantidad no es positiva, debe establecerse en 0.
Si el precio por artículo no es positivo, debe establecerse en 0.0.
Escriba una aplicación de prueba llamada PruebaFactura, que demuestre las capacidades de la clase Factura.
*/

package EJ_3;

public class Factura {
    private Integer NumFactura;
    private Integer NumArticulo;
    private String Descripcion;
    private Integer cantidad;
    private double precio;

    public Factura(Integer numFactura, Integer numArticulo, String descripcion, Integer cantidad, double precio) {
        NumFactura = numFactura;
        NumArticulo = numArticulo;
        Descripcion = descripcion;
        this.setCantidad(cantidad);
        this.setPrecio(precio);
    }

    public Integer getNumFactura() {
        return NumFactura;
    }

    public void setNumFactura(Integer numFactura) {
        NumFactura = numFactura;
    }

    public Integer getNumArticulo() {
        return NumArticulo;
    }

    public void setNumArticulo(Integer numArticulo) {
        NumArticulo = numArticulo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        if(cantidad > 0){
            this.cantidad = cantidad;
        }else {
            this.cantidad = 0;
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if(precio > 0){
            this.precio = precio;
        }else{
            this.precio = 0.0;
        }
    }

    public double obtenerMontoFactura(){
        return cantidad * precio;
    }
}
