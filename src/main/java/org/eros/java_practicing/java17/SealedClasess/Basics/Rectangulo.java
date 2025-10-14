package org.eros.java_practicing.java17.SealedClasess.Basics;

public sealed class Rectangulo extends  Figura permits Cuadrado{
    @Override
    double calcularArea() {
        return 0;
    }
}
