package EJ_10;

public class PruebaRacional {
    public static void main(String[] args) {
        System.out.println("PRUEBA DE LA CLASE RACIONAL: ");

        // 2/4 pasa automáticamente a 1/2
        Racional r1 = new Racional(2, 4);
        Racional r2 = new Racional(3, 5);
        Racional r3 = new Racional(); // Por defecto 0/1

        System.out.println("Racional 1 (2/4 original): " + r1.aStringRacional());
        System.out.println("Racional 2 (3/5):          " + r2.aStringRacional());
        System.out.println("Racional 3 (Por defecto):  " + r3.aStringRacional());
        System.out.println("-------------------------------------------");

        // operaciones aritmeticas
        Racional suma = Racional.sumar(r1, r2);
        Racional resta = Racional.restar(r1, r2);
        Racional mult = Racional.multiplicar(r1, r2);
        Racional div = Racional.dividir(r1, r2);

        System.out.println("a) Suma (1/2 + 3/5): " + suma.aStringRacional());
        System.out.println("b) Resta  (1/2 - 3/5): " + resta.aStringRacional());
        System.out.println("c) Multiplica  (1/2 * 3/5): " + mult.aStringRacional());
        System.out.println("d) División  (1/2 / 3/5): " + div.aStringRacional());
        System.out.println("-------------------------------------------");

        System.out.println("e)formato decimal de Racional 1(1/2):");
        System.out.println("   - 2 decimales: " + r1.aStringFlotante(2));
        System.out.println("   - 4 decimales: " + r1.aStringFlotante(4));

        System.out.println("\nformato decimal del resultado de la Suma(11/10 = 1.1):");
        System.out.println("   - 2 decimales: " + suma.aStringFlotante(2));
        System.out.println("   - 5 decimales: " + suma.aStringFlotante(5));
        System.out.println("===========================================");
    }
}