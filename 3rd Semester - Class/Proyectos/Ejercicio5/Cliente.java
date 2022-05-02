package Ejercicio5;

public class Cliente {
    private String nombre;
    private String apellidos;
    private String direccion;
    private String dni;

    public Cliente(String nombre, String apellidos, String direccion, String dni){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.dni = dni;
    }

    public String getNombre(){
        return nombre;
    }
    public String getApellidos(){
        return apellidos;
    }
    public String getDireccion(){
        return direccion;
    }
    public String getDni(){
        return dni;
    }
    public void setNombre(String newValue){
        nombre = newValue;
    }
    public void setApellidos(String newValue){
        apellidos = newValue;
    }
    public void setDireccion(String newValue){
        direccion = newValue;
    }
    public void setDni(String newValue){
        dni = newValue;
    }
}
