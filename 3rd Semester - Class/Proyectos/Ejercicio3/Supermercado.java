package Ejercicio3;
import java.util.Scanner;

public class Supermercado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca el precio:");
        double precio = Double.parseDouble(scanner.nextLine());

        System.out.println("Introduzca el cantidad de dinero:");
        double cantidad = Double.parseDouble(scanner.nextLine());

        double cambio = cantidad - precio;

        int billete500 = (int)Math.floor(cambio / 500);
        cambio %= 500;
        int billete200 = (int)Math.floor(cambio / 200);
        cambio %= 200;
        int billete100 = (int)Math.floor(cambio / 100);
        cambio %= 100;
        int billete50 = (int)Math.floor(cambio / 50);
        cambio %= 50;
        int billete20 = (int)Math.floor(cambio / 20);
        cambio %= 20;
        int billete10 = (int)Math.floor(cambio / 10);
        cambio %= 10;
        int billete5 = (int)Math.floor(cambio / 5);
        cambio %= 5;
        int moneda2 = (int)Math.floor(cambio / 2);
        cambio %= 2;
        int moneda1 = (int)Math.floor(cambio / 1);
        cambio %= 1;
        int moneda50 = (int)Math.floor(cambio / 0.5);
        cambio %= 0.5;
        int moneda20 = (int)Math.floor(cambio / 0.2);
        cambio %= 0.2;
        int moneda10 = (int)Math.floor(cambio / 0.1);
        cambio %= 0.1;
        int moneda5 = (int)Math.floor(cambio / 0.05);
        cambio %= 0.05;
        int moneda02 = (int)Math.floor(cambio / 0.02);
        cambio %= 0.02;
        int moneda01 = (int)Math.floor(cambio / 0.01);
        cambio %= 0.01;

        System.out.println("Billetes 500: " + billete500);
        System.out.println("Billetes 200: " + billete200);
        System.out.println("Billetes 100: " + billete100);
        System.out.println("Billetes 50: " + billete50);
        System.out.println("Billetes 20: " + billete20);
        System.out.println("Billetes 10: " + billete10);
        System.out.println("Billetes 5: " + billete5);
        System.out.println("Monedas 2: " + moneda2);                                                               
        System.out.println("Monedas 1: " + moneda1);                                
        System.out.println("Monedas 0.5: " + moneda50); 
        System.out.println("Monedas 0.2: " + moneda20);
        System.out.println("Monedas 0.1: " + moneda10);
        System.out.println("Monedas 0.05: " + moneda5);
        System.out.println("Monedas 0.02: " + moneda02);
        System.out.println("Monedas 0.01: " + moneda01);
                            
        System.out.println(cambio);
        scanner.close();          
    }
} 
