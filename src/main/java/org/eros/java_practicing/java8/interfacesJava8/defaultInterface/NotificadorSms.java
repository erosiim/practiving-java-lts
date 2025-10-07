package org.eros.java_practicing.java8.interfacesJava8.defaultInterface;

public class NotificadorSms implements INotificador{
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando SMS: " + mensaje);
    }

    @Override
    public String getTipoNotificacion() {
        return "SMS";
    }
}
