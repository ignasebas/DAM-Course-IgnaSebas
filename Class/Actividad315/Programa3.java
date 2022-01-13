package Actividad315;

public class Programa3 {
    public static void accion(int n){  //método que hace que el alumno salude
        int resultado = 0;
        for(int counter = 1; counter < n+1; counter+=2){
            resultado += counter;
        }
        System.out.println("La suma de los numero impares menores o iguales que " + n + " es " + resultado);
            
    }
}
