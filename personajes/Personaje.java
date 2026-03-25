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

    }
    public abstract void gritoBatalla();
}
