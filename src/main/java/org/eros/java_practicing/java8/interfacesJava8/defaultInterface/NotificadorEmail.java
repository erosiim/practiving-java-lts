package org.eros.java_practicing.java8.interfacesJava8.defaultInterface;

public class NotificadorEmail implements INotificador{
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando email: " + mensaje);
    }

}
