package chapter_7;

import java.security.SecureRandom;

public class PaqueteDeCartas {

    // Esta Clase representa un paquete de cartas
    private Carta[] paquete; // arreglo de tipo por referencia y de objetos Carta
    private int cartaActual; // índice del número de cartas
    private static final int NUMERO_DE_CARTAS = 52; // número constante de cartas

    // generación de números aleatorios seguros
    private static final SecureRandom numerosAleatorios = new SecureRandom();

    // el Constructor llena el paquete de cartas
    public PaqueteDeCartas() {
        
        String[] cara = {"As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez", "Joker", "Reina", "Rey"};
        String[] palo = {"Corazones", "Diamantes", "Espadas", "Treboles"};

        paquete = new Carta[NUMERO_DE_CARTAS]; // creo un arreglo de objetos Carta
        cartaActual = 0; // la primera carta repartida será el paquete cero (paquete[0])

        // lleno el paquete con objetos Carta
        for (int contador = 0; contador < paquete.length; contador++) {
            paquete[contador] = new Carta(cara[contador % 13], palo[contador / 13]);
        }
        
    }

    // mezclo el paquete de cartas
    public void mezclar() {
        // la siguiente llamada al método repartirCarta debe empezar en paquete[0], otra vez
        cartaActual = 0;

        // para cada carta, selecciona otra carta aleatoria (0 a 51) y las intercambia
        for (int primeraMezcla = 0; primeraMezcla < paquete.length; primeraMezcla++) {
            // selecciona un número aleatorio entre cero y 51
            int segundaMezcla = numerosAleatorios.nextInt(NUMERO_DE_CARTAS);

            // intercambia la carta actual con la carta seleccionada al azar
            Carta temp = paquete[primeraMezcla];
            paquete[primeraMezcla] = paquete[segundaMezcla];
            paquete[segundaMezcla] = temp;

        }

    }

    // reparto una carta
    public Carta repartirCarta() {
        // determina si quedan cartas por repartir
        if (cartaActual < paquete.length) {
            return paquete[cartaActual++]; // devuelve la carta actual en el arreglo
        } else {
            return null; // devuelve null para indicar que se repartieron todas las cartas
        }
        
    }

}
