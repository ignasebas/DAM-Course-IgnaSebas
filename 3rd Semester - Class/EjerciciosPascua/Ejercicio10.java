import java.util.Arrays;

public class Ejercicio10 {

    enum DiasSemana{
        Lunes,Martes,Miercoles,Jueves,Viernes,Sabado,Domingo
    }
    enum Calificaciones{
        Suspenso,Suficiente,Bien,Notable,Sobresaliente
    }
    enum Colores{
        Rojo,Amarillo,Azul
    }
    enum NotasMusicales{
        Do,Re,Mi,Fa,Sol,La,Si
    }
    public static void main(String args[]) {
        System.out.println(Arrays.asList(DiasSemana.values()));
        System.out.println(Arrays.asList(Calificaciones.values()));
        System.out.println(Arrays.asList(Colores.values()));
        System.out.println(Arrays.asList(NotasMusicales.values()));
    }
}
