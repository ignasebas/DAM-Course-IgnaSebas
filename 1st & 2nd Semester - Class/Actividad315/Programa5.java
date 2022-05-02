package Actividad315;
import java.util.Scanner;

public class Programa5 {
    public static void accion(){  //método que hace que el alumno salude
        char letra;
        System.out.println("Pulsa una letra en tu teclado");
        Scanner scan2 = new Scanner (System.in);
        letra = scan2.next().charAt(0);
        
        while (letra !=  'a'  && letra !=  'e'  && letra !=  'i' && letra !=  'o' && letra !=  'u'){
            
            System.out.println("Pulsa otra letra");
            letra = scan2.next().charAt(0);
            
        }

        System.out.println("La letra " + letra + " es una vocal.");
        boolean stopbug = false;
        if(stopbug == true){
            scan2.close();
        }
    }
}
