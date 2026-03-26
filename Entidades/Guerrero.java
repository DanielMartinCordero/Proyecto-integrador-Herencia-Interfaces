package Entidades;

import interfaces.Atacar;

public class Guerrero extends Personaje implements Atacar {

    public Guerrero(String nombre, double nivelActual, double salud) {
        super(nombre, nivelActual, salud);
    }
    public Guerrero(String nombre, double nivelActual){
        super(nombre, nivelActual);
    }
    @Override
    public void gritoBatalla(){
        System.out.println("¡Por la alianza!");
    }

    @Override
    public void ataque(Personaje objetivo){
        gritoBatalla();
        objetivo.recibirDaño(20.00);
    }
}
