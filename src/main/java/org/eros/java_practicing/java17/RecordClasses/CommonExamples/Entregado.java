package org.eros.java_practicing.java17.RecordClasses.CommonExamples;

import java.time.Instant;

public record Entregado(Instant horaEntrega) implements EstadoPedido {
    @Override
    public String mostrarMensaje(String mensaje) {
        return "Pedido entregado a las: " + horaEntrega +  " Notas de entrega: " + mensaje;
    }
}
