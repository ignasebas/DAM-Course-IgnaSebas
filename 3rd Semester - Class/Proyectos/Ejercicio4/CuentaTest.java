package Ejercicio4;

public class CuentaTest {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta(124123);
        Cuenta cuenta2 = new Cuenta(346658);
        cuenta1.ingresar(1000);
        cuenta2.retirar(2000);
        cuenta1.retirar(1000);
        cuenta2.ingresar(10000);
        Cuenta.transferencia(cuenta2, cuenta1, 1000);
    }
}
