package org.eros.java_practicing.java11;
/*
Las interfaces funcionales pueden ser implementadas por
otras clases como normalmente se hace,
pero el plus de este tipo de interfaces es delegar la implementación con lambdas
al momento que es requerida y no tener implementaciones fijas
 */
@FunctionalInterface
public interface INotificador {

    default String tipoNoitificacion(){return "GENERICO";}
    String concatenaMensaje(String a, String b);

}
