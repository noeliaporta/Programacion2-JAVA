package EJ_9;

public class PruebaComplejo {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA DE LA CLASE COMPLEJO ===");

        Complejo c1 = new Complejo(9.5, 4.2);
        Complejo c2 = new Complejo(3.1, 7.8);

        Complejo c3 = new Complejo();

        System.out.print("Num complejo 1 (c1): ");
        c1.imprimirComplejo();
        System.out.println();

        System.out.print("Num complejo 2 (c2): ");
        c2.imprimirComplejo();
        System.out.println();

        System.out.print("Num complejo 3 (c3 por defecto): ");
        c3.imprimirComplejo();
        System.out.println("\n------------------------------------");

        // 1) Suma: c1 + c2
        Complejo suma = c1.sumar(c2);
        System.out.print("Suma (c1 + c2): ");
        c1.imprimirComplejo();
        System.out.print(" + ");
        c2.imprimirComplejo();
        System.out.print(" = ");
        suma.imprimirComplejo();
        System.out.println();

        // 2) Resta: c1 - c2
        Complejo resta = c1.restar(c2);
        System.out.print("Resta (c1 - c2): ");
        c1.imprimirComplejo();
        System.out.print(" - ");
        c2.imprimirComplejo();
        System.out.print(" = ");
        resta.imprimirComplejo();
        System.out.println("\n====================================");
    }
}