package Actividad315;
import java.util.Scanner;

public class Programa7 {
    public static void accion(){  //método que hace que el alumno salude
        int numero;
        System.out.println("Pulsa un numero en tu teclado");
        Scanner scan4 = new Scanner (System.in);
        numero = scan4.nextInt();
        
        while (numero !=  1  && numero !=  2  && numero !=  3 && numero !=  4 && numero !=  5){
            
            System.out.println("Pulsa otro numero");
            numero = scan4.nextInt();
            
        }

        System.out.println("El numero " + numero + " esta entre el 1 y el 5");

        boolean stopbug = false;
        if(stopbug == true){
            scan4.close();
        }
        
    }
}
