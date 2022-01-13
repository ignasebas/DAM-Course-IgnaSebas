package Examen;
import java.util.Scanner;

public class Masa {
    public static void accion(){
        boolean exit = false; //variable para quitar el aviso de que el Scanner sigue abierto (VScode)
        char stop = 's';
        final double GRAVEDAD_MARTE = 3.72;
        final double GRAVEDAD_TIERRA = 9.80;
        final double GRAVEDAD_JUPITER = 24.76;
        final double GRAVEDAD_SATURNO = 10.44;
        final double GRAVEDAD_PLUTON = 0.62;
        double masaTierra, pesoMarte, pesoTierra, pesoJupiter, pesoSaturno, pesoPluton;
        do {
            System.out.println("Hola buenas tardes soy Bogdan");
            System.out.print("Introduce tu masa en kg:");
            Scanner teclado = new Scanner(System.in);
            masaTierra = teclado.nextInt();
            System.out.print("Introduce tu en que planeta quieres calcular tu peso\n(0.Marte)/(1.Tierra)/(2.Jupiter)/(3.Saturno)/(4.Pluton): ");
            int eleccion = teclado.nextInt();
            switch (eleccion) {
                default:
                    System.out.println("Introduce un numero del 0 al 4");
                    eleccion = teclado.nextInt();
                    break;
                case 0:
                    pesoMarte = masaTierra * GRAVEDAD_MARTE; //F = m * a
                    System.out.println("Si tu masa es de " + masaTierra + "kg, entonces tu peso en Marte es de " + (float)pesoMarte + "N.");
                    break;
                case 1:
                    pesoTierra = masaTierra * GRAVEDAD_TIERRA;
                    System.out.println("Si tu masa es de " + masaTierra + "kg, entonces tu peso en la Tierra es de " + (float)pesoTierra + "N.");   
                    break;
                case 2:
                    pesoJupiter = masaTierra * GRAVEDAD_JUPITER;
                    System.out.println("Si tu masa es de " + masaTierra + "kg, entonces tu peso en Jupiter es de " + (float)pesoJupiter + "N.");
                    break;
                case 3:
                    pesoSaturno = masaTierra * GRAVEDAD_SATURNO;
                    System.out.println("Si tu masa es de " + masaTierra + "kg, entonces tu peso en Saturno es de " + (float)pesoSaturno + "N.");
                    break;
                case 4:
                    pesoPluton= masaTierra * GRAVEDAD_PLUTON;
                    System.out.println("Si tu masa es de " + masaTierra + "kg, entonces tu peso en Plutón es de " + (float)pesoPluton + ".");
                    break;
            }
            
            System.out.println("¿Quieres continuar? Pulsa N para salir");
            stop = teclado.next().charAt(0);
            
            //El código a continuación es para hacer bonito, no tiene ninguna utilidad
            if(stop != 'N' && stop != 'n'){
                System.out.println("Genial, vamos a repetir el calculo");
            }else{
                System.out.println("Muchas gracias por usar nuestra calculadora de masa, que tengas un buen día :)");
            }
            /*
            El código a continuación es para cerrar el Scanner y quitar el aviso de 
            que esta el Scanner sin cerrar (VScode)
            */
            if(exit == true){
                teclado.close();
            }

        } while (stop != 'N' && stop != 'n');
        
    }
}
