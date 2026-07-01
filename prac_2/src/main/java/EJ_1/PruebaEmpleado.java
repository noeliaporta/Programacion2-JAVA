/*
Cree una clase llamada Empleado, que incluya tres variables de instancia: el nombre (String), un apellido (String) y un salario mensual (double).
Su clase debe tener un constructor que inicialice las tres variables de instancia. Proporcione los métodos get y set para cada variable de instancia.

Si el salario mensual no es positivo, no establezca su valor.
Escriba una aplicación de prueba llamada PruebaEmpleado, que demuestre las capacidades de la clase Empleado.
Cree dos objetos Empleado y muestre el salario anual de cada objeto.
Después, proporcione a cada Empleado un aumento del 10% y muestre el salario anual de cada Empleado otra vez.
*/
package EJ_1;

public class PruebaEmpleado {
    public static void main(String[] args){

        Empleado emp1 = new Empleado(
                "Juan",
                "Perez",
                1000
        );

        Empleado emp2 = new Empleado(
                "Lucas",
                 "Bubans",
                1500
        );

        System.out.println(emp1.calcularSalarioAnual());
        System.out.println(emp2.calcularSalarioAnual());

        emp1.setSalarioMensual(
                emp1.getSalarioMensual() * 1.10 // getter devuelve el valor mientras que setter lo modifica
        );

        emp2.setSalarioMensual(
                emp2.getSalarioMensual() * 1.10
        );

        System.out.println(emp1.calcularSalarioAnual());
        System.out.println(emp2.calcularSalarioAnual());
    }
}
