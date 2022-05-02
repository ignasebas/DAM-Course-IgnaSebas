package Evaluacion;

public class Contactos {
    private String name;
    private int phone;
    private String email;

    public Contactos(String name, int phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String verContactos(){
        return (name + " " + phone + " " + email);
    }
    public String verNombre(){
        return name;
    }
    public int verTelefono(){
        return phone;
    }
    public String verEmail(){
        return email;
    }
    
}
