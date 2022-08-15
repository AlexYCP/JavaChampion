package chapter_6;

import java.security.SecureRandom;
import java.util.Scanner;

public class JuegoCraps {

    // Tipo enum
    // La Clase Secure Random para generar números aleatorios seguros
    /*
    Craps (juego de azar):
    Un jugador tira dos dados. Cada uno tiene seis caras, las cuales contienen uno, dos, tres, cuatro, cinco y seis puntos negros,
    respectivamente. Una vez que los dados dejan de moverse, se calcula la suma de los puntos negros en las dos caras superiores.
    Si la suma es 7 u 11 en el primer tiro, el jugador gana. Si la suma es 2, 3 o 12 en el primer tiro (llamado “Craps”), el
    jugador pierde (es decir, la "casa" gana). Si la suma es 4, 5, 6, 8, 9 o 10 en el primer tiro, esta suma se convierte en
    el "punto" del jugador. Para ganar, el jugador debe seguir tirando los dados hasta que salga otra vez "su punto" (es decir,
    que tire ese mismo valor de punto). El jugador pierde si tira un 7 antes de llegar a su punto.
     */
    /*
    Análisis más detallado, el tipo enum Estado:
    La variable local estadoDeJuego se declara como de un nuevo tipo llamado Estado. El tipo Estado es un miembro private de la clase
    JuegoCraps, ya que sólo se utiliza en ésta clase. Estado se conoce como un tipo enum (enumeración), que en su forma más simple
    declara un conjunto de constantes representadas por identificadores. Una enumeración es un tipo especial de clase, que se introduce
    mediante la palabra clave enum y un nombre para el tipo (en este caso, Estado). Al igual que con las clases, las llaves delimitan
    el cuerpo de una declaración de enum. Dentro de las llaves hay una lista separada por comas de constantes enum, cada una de las
    cuales representa un valor único. Los identificadores en una enum deben ser únicos o diferentes. En el capítulo 8 aprenderá más
    acerca de los tipos enum.
    
    -----Buena práctica de programación-----
    Use sólo letras mayúsculas en los nombres de las constantes enum para que resalten y nos recuerden que no son variables.
    
    A las variables de tipo Estado se les puede asignar sólo una de las tres constantes declaradas en la enumeración (GANASTE,
    CONTINUA, PERDISTE), o se producirá un error de compilación.
    
    -----Buena práctica de programación-----
    El uso de constantes enum (como ESTADO.GANASTE, ESTADO.CONTINUA y ESTADO.PERDISTE) en vez de valores enteros literales (como 0,
    1 y 2) puede hacer que los programas sean más fáciles de leer y de mantener.
    */
    public static final SecureRandom numerosAleatorios = new SecureRandom();
    
    private static String nombre;
    
    private enum ESTADO {GANASTE, CONTINUA, PERDISTE};
    
    private static final int DOS = 2;
    private static final int TRES = 3;
    private static final int SIETE = 7;
    private static final int ONCE = 11;
    private static final int DOCE = 12;

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("¡¡Hola, bienvenid@ al juego de azar CRAPS!!\n"
                + "\n¿Cómo te llamas?:");
        nombre = entrada.nextLine();
        
        int sumaDeDados = tirarDados();
        ESTADO estadoDeJuego; // determino si gano, continuo o pierdo el juego
        int miPunto = 0; // punto si no gano o pierdo en mi primer tiro
        
        //
        switch (sumaDeDados) {
            case SIETE:
            case ONCE:
                estadoDeJuego = ESTADO.GANASTE;
                break;
            case DOS:
            case TRES:
            case DOCE:
                estadoDeJuego = ESTADO.PERDISTE;
                break;
            default:
                estadoDeJuego = ESTADO.CONTINUA;
                miPunto = sumaDeDados;
                System.out.printf("Obtuviste el punto: %d%n", miPunto);
                break;
        }
        
        // mientras siga jugando
        while (estadoDeJuego == ESTADO.CONTINUA) {
            sumaDeDados = tirarDados();
            
            // si mi sig. tiro es igual a mi punto gano, pero si es igual a siete pierdo el juego
            if (sumaDeDados == miPunto) {
                estadoDeJuego = ESTADO.GANASTE;
            } else if (sumaDeDados == SIETE) {
                estadoDeJuego = ESTADO.PERDISTE;
            }
        }
        
        // muestro por pantalla si gané o perdí
        if (estadoDeJuego == ESTADO.GANASTE) {
            System.out.printf("%n¡Felicidades, %s, ganaste el juego!", nombre);
        } else {
            System.out.printf("%n¡Lo sentimos mucho, %s, perdiste el juego!", nombre);
        }
        
    }
    
    // tiro los dados, calculo la suma y muestro el resultado
    public static int tirarDados() {
        int dado_1 = 1 + numerosAleatorios.nextInt(6); // primer dado
        int dado_2 = 1 + numerosAleatorios.nextInt(6); // segundo dado
        
        int sumaDeTiro = dado_1 + dado_2;
        
        // muestro los resultados de este tiro
        System.out.printf("%nResultados del tiro de %s:%nDado uno: %d%nDado dos: %d%nSuman: %d%n",
                nombre, dado_1, dado_2, sumaDeTiro);
        
        return sumaDeTiro;
        
    }    

}
