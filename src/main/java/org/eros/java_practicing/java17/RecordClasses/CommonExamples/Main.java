package org.eros.java_practicing.java17.RecordClasses.CommonExamples;

import java.time.Instant;

public class Main {
    public static void main(String[] args) {
        System.out.println(obtenerEstatusPedido("CREADO").mostrarMensaje("Pedido creado"));
        System.out.println(obtenerEstatusPedido("VALIDANDO PAGO").mostrarMensaje("En validación"));
        System.out.println(obtenerEstatusPedido("ENVIADO").mostrarMensaje("Pedido enviado correctamente"));
        System.out.println(obtenerEstatusPedido("ENTREGADO").mostrarMensaje("Pedido entregado"));
        System.out.println(obtenerEstatusPedido("CANCELADO").mostrarMensaje("Pedido cancelado"));

    }

    static EstadoPedido obtenerEstatusPedido(String estatus){
        return switch(estatus){
            case "CREADO" -> new Creado(1L);
            case "VALIDANDO PAGO" -> new ValidandoPago("Pago en proceso de validación", 1L);
            case "ENVIADO" -> new Enviado("Pedido  enviado correctamente", "DHL");
            case "ENTREGADO" -> new Entregado(Instant.now());
            case "CANCELADO" -> new Cancelado("Se rechazó el método de pago");
            default -> throw new IllegalStateException("Unexpected value: " + estatus);
        };
    }
}
