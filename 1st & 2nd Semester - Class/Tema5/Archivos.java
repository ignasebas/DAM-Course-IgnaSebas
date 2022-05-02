package Tema5;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.io.File;
import java.util.Scanner;

public class Archivos {
    private Formatter arch;

    public void creaArchivo() {
        try{
            arch = new Formatter("C:/1. Personal/1. Courses/1. Campus Camara FP/1. Programación/Java/DAM-Course-IgnaSebas/Class/Tema5/Sebas.txt");
            System.out.println("Se ha creado correctamente");
        }catch(Exception e){
            System.out.println("La creación del archivo ha fallado");
        }
    }

    public void escribeArchivo(String nom, String ape, int age){
        System.out.println("Escribiendo...");
        arch.format("%s %s %s ", nom, ape, age);
    }

    public void cierraArchivo() {
        System.out.println("Cerrando...");
        arch.close();
    }

    public void leerArchivoConFormato(){
        try{
            File miObj = new File("C:/1. Personal/1. Courses/1. Campus Camara FP/1. Programación/Java/DAM-Course-IgnaSebas/Class/Tema5/Sebas.txt");
            Scanner miFileBuffer = new Scanner(miObj);
            while(miFileBuffer.hasNext()){
                String columna1 = miFileBuffer.next();
                String columna2 = miFileBuffer.next();
                String columna3 = miFileBuffer.next();

                System.out.printf("%s %s %s\n",columna1,columna2,columna3);
            }
            miFileBuffer.close();
        }catch(FileNotFoundException e){
            System.out.println("Error al abrir el archivo");
        }
    }
    public void leerArchivoConFormatoCSV(){
        try{
            File miObj = new File("C:/1. Personal/1. Courses/1. Campus Camara FP/1. Programación/Java/DAM-Course-IgnaSebas/Class/Tema5/Sebas.csv");
            Scanner miFileBuffer = new Scanner(miObj);
            while(miFileBuffer.hasNext()){
                String fila = miFileBuffer.nextLine();
                Scanner scFila = new Scanner(fila);
                scFila.useDelimiter(";");
                while(scFila.hasNext()){
                    String columna1 = scFila.next();
                    String columna2 = scFila.next();
                    String columna3 = scFila.next();
                    System.out.printf("%s %s %s\n",columna1,columna2,columna3);
                }
                scFila.close();
            }
            miFileBuffer.close();
        }catch(FileNotFoundException e){
            System.out.println("Error al abrir el archivo");
        }
    }
}
