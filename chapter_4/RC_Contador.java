package chapter_4;

import java.util.Scanner;

public class RC_Contador {

    public static void main(String[] args) {

        // Repetición controlada por un contador.
        // Calcula tu promedio, introduce tus calificaciones desde el teclado.
        /*
        Algoritmo en pseudocódigo:
        Inicializa la variable total con valor cero
        Inicializa la variable contador con valor uno
        
        Mientras que contador sea menor o igual que siete
            Solicita introducir tu calificación
            Define la variable calificación e introducela desde el teclado
            Agrega la calificación a la variable total
            Suma uno al contador
            
        Define la variable promedio y calculalo
        
        Imprime el promedio
         */
        Scanner entrada = new Scanner(System.in);

        var total = 0;
        var contador = 1;

        while (contador <= 7) {
            System.out.println("Introduce tu calificación:");
            var calificacion = entrada.nextInt();
            total = total + calificacion;
            contador += 1;
        }

        var promedio = (total / 7);

        System.out.printf("El promedio del alumno es: %d de calificación.", promedio);

    }
}
