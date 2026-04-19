package Ej_10;
/*
Escribe una aplicación que determine el sueldo bruto para cada uno de cinco empleados. La
empresa paga la cuota normal en las primeras 40 horas de trabajo de cada empleado, y cuota y
media en todas las horas trabajadas que excedan de 40. Usted recibe una lista de los empleados de
la empresa, el número de horas que trabajó cada uno la semana pasada y la tarifa por horas de cada
empleado. Su programa debe recibir como entrada esta información para cada empleado, debe
determinar y mostrar el sueldo bruto de cada trabajador.
 */
import java.util.Scanner;

public class principal_10 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int cantEmp = 5;
        int[] horasEmpleado = new int[cantEmp];
        double[] tarifaXHoraEmpl = new double[cantEmp];

        for(int i = 0; i < cantEmp; i++){
            System.out.print("Horas trabajadas del empleado " + (i+1) + ": ");
            horasEmpleado[i] = lector.nextInt();

            System.out.print("Tarifa por hora del empleado " + (i+1)+ ": ");
            tarifaXHoraEmpl[i] = lector.nextDouble();
            System.out.println("-----------------------------------");
        }
        System.out.println("\n================================");
        System.out.println("  INFORME DE SUELDOS BRUTOS");
        System.out.println("================================");

        for(int i = 0; i < cantEmp; i++) {
            double sueldoBruto = 0;

            if (horasEmpleado[i] <= 40) {
                sueldoBruto = horasEmpleado[i] * tarifaXHoraEmpl[i];
            } else {
                int horasExtra = horasEmpleado[i] - 40;
                sueldoBruto = (40 * tarifaXHoraEmpl[i]) + (horasExtra * tarifaXHoraEmpl[i] * 1.5);
            }

            System.out.println("Empleado: " + (i+1) + " con cantidad de horas " + horasEmpleado[i]);
            System.out.println("sueldo bruto de " + sueldoBruto);
        }

        lector.close();
    }
}
