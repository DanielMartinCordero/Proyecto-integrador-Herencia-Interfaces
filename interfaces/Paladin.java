package interfaces;

public interface Paladin extends Atacar, Curar {
    default void protegerse(){
        System.out.println("El paladín levanta su escudo sagrado y bloquea el ataque");
    }
}
