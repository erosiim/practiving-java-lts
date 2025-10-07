package org.eros.java_practicing.java8.interfacesJava8.defaultInterface;
/*
Práctica de interfaces con métodos default.
Este tipo de interfaces pueden tener 1 o más métodos default, estos tienen un comportamiento
en específico ya definido y es opcional reemplazarlo en las clases que
implementen esta interface
 */

public interface INotificador {
    default String getTipoNotificacion(){return "Genérico";}
    void enviarMensaje(String mensaje);
}
