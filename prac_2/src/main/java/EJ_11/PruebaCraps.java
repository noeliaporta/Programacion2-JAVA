package EJ_11;

import java.util.Random;
import java.util.Scanner;

public class PruebaCraps {

    private static final int GANA = 1;
    private static final int PIERDE = 2;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Craps juego = new Craps();

            int saldo = 1000;
            System.out.println("*** CASINO CRAPS ***");
            System.out.println("Saldo inicial: $" + saldo);

            int apuesta = pedirApuestaValida(scanner, saldo);

            System.out.println("\n--- LANZAMIENTO INICIAL ---");
            int sumaDados = juego.tirarDados();
            int estado = juego.primerTiro(sumaDados);

            switch (estado) {
                case GANA -> {
                    saldo += apuesta;
                    System.out.println("Victoria en la primera ronda!");
                    mostrarEstadoJuego(saldo);
                }
                case PIERDE -> {
                    saldo -= apuesta;
                    System.out.println("Derrota inmediata.");
                    mostrarEstadoJuego(saldo);
                }
                default -> {
                    int puntoEstablecido = sumaDados;
                    System.out.println("\n--- RONDA DE PUNTO ---");
                    System.out.printf("Punto fijado en: %d Debes repetir %d antes de obtener un 7%n",
                            puntoEstablecido, puntoEstablecido);

                    boolean victoria = juego.jugarPunto(puntoEstablecido);

                    if (victoria) {
                        saldo += apuesta;
                        System.out.println("Lograste el punto! Ganaste.");
                    } else {
                        saldo -= apuesta;
                        System.out.println("Salio un 7 ates del punto. Perdiste!!");
                    }
                    mostrarEstadoJuego(saldo);
                }
            }
        }
    }

    private static int pedirApuestaValida(Scanner scanner, int saldoMaximo) {
        System.out.print("Ingrese el monto a apostar: $");
        int monto = scanner.nextInt();

        while (monto <= 0 || monto > saldoMaximo) {
            System.out.println("Monto no permitido. Debe apostar entre $1 y $" + saldoMaximo);
            System.out.print("Ingrese nuevamente su apuesta: $");
            monto = scanner.nextInt();
        }
        return monto;
    }

    private static void mostrarEstadoJuego(int saldoActual) {
        System.out.println("Saldo actualizado: $" + saldoActual);
        if (saldoActual == 0) {
            System.out.println("Bancarrota! Te has quedado sin saldo");
        } else {
            comentarioAleatorio();
        }
    }

    public static void comentarioAleatorio() {
        Random rand = new Random();
        String[] frases = {
                "Buena jugada! ¿Seguimos tentando a la suerte?",
                "Cuidado! La casa siempre busca recuperar su ventaja",
                "Gran tiro! Es un buen momento para retirarse arriba"
        };
        System.out.println("> " + frases[rand.nextInt(frases.length)]);
    }
}