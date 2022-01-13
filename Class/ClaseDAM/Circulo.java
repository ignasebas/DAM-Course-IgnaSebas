package ClaseDAM;

public class Circulo {
    private double radio;
    private String color;
    private int centroX,centroY;

    public Circulo(double radio, String color, int centroX, int centroY){
        this.radio = radio; 
        this.color = color;
        this.centroX = centroX;
        this.centroY = centroY;
    }

    public double getRadio(){
        return this.radio;
    }

    public void setRadio(double nuevoRadio){
        this.radio = nuevoRadio;
    }

    public void decrece(){
        this.radio = this.radio/1.3;
    }

    public double area(){
        return 3.14 * radio * radio;
    }

    public String toString(){
        String res="Circulo de radio " + radio; 
        res += ", color " + color +"y centro ("+centroX+", "+centroY+")";
        return res;
    }
}
