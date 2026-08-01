package EJ_11;
/*
 Un juego de azar popular es el juego de dados conocido como “Craps”, el cual se
 juega en casinos y callejones por todo el mundo. Las reglas del juego son simples:
Un jugador tira dos dados. Cada uno tiene seis caras, las cuales contienen uno,
 dos, tres cuatro, cinco y seis puntos negros, respectivamente. Una vez que los
dados dejan de moverse, se calcula la suma de los puntos negros en las dos caras
 superiores. Si la suma es 7 u 11 en el primer tiro, el jugador gana. Si la suma
 es 2, 3 o 12 en el primer tiro (llamado “Craps”), el jugador pierde (es decir, la “casa” gana).
 Si la suma es 4, 5, 6, 8, 9 o 10 en el primer tiro, esta suma se convierte
 en el “punto” del jugador. Para ganar, el jugador debe seguir tirando los dados
 hasta que salga otra vez “su punto” (es decir, que tire ese mismo valor de punto).
 El jugador pierde si tira un 7 antes de llegar a su punto.
(Modificación del juego de Craps) Modifique el programa Craps para permitir apuestas.
 Iniciar la variable saldoBanco con $1,000. Pida al jugador que introduzca una apuesta.
 Compruebe que esa apuesta sea menor o igual que saldoBanco y, si no lo es, haga que el
 usuario vuelva a introducir la apuesta hasta que se ingrese un valor válido.
Después de esto, comience un juego de Craps. Si el jugador gana, agregue la apuesta al
 saldoBanco e imprima el nuevo saldoBanco. Si pierde, reste la apuesta al saldoBanco,
 imprima el nuevo saldoBanco, compruebe si saldoBanco se ha vuelto cero y, de ser así,
 imprima el mensaje "Lo siento. Se quedo sin fondos! ” A medida que el juego progrese,
 imprima varios mensajes para crear algo de “charla”, como "Oh, se esta yendo a la quiebra,
 verdad?”,o “Oh, vamos, arriesguese!”, o “La hizo en grande. Ahora es tiempo de cambiar sus
 fichas por efectivo!”. Implemente la “charla” como un metodo separado que seleccione en
 forma aleatoria la cadena a mostrar.
 */

import java.util.Random;

public class Craps {
    private final Random random = new Random();

    private static final int GANA = 1;
    private static final int PIERDE = 2;
    private static final int SIGUE = 3;

    private int ronda = 1;

    public int tirarDados() {
        int dado1 = 1 + random.nextInt(6);
        int dado2 = 1 + random.nextInt(6);
        int suma = dado1 + dado2;

        System.out.println("Dado 1: " + dado1);
        System.out.println("Dado 2: " + dado2);
        System.out.println("Suma: " + suma);
        return suma;
    }

    public int primerTiro(int suma) {

        if (ronda == 1) {
            if (suma == 7 || suma == 11) {
                return GANA;
            }
            if (suma == 2 || suma == 3 || suma == 12) {
                return PIERDE;
            }
            ronda = 2;
            return SIGUE;
        }
        return SIGUE;
    }

    public boolean jugarPunto(int punto) {

        int suma;
        do {
            suma = tirarDados();
            if (suma == punto) {
                return true;
            }
            if (suma == 7) {
                return false;
            }
        } while (true);
    }

    public void reiniciar() {
        ronda = 1;
    }
}
