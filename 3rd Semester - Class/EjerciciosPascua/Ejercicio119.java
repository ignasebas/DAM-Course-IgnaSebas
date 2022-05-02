import java.util.Scanner;

public class Ejercicio119 {
    public static int dimeSigno(int x){
        if(x > 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.print("Introduce un numero: ");
        Scanner teclado = new Scanner(System.in);
        int a = teclado.nextInt();
        int resultado = dimeSigno(a);
        switch (resultado) {
            case 1:
                System.out.println("El numero es positivo");
                break;
            case 0:
                System.out.println("El numero es igual a 0");
                break;
            default:
                System.out.println("El numero es negativo");
                break;
        }
        teclado.close();
    }
}
