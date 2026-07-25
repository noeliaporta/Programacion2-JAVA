package EJ_8;

public class PruebaCuentaDeAhorros {
    public static void main(String[] args) {
        CuentaDeAhorros ahorrador1 = new CuentaDeAhorros(20000.00);
        CuentaDeAhorros ahorrador2 = new CuentaDeAhorros(30000.00);

        System.out.println("=========================================================================");
        System.out.println("                     SIMULACION DE CUENTAS DE AHORRO                     ");
        System.out.println("=========================================================================");
        System.out.printf("Saldo inicial Ahorrador 1: $%.2f%n", ahorrador1.getSaldoAhorros());
        System.out.printf("Saldo inicial Ahorrador 2: $%.2f%n%n", ahorrador2.getSaldoAhorros());

        //tasa de interes anual en 4% (0.04)
        CuentaDeAhorros.modificarTasaInteres(0.04);
        System.out.printf("-> Tasa de interés anual establecida en: %.1f%%%n%n", CuentaDeAhorros.getTasaInteresAnual() * 100);

        //tabla de evolucion mensual durante 12 mese
        System.out.println("-------------------------------------------------------------------------");
        System.out.printf("%-10s | %-25s | %-25s%n", "Mes", "Saldo Ahorrador 1", "Saldo Ahorrador 2");
        System.out.println("-------------------------------------------------------------------------");

        for (int mes = 1; mes <= 12; mes++) {
            ahorrador1.calcularInteresMensual();
            ahorrador2.calcularInteresMensual();

            System.out.printf("Mes %-6d | $%-24.2f | $%-24.2f%n",
                    mes, ahorrador1.getSaldoAhorros(), ahorrador2.getSaldoAhorros());
        }

        System.out.println("-------------------------------------------------------------------------");

        // cmbiar la tasa de interes al 5% (0.05) para el mes 13
        CuentaDeAhorros.modificarTasaInteres(0.05);
        System.out.printf("%n-> Tasa de interés anual modificada a: %.1f%%%n%n", CuentaDeAhorros.getTasaInteresAnual() * 100);

        ahorrador1.calcularInteresMensual();
        ahorrador2.calcularInteresMensual();

        System.out.println("-------------------------------------------------------------------------");
        System.out.printf("%-10s | %-25s | %-25s%n", "Mes 13 (5%)", "Saldo Ahorrador 1", "Saldo Ahorrador 2");
        System.out.println("-------------------------------------------------------------------------");
        System.out.printf("%-10s | $%-24.2f | $%-24.2f%n",
                "Resultado", ahorrador1.getSaldoAhorros(), ahorrador2.getSaldoAhorros());
        System.out.println("=========================================================================");
    }
}
