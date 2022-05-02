package Ejercicio1;
import java.util.Scanner;

public class SistemaEcuaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserte el coeficiente a:");
        float a = scanner.nextFloat();

        System.out.println("Inserte el coeficiente b:");
        float b = scanner.nextFloat();

        System.out.println("Inserte el coeficiente c:");
        float c = scanner.nextFloat();

        Ecuacion ecuacion = new Ecuacion(a, b, c);
        ecuacion.resolver();

        scanner.close();
    }
}
