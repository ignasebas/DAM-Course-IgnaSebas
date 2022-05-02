public class Ejercicio138 {
    public static void main(String[] args) {
        Coche coche1 = new Coche("BMW318d", "verde", true, "vrf23", "tipoCoche", 2007, "seguro");
        Coche coche2 = new Coche("mercedesamg", "rojo", false, "12343jff", "tipoCoche", 2021, "seguro");
        Coche coche3 = new Coche("honda", "negro", false, "12346FVG", "tipoCoche", 2001, "seguro");

        coche1.verInformacion();
        coche2.verInformacion();
        coche3.verInformacion();
    }
}
