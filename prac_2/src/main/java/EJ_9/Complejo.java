/*
Cree una clase llamada Complejo para realizar operaciones aritméticas con números complejos.
Estos números tienen la forma
parte Real + parte imaginaria * i
Escriba un programa para probar su clase. Use variables de punto flotante para representar los datos
private de la clase.
Proporcione un constructor que permita que un objeto de esta clase se inicialice al declararse.
Proporcione un constructor sin argumentos con valores predeterminados, en caso de que no se proporcionen
inicializadores. Ofrezca métodos public que realicen las siguientes operaciones:
a) Sumar dos números Complejos: las partes reales se suman entre sí y las partes imaginarias también.
b) Restar dos números Complejos: la parte real del operando derecho se resta de la parte real del
operando izquierdo, y la parte imaginaria del operando derecho se resta de la parte imaginaria del
operando izquierdo.
c) Imprimir números Complejos en la forma (parte Real, parte imaginaria) .
 */
package EJ_9;

public class Complejo {
    private double parteReal;
    private double parteImaginaria;

    public Complejo(double parteReal, double parteImaginaria) {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }

    public Complejo() {
        this(0.0, 0.0);
    }

    // 1) Sumar dos num complejos
    public Complejo sumar(Complejo otro) {
        double nuevaReal = this.parteReal + otro.getParteReal();
        double nuevaImaginaria = this.parteImaginaria + otro.getParteImaginaria();
        return new Complejo(nuevaReal, nuevaImaginaria);
    }

    // 2) Restar dos num complejos
    public Complejo restar(Complejo otro) {
        double nuevaReal = this.parteReal - otro.getParteReal();
        double nuevaImaginaria = this.parteImaginaria - otro.getParteImaginaria();
        return new Complejo(nuevaReal, nuevaImaginaria);
    }

    // 3) Imprimir en la forma (parteReal, parteImaginaria)
    public void imprimirComplejo() {
        System.out.printf("(%.2f, %.2f)", this.parteReal, this.parteImaginaria);
    }

    public double getParteReal() {
        return parteReal;
    }

    public void setParteReal(double parteReal) {
        this.parteReal = parteReal;
    }

    public double getParteImaginaria() {
        return parteImaginaria;
    }

    public void setParteImaginaria(double parteImaginaria) {
        this.parteImaginaria = parteImaginaria;
    }
}