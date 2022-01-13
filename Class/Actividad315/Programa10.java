package Actividad315;
import java.util.Random;

public class Programa10 {
    public static void accion(){
        for(int x=1 ; x < 6 ; x++){

            Random aleatorio = new Random();
            int a = aleatorio.nextInt(11);
            int b = aleatorio.nextInt(11);
            int c = aleatorio.nextInt(11);

            System.out.println("En Python, fulanito " + x + " ha sacado: "+a);
            System.out.println("En JavaScript, fulanito " + x + " ha sacado: "+b);
            System.out.println("En Java, fulanito " + x + " ha sacado: "+c);

            System.out.println("La media de fulanito " + x + " es: "+ ((a+b+c)/3));

        }
    }
    
}
