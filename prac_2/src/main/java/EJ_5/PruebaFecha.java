package EJ_5;

public class PruebaFecha {
    public static void main(String[] args) {
        System.out.println("Creo la fecha con el primer constructor(int int int) :");
        Fecha fecha1 = new Fecha(5, 21, 2010);
        fecha1.mostrarFecha();

        System.out.println("Creo la fecha con el segundo constructor(String, int, int):");
        Fecha fecha2 = new Fecha("Junio", 14, 2012);
        fecha2.mostrarFecha();

        System.out.println("Cro la fecha con el tercer constructor(int, String, int):");
        Fecha fecha3 = new Fecha(20, "Agosto", 2011);
        fecha3.mostrarFecha();
    }
}