package ClaseDAM;

public class Dia {
    private int dia;
    private int mes;
    private int anyo;

    public Dia(int dia, int mes, int anyo){
        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;
    }

    public String getDate(int condicion){
        if (condicion == 0){
            return String.format("%02d/%02d/%02d", dia, mes, anyo);
        }else{
            return String.format("%02d-%02d-%02d", dia, mes, anyo);
        }
    }
}
