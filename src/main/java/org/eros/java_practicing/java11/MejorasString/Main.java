package org.eros.java_practicing.java11.MejorasString;

public class Main {
    public static void main(String[] args) {
        /*
        Nuevos métodos agregados a la clase String
        isBlank() -- boolean si una cadena está vacía o si contiene sólo espacios en blanco
        strip() -- quitar espacios al inicio y al final con unicode y ascii
        stripLeading() -- Elimina espacios en blanco solo al inicio
        stripTrailing() -- Elimina espacios en blanco solo al final
        repeat() -- concatena la cadena original tantas veces como se le indique
         */
        var pruebaIsBlank = " ahora si";
        var pruebaStrip = " cadena con espacios ";
        var pruebaStripLeading = " cadena sin espacios al inicio";
        var pruebaStripTriling = "cadena sin espacios al final ";
        var pruebaRepeat = "123";

        System.out.println(pruebaIsBlank.isBlank());
        System.out.println(pruebaStrip.strip());
        System.out.println(pruebaStripLeading.stripLeading());
        System.out.println(pruebaStripTriling.stripTrailing());
        System.out.println(pruebaRepeat.repeat(10));
    }
}
