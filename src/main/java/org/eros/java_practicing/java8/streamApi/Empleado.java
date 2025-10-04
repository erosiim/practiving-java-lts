package org.eros.java_practicing.java8.streamApi;

import java.util.*;
import java.util.stream.Collectors;

public class Empleado {

    private String nombre;
    private String departamento;
    private double salario;

    // Lista simple de Nombres
    static List<String> nombres = Arrays.asList("Ana", "Pedro", "María", "Javier", "Elena", "Pablo", "Laura", "Carlos");
    // Lista de Números
    static List<Integer> numeros = Arrays.asList(15, 23, 8, 42, 10, 5, 30, 18, 50, 9);
    //Lista de números duplicados
    static List<Integer> numerosConDuplicados = Arrays.asList(10,10,20,20,23,24,50,60,45,56,90,90);


    public Empleado(String nombre, String dept, double salario) {
        this.nombre = nombre;
        this.departamento = dept;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Lista de Empleados
    static List<Empleado> empleados = Arrays.asList(
            new Empleado("Juan", "TI", 60000),
            new Empleado("Sofía", "Ventas", 45000),
            new Empleado("Miguel", "TI", 75000),
            new Empleado("Lucía", "RRHH", 40000),
            new Empleado("David", "Ventas", 50000),
            new Empleado("Ana", "TI", 65000)
    );

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", departamento='" + departamento + '\'' +
                ", salario=" + salario +
                '}';
    }

    public static void main(String[] args) {
        obtenerEmpleadosNombresMayor5caracteres(nombres).forEach(System.out::println);
        convertirNombresAMayusculas(nombres).forEach(System.out::println);
        System.out.println(obtenerSumaTotal(numeros));
        System.out.println(obtenerValorMaximo(numeros));
        obtenerListaValoresUnicosOrdenadosAscendente(numerosConDuplicados).forEach(System.out::println);
        listaEmpleadosDeTI(empleados).forEach(System.out::println);
        System.out.println(obtenerSalaroPromedioEmpleados(empleados));
        generarMapaEmpleadosPorDepartamento(empleados).forEach((departamento, lista) -> System.out.println(departamento + lista));
        System.out.println(obtenerNombresConInicialA(nombres));
    }

    /*
    1. Filtrar por Longitud: Usando la lista nombres, crea una nueva lista que contenga solo los nombres con una longitud mayor a 5 caracteres.
     */
    static List<String> obtenerEmpleadosNombresMayor5caracteres(List<String> nombres){
        return nombres.stream()
                .filter(nombre -> nombre.length() > 5)
                .toList();

    }

    /*
    2. Conversión a Mayúsculas: Usando la lista nombres, crea una lista con todos los nombres convertidos a mayúsculas
     */
    static List<String> convertirNombresAMayusculas(List<String> nombres){
        return nombres.stream()
                .map(String::toUpperCase) // convierte cada elemento de la lista en mayúsculas
                .toList();
    }

    /*
    3. Filtrar y Sumar: Usando la lista numeros, calcula la suma de todos los números que sean pares.
     */
    static Integer obtenerSumaTotal(List<Integer> numeros){
        return  numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .reduce(0, Integer::sum);
    }

    /*
    4. Encontrar Máximo: Usando la lista numeros, encuentra el valor máximo.
     */
    static Integer obtenerValorMaximo(List<Integer> numeros){
        return numeros.stream()
                .reduce(0, Integer::max); // reduce es para combinar todos los elementos en un solo resultado,
    }

    /*
    5. Distintos y Ordenados: Usando una lista de números con duplicados
    (ej: List.of(1, 5, 2, 5, 3, 1)), crea un stream para obtener una lista de los elementos únicos y ordenados de forma ascendente.
     */
    static List<Integer> obtenerListaValoresUnicosOrdenadosAscendente(List<Integer> numerosConDuplicados){
        return numerosConDuplicados.stream()
                .distinct() // Elimina duplicados de la lista
                .sorted() //ordena los elementos de la lista
                .toList();
    }

    /*
    6. Empleados de un Departamento: Usando la lista empleados,
    obtén una lista de los nombres de todos los empleados que trabajan en el departamento de "TI".
     */
    static List<String> listaEmpleadosDeTI(List<Empleado> empleados){
        return empleados.stream()
                .filter(empleado -> empleado.getDepartamento().equals("TI"))
                .map(empleado -> empleado.getNombre())//map convierte el tipo de stream y datos al que reciba, puede ignorar el reto de datos de la lista recibida
                .toList();
    }

    /*
    7. Salario Promedio por Departamento: Usando la lista empleados, calcula el salario promedio de todos los empleados
     */
    static Double obtenerSalaroPromedioEmpleados(List<Empleado> empleados){
        return empleados.stream()
                .mapToDouble(Empleado::getSalario)//transforma cada Elemento de tipo Empleado para trabajar con elementos de tipo Double, IMPORTANTE!
                .average()
                .getAsDouble();
    }
    /*
    8. Agrupación por Departamento: Usando la lista empleados, crea un Map<String, List<Empleado>>
    donde la clave sea el nombre del departamento y el valor sea la lista de empleados en ese departamento.
     */
    static Map<String, List<Empleado>> generarMapaEmpleadosPorDepartamento(List<Empleado> empleados){
        return empleados.stream()
                .collect(Collectors.groupingBy
                        (empleado -> empleado.getDepartamento())); // usar stream.Collectors.groupingBy() para agrupar con base en un campo de un objeto
    }

    /*
    9. Empleado Mejor Pagado: Usando la lista empleados, encuentra el empleado con el salario más alto. El resultado debe ser un Optional<Empleado>.
     */
    static Optional<Empleado> obtenerEmpleadoMejorPagado(List<Empleado> empleados){
        //.max  es una operación terminal que devuelve el elemento más grande del stream según el !!Comparator!! proporcionado
        //max() siempre requiere de un Comparator cuando comparas objetos personalizdos, o sea, el valor por el que va a estar comparando los valores
        // Comparator.comparingDouble es para datos Double que vienen de un objeto personalizado, en este caso lo obtiene del salario
        // los Streams primitivos (IntStream, LongStream, DoubleStream) sí tienen métodos que encuentran el máximo sin un Comparator
        return empleados.stream()
                .max(Comparator.comparingDouble(Empleado::getSalario));
    }

    /*
    10. Conteo por Prefijo: Usando la lista nombres, cuenta cuántos nombres comienzan con la letra 'A' (ignorando mayúsculas/minúsculas).
     */
    static Long obtenerNombresConInicialA(List<String> nombres){
        return nombres.stream()
                .filter(nombre -> nombre.charAt(0) == 'A')
                .count();
    }


}
