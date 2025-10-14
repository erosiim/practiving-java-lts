package org.eros.java_practicing.java17.SealedClasess.CommonExamples;
/*
Implementación común para realizar un descuento de acuerdo a un porcentaje que la tienda fije.
Además, se define como sealed para que haya una y solo una clase más que pueda extender de esta y herede
el comportamiento de esta con una implementación en específico
 */
public sealed class DescuentoPorcentaje extends  Descuento permits DescuentoTarjetaCredito{

    private float procentajeDescuento;

    public DescuentoPorcentaje(float procentajeDescuento) {
        this.procentajeDescuento = procentajeDescuento;
    }

    @Override
    double aplicar(double precioOriginal) {
        return precioOriginal - (precioOriginal * (this.procentajeDescuento / 100));
    }
}
