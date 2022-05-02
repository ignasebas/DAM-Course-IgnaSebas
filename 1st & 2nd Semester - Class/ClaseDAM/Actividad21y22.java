package ClaseDAM;
import java.util.Scanner;
import java.lang.Math;
import java.lang.Double;

public class Actividad21y22 {

    static void AreaCirculo(){
        double radio;
        Scanner scan = new Scanner(System.in);
        System.out.print("Buenas, vamos a calcular el área de un circulo. \nIntroduce el radio del circulo (en metros): ");
        radio = scan.nextDouble();
        System.out.println("El area del circulo es igual a " + (Math.PI * (radio*radio)) + " metros cuadrados");
        scan.close();
    }

    static void EcuacionCuadratica(){
        double A, B, C;
        double x1, x2;
        Scanner scan = new Scanner(System.in);
        System.out.print("Buenas, vamos a calcular las soluciones x1 y x2 de la ecuación cuadratica ax2 + bx + c = 0.\nIntroduce la variable A: ");
        A = scan.nextDouble();
        System.out.print("Ahora introduce la variable B: ");
        B = scan.nextDouble();
        System.out.print("Ahora introduce la variable C: ");
        C = scan.nextDouble();
        double sqrtInside = (B*B)-4*A*C;
        System.out.println("sqrtInside = " + sqrtInside);
        x1 = ((-B + Math.sqrt(sqrtInside))/2*A);
        x2 = ((-B - Math.sqrt(sqrtInside))/2*A);
        if (Double.isNaN(x1)) {
            System.out.println("El resultado no existe");
        }else{
            System.out.println("El resultado de x1 sería de " + x1 + " y de x2 sería de " + x2); 
        }
        scan.close();
        
    }
    public static void main(String args[]){
        //AreaCirculo();
        EcuacionCuadratica();
    }
}
