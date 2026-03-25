package personajes;

import interfaces.Atacar;

public class Mago extends Personaje implements Atacar {
    public Mago(String nombre, double nivelActual, double salud) {
        super(nombre, nivelActual, salud);
    }
    public Mago(String nombre, double nivelActual){
        super(nombre, nivelActual);
    }
    @Override
    public void ataque(Personaje objetivo){
        gritoBatalla();

        if(super.nivelActual >5){
            objetivo.recibirDaño(30.00);
        }
        else{
            objetivo.recibirDaño(10.00);
        }
    }
    @Override
    public void gritoBatalla(){
        System.out.println("¡Fuego y destrucción!");
    }
}
