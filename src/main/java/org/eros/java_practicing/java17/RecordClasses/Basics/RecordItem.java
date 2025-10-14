package org.eros.java_practicing.java17.RecordClasses.Basics;
/*
Definición común de un Record, solución de java para objetos inmutables como Pojo y DTO comunes,
no lleva class y en su lugar se coloca la keyword record, además,
solo se definen los parámetros desde la firma del record, no se colocan como en las clases convencionales.
Pueden tener constructores específicos para validaciones y no se definen los parámetros.
El compilador se encarga de crear el código boilerplate como setters y getters así como los <<this.atributo>>
los records no pueden extender de otras clases, pero sí pueden implementar interfaces
 */
public  record  RecordItem (String nombre, Double precio, Long cantidad, String descripcion){

    //Nuevo tipo de constructor que no lleva los parámetros de entrada, solo realiza validaciones
    public RecordItem {
        if(precio < 0 )
            throw new IllegalArgumentException("El precio no puede ser negativo");
    }



}
