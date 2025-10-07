package org.eros.java_practicing.java8.interfacesJava8.staticInterface;

/*
Práctica de interfaces con métodos static
Este tipo de interfaces definen un comportamiento específico por cada método,
además, al ser static se cargan con la clase yy no necesitan ser implementados
ni crear una instancia de esta
 */
public interface Operaciones {
    static boolean esPar(int numero){return numero % 2 == 0;}

    static double obtenerPI(){return Math.PI;}

}