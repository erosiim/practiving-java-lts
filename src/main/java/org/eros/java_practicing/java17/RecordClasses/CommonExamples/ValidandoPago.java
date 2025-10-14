package org.eros.java_practicing.java17.RecordClasses.CommonExamples;

public record ValidandoPago(String mensaje, Long idPedido) implements EstadoPedido {

    public ValidandoPago {
        if(mensaje.isEmpty())
            throw new IllegalArgumentException("El mensaje no puede estar vacío");
    }

    @Override
    public String mostrarMensaje(String mensaje) {
        return "Se está validando el pago del pedido: " + idPedido  + "\n Información del pago: "+ mensaje;
    }
}
