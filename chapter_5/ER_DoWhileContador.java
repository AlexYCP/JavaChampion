package chapter_5;

public class ER_DoWhileContador {

    public static void main(String[] args) {

        // Estructura de repetición 'do-while'.
        /*
        La estructura de repetición 'do-while' primero imprime la instrución que contenga el cuerpo de la palabra reservada 'do',
        después evalúa la condición, se cumpla o no se cumpla la condición, siempre mostrará la primera iteración de su cuerpo
        entre paréntesis, a diferencia del ciclo repetitivo 'while', que lo que hace primero es evaluar la condición, pero
        en este caso puede imprimir la literal de cadena con sus variables o no mostrar nada ya que, esto depende de si
        la condición se cumple o de igual forma a lo anterior, tampoco se cumple.
         */
        // ejemplo 1:
        int contador = 1;

        do {
            System.out.printf("%d, ", contador);
            contador++;
        } while (contador <= 10);

    }

}
