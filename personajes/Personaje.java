package personajes;

public abstract class Personaje {
    protected String nombre;
    protected double nivelActual;
    protected double salud;

    protected Personaje(String nombre, double nivelActual, double salud){
        this(nombre, nivelActual);
        this.salud = salud;
    }
    protected Personaje(String nombre, double nivelActual){
        this.nombre = nombre;
        this.nivelActual = nivelActual;
        this.salud = 100.00;
    }
    public void recibirDaño(double cantidadRecibida){
        if(salud >= cantidadRecibida){
            salud -= cantidadRecibida;
            System.out.println("Daño recibido: "+cantidadRecibida);
            System.out.println("Salud actual: "+salud);
        }
        else{
            System.out.println("Daño recibido: "+salud);
            salud = 0;
            System.out.println("Salud actual: "+salud);
        }
    }
    public abstract void gritoBatalla();

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getNivelActual() {
        return nivelActual;
    }
    public void setNivelActual(double nivelActual) {
        this.nivelActual = nivelActual;
    }
    public double getSalud() {
        return salud;
    }
    public void setSalud(double salud) {
        this.salud = salud;
    }
}
