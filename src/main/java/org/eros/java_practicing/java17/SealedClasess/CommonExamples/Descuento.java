package org.eros.java_practicing.java17.SealedClasess.CommonExamples;

/*
Se puede usar una sealed class (clase sellada) cuando se requiere generar una jerarquía de clases definida o
cuando se tiene un conjunto finito y conocido de subtipos de clases que extenderán de una clase principal.
Ejemplos: Estatus de un proceso (compra/venta/envío), RespuestasApi (Error, OK, creado, redireccionado),
Descuentos de una tienda (Porcentaje, Tarjetas crédito, tarjeta de puntos, 2x1...)
 */
public abstract sealed class Descuento permits DescuentoPorcentaje, DescuentoTarjetaPuntos{
    abstract double aplicar(double precioOriginal);
}
