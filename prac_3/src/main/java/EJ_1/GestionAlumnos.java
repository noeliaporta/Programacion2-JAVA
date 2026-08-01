
//  CORREGIR //

/*
Usando ArayList escriba un programa que permita hacer altas, bajas, búsqueda y recorridos
en una lista de enteros
en una lista de objetos Alumno (cree la clase)
 */

package EJ_1;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionAlumnos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Listas para almacenar los datos
        ArrayList<Integer> listaEnteros = new ArrayList<>();
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();

        int opcionPrincipal;

        do {
            System.out.println("\n=================================");
            System.out.println("          MENÚ PRINCIPAL - TP 3");
            System.out.println("=================================");
            System.out.println("1. Trabajar con Lista de Enteros");
            System.out.println("2. Trabajar con Lista de Alumnos");
            System.out.println("3. Salir");
            System.out.print("Elija una opción: ");
            opcionPrincipal = scanner.nextInt();

            switch (opcionPrincipal) {
                case 1 -> menuEnteros(scanner, listaEnteros);
                case 2 -> menuAlumnos(scanner, listaAlumnos);
                case 3 -> System.out.println("¡Hasta luego!");
                default -> System.out.println("Opción inválida.");
            }

        } while (opcionPrincipal != 3);

        scanner.close();
    }

    // ==========================================
    // SUBMENÚ: LISTA DE ENTEROS
    // ==========================================
    private static void menuEnteros(Scanner scanner, ArrayList<Integer> lista) {
        int opcion;
        do {
            System.out.println("\n--- GESTIÓN DE ENTEROS ---");
            System.out.println("1. Alta (Agregar número)");
            System.out.println("2. Baja (Eliminar número)");
            System.out.println("3. Buscar número");
            System.out.println("4. Recorrer (Mostrar todos)");
            System.out.println("5. Volver al Menú Principal");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese número a agregar: ");
                    int num = scanner.nextInt();
                    lista.add(num);
                    System.out.println("Número agregado.");
                }
                case 2 -> {
                    System.out.print("Ingrese número a eliminar: ");
                    int num = scanner.nextInt();
                    if (lista.remove(Integer.valueOf(num))) {
                        System.out.println("Número eliminado.");
                    } else {
                        System.out.println("El número no está en la lista.");
                    }
                }
                case 3 -> {
                    System.out.print("Ingrese número a buscar: ");
                    int num = scanner.nextInt();
                    if (lista.contains(num)) {
                        System.out.println("Encontrado en el índice: " + lista.indexOf(num));
                    } else {
                        System.out.println("El número no existe en la lista.");
                    }
                }
                case 4 -> {
                    if (lista.isEmpty()) {
                        System.out.println("La lista está vacía.");
                    } else {
                        System.out.println("Elementos: " + lista);
                    }
                }
                case 5 -> System.out.println("Volviendo...");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 5);
    }

    // ==========================================
    // SUBMENÚ: LISTA DE ALUMNOS
    // ==========================================
    private static void menuAlumnos(Scanner scanner, ArrayList<Alumno> lista) {
        int opcion;
        do {
            System.out.println("\n--- GESTIÓN DE ALUMNOS ---");
            System.out.println("1. Alta de alumno");
            System.out.println("2. Baja de alumno (por legajo)");
            System.out.println("3. Buscar alumno (por legajo)");
            System.out.println("4. Recorrer (Mostrar todos)");
            System.out.println("5. Volver al Menú Principal");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese legajo: ");
                    int legajo = scanner.nextInt();
                    scanner.nextLine(); // Limpiar buffer

                    System.out.print("Ingrese nombre: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Ingrese promedio: ");
                    double promedio = scanner.nextDouble();

                    lista.add(new Alumno(legajo, nombre, promedio));
                    System.out.println("Alumno registrado con éxito.");
                }
                case 2 -> {
                    System.out.print("Ingrese el legajo del alumno a eliminar: ");
                    int legajo = scanner.nextInt();
                    int indice = buscarPorLegajo(lista, legajo);

                    if (indice != -1) {
                        lista.remove(indice);
                        System.out.println("Alumno eliminado.");
                    } else {
                        System.out.println("No se encontró alumno con ese legajo.");
                    }
                }
                case 3 -> {
                    System.out.print("Ingrese legajo a buscar: ");
                    int legajo = scanner.nextInt();
                    int indice = buscarPorLegajo(lista, legajo);

                    if (indice != -1) {
                        System.out.println("Alumno encontrado: " + lista.get(indice));
                    } else {
                        System.out.println("No existe un alumno con ese legajo.");
                    }
                }
                case 4 -> {
                    if (lista.isEmpty()) {
                        System.out.println("No hay alumnos cargados.");
                    } else {
                        System.out.println("--- LISTADO DE ALUMNOS ---");
                        for (Alumno alu : lista) {
                            System.out.println(alu);
                        }
                    }
                }
                case 5 -> System.out.println("Volviendo...");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 5);
    }

    // Método auxiliar para buscar la posición de un alumno por legajo
    private static int buscarPorLegajo(ArrayList<Alumno> lista, int legajo) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getLegajo() == legajo) {
                return i;
            }
        }
        return -1;
    }
}