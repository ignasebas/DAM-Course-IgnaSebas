package Actividad315;
import java.util.Arrays;

public class Programa8 {
    public static void accion(int uno, int dos, int tres, int cuatro, int cinco, int seis){
        System.out.println("Tenemos una lista con los numero seleccionados. Vamos a buscar el numero mayor.");
        int[] numeros = {uno, dos, tres, cuatro, cinco, seis};
        System.out.println("La lista es " + Arrays.toString(numeros));
        int resultado = 0;
        for (int x : numeros) {
            if(resultado <= x){
                resultado = x;
            }
        }
        System.out.println("El numero mas mayor es " + resultado);

    }
}
