package ClaseDAM;

public class Principal {
    public static void main(String[] args){
        Tiempo tiempo1 = new Tiempo();
        System.out.println("El tiempo inicial es: " + tiempo1.getTime());
        System.out.println("Cambio el tiempo");
        tiempo1.setTime(6,4,15);
        System.out.println("El tiempo ahora es: " + tiempo1.getTime());


        Circulo rodrigo = new Circulo(5.5,"verde",100,244);
        rodrigo.setRadio(60);
        System.out.println(rodrigo.getRadio());
        rodrigo.decrece();
        System.out.println(rodrigo.area());
        String nuevoRadio2 = rodrigo.toString();
        System.out.println(nuevoRadio2);

        Dia dia1 = new Dia(12,12,2345);
        Dia diaMiCumple = new Dia(19,8,2001);

        System.out.println("La fecha es " + dia1.getDate(0));
        System.out.println("La fecha es " + diaMiCumple.getDate(1));

        MultiplesMetodos amigo = new MultiplesMetodos();
        amigo.setName("Rodrigo");
        amigo.say();

        Alumno.saluda();
        Alumno Sebas = new Alumno("654561165", "Sebas", "Kuhnel", 19);
        new Alumno("595486465", "Rodrigo", "Tarazon", 18);
        
        System.out.println(Sebas.getApellido());    
        System.out.println(Sebas.getNombre());  
        
        new Alumno();
        new Alumno("SEbas");
        new Alumno("SEBAAAAS", 12);

        int variable = 19;  

        if(variable >= 18){
            System.out.println("Puedes pasar");  
        }else{
            System.out.println("No puedes pasar");  
        }

        Condicionales.contar(100);
    }
}
