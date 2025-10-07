package org.eros.java_practicing.java8.optional.busquedaSegura;

import java.util.Optional;
/*
Se agrega validación isPresent() para determinar si se pudo encontrar el artículo o no
 */
public class Main {
    public static void main(String[] args) {
        Optional<Articulo> laptop = Inventario.buscarArticulo("Laptop");
        if(laptop.isPresent()){
            System.out.println(laptop.get());
        }
        Optional<Articulo> monitor = Inventario.buscarArticulo("Monitor");
        if(monitor.isPresent()){
            System.out.println(monitor.get());
        }else{
            System.out.println(monitor);
        }
    }
}
