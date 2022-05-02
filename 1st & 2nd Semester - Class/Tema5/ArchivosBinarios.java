package Tema5;

import java.io.*;

public class ArchivosBinarios {
    String fichero = "C:/1. Personal/1. Courses/1. Campus Camara FP/1. Programación/Java/DAM-Course-IgnaSebas/Class/Tema5/salarios.data";
    
    public void escribeArchBin(String nom, int anyo, double salario) {
        String nombre = nom;
        int anyoInicio = anyo;
        double salarioMensual = salario;
        try{
            ObjectOutputStream outObj = new ObjectOutputStream(new FileOutputStream(fichero));
            outObj.writeUTF(nombre);
            outObj.writeInt(anyoInicio);
            outObj.writeDouble(salarioMensual);
            outObj.close();
        }catch(Exception e){
            System.out.println("Error");
        }
    }

    public void leerArchBin() {
        try{
            ObjectInputStream inObj = new ObjectInputStream(new FileInputStream(fichero));
            System.out.println("Valor leido del nombre: " + inObj.readUTF());
            System.out.println("Valor leido del año de inicio: " + inObj.readInt());
            System.out.println("Valor leido del salario mensual: " + inObj.readDouble());
            inObj.close();
        }catch(Exception e){
            System.out.println("No se ha podido encontrar y el archivo");
        }
    }       
}
