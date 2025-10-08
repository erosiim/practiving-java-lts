package org.eros.java_practicing.java11;

@FunctionalInterface
public interface INotificador {

    default String tipoNoitificacion(){return "GENERICO";}
    String concatenaMensaje(String a, String b);

}
