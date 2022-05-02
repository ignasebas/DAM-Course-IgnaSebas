package Tema5;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.io.File;
import java.util.Scanner;

public class Actividad51 {
    private Formatter arch;

    public void creaArchivo() {
        boolean stop = false;
        try{   
            Scanner teclado = new Scanner(System.in);
            System.out.print("Introduce el nombre del archivo: ");
            String name = teclado.nextLine();
            String filepath = String.format("C:/1. Personal/1. Courses/1. Campus Camara FP/1. Programación/Java/DAM-Course-IgnaSebas/Class/Tema5/%s.txt",name);
            arch = new Formatter(filepath);
            System.out.println("Se ha creado correctamente");
            if(stop==true){
                teclado.close();
            }
            
        }catch(Exception e){
            System.out.println("La creación del archivo ha fallado");
        }
    }

    public void escribeArchivo(String nombre,int telefono,int age, double salario){
        System.out.println("Escribiendo...");
        arch.format("%s %s %s %s", nombre, telefono, age, salario);
    }

    public void cierraArchivo() {
        System.out.println("Cerrando...");
        arch.close();
    }

    public void leerArchivoConFormato(){
        boolean stop = false;
        try{
            Scanner teclado2 = new Scanner(System.in);
            System.out.print("Introduce el nombre del archivo: ");
            String name = teclado2.nextLine();
            String filepath = String.format("C:/1. Personal/1. Courses/1. Campus Camara FP/1. Programación/Java/DAM-Course-IgnaSebas/Class/Tema5/%s.txt",name);
            File miObj = new File(filepath);
            Scanner miFileBuffer = new Scanner(miObj);
            while(miFileBuffer.hasNext()){
                String columna1 = miFileBuffer.next();
                String columna2 = miFileBuffer.next();
                String columna3 = miFileBuffer.next();
                String columna4 = miFileBuffer.next();

                System.out.printf("Nombre: %s | Telefono: %s | Edad: %s | Salario: %s\n",columna1,columna2,columna3,columna4);
            }
            miFileBuffer.close();
            if(stop==true){
                teclado2.close();
            }
        }catch(FileNotFoundException e){
            System.out.println("Error al abrir el archivo");
        }
    }

    public static void main(String[] args) {
        Actividad51 archivo = new Actividad51();
        archivo.creaArchivo();
        archivo.escribeArchivo("Sebas", 432123123, 20, 12000.57);
        archivo.cierraArchivo();
        System.out.println("Ahora se lee el archivo...");
        archivo.leerArchivoConFormato();
    }
}
