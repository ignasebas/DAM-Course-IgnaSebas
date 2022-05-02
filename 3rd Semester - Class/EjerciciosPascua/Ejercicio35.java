import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String args[]) {
        double coste = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce la duración de la llamada en minutos: ");
        int minutos = teclado.nextInt();
        if (minutos <= 5) {
            coste += minutos * 1;
            minutos -= 5;
        }
        coste += 5 * 1;
        minutos -= 5;

        if (minutos <= 3) {
            coste += minutos * 0.8;
            minutos -= 3;
        }
        coste += 3 * 0.8;
        minutos -= 3;

        if (minutos <= 2) {
            coste += minutos * 0.7;
            minutos -= 2;
        }

        coste += 2 * 0.7;
        minutos -= 2;
        coste += minutos * 0.5;
        
        
        System.out.println("El coste total de la llamada de " + minutos + " minutos es de " + coste + "€.");
        teclado.close();
    }
}
