import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el numero a: ");
        double a = teclado.nextDouble();
        System.out.print("Introduce el numero b: ");
        double b = teclado.nextDouble();
        if (a % b == 0) {
            System.out.println("El numero a ( a = " + a + " ) es multiplo de b ( b = " + b +" ).");
        }if (b % a == 0) {
            System.out.println("El numero b ( b = " + b + " ) es multiplo de a ( a = " + a +" ).");
        }
        if ((b % a != 0) && (a % b != 0)){
            System.out.println("El numero a ( a = " + a + " ) no es multiplo de b ( b = " + b +" ) ni viceversa.");
        }

        teclado.close();
    }
}
