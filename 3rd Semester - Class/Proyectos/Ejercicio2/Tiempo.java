package Ejercicio2;
import java.util.Scanner;

public class Tiempo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca el tiempo en el formato 00h 00m 00s:");

        String horaIncorrecta = scanner.nextLine();

        String[] parts = horaIncorrecta.split(" ");
        int segundosTotales = 0;
        segundosTotales = Integer.parseInt(parts[0].replace("h", ""))*60*60;
        segundosTotales += Integer.parseInt(parts[1].replace("m", ""))*60;
        segundosTotales += Integer.parseInt(parts[2].replace("s", "")); 

        int segundos = segundosTotales % 60;
        int minutos = (segundosTotales / 60) % 60;
        int horas = (segundosTotales / 60) / 60;
        
        System.out.println(horas + "h " + minutos + "m " + segundos + "s");
        
        System.out.println(15/4);

        scanner.close();
    }
}
