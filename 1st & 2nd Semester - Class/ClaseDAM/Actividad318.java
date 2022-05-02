package ClaseDAM;
import java.util.Scanner;
import java.util.ArrayList;

public class Actividad318 {
    public static void main(String[] args){
        boolean exit = false;
        boolean stopbug = false;
        Scanner scan = new Scanner (System.in);
        while (exit == false) {
    
            int eleccion ;
            System.out.println("¿Que programa quieres ejecutar?(1-4; Pulse 0 para salir):");
            eleccion = scan.nextInt();
            while (eleccion < 0 || eleccion > 4){
                System.out.println("Introduce un numero del 1 al 4");
                eleccion = scan.nextInt();
            }
            switch(eleccion){
                case 0:
                    exit = true;   
                
                case 1:
                    int numero;
                    System.out.println("Pulsa un numero en tu teclado");
                    Scanner scan2 = new Scanner (System.in);
                    numero = scan2.nextInt();
                    
                    while (numero !=  1  && numero !=  2  && numero !=  3 && numero !=  4 && numero !=  5){
                        
                        System.out.println("Pulsa otro numero");
                        numero = scan2.nextInt();
                        
                    }

                    System.out.println("El numero " + numero + " esta entre el 1 y el 5");
                    if(stopbug == true){
                        scan2.close();
                    }
                    
                
                case 2:
                    Scanner scan3 = new Scanner (System.in);
                    System.out.println("Pulsa un numero hasta el cual quieres sumar:");
                    int numero2 = scan3.nextInt();
                    int resultado = 0;
                    for(int counter = 0; counter < numero2; counter++){
                        resultado += counter;
                    }
                    System.out.println("La suma de los numero enteros hasta el " + numero2 + " es " + resultado);
                    if(stopbug == true){
                        scan3.close();
                    }
                    
                
                case 3:
                    Scanner scan4 = new Scanner (System.in);
                    System.out.println("Introduce cuantos numero quieres introducir:");
                    int numero3 = scan4.nextInt();
                    int counter = 1;
                    ArrayList<Integer> lista = new ArrayList<Integer>();
                    int suma = 0;
                    do{

                        counter++;
                        System.out.print("Introduce un numero: ");
                        int nuevonumero = scan4.nextInt();
                        lista.add(nuevonumero);
                        suma += nuevonumero;

                    }while(counter <= numero3);

                    String listaconcomas = lista.toString().substring(1, lista.toString().length() - 1);
        

                    System.out.println("La lista es de un total de " + numero3 + " numeros y son los siguientes: " + listaconcomas );
                    System.out.println("La suma de los " + numero3 + " numeros es: " + suma );

                    if(stopbug == true){
                        scan4.close();
                    }

                
                case 4:
                    Scanner scan5 = new Scanner (System.in);
                    double nuevonumero = 0;
                    double counter4 = 0;
                    double media = 0;
                    do{
                        counter4++;
                        System.out.println("Introduce un numero:");
                        nuevonumero = scan5.nextInt();
                        media += nuevonumero;

                    }while(nuevonumero != 9999);
                    System.out.println("La media de los " + (counter4-1) + " numeros, es " + ((media-9999)/(counter4-1)) );

                    if(stopbug == true){
                        scan5.close();
                    }
                } 
        }
        scan.close();

    }
}
