package ClaseDAM;

import java.util.Scanner;

public class Condicionales {

    public static void contar(int x){
        int cont = 1;
        int r;
        for(r = 1; r <= x; r++){
            System.out.println(cont);
            cont += 1;
        }
    }
    public static void factorial(){
        int num, factorial, i;
        System.out.println("Teclea un número y te diré su factorial: ");
        Scanner scan = new Scanner (System.in);
        num = scan.nextInt();
        scan.close();
        factorial = 1;
        if(num > 0){
            for(i = 1; i <= num; i++){
                System.out.println(i);
                factorial = factorial * i;
                System.out.println(i);
            }
                 
        }
        System.out.println("El factorial de: " +num + " es: " + factorial);
        
    }
    public static void whileraro(){
        double suma, numero;
        int n, total;
        
        Scanner scan2 = new Scanner (System.in);
        n = scan2.nextInt();
        total = n;
        suma = 0;

        while(total>0){
            System.out.println("Teclea el valor de un número: ");
            numero = scan2.nextInt();
            suma  = suma + numero;
            total = total - 1;
        }
        System.out.println("La suma de los " + n + " número es: " + suma);

        scan2.close();
    }

    public static void otrowhileraro(){
        int suma = 0;
        System.out.println("Teclea el valor de la variable número: ");
        Scanner scan3 = new Scanner(System.in);
        int numero = scan3.nextInt();

        while(numero>=0){
            suma = suma + numero;
            System.out.println("Teclea el valor de la variable número: ");
            numero = scan3.nextInt();
        }
        scan3.close();
    }

}
