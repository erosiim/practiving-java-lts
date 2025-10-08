package org.eros.java_practicing.java8.streamApiOptional;

import java.util.Arrays;
import java.util.List;

/*

    Dada una lista de nombres. Necesitas encontrar el primer nombre que tenga exactamente 5 caracteres.
    Si se encuentra, conviértelo a mayúsculas.
    Si no se encuentra (el Optional está vacío), el resultado debe ser la cadena "NO ENCONTRADO".
 */
public class BusquedaSeguraStream {
    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Alicia", "Beto", "Carlos", "Daria");
        String first = nombres.stream()
                .filter(nombre -> nombre.length() == 50) // Intermedia: Filtra por longitud de 5
                .map(nombre -> nombre.toUpperCase()) // Intermedia: Convierte a mayúsculas
                .findFirst()// Terminal: Devuelve Optional<String>);
                .orElse("NO ENCONTRADO"); // Manejo de Optional: Devuelve un valor por defecto

        System.out.println(first);
    }

}
