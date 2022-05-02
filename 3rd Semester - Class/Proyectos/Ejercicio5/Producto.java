package Ejercicio5;

public class Producto {
    private String codigo;
    private String descripcion;
    private double precio;

    public Producto(String codigo, String descripcion, double precio){
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getCodigo(){
        return codigo;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public double getPrecio(){
        return precio;
    }
    public void setCodigo(String newValue){
        codigo = newValue;
    }
    public void setDescripcion(String newValue){
        descripcion = newValue;
    }
    public void setPrecio(double newValue){
        precio = newValue;
    }
}
