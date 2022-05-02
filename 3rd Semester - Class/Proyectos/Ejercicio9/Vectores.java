package Ejercicio9;

public class Vectores {
    public static void main(String[] args){
        double[] vectorDobles = {5.0,3.0,2.0};
        System.out.println("El valor maximo es " + max(vectorDobles));
        System.out.println("El valor minimo es " + min(vectorDobles));
        System.out.println("La media es " + avg(vectorDobles));
    }   

    private static double max(double[] vector){
        double valorMaximo=vector[0];

        for (int i = 1; i < vector.length; i++) {
            if (valorMaximo < vector[i]) {
                valorMaximo=vector[i];
            }
        }

        return valorMaximo;
    }

    private static double min(double[] vector){
        double valorMinimo=vector[0];

        for (int i = 1; i < vector.length; i++) {
            if (valorMinimo > vector[i]) {
                valorMinimo=vector[i];
            }
        }

        return valorMinimo;
    }

    private static double avg(double[] vector){
        double suma = vector[0];

        for (int i = 1; i < vector.length; i++) {
            suma += vector[i];
            
        }
        double media = suma/vector.length;
        return media;
    }
}
