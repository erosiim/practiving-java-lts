package org.eros.java_practicing.java17.SealedClasess.Basics;
/*
Cada clase que extienda de una Sealed class (clase sellada) debe de tener uno de los tres modeificadores
--sealed (extiende la herencia definiendo nuevas clases finitas para extender),
--non-sealed (permite que cualquier otra clase extienda de esta sin más)
--final (ninguna otra clase puede extender de esta).
 */
public final class  Circulo extends Figura{
    @Override
    double calcularArea() {
        return 0;
    }
}
