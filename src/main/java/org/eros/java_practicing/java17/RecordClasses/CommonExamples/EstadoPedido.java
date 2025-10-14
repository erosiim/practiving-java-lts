package org.eros.java_practicing.java17.RecordClasses.CommonExamples;

public sealed interface EstadoPedido permits Creado, ValidandoPago, Enviado, Entregado, Cancelado   {
    long idPedido = 0;
    abstract String mostrarMensaje(String mensaje);

}
