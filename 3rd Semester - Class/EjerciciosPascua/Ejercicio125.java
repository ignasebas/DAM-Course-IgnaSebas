import java.util.Scanner;

public class Ejercicio125 {
    public static Boolean verificarFecha(int dia, int mes, int anyo){
        if(dia > 0 && dia < 31){
            if(mes > 0 && dia < 13){
                if(anyo > 0){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el dia: ");
        int dia = teclado.nextInt();
        System.out.print("Introduce el mes: ");
        int mes = teclado.nextInt();
        System.out.print("Introduce el año: ");
        int anyo = teclado.nextInt();

        boolean resultado = verificarFecha(dia,mes,anyo);
        if (resultado == true) {
            System.out.println("La fecha introducida es correcta");
        }else{
            System.out.println("La fecha introducida no es correcta");
        }
        teclado.close();
    }
}
