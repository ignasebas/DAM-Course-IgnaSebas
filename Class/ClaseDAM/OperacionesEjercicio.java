package ClaseDAM;
import java.util.Scanner;
import java.lang.Math;

public class OperacionesEjercicio {

    static void OperacionA(Scanner scan){
        double M, N, P;
        System.out.print("Introduce la variable M: ");M = scan.nextInt(); 
        System.out.print("Introduce la variable N: ");N = scan.nextInt();
        System.out.print("Introduce la variable P: ");P = scan.nextInt();
        System.out.print("El resultado es " + (M / N + P));
    }
    static void OperacionB(Scanner scan){
        double M, N, P, Q;
        System.out.print("Introduce la variable M: ");M = scan.nextInt(); 
        System.out.print("Introduce la variable N: ");N = scan.nextInt();
        System.out.print("Introduce la variable P: ");P = scan.nextInt();
        System.out.print("Introduce la variable Q: ");Q = scan.nextInt();
        System.out.print("El resultado es " + (M + N / (P-Q)));
    }
    static void OperacionC(Scanner scan){
        double M, N, P;
        System.out.print("Introduce la variable M: ");M = scan.nextInt(); 
        System.out.print("Introduce la variable N: ");N = scan.nextInt();
        System.out.print("Introduce la variable P: ");P = scan.nextInt();
        System.out.print("El resultado es " + ((Math.sin(M) + Math.cos(N)) / Math.tan(P)));
    }
    static void OperacionD(Scanner scan){
        double M, N, P, Q;
        System.out.print("Introduce la variable M: ");M = scan.nextInt(); 
        System.out.print("Introduce la variable N: ");N = scan.nextInt();
        System.out.print("Introduce la variable P: ");P = scan.nextInt();
        System.out.print("Introduce la variable Q: ");Q = scan.nextInt();
        System.out.print("El resultado es " + (( M + N )/ ( P - Q )));
    }
    static void OperacionE(Scanner scan){
        double M, N, P, Q, R;
        System.out.print("Introduce la variable M: ");M = scan.nextInt(); 
        System.out.print("Introduce la variable N: ");N = scan.nextInt();
        System.out.print("Introduce la variable P: ");P = scan.nextInt();
        System.out.print("Introduce la variable R: ");R = scan.nextInt();
        System.out.print("Introduce la variable Q: ");Q = scan.nextInt();
        System.out.print("El resultado es " + ((M + (N/P))/ (Q - (R/5))));
    }
    

    public static void main(String args[]){
        char operacion;
        Scanner scan = new Scanner(System.in);
        System.out.print("Que operación quieres realizar? (Elige entre la a-e): ");
        operacion = scan.next().charAt(0);
        switch(operacion){
            case 'a':
                OperacionA(scan);
                break;
            case 'b':
                OperacionB(scan);
                break;
            case 'c':
                OperacionC(scan);
                break;
            case 'd':
                OperacionD(scan);
                break;
            case 'e':
                OperacionE(scan);
                break;
            
        }
    }
}
