package org.eros.java_practicing.java11.AgregandoVar;

public class ImplementandoVar {
    public static void main(String[] args) {
        var mensaje = "HOLA"; //aplica inferencia de tipo de datos
        var stock = 60;

        INotificador mensajeStock = (String s, String f) -> s.concat(f); // Define un comportamiento en específico
        System.out.println(mensajeStock.concatenaMensaje(mensaje, String.valueOf(stock))); // ejecuta el comportamiento definido

        System.out.println(mensajeStock.tipoNoitificacion());

        mensajeStock = ( var d, var l) -> d.concat(l).toUpperCase();
        System.out.println(mensajeStock.concatenaMensaje("HOLA", "BB"));
    }
}
