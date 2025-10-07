package org.eros.java_practicing.java8.optional.mapeoTransformacion;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        String nombre1 = "alonso";
        String nombre2 = null;

        Optional<Integer> longitudSegura = getLongitudSegura(nombre1);
        Optional<Integer> longitudSegura1 = getLongitudSegura(nombre2);

        // () es una interfaz funcional que genera y devuelve un resultado sin
        // necesidad de aceptar ningún argumento de entrada.
        longitudSegura.orElseGet( ()-> {
            System.out.println("Cadena vacía");
            return 0;
        });

        System.out.println("Longitud obtenida " + longitudSegura.orElseGet(() -> 0) );
        //otra forma de manejar el orElseGet implementando la interfaz funcional directo
        //al llamar el método
        System.out.println("Longitud obtenida " + longitudSegura1.orElseGet(() -> {
            System.out.println("error al obtener longitud");
            return 0;
        }));


    }

    static Optional<Integer> getLongitudSegura(String cadena){
        return Optional.ofNullable(cadena)
                .map(c -> c.length());
    }
}
