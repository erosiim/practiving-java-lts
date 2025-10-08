package org.eros.java_practicing.java8.streamApiOptional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*
    Tienes una lista de Optional<Integer>. Algunos están presentes, otros están vacíos.
    Filtra y extrae solo los valores enteros presentes.
    Solo considera los números que son pares.
    Calcula la suma de esos números.
    Pista: Puedes usar reduce(T identity, BinaryOperator<T> accumulator) para la suma.
 */
public class ExtraccionLimpiezaOptional {
    public static void main(String[] args) {
        List<Optional<Integer>> numerosOpcionales = Arrays.asList(
                Optional.of(1), Optional.of(2), Optional.empty(),
                Optional.of(3), Optional.of(4), Optional.empty(),
                Optional.of(6), Optional.of(7)
        );
        Integer sumaParesPresentes = numerosOpcionales.stream()
                .filter(numero -> numero.isPresent()) //Extrae solo los valores que existan
                .map(numero -> numero.get())//Convierte a un Stream de Integer
                .filter(n -> n % 2 == 0) //Toma sólo los valores pares
                .reduce(0, Integer::sum);//Suma todos los elementos
        System.out.println(sumaParesPresentes);

    }
}
