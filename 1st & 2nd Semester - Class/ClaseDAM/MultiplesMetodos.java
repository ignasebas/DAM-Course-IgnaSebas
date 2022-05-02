package ClaseDAM;

public class MultiplesMetodos {
    private String nombreAmigo;

    public void setName(String name){
        nombreAmigo = name;
    }

    public String getName(){
        return nombreAmigo;
    }

    public void say(){
        System.out.println("El nombre de tu amigo es: " + getName());
    }
}
