package Actividad315;
import java.lang.Math;

public class Programa1 {
    public static void accion(){  //método que hace que el alumno salude
        for(int counter = 1; counter < 31; counter++){
            double resultado = Math.pow(4,counter);
            System.out.println("La potencia numero " + counter + " de 4 es " + resultado);
        }
            
    }
}
