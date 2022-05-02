package Actividad315;
import java.util.ArrayList;
import java.util.Random;

public class Programa9 {
    public static void accion(){
        int maxVal = 200;
        int resultado = 0;
        int resultado2 = 200;
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random aleatorio = new Random();

        for (int i = 0; i < 99; i++) {
            int randInt = aleatorio.nextInt(maxVal);
            list.add(randInt);
        }

        for (int i = 0; i < list.size(); i++) {
            if(resultado <= list.get(i)){
                resultado = list.get(i); //mas grande
            }
            if(resultado2 >= list.get(i)){
                resultado2 = list.get(i);//mas pequeño
            } 
        }

        System.out.println("El numero mas mayor es " + resultado);
        System.out.println("El numero menor es " + resultado2);

    }
}
