package ClaseDAM;

public class Tiempo {
    private int hora = 1;
    private int minuto = 2;
    private int segundo = 3;

    public void setTime(int hora, int minuto, int segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    public String getTime(){
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }
    
}
