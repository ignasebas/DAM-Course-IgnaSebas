package Actividad315;
import java.util.Scanner;

public class Programa6 {
    public static void accion(){  //método que hace que el alumno salude
        char letra;
        System.out.println("¿Desea continuar? S/N");
        Scanner scan3 = new Scanner (System.in);
        letra = scan3.next().charAt(0);
        
        while (letra ==  's' || letra ==  'S'){
            
            System.out.println("¿Desea continuar? S/N");
            letra = scan3.next().charAt(0);
            
        }

        System.out.println("Perfecto, continuemos");
        boolean stopbug = false;
        if(stopbug == true){
            scan3.close();
        }
        
    }
}
