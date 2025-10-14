package org.eros.java_practicing.java17.RecordClasses.CommonExamples;

public final record Creado(Long idPedido) implements EstadoPedido {

    public Creado{
        if(idPedido<0){
            throw new IllegalArgumentException("El id del pedido no puede ser menor a cero: " + idPedido);
        }
    }

    @Override
    public String mostrarMensaje(String mensaje) {
        return "El id del pedido es: " + mensaje ;
    }
}
