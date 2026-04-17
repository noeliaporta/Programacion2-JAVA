package Ej_2;
/*
Escribe un programa que tome un año introducido por el usuario y diga si es bisiesto o no. Recuerda
que los años múltiplos de 4 son bisiestos, excepto aquellos que son múltiplos de 100 y no lo son de
400. Es decir el año 2000 si es bisiesto, pero no lo son el 1990 ni el 2100.
*/
import java.util.Scanner;

public class principal2 {
    public static void main (String[] args){
        int anio = 0;

        Scanner lector = new Scanner(System.in);

        System.out.print("Ingrese el anio: ");
        anio = lector.nextInt();

        // (es divisible por 4 Y NO por 100) O (Es divisible por 400)
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println("Es bisiesto.");
        } else {
            System.out.println("No es bisiesto.");
        }

        lector.close();
    }
}
