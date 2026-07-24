package EJ_5;

public class PruebaFecha {
    public static void main(String[] args) {
        System.out.println("Fecha 1: (int, int, int) :");
        Fecha fecha1 = new Fecha(5, 21, 2010);
        fecha1.mostrarFecha();

        System.out.println("Fecha 2: (String, int, int):");
        Fecha fecha2 = new Fecha("Junio", 14, 2012);
        fecha2.mostrarFecha();

        System.out.println("Fecha 3: (int, String, int):");
        Fecha fecha3 = new Fecha(20, "Agosto", 2011);
        fecha3.mostrarFecha();

        System.out.println("Prueba con valores inválidos ");
        Fecha fecha4 = new Fecha(2, 29, 2024); // Febrero en año bisiesto
        fecha4.mostrarFecha();
    }
}