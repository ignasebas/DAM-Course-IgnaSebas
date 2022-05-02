import java.util.Scanner;

public class Ejercicio63 {
    public static void main(String[] args) {
        System.out.print("Introduce un numero: ");
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        int factorial = 1;
        for(int i = 1; i <= numero; i++){
            factorial = factorial * i;
        }
        System.out.println("El factorial del numero " + numero + " es "+ factorial);
        teclado.close();
    }
}
