package Actividad315;

public class Programa4 {
    public static void accion(){  //método que hace que el alumno salude
        int resultado = 0;
        for(int counter = 2; counter <= 1000; counter+=2){
            resultado += counter;
        }
        System.out.println("La suma de los numero pares hasta 1000 (inclusive) es " + resultado);
            
    }
}
