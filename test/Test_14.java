package test;   

import java.util.Scanner;

public class Test_14 {

    public static void main(String[] args) {

        // Test 14
        // Operador lógico AND (&&) para evaluar dos condiciones:
        /*
        Tabla de verdad de todas las posibles combinaciones:
        
        Expresión 1     Expresión 2     Expresión 1 && Expresión 2
        ----------------------------------------------------------
        true            false           false
        ----------------------------------------------------------
        true            true           true
        ----------------------------------------------------------
        false           true           false
        ----------------------------------------------------------
        false           false          false
        
        Dato excepcional:
        Si la primera condición se evalúa como false en automático se provocará un 'corto circuito' y la segunda expresión ya no se
        evaluará.
        
        Dato excepcional:
        Algunos programadores consideran que la condición combinada presentada a continuación es más legible si se agregan paréntesis
        redundantes, como por ejemplo:
        
        if ((expresion_1) && (expresion_2))
         */
        
        /*
        Ejercicio:
        Una Institución filantrópica junto con una empresa me solicitan para desarrollar un programa que nos ayude a destinar ocho
        tipos de recursos hacia mujeres mayores de 67 años y hombres mayores de 68 años, el recurso de tipo cero se destinará a las
        mujeres y el recurso de tipo uno a los hombres. Ayudanos a identificar el tipo de recurso que pertenece a cada grupo de género.
         */
        Scanner entrada = new Scanner(System.in);

        // variables globales
        int contador = 0;
        int recurso_0 = 0;
        int recurso_1 = 0;

        // mensaje de bienvenida
        System.out.println("Hola, bienvenid@ al programa de destinación de recursos.\n");

        // ciclo iterativo por un contador
        while (contador < 8) {
            // preincrementar al contador en uno
            ++contador;

            // introducir el tipo de género
            System.out.println("Escribe '0' si se trata de mujeres o '1' si se trata de hombres:");
            int genero = entrada.nextInt();

            // introducir la edad
            System.out.println("Escribe la edad:");
            int edad = entrada.nextInt();

            // estructura de selección simple y anidada
            if (genero == 0 && edad >= 67) {
                ++recurso_0;
            } else if (genero == 1 && edad >= 68) {
                ++recurso_1;
            }

            // salto de línea
            System.out.println("");

        }

        System.out.printf("Muy bien, a continuación presentaremos el informe de destinación de recursos:%n"
                + "Recursos destinados para mujeres mayores de 67 años: %d%n"
                + "Recursos destinados para hombres mayores de 68 años: %d",
                recurso_0, recurso_1);

    }

}
