package ClaseDAM;

public class Alumno {
    private String numMatricula; //Atributo número de matrícula
    private String nombre; //Atributo nombre
    private String apellido;
    private int edad; //Atributo edad
    static String centro = "Campus Cámara FP";
    static int miembros = 0;
   
    public Alumno(){
        miembros++;
        System.out.println("Soy un alumno nuevo");
    }
    public Alumno(String nom){
        this.nombre = nom;
        System.out.println("Soy un alumno nuevo, me llamo " + nom);
    }
    public Alumno(String nom, int age){
        this.nombre = nom;
        this.edad = age;
        System.out.println("Soy un alumno nuevo, me llamo " + nom + " y tengo " + Integer.toString(age) + " años.");
    }
    public Alumno(String matricula, String nom, String apellido, int age ){
        this.numMatricula = matricula;
        this.nombre = nom;
        this.apellido = apellido;
        this.edad = age;
        miembros++;
    
        System.out.println(String.format("Constructor para %s %s: Hay un total de %d miembros.", nombre, apellido, miembros));
    }
   

    public static void saluda(){  //método que hace que el alumno salude
        System.out.println("¡Hola! Buenos días.");
    }
   
    public String saludaConReturn(){
        return "Hola, Buenaos días";
    }

    /**
    * @author Sebastian Ignacio Kuhnel Bozzo
    * @version 1.0
    * @param a operando1 real a sumar
    * @param b operando2 real a sumar
    * @return suma de a + b
    */
    public double suma(double a, double b){
        return a+b;
    }
   
    /**
    * @author Sebastian Ignacio Kuhnel Bozzo
    * @version 1.0
    * @param saludo1 string1 concatenar para devolver un saludo
    * @param saludo2 string2 concatenar para devolver un saludo
    * @return concatenación del saludo1 y saludo2
    */
    public void saluda2param(String saludo1, String saludo2) { //definición
        System.out.println(saludo1);
        System.out.println(saludo2);
        System.out.println("Mi nombre es " + nombre  + " " + apellido + ", mi matricula es " + numMatricula + " y tengo " + Integer.toString(edad) + " años");
    }   

    public static int getMiembros(){
        return miembros;
    }

    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }
         
}