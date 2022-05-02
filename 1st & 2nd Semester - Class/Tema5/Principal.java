package Tema5;

public class Principal {
    public static void main(String[] args) {
        /*
        Archivos archivo1 = new Archivos();
        archivo1.creaArchivo();
        archivo1.escribeArchivo("Sebas", "Kuhnel", 20);
        archivo1.escribeArchivo("Cristiano", "Ronaldo", 35);
        archivo1.escribeArchivo("Lionel", "Messi", 32);
        archivo1.cierraArchivo();
        archivo1.leerArchivoConFormato();
        */
        ArchivosBinarios archivoBinario = new ArchivosBinarios();
        archivoBinario.escribeArchBin("SEBAS", 2001, 5000.75);
        archivoBinario.leerArchBin();
    }
}
