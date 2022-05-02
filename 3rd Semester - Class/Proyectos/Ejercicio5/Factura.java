package Ejercicio5;

public class Factura {
    
    private int cantidades[] = new int[100];
    private Producto productos[] = new Producto[100];
    private Cliente cliente = null;

    public Factura(Cliente cliente){
        this.cliente = cliente;
    }

    public void añadirProducto(Producto producto, int cantidad){
        for (int i = 0; i < cantidades.length; i++) {
            if (cantidades[i]==0) {
                cantidades[i]=cantidad;
                productos[i]=producto;
                return;
            }
        }
    }

    public double calcularTotal(){
        double suma = 0;
        for (int i = 0; i < cantidades.length; i++) {
            if (cantidades[i]==0) {
                continue;
            }
            suma += (productos[i].getPrecio() * cantidades[i]);
        }
        double importeTotal = suma * 1.21;
        return importeTotal;
    }

    public void generarTicket(){
        System.out.println("SUPERMERCADO CAMPUS CAMARA FP");
        System.out.println("*****************************");
        System.out.println("");
        System.out.println("Datos del cliente:");
        System.out.println("DNI: " + cliente.getDni());
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Apellidos: " + cliente.getApellidos());
        System.out.println("Direccion: " + cliente.getDireccion());
        System.out.println("");
        System.out.println("*****************************");
        System.out.println("");
        System.out.println("ARTICULOS");
        System.out.println("");
        for (int i = 0; i < cantidades.length; i++) {
            if (cantidades[i]==0) {
                continue;
            }
            int cantidad = cantidades[i];
            double precio = productos[i].getPrecio();
            System.out.println(cantidad + " X " + productos[i].getDescripcion() + " - " + precio + "€ - " + (precio*cantidad) + "€");
        }
        System.out.println("");
        System.out.println("*****************************");
        System.out.println("");
        System.out.println("IVA: 21%");
        System.out.println("TOTAL: " + calcularTotal() + "€");
        System.out.println("");
    }

}
