package ClaseDAM;
import java.util.Scanner;

public class Calculadoramtkg {
    public static void main(String [] args) {

        ObjetoParaCalculadora.accion();
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Buenas, Introduce a continuación la longitud del objeto en pies: ");
        double longitud = scan.nextDouble();
        System.out.println("Ahora introduce el peso del objeto en libras: ");
        double peso = scan.nextDouble();
        new ObjetoParaCalculadora(longitud, peso);
        scan.close();
    }
}
