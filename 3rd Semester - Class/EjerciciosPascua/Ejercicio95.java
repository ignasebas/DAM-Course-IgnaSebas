import java.util.Scanner;

public class Ejercicio95 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce un numero: ");
            numeros[i] = teclado.nextInt();
        }
        int max = numeros[0];
        int minimo = numeros[0];
        for (int x : numeros) {
            if(max <= x){
                max = x;
            }
            if(minimo >= x){
                minimo = x;
            }
        }
        System.out.println("El numero maximo es " + max);
        System.out.println("El numero minimo es " + minimo);
        teclado.close();
    }
}
