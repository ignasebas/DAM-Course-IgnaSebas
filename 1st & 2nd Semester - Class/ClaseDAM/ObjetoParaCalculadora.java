package ClaseDAM;

public class ObjetoParaCalculadora {
    private double longitud;
    private double peso;

    static void accion(){
        System.out.println("Hola soy un accion en static :)");
    }
    public ObjetoParaCalculadora(double longitud, double peso){
        this.longitud = (longitud * 0.3048);
        this.peso = (peso * 0.453592);
        System.out.println("El objeto tiene una longitud de " + this.longitud + " metros y " + this.peso + " kilogramos.");
    }
}
