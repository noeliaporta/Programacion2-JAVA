/*
Cree una clase llamada Rectángulo con los atributos longitud y anchura, cada uno con un valor predeterminado de 1.
Debe tener métodos para calcular el perímetro y el área del rectángulo.
Debe tener métodos get y set para longitud y anchura.
Los métodos set deben verificar que longitud y anchura sean números de punto flotante mayores de 0.0, y menores de 20.0.
Escriba un programa para probar la clase Rectángulo y cada uno de sus métodos.
 */
package EJ_4;

public class Rectangulo {
    private double longitud = 1;
    private double anchura = 1;

    public Rectangulo(double longitud, double anchura) {
        this.longitud = longitud;
        this.anchura = anchura;
    }

    public double CalcularPerimetro(){
        return (longitud * 2) + (anchura * 2);
    }

    public double CalcularAreaRectangulo(){
        return (longitud * anchura);
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        if(longitud > 0.0 && longitud < 20.0){
            this.longitud = longitud;
        }
    }

    public double getAnchura() {
        return anchura;
    }

    public void setAnchura(double anchura) {
        if(anchura > 0.0 && anchura < 20.0){
            this.anchura = anchura;
        }
    }
}
