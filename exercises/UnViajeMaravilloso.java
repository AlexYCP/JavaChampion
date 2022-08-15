package ejercicios;

import java.util.Scanner;

public class UnViajeMaravilloso {

    public static void main(String[] args) {

        // Un Viaje Maravilloso
        // demostración
        Scanner entrada = new Scanner(System.in);

        System.out.println("La alarma sonará en unos momentos...\nAlarma sonando...");
        String horaDeCantarDeLaAlarma = entrada.nextLine();

        if (horaDeCantarDeLaAlarma.equals("Apagar") || horaDeCantarDeLaAlarma.equals("apagar")
                || horaDeCantarDeLaAlarma.equals("APAGAR")) {
            System.out.println("Muy bien, dormilón, acabas de apagar la alarma, eso quiere decir que ya estás despierto..."
                    + "\nAhora, ¿ya te levantaste de la cama?");
            String despertarYLevantarmeDeLaCama = entrada.nextLine();

            if (despertarYLevantarmeDeLaCama.equals("SI") || despertarYLevantarmeDeLaCama.equals("si")
                    || despertarYLevantarmeDeLaCama.equals("Si")) {
                System.out.println("Magnífico, ahora revisa si el desayuno ya está preparado, ¿está listo?");
                String desayunoPreparado = entrada.nextLine();

                if (desayunoPreparado.equals("SI") || desayunoPreparado.equals("si") || desayunoPreparado.equals("Si")) {
                    System.out.println("¡Ya está preparado el desayuno, es hora de comer!..."
                            + "\nPerfecto, ya terminaste tu desayuno, eso quiere decir que es hora de bañarse"
                            + "\nAhora, prende el calentador de agua"
                            + "\nMuy bien, se está calentando..."
                            + "\nVuelve a revisarlo y verifica si tiene 10 minutos o más de encendido para que te puedas bañar con"
                            + "agua caliente"
                            + "\n¿Cuántos minutos lleva encendido el calentador de agua?");
                    int tiempoParaCalentarElAgua = entrada.nextInt();

                    if (tiempoParaCalentarElAgua >= 10) {
                        System.out.println("Excelente, el tiempo suficiente, ya puedes bañarte"
                                + "\nYa terminaste de bañarte es tiempo de que te arropes..."
                                + "\nYa te arropaste?");
                        String arroparme = entrada.nextLine();

                        if (arroparme.equals("Si") || arroparme.equals("si") || arroparme.equals("SI")) {
                            System.out.println("¡Ya te arropaste!"
                                    + "\nAhora revisa si todas las cosas que llevarás para el viaje están preparadas y listas"
                                    + "\n¿Todo el equipaje ya está preparado y listo?");
                            String alistarYEmpacar = entrada.next();

                            if (alistarYEmpacar.equals("Si") || alistarYEmpacar.equals("si") || alistarYEmpacar.equals("SI")) {
                                System.out.println("¡Genial, ya todo está empacado y listo!, sube todo el equipaje al automóvil"
                                        + "\nPerfecto, ahora verifica si Mamá, Rocky y simba Alexa están listos, ¿lo están?");
                                String tripulantesDelViaje = entrada.nextLine();

                                if (tripulantesDelViaje.equals("Si") || tripulantesDelViaje.equals("Si")
                                        || tripulantesDelViaje.equals("Si")) {
                                    System.out.println("¡Incríble, es hora de que aborden el automóvil eléctrico!"
                                            + "\nPor último, revisa si la batería del automóvil eléctrico tiene 70% o más"
                                            + "\n¿Cuánta batería tiene?");
                                    int cargaDeLaBateriaDelAuto = entrada.nextInt();

                                    if (cargaDeLaBateriaDelAuto >= 70) {
                                        System.out.println("¡Magnífico, es hora de viajar al hermoso y fantástico lugar! :)");
                                    } else {
                                        System.out.printf("Carga de la batería del %d%, por lo tanto, aún no hay la carga suficiente"
                                                + "para el automóvil eléctrico, espera un poco más, por favor",
                                                cargaDeLaBateriaDelAuto);
                                    }
                                } else {
                                    System.out.println("¡Todavía no están listos los hermosos tripulantes, espera a que lo estén!");
                                }

                            } else {
                                System.out.println("El equipaje aún no está empacado y listo, completalo todo");
                            }
                        } else {
                            System.out.println("Aún no te arropas, qué esperas para terminar de arroparte");
                        }

                    } else {
                        System.out.printf("El tiempo del calentador encendido es de %d minutos, por lo tanto, es inferior a los diez"
                                + " minutos necesarios para que se caliente el agua, espera un poco más...", tiempoParaCalentarElAgua);
                    }
                } else {
                    System.out.println("¡Aún no está preparado el desayuno, espera a que mamá lo prepare!...");
                }
            } else {
                System.out.println("¡Aún no te levantas de la cama, levántate ahora mismo para que puedas seguir con todos los"
                        + " preparativos para el grandioso y maravilloso viaje fantástico!");
            }
        }

    }

}
