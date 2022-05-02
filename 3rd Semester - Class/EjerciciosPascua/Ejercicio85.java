import java.util.Scanner;

public class Ejercicio85 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        String nombre = teclado.nextLine();
        System.out.print("Introduce tu primer apellido: ");
        String apellido1 = teclado.nextLine();
        System.out.print("Introduce tu segundo apellido: ");
        String apellido2 = teclado.nextLine();
        String codigo = nombre.substring(0, 3) + apellido1.substring(0, 3) + apellido2.substring(0, 3); 
        System.out.println("Tu codigo de usuario es " + codigo.toUpperCase());
        teclado.close();
    }
}
