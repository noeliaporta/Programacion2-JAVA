/*
Cree una clase llamada Racional para realizar operaciones aritméticas con fracciones.
Escriba un programa para probar su clase. Use variables enteras para representar las variables de
instancia de la clase: el numerador y el denominador. Proporcione un constructor que permita inicializarse
 a un objeto de esta clase al ser declarado. El constructor debe almacenar la fracción en forma reducida.
 La fracción 2/4 es equivalente a 1/2 y debe guardarse en el objeto como 1 en el numerador y 2 en el
 denominador. Proporcione un constructor sin argumentos con valores predeterminados, en caso de que no se
 proporcionen inicializadores. Proporcione métodos public que realicen cada una de las siguientes
 operaciones:
a) Sumar dos números Racional: el resultado de la suma debe almacenarse en forma reducida. Implemente esto como un método static.
b) Restar dos números Racional: el resultado de la resta debe almacenarse en forma reducida. Implemente esto como un método static.
c) Multiplicar dos números Racional: el resultado de la multiplicación debe almacenarse en forma reducida. Implemente esto
como un método static .
d) Dividir dos números Racional: el resultado de la división debe almacenarse en forma reducida.
Implemente esto como un método static.
e) Devolver una representación String de un número Racional en la forma a/b, en donde a es el numerador
y b es el denominador.
f) Devolver una representación String de un número Racional en formato de punto flotante. (Considere
proporcionar capacidades de formato, que permitan al usuario de la clase especificar el número de dígitos
de precisión a la derecha del punto decimal).
 */
package EJ_10;

public class Racional {
    private int numerador;
    private int denominador;

    public Racional(int numerador, int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("El denominador no puede ser cero.");
        }
        this.numerador = numerador;
        this.denominador = denominador;
        reducir();
    }

    public Racional() {
        this(0, 1);
    }

    // metodo privado para simplificar la fracción a su forma reducida
    private void reducir() {
        if (this.denominador < 0) {
            this.numerador = -this.numerador;
            this.denominador = -this.denominador;
        }

        int mcd = calcularMCD(Math.abs(this.numerador), Math.abs(this.denominador));
        if (mcd > 1) {
            this.numerador /= mcd;
            this.denominador /= mcd;
        }
    }

    // Algoritmo de Euclides para el maximo común divisor (MCD)
    private static int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a == 0 ? 1 : a;
    }

    // a) Sumar dos num racional (Static)
    public static Racional sumar(Racional r1, Racional r2) {
        int num = (r1.numerador * r2.denominador) + (r2.numerador * r1.denominador);
        int den = r1.denominador * r2.denominador;
        return new Racional(num, den);
    }

    // b) Restar dos num racional (Static)
    public static Racional restar(Racional r1, Racional r2) {
        int num = (r1.numerador * r2.denominador) - (r2.numerador * r1.denominador);
        int den = r1.denominador * r2.denominador;
        return new Racional(num, den);
    }

    // c) Multiplicar dos num racional (Static)
    public static Racional multiplicar(Racional r1, Racional r2) {
        int num = r1.numerador * r2.numerador;
        int den = r1.denominador * r2.denominador;
        return new Racional(num, den);
    }

    // d) Dividir dos num racional (Static)
    public static Racional dividir(Racional r1, Racional r2) {
        if (r2.numerador == 0) {
            throw new ArithmeticException("No se puede dividir por un racional con numerador cero.");
        }
        int num = r1.numerador * r2.denominador;
        int den = r1.denominador * r2.numerador;
        return new Racional(num, den);
    }

    // e) Representación en String en la forma a/b
    public String aStringRacional() {
        return this.numerador + "/" + this.denominador;
    }

    // f) Representación en punto flotante con precisión configurable
    public String aStringFlotante(int precision) {
        if (precision < 0) {
            precision = 2; // Precisión por defecto
        }
        double valorDecimal = (double) this.numerador / this.denominador;
        return String.format("%." + precision + "f", valorDecimal);
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }
}
