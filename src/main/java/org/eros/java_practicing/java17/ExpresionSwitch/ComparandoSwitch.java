package org.eros.java_practicing.java17.ExpresionSwitch;
/*
Ejercicio para demostrar el funcionamiento de la nueva forma de utilizar switch en java 17
comparando con la versión anterior
 */
public class ComparandoSwitch {
    public static void main(String[] args) {
        String diaActual = "lunes";
        System.out.println(evaluarDiaSemana(diaActual));
        System.out.println(evaluarDiaSemanaV2(diaActual));

    }

    //Utilizando antiguo switch
    static String evaluarDiaSemana(String dia){
        switch(dia.toUpperCase()){
            case "LUNES":
            case "MARTES":
            case "MIÉRCOLES":
            case "JUEVES":
            case "VIERNES":
                return "DIA LABORAL";
            case "SABADO":
            case "DOMINGO":
                return "DIA NO LABORAL";
            default:
                return "DIA NO RECONOCIDO";
        }
    }

    //Nuevo tipo de switch
    static String evaluarDiaSemanaV2(String dia){
        switch (dia.toUpperCase()){
            case "LUNES", "MARTES", "MIÉRCOLES", "JUEVES", "VIERNES" -> {
                return "DIA LABORAL";
            }
            case "SABADO", "DOMINGO" ->{
                return "DIA NO LABORAL";
            }
            default ->  {
                return "dia invalido";
            }

        }
    }
    //Ejercicio que asigna un valor a una variable con nuevo switch y operación flecha en una sola linea
    static String evaluardiaSemanav3(String dia){
        String tipoDia;
        switch (dia.toUpperCase()){
            case "LUNES", "MARTES", "MIÉRCOLES", "JUEVES", "VIERNES" -> tipoDia = "DIA LABORAL";
            case "SABADO", "DOMINGO" -> tipoDia = "DIA NO LABORAL";
            default -> tipoDia = "DIA NO IDENTIFICADO";
        }
        return tipoDia;
    }
    //Ejercicio para usar el switch como expresiones que retornan un valor de acuerdo a alguna operación
    //aqui se agrega un nuevo keyword yield para devolver un valor en una sola línea
    static Integer calcularSuma(String operacion, Integer a, Integer b){
        Integer resultado = switch (operacion){
            case "SUMA" -> a+b;
            case "RESTA" -> a-b;
            case "MULTIPLICAION" -> a*b;
            case "DIVISION" -> {
                if(a != 0){
                    yield a / b; //yield es la palabra reservada para retornar un valor desde un bloque de código más elaborado
                }else{
                    yield 0;
                }
            }
            default -> 0;
        };
        return resultado;
    }



}
