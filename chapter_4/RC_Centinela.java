package chapter_4;

import java.util.Scanner;

public class RC_Centinela {

    public static void main(String[] args) {

        // Repetición controlada por un centinela.
        // Calcula tu promedio y verifica si aprobaste o no.
        /*
        Algoritmo en pseudocódigo:
        
        Crear la variable total e inicializala con valor de cero
        Crear la variable contador e inicializala con un valor de cero
        
        El programa solicita tu calificación (puede ser el valor centinela)
        Introduce tu calificación (puede ser el valor centinela)
        
        Mientras el usuario no haya introducido el valor centinela
            Agrega tu calificación a la variable total
            Suma uno a la variable contador
            El programa solicita tu calificación (puede ser el valor centinela)
            Introduce tu calificación (puede ser el valor centinela)
        
        Crear la variable promedio y asignar el total dividido entre el contador
        
        Si contador es diferente a cero
            Si promedio es mayor o igual a seis
                Imprime en pantalla "aprobado" y tu promedio
            De no ser así:
                Imprime por pantalla el mensaje "reprobado" y tu promedio
        De no ser así:
            Imprime por pantalla "No es posible dividir números entre cero por ley general en cálculos matemáticos."
         */
        Scanner entrada = new Scanner(System.in);

        // fase de inicialización
        var total = 0;
        var contador = 0;

        // fase de procesamiento
        System.out.println("Introduce tu calificación o escribe \"-1\" para terminar:");
        var calificacion = entrada.nextInt();

        // iterar hasta recibir el valor centinela (-1)
        while (calificacion != -1) {
            total = total + calificacion;
            contador += 1;
            System.out.println("Introduce tu calificación o escribe \"-1\" para terminar:");
            calificacion = entrada.nextInt();
        }

        var promedio = total / contador;

        // fase de terminación
        if (contador != 0) {
            if (promedio >= 6) {
                System.out.printf("Felicidades, aprobaste con una calificación de %d puntos.", promedio);
            } else {
                System.out.printf("Lo sentimos, reprobaste con una calificación de %d puntos.", promedio);
            }
        } else {
            System.out.println("No es posible dividir números entre cero por ley general en cálculos matemáticos.");
        }

    }
}
