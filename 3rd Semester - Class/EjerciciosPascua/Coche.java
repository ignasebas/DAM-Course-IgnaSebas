public class Coche {
    private String modelo;
    private String color;
    private boolean metalizado;
    private String matricula;
    private String tipoCoche;
    private int anyoFabricacion;
    private String seguro;

    enum opcionesCoche{
        MINI,UTILITARIO,FAMILIAR,DEPORTIVO
    }
    enum tipoSeguro{
        TERCEROS,TODO_RIESGO
    }

    public Coche(String modelo, String color, boolean metalizado, String matricula, String tipoCoche, int anyoFabricacion, String seguro){
        this.modelo = modelo;
        this.color = color;
        this.metalizado = metalizado;
        this.matricula = matricula;
        this.tipoCoche = tipoCoche;
        this.anyoFabricacion = anyoFabricacion;
        this.seguro = seguro;
    }

    public String getModelo(){
        return modelo;
    }
    public String getColor(){
        return color;
    }
    public boolean getMetalizado(){
        return metalizado;
    }
    public String getMatricula(){
        return matricula;
    }
    public String getTipoCoche(){
        return tipoCoche;
    }
    public int getAnyoFabricacion(){
        return anyoFabricacion;
    }
    public String getSeguro(){
        return seguro;
    }

    public void setModelo(String x){
        this.modelo = x;
    }
    public void setColor(String x){
        this.color = x;
    }
    public void setMetalizado(boolean x){
        this.metalizado= x;
    }
    public void setMatricula(String x){
        this.matricula= x;
    }
    public void setTipoCoche(String x){
        this.tipoCoche= x;
    }
    public void setAnyoFabricacion(int x){
        this.anyoFabricacion= x;
    }
    public void setSeguro(String x){
        this.seguro= x;
    }

    public void verInformacion(){
        System.out.println("INFORMACIÓN DEL VEHICULO");
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Metalizado: " + metalizado);
        System.out.println("Tipo Coche: " + tipoCoche);
        System.out.println("Año de Fabricacion: " + anyoFabricacion);
        System.out.println("Seguro: " + seguro);
        System.out.println("");
    }
}
