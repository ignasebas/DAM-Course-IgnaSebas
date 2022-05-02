package Ejercicio1;
import java.lang.Math;

public class Ecuacion {
    //variables de la clase y estaticas
    private float a,b,c;

    public Ecuacion(float a, float b, float c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void resolver(){
        double raiz = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
        double x1 = (-b + raiz) / (2*a);
        double x2 = (-b - raiz) / (2*a);

        System.out.println("Las soluciones son " + x1 + " y " + x2);
    }
}
