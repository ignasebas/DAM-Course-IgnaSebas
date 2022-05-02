package Tema5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArchivosAlumnos {
    public static void main(String[] args){
        try{
            File miobj = new File("C:/1. Personal/1. Courses/1. Campus Camara FP/1. Programación/Java/DAM-Course-IgnaSebas/Class/Tema5/nombreArchivo.txt");
            Scanner miBuffer = new Scanner(miobj);
            while(miBuffer.hasNextLine()){
                String datos = miBuffer.nextLine();
                System.out.println(datos);
            }
            miBuffer.close();
        }
        catch(FileNotFoundException e){
            System.out.println("Error al abrir archivo. Archivo no encontrado");
            e.printStackTrace();
        }
    }
}