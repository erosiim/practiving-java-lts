package org.eros.java_practicing.java17.SealedClasess.CommonExamples;
/*
Pruebas de la implementación de Sealed classes (clases selladas) utilizando diferentes tipos
de descuentos con implementaciones específicas para cada tipo finito de la colección.

 */
public class Main {
    public static void main(String[] args) {
        Descuento descuentoPorcentaje = new DescuentoPorcentaje(25);
        Descuento descuentoTarjetaCredito = new DescuentoTarjetaCredito(15, "ORO");
        Descuento descuentoTarjetaPuntos = new DescuentoTarjetaPuntos(1000);
        Double precioOriginal = 12499.99;
        System.out.println(descuentoPorcentaje.aplicar(precioOriginal));
        System.out.println(descuentoTarjetaCredito.aplicar(precioOriginal));
        System.out.println(descuentoTarjetaPuntos.aplicar(precioOriginal));
    }
}
