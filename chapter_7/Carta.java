package chapter_7;

public class Carta {

    // Esta Clase representa una carta del juego
    private final String cara; // cara de la carta (As, Dos, Tres, Cuatro, ...)
    private final String palo; // palo de la carta (Corazones, Diamantes, Espadas, Treboles)

    public Carta(String caraDeLaCarta, String paloDeLaCarta) {
        cara = caraDeLaCarta;
        palo = paloDeLaCarta;
    }

    public String toString() {
        return cara + " de " + palo;
    }

}
