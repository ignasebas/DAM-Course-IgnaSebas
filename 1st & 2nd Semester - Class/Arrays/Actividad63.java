package Arrays;

public class Actividad63 {
    public static void main(String[] args) {
        String nombre = "Gandalf";
        int contador = 0;
        int[] indices = {0,0};
        for(int x = 0; x < nombre.length(); x++){
            if(nombre.charAt(x) == 'a'){
                if(indices[0] == 0){
                    indices[0] = x;
                }else{
                    indices[1] = x;
                }
                contador += 1;
                
            }
        }
        System.out.println("El String " + nombre + " tiene un total de " + contador + " caracteres a");
        System.out.println("Estos caracteres estan en los indices " + indices[0] + " y " + indices[1]);
    }
}
