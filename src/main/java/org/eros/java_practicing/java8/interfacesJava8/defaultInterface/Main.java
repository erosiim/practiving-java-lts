package org.eros.java_practicing.java8.interfacesJava8.defaultInterface;

public class Main {
    static final INotificador iNotificadorEmail = new NotificadorEmail();
    static final INotificador iNotificadorSms = new NotificadorSms();

    public static void main(String[] args) {
        iNotificadorEmail.enviarMensaje("HOLA MUNDO");
        System.out.println(iNotificadorEmail.getTipoNotificacion());
        iNotificadorSms.enviarMensaje("HOLA MUNDO SMS");
        System.out.println(iNotificadorSms.getTipoNotificacion());
    }
}
