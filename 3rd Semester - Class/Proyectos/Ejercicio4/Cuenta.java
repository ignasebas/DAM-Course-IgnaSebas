package Ejercicio4;

public class Cuenta {
    private double capital = 0;
    private int numCuenta;

    public Cuenta(int numCuenta){
        this.numCuenta = numCuenta;
    }

    public void ingresar(float dineroIngresar){
        this.capital+=dineroIngresar;
        System.out.println("Se ha ingresado el dinero con exito a la cuenta " + numCuenta);
    }

    public void retirar(float dineroRetirar){
        if(!this.puedeRetirar(dineroRetirar)){
            System.out.println("No hay suficiente capital en la cuenta");
            return;
        }
            
        this.capital-=dineroRetirar;
        System.out.println("Se ha retirado el dinero con exito");
    }

    public boolean puedeRetirar(float dineroRetirar){
        return capital >= dineroRetirar;
    }

    public static void transferencia(Cuenta origen, Cuenta destino, float dineroTransferir){
        if(!origen.puedeRetirar(dineroTransferir)){
            System.out.println("No hay suficiente capital en la cuenta");
            return;
        }
        origen.retirar(dineroTransferir);
        destino.ingresar(dineroTransferir);
        System.out.println("La transferencia se ha realizado con exito");
    }

}
