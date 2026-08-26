/*
¿Qué es un iterador? (iterator). Muestre cómo se usa, haciendo altas, bajas,
recorridos y búsquedas en listas implementadas con ArrayList.
 */
package EJ_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iterador {
    public static void main(String[] args){

        // ALTAS (Agregar elementos a la lista)
        List<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Naranja");
        frutas.add("Uva");
        frutas.add("Pera");

        System.out.println("Lista inicial: " + frutas);

        // RECORRIDO
        // Se obtiene la instancia del Iterator desde el ArrayList
        Iterator<String> itRecorrido = frutas.iterator();

        System.out.println("\n--- Recorrido de la lista ---");
        // hasNext() verifica si quedan elementos por iterar
        while (itRecorrido.hasNext()) {
            // next() devuelve el siguiente elemento y avanza el puntero
            String fruta = itRecorrido.next();
            System.out.println("Fruta: " + fruta);
        }

        // BUSQUEDA
        Iterator<String> itBusqueda = frutas.iterator();
        String elementoBuscado = "Naranja";
        boolean encontrado = false;

        while (itBusqueda.hasNext()) {
            String fruta = itBusqueda.next();
            if (fruta.equals(elementoBuscado)) {
                encontrado = true;
                break; // Se interrumpe el recorrido al encontrar el elemento
            }
        }

        if (encontrado) {
            System.out.println("\nBúsqueda: '" + elementoBuscado + "' se encuentra en la lista.");
        } else {
            System.out.println("\nBúsqueda: '" + elementoBuscado + "' no se encuentra.");
        }

        // BAJAS (Eliminación segura durante el recorrido)
        Iterator<String> itBajas = frutas.iterator();

        // Eliminaremos los elementos que comiencen con la letra 'M' o 'P'
        while (itBajas.hasNext()) {
            String fruta = itBajas.next();
            if (fruta.startsWith("M") || fruta.startsWith("P")) {
                // remove() elimina el último elemento devuelto por next()
                itBajas.remove();
            }
        }

        System.out.println("\nLista después de las bajas: " + frutas);
    }
}
