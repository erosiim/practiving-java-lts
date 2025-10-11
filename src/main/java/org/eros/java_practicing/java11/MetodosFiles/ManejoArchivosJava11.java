package org.eros.java_practicing.java11.MetodosFiles;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/*
Probando nueva manera de leer datos de un archivo con Files.readString,
en comparación a la implementación anterior con BufferedReader es máß sencillo de leer.
Es bueno usar esta nueva forma para archivos pequeños a medianos porque Files.readString lee por completo el archivo de una en RAM.
Cuando se requiera procesar archivos grandes, es mejor utilizar la versión anterior con BufferedReader ya que lee la información por bloques.
 */
public class ManejoArchivosJava11 {
    static final Path path = Paths.get("mi_archivo_prueba.txt");
    static final String contenidoArchivo = "Hola Mundo \n Estoy practicando Java 11 \n Nueva forma de escribir contenido en archivos";


    public static void main(String[] args) throws IOException {

        crearArchivoYEscribir(path, contenidoArchivo);
        System.out.println(mostrarDatosDeArchivo(path));
        Stream<String> stringStream = obtenerLineasArchivo(path);
        System.out.println("Transformando lineas de archivo a mayúsculas");
        Stream<String> stringStream1 = stringStream
                .filter(linea -> linea.length() >= 10)
                .map(String::toUpperCase);
        stringStream1.forEach(System.out::println);
        mostrarLineasArchivoBufferedReader(path);
    }

    static void crearArchivoYEscribir(Path directorioYNombreArchivo, String contenido) throws IOException {
        Files.writeString(directorioYNombreArchivo, contenido);//Crea el archivo y le asigna la cadena que se le pasa como contenido
        System.out.println("Contenido de archivo escrito en :" + directorioYNombreArchivo.toAbsolutePath());
    }

    static Stream<String> obtenerLineasArchivo(Path directorioYNombreArchivo) throws IOException {
        return Files.lines(directorioYNombreArchivo);
    }

    static String  mostrarDatosDeArchivo(Path directorioYNombreArchivo) throws IOException {
        return Files.readString(directorioYNombreArchivo);
    }

    /*
    Forma tradicional y óptimo para leer datos de archivos GRANDES.
    Lee los datos por chunks y no carga el archivo completo en RAM
    Otra alternativa es usar BufferedInputStream, pero este es solo para archivos procesados, comprimidos o binarios en general
     */
    static void mostrarLineasArchivoBufferedReader(Path directorio){
        try(BufferedReader lector = new BufferedReader(new FileReader(directorio.toFile()))){
            String linea;
            long contadorLineas = 0;
            while((linea=lector.readLine()) != null){
                contadorLineas++;
                System.out.println(contadorLineas + " - " +linea);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
