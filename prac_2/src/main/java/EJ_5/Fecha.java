/*
Cree una clase llamada Fecha, que incluya tres variables de instancia: un mes (int), un día (int) y un año (int).
Su clase debe tener un constructor que inicialice las tres variables de instancia, y debe verificar que los valores que se proporcionan son correctos.
Proporcione los métodos get y set para cada variable de instancia.

Proporcione un método mostrarFecha , para Imprimir la fecha en varios formatos, como
     05/21/2010
     Junio 14, 2012
     20 Agosto 11
Usar constructores sobrecargados para crear objetos Fecha inicializados con fechas de los formatos solicitados para imprimir.
En el primer caso, el constructor debe recibir tres valores enteros.
En el segundo, debe recibir un objeto String y dos valores enteros.
En el tercero debe recibir un valor entero, string y otro entero.
Escriba una aplicación de prueba llamada PruebaFecha,que demuestre las capacidades de la clase Fecha.
 */
package EJ_5;

public class Fecha {
    private int anio;
    private int mes;
    private int dia;

    private static final String[] MESES = {"", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

    private static final int[] DIAS_POR_MES = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public Fecha(int mes, int dia, int anio) {
        setAnio(anio);
        setMes(mes);
        setDia(dia);
    }

    public Fecha(String nombreMes, int dia, int anio) {
        setAnio(anio);
        setMes(convertirMesAEntero(nombreMes));
        setDia(dia);
    }

    public Fecha(int dia, String nombreMes, int anio) {
        setAnio(anio);
        setMes(convertirMesAEntero(nombreMes));
        setDia(dia);
    }

    private int convertirMesAEntero(String nombreMes) {
        if (nombreMes != null) {
            for (int i = 1; i < MESES.length; i++) {
                if (MESES[i].equalsIgnoreCase(nombreMes.trim())) {
                    return i;
                }
            }
        }
        return 1; //caso de nombre invalido
    }


    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        if(anio >= 1990 && anio <= 2026){
            this.anio = anio;
        }else {
            this.anio = 2000; //si es invalido
        }
    }


    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if(mes <= 12 && mes >= 1){
            this.mes = mes;
        }else {
            this.mes = 1;
        }
    }

    public void setDia(int dia) {
        int maxDias = obtenerDiasDelMes(this.mes, this.anio);
        if (dia >= 1 && dia <= maxDias) {
            this.dia = dia;
        } else {
            this.dia = 1;
        }
    }

    private int obtenerDiasDelMes(int mes, int anio) {
        if (mes < 1 || mes > 12) return 31;
        // febrero bisiesto
        if (mes == 2 && esBisiesto(anio)) {
            return 29;
        }
        return DIAS_POR_MES[mes];
    }

    private boolean esBisiesto(int anio) {
        return (anio % 400 == 0) || (anio % 4 == 0 && anio % 100 != 0);
    }

    public String getNombreMes() {
        if (this.mes >= 1 && this.mes <= 12) {
            return MESES[this.mes];
        }
        return "Enero";
    }

    public void mostrarFecha() {
        // 05/21/2010
        System.out.printf("%02d/%02d/%d%n", this.mes, this.dia, this.anio);
        // Junio 14, 2012
        System.out.printf("%s %d, %d%n", getNombreMes(), this.dia, this.anio);
        // 20 Agosto 11
        System.out.printf("%d %s %02d%n%n", this.dia, getNombreMes(), this.anio % 100);
    }
}
