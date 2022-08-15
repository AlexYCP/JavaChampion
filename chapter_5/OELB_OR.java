package chapter_5;

import java.util.Scanner;

public class OELB_OR {

    public static void main(String[] args) {

        // Operador exclusivo lógico booleano (^):
        /*
        Una condición simple que contiene el operador OR exclusivo lógico booleano (^) es true si y sólo si uno de sus operandos es true
        y el otro es false. Si ambos operandos son true o si los dos son false, toda la condición es false.
        
        Tabla de verdad de todas las posibles combinaciones:
        
        Expresión 1     Expresión 2     Expresión 1 && Expresión 2
        ----------------------------------------------------------
        true            false           true
        ----------------------------------------------------------
        true            true            false
        ----------------------------------------------------------
        false           true            true
        ----------------------------------------------------------
        false           false           false
         */
 /*
        Ejercicio:
        Es Día de Reyes Magos y habrá intercambio de regalos. Hay una caja gigante llena de obsequios que estarán preparados para ser
        compartidos, ahora bien, si obtengo un solo regalo lo conservaré, pero si recibo más de un obsequio, entonces, me daré a la
        tarea de obsequiarlos a una Fundación colectora de juquetes.
         */
        Scanner entrada = new Scanner(System.in);

        System.out.println("Un familiar te dará una sorpresa... ¿cuántos obsequios recibiste?:");
        int familiar_1 = entrada.nextInt();

        System.out.println("Otro familiar te dará otra sorpresa... ¿cuántos obsequios recibiste?:");
        int familiar_2 = entrada.nextInt();

        int regalos = familiar_1 + familiar_2;

        if (familiar_1 >= 1 ^ familiar_2 >= 1) {
            if (regalos == 1) {
                System.out.printf("%nMuy bien, obtuviste %d regalo por parte de tus familiares", regalos);
            } else {
                System.out.printf("%nMuy bien, obtuviste %d regalos por parte de tus familiares", regalos);
            }
        } else {
            System.out.printf("%n¡Perfecto, se donarán %d regalos a la fundación!", regalos);
        }

    }

}
