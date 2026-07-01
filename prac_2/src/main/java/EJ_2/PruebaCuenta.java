/*Realizar una aplicación sencilla para simular una cuenta bancaria (caja de ahorro). Una cuenta bancaria vista como un objeto tiene, por una parte,
atributos que definen su estado, como Tipo de interés y Saldo, y por otra, operaciones que definen su comportamiento, como
Establecer tipo de interés,
Ingresar dinero,
 Retirar dinero,
  Saldo actual o Abonar intereses.
  Asegúrese que el monto a retirar no exceda el saldo de Cuenta.
Si lo hace, el saldo debe permanecer sin cambio y el método debe imprimir un mensaje que indique
 ''El monto a retirar excede el saldo de la cuenta.”
 Realice la clase PruebaCuenta para probar los diferentes métodos.
 */
package EJ_2;
import java.util.Scanner;

public class PruebaCuenta {
    public static void main(String[] args){
        /*
        CuentaBancaria cuenta = new CuentaBancaria(1000, 5);

        System.out.println("Saldo inicial: " + cuenta.getSaldo());
        cuenta.ingresarDinero(500);
        System.out.println("Saldo luego del deposito: " + cuenta.getSaldo());
        cuenta.retirarDinero(200);
        System.out.println("Saldo luego del retiro: " + cuenta.getSaldo());
        System.out.println("Monto de interese:" + cuenta.MontoInteres());
        cuenta.abonarIntereses();
        System.out.println("Saldo final: " + cuenta.getSaldo());
        System.out.println(cuenta.getSaldo());
         */

        /*
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el saldo inicial: ");
        double saldo = teclado.nextDouble();
        System.out.print("Ingrese el tipo de interés: ");
        double tipoInteres = teclado.nextDouble();

        CuentaBancaria cuenta = new CuentaBancaria(saldo, tipoInteres);

        System.out.print("Ingrese monto a depositar: ");
        double deposito = teclado.nextDouble();
        cuenta.ingresarDinero(deposito);
        System.out.println("Saldo luego del deposito: " + cuenta.getSaldo());

        System.out.print("Ingrese monto a retirar: ");
        double retiro = teclado.nextDouble();
        cuenta.retirarDinero(retiro);
        System.out.println("Saldo luego del retiro: " + cuenta.getSaldo());

        System.out.println("Monto de interese:" + cuenta.MontoInteres());
        cuenta.abonarIntereses();

        System.out.println("Saldo final: " + cuenta.getSaldo());

         */

        int opcion = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el saldo inicial: ");
        double saldo = teclado.nextDouble();
        System.out.print("Ingrese el tipo de interés: ");
        double tipoInteres = teclado.nextDouble();

        while(opcion != 3){

            System.out.println("1 - Depositar");
            System.out.println("2 - Retirar");
            System.out.println("3 - Salir");

            opcion = teclado.nextInt();
            CuentaBancaria cuenta = new CuentaBancaria(saldo, tipoInteres);

            if(opcion == 1){

                System.out.print("Ingrese monto a depositar: ");
                double deposito = teclado.nextDouble();
                cuenta.ingresarDinero(deposito);
                System.out.println("Saldo actual: " + cuenta.getSaldo());

            }else if(opcion == 2){

                System.out.print("Ingrese monto a retirar: ");
                double retiro = teclado.nextDouble();
                cuenta.retirarDinero(retiro);
                System.out.println("Saldo actual: " + cuenta.getSaldo());

            }else if(opcion == 3){
                System.out.println("Saliendo..");

            }else{
                System.out.println("Opción no válida.");

            }
        }
    }
}
