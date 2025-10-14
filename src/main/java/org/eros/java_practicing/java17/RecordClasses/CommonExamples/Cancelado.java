package org.eros.java_practicing.java17.RecordClasses.CommonExamples;

public record Cancelado(String motivoCancelacion) implements EstadoPedido{
    @Override
    public String mostrarMensaje(String mensaje) {
        return "El pedido se canceló por el motivo: " + motivoCancelacion;
    }
}
