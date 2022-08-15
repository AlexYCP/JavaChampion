package chapter_7;

public class PruebaPaqueteDeCartas {

    public static void main(String[] args) {

        // Aplicación para mezclar y repartir las cartas del juego
        PaqueteDeCartas miPaqueteDeCartas = new PaqueteDeCartas();
        miPaqueteDeCartas.mezclar(); // coloca las cartas en orden aleatorio

        // imprime el total de las cartas en el orden en el que se reparten
        for (int i = 1; i <= 52; i++) {
            // reparte e imprime una carta
            System.out.printf("%-21s", miPaqueteDeCartas.repartirCarta());
            // imprime una nueva línea después de cada cuatro cartas
            if (i % 4 == 0) {
                System.out.println("");
            }

        }

    }

}
