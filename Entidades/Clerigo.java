package Entidades;

import interfaces.Paladin;

public class Clerigo extends Personaje implements Paladin {
    public Clerigo(String nombre, double nivelActual, double salud) {
        super(nombre, nivelActual, salud);
    }
    public Clerigo(String nombre, double nivelActual){
        super(nombre, nivelActual);
    }
    @Override
    public void ataque(Personaje objetivo){
        gritoBatalla();

        objetivo.recibirDaño(10);
    }

    @Override
    public void curacion(Personaje objetivo){
        objetivo.setSalud(objetivo.getSalud()+20.00);
    }

    @Override
    public void gritoBatalla(){
        System.out.println("¡La luz me guía!");
    }
}
