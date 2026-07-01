/*
Cree una clase llamada Fecha, que incluya tres variables de instancia: un mes (int), un día (int) y un año (int).
Su clase debe tener un constructor que inicialice las tres variables de instancia, y debe verificar que los valores que se proporcionan son correctos.
Proporcione los métodos get y set para cada variable de instancia.

Proporcione un método mostrarFecha , para Imprimir la fecha en varios formatos, como
     05/21/2010
     Junio 14, 2012
     20 Agosto 11
Usar constructores sobrecargados para crear objetos Fecha inicializados con fechas de los formatos solicitados para imprimir.
En el primer caso, el constructor debe recibir tres valores enteros. En el segundo, debe recibir un objeto String y dos valores enteros.
En el tercero debe recibir un valor entero, string y otro entero. Escriba una aplicación de prueba llamada PruebaFecha,
que demuestre las capacidades de la clase Fecha.
 */
package EJ_5;

public class Fecha {
    private int anio;
    private int mes;
    private int dia;

    public Fecha(int anio, int mes, int dia) {
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        if(anio > 1990 && anio < 2026){
            this.anio = anio;
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if(mes <= 12 && mes >= 1){
            this.mes = mes;
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if(dia <= 31 && dia >= 1){
            this.dia = dia;
        }
    }

    public void mostrarFecha(){
        String nombreMes;

    }
}
