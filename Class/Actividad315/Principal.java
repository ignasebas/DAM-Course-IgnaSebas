package Actividad315;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        boolean exit = false;
        Scanner scan = new Scanner (System.in);
        while (exit == false) {
    
            int eleccion ;
            System.out.println("¿Que programa quieres ejecutar?(1-10; Pulse 0 para salir):");
            eleccion = scan.nextInt();
            while (eleccion < 0 || eleccion > 10){
                System.out.println("Introduce un numero del 1 al 10");
                eleccion = scan.nextInt();
            }
            if(eleccion == 0){
                exit = true;   
            }
            if(eleccion == 1){
                Programa1.accion();   
            }
            if(eleccion == 2){
                Programa2.accion(6);
            }
            if(eleccion == 3){
                Programa3.accion(10);
            }
            if(eleccion == 4){
                Programa4.accion();
            }
            if(eleccion == 5){
                Programa5.accion();
            }
            if(eleccion == 6){
                Programa6.accion();
            }
            if(eleccion == 7){
                Programa7.accion();
            }
            if(eleccion == 8){
                Programa8.accion(2,4,5,6,10,8);
            }
            if(eleccion == 9){
                Programa9.accion();
            }
            if(eleccion == 10){
                Programa10.accion();   
            }
            
        }
        scan.close();

    }
        
}
