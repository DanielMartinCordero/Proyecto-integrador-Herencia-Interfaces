import Entidades.*;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Guerrero guerrero = new Guerrero("Bárbaro", 6);
        Mago mago = new Mago("Gandalf", 3, 120);
        Clerigo clerigo = new Clerigo("Profeta", 2);

        Personaje[] batallon =  {guerrero,mago,clerigo};
        System.out.println("==== GRITOS DE LOS PERSONAJES ====");
        for(int i = 0; i<batallon.length;i++){
            batallon[i].gritoBatalla();
        }
        System.out.println("==== FIN GRITOS ====");

        System.out.println("==== GUERRERO ATACA A MAGO ====");
        guerrero.ataque(mago);

        System.out.println("==== MAGO ATACA A GUERRERO (10)====");
        mago.ataque(guerrero);
        System.out.println("==== CLÉRIGO CURA A GUERRERO (20)====");
        clerigo.curacion(guerrero);

        mago.subirNivelActual(10);
        System.out.println("==== MAGO ATACA A GUERRERO (30)====");
        mago.ataque(guerrero);



        System.out.println("==== CLÉRIGO CURA A MAGO ====");
        clerigo.curacion(mago);
    }
}
