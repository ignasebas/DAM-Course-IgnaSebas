package PruebasVariables;
import java.util.Scanner;

class pruebasVariables {
    public static void main(String args[]) {
        String saludo = "Hola Mundo";
        System.out.println(saludo);
        int primera = 1; int segunda = 2; double trece_3 = 3.12;
        System.out.println(primera + " " + segunda + " " + trece_3);
        primera = 34; segunda = 23; trece_3 = 12.34;
        System.out.println(primera + " " + segunda + " " + trece_3);

        char pruebaChar = 'h';
        //String nombre; int nombreVariable;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Enter number:");
        int nombreVariable = teclado.nextInt();
    
        Scanner teclado2 = new Scanner(System.in);
        System.out.println("Introduzca su nombre: ");
        String nombre = teclado2.nextLine(); 
        
        System.out.println("Hola " + nombre + "!!!");
        System.out.println("Number is " + nombreVariable);
        teclado.close();
        teclado2.close();


        
        System.out.println(pruebaChar);

    }
    
}