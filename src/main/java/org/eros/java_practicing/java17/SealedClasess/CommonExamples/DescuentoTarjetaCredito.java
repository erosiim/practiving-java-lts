package org.eros.java_practicing.java17.SealedClasess.CommonExamples;
/*
clase tipo final que ya extiende de una clase sealed (clase sellada) la cual ya tiene un comportamiento específico
per, en esta clase se agrega una validación adicional (tipoTarjeta) para definir el monto sobre el que se realiza
el descuento final
 */
public final class DescuentoTarjetaCredito extends DescuentoPorcentaje{

    private final String tipoTarjeta;

    public DescuentoTarjetaCredito(float procentajeDescuento, String tipoTarjeta) {
        super(procentajeDescuento);
        this.tipoTarjeta = tipoTarjeta;
    }

    @Override
    double aplicar(double precioOriginal) {
        Integer descuentoAdicional;
        switch (this.tipoTarjeta.toUpperCase()){
            case "LIBRETON", "COSTCO", "AZUL" -> descuentoAdicional = 100;
            case "ORO", "BUSINESS" ->  descuentoAdicional = 250;
            case "PLATINUM" -> descuentoAdicional = 500;
            default -> descuentoAdicional = 0;
        }
        return super.aplicar(precioOriginal - descuentoAdicional);
    }
}
