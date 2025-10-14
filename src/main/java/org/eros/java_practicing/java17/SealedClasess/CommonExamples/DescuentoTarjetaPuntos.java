package org.eros.java_practicing.java17.SealedClasess.CommonExamples;
/*
Clase que finaliza con el flujo de herencia de las clases, implementa una funcionalidad en específico
para transformar los puntos del cliente en dinero real y sobre ese cálculo se realiza el descuento final
 */
public final class DescuentoTarjetaPuntos extends Descuento{

    private final double puntosCliente;
    private final double DIVISOR_CONVERSION_PUNTOS = 1000;

    public DescuentoTarjetaPuntos(int puntosCliente) {
        this.puntosCliente = puntosCliente;
    }

    @Override
    double aplicar(double precioOriginal) {
        return precioOriginal - convertirPuntosAPesos();
    }

    private double convertirPuntosAPesos(){
        return this.puntosCliente / DIVISOR_CONVERSION_PUNTOS;
    }

}
