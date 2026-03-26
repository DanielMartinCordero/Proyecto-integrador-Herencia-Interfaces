package Entidades;

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
        if(getSalud() >= cantidadRecibida){
            setSalud(getSalud() - cantidadRecibida);
            System.out.println("Daño recibido: "+cantidadRecibida);
            System.out.println("Salud actual: "+getSalud());
        }
        else{
            System.out.println("Daño recibido: "+getSalud());
            setSalud(0.00);
            System.out.println("Salud actual: "+getSalud());
        }
    }
    public abstract void gritoBatalla();

    public void subirNivelActual(double nivelesAñadidos){
        setNivelActual(getNivelActual() + nivelesAñadidos);
    }

    public String getNombre() {
        return nombre;
    }
    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getNivelActual() {
        return nivelActual;
    }
    protected void setNivelActual(double nivelActual) {
        this.nivelActual = nivelActual;
    }
    public double getSalud() {
        return salud;
    }
    protected void setSalud(double salud) {
        this.salud = salud;
    }
}
