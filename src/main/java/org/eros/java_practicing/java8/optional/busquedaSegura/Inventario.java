package org.eros.java_practicing.java8.optional.busquedaSegura;

import java.util.Optional;
/*
Implementación de Optional al buscar un articulo en específico,
cuando no exista se debe devolver un articulo vacío embebido dentro de un Optional
para que no ocasione un NullPointerException
 */
public class Inventario {
    static Articulo laptop = new Articulo("Laptop", 13500.90);

    static Optional<Articulo> buscarArticulo(String nombreArticulo){
        if(nombreArticulo.equals("Laptop")){
            return Optional.of(laptop);
        }else{
            return Optional.of(new Articulo("", 0.0));
        }
    }
}
