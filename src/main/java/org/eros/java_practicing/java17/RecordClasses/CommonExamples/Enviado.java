package org.eros.java_practicing.java17.RecordClasses.CommonExamples;

public record Enviado(String mensaje, String paqueteria) implements EstadoPedido{

    @Override
    public String mostrarMensaje(String mensaje) {
        return "";
    }
}
