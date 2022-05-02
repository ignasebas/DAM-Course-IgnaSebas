package Evaluacion;

import java.util.Scanner;
import java.util.ArrayList;

public class EjercicioEvaluacion {

    public static void verContactos(ArrayList<Contactos> listacontactos){
        if(listacontactos.size() == 0){
            System.out.println("No hay contactos");
        }else{
            for (int i = 0; i < listacontactos.size(); i++) {
                System.out.println(i + "." + listacontactos.get(i).verContactos());
            }
        }
        
    }
    
    public static void eliminarContactos(ArrayList<Contactos> listacontactos, String deletename){
        for (int i = 0; i < listacontactos.size(); i++) {
            String currentValue = listacontactos.get(i).verNombre();
            if(currentValue.equals(deletename)){
                listacontactos.remove(listacontactos.get(i));
            }
        }
    }

    public static void buscarPorNombre(ArrayList<Contactos> listacontactos, String texto){
        ArrayList<Contactos> busqueda = new ArrayList<Contactos>();
        for (int i = 0; i < listacontactos.size(); i++) {
            String currentValue = listacontactos.get(i).verNombre();
            if(currentValue.contains(texto)){
                busqueda.add(listacontactos.get(i));
            }
        }
        if(busqueda.size() == 0){
            System.out.println("No se han encontrado contactos");
        }else{
            for (int i = 0; i < busqueda.size(); i++) {
                System.out.println(i + "." + busqueda.get(i).verNombre());
            }
        }
    }
    
    public static void buscarPorTelefono(ArrayList<Contactos> listacontactos, String texto){
        ArrayList<Contactos> busqueda = new ArrayList<Contactos>();
        for (int i = 0; i < listacontactos.size(); i++) {
            int currentValue = listacontactos.get(i).verTelefono();
            if(String.valueOf(currentValue).contains(texto)){
                busqueda.add(listacontactos.get(i));
            }
        }
        if(busqueda.size() == 0){
            System.out.println("No se han encontrado contactos");
        }else{
            for (int i = 0; i < busqueda.size(); i++) {
                System.out.println(i + "." + busqueda.get(i).verTelefono());
            }
        }
    }

    public static void buscarPorCorreo(ArrayList<Contactos> listacontactos, String texto){
        ArrayList<Contactos> busqueda = new ArrayList<Contactos>();
        for (int i = 0; i < listacontactos.size(); i++) {
            String currentValue = listacontactos.get(i).verEmail();
            if(currentValue.contains(texto)){
                busqueda.add(listacontactos.get(i));
            }
        }
        if(busqueda.size() == 0){
            System.out.println("No se han encontrado contactos");
        }else{
            for (int i = 0; i < busqueda.size(); i++) {
                System.out.println(i + "." + busqueda.get(i).verEmail());
            }
        }
    }
    
    public static void busquedaGlobal(ArrayList<Contactos> listacontactos, String texto){
        ArrayList<Contactos> busqueda = new ArrayList<Contactos>();
        for (int i = 0; i < listacontactos.size(); i++) {
            String currentName = listacontactos.get(i).verNombre();
            String currentEmail = listacontactos.get(i).verEmail();
            int currentPhone = listacontactos.get(i).verTelefono();
            if(currentName.contains(texto) || currentEmail.contains(texto) || String.valueOf(currentPhone).contains(texto)){
                busqueda.add(listacontactos.get(i));
            }
        }
        if(busqueda.size() == 0){
            System.out.println("No se han encontrado contactos");
        }else{
            for (int i = 0; i < busqueda.size(); i++) {
                System.out.println(i + "." + busqueda.get(i).verContactos());
            }
        }
    }
    
    public static void main(String[] args){
        boolean exit = false; //variable para quitar el aviso de que el Scanner sigue abierto (VScode)
        boolean stop = false;
        ArrayList<Contactos> listacontactos = new ArrayList<Contactos>();
        do {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Introduce la accion a realizar: (Pulsa 8 para salir)");
            int eleccion = teclado.nextInt();
            switch (eleccion) {
                default:
                    System.out.println("Introduce un numero del 1 al 8");
                    break;
                case 1:
                    verContactos(listacontactos);
                    break;

                case 2:
                    teclado.nextLine();
                    Boolean nameValid = false;
                    String name = " ";
                    while (nameValid != true) {
                        System.out.print("Introduce el nombre del contacto a añadir: ");
                        name = teclado.nextLine();
                        boolean valid = true;

                        for (int i = 0; i < listacontactos.size(); i++) {
                            String currentValue = listacontactos.get(i).verNombre();
                            if(currentValue.equals(name)){
                                valid = false;
                            }
                        } 

                        if(valid == true){
                            nameValid = true;
                        }else{
                            System.out.println("El nombre ya esta en uso, vuelve a introducir otro.");
                        }
                    }
                
                    System.out.print("Introduce el email del contacto a añadir: ");
                    String email = teclado.nextLine();
                    System.out.print("Introduce el telefono del contacto a añadir: ");
                    int phone = teclado.nextInt();
                    listacontactos.add(new Contactos(name,phone,email));
                    break;

                case 3:
                    teclado.nextLine();
                    System.out.print("Introduce el nombre del contacto a eliminar: ");
                    String deletename = teclado.nextLine();
                    eliminarContactos(listacontactos,deletename);
                    break;
                case 4:
                    teclado.nextLine();
                    System.out.print("Introduce el texto a buscar en nombre: ");
                    String texto = teclado.nextLine();
                    buscarPorNombre(listacontactos,texto);
                    break;
                case 5:
                    teclado.nextLine();
                    System.out.print("Introduce el texto a buscar en el telefono: ");
                    String texto2 = teclado.nextLine();
                    buscarPorTelefono(listacontactos,texto2);
                    break;
                case 6:
                    teclado.nextLine();
                    System.out.print("Introduce el texto a buscar en email: ");
                    String texto3 = teclado.nextLine();
                    buscarPorCorreo(listacontactos,texto3);
                    break;
                case 7:
                    teclado.nextLine();
                    System.out.print("Introduce el texto a buscar en cualquier parametro: ");
                    String texto4 = teclado.nextLine();
                    busquedaGlobal(listacontactos,texto4);
                    break;
                case 8:
                    System.out.println("Adios");
                    stop = true;
                    break;
            }

            /*
            El código a continuación es para cerrar el Scanner y quitar el aviso de 
            que esta el Scanner sin cerrar (VScode)
            */
            if(exit == true){
                teclado.close();
            }

        } while (stop == false);
        
    }
}
