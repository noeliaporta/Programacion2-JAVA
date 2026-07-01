package EJ_4;
import java.util.Scanner;

public class PruebaRectangulo {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el ancho de la figura: ");
        double anchura = teclado.nextDouble();
        System.out.println("Ingrese la longitud de la figura: ");
        double longitud = teclado.nextDouble();

        Rectangulo r = new Rectangulo(longitud, anchura);

        double perimetro = r.CalcularPerimetro();
        double area = r.CalcularAreaRectangulo();

        System.out.println("Perimetro: " + perimetro);
        System.out.println("Area: " + area);
    }
}
