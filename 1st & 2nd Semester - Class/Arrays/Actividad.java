package Arrays;

public class Actividad {
    public static void main(String[] args) {
        double maximo = 0;
        int indice = 0;
        double[] salarios = {1200.80,2200.80,1500.60,3000.20,1080.20};
        for (int i=0; i < salarios.length; i++) {
            if(maximo <= salarios[i]){
                maximo = salarios[i];
                indice = i;
            }
        }
        System.out.println("El valor maximo de los elementos es " + maximo);
        System.out.println("El indice del valor maximo es " + indice);
    }
}
