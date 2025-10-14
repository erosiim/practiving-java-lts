package org.eros.java_practicing.java17.SealedClasess.Basics;
/*
Definición común de una Sealed class (clase sellada), es una clase con métodos abstractos \
que debe definir explícitamente cuáles clases pueden extender de esta (permits).
Se pueden combinar con switch para definir posibles instancias de clases sin definir un default
 */
public sealed abstract class Figura  permits Circulo, Rectangulo, Triangulo{
    abstract double calcularArea();
}
