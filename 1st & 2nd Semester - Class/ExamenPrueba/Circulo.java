package ExamenPrueba;
import java.util.Scanner;

public class Circulo {
    public static void accion(){
        boolean exit = false;
        char stop = 's';
        final double PI = 3.1415; //LAS CONSTANTES EN MAYUSCULAS
        double radio , area, volumen;
        do {
            System.out.print("Introduce el radio de la esfera:");
            Scanner teclado = new Scanner(System.in);
            radio = teclado.nextInt();
            area = (4*PI)*(radio*radio);
            volumen = ((4.0/3.0)*PI)*(radio*radio*radio);
            System.out.println("El área de la esfera es: " + area);
            System.out.println("El volumen de la esfera es: " + volumen);
            
            System.out.println("¿Quieres continuar? Pulsa N para salir");
            stop = teclado.next().charAt(0);

            if(exit == true){
                teclado.close();
            }

        } while (stop != 'N' && stop != 'n');
        
    }
}
