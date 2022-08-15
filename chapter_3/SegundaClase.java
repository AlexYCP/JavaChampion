package chapter_3;

import java.util.Scanner;

/* 
A este tipo de clases se les conoce como 'Clases Controladoras', ya que le ordenan a otras clases
lo que debe ejecutarse. En otras palabras, llama a sus métodos para decirle lo que debe hacerse. 
 */
public class SegundaClase {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        // Creo un objeto con el nombre "pc" para llamar a los métodos de la "PrimeraClase"
        PrimeraClase pc = new PrimeraClase();
        /* cuando llamo el método "mostrarNombres" para mostrar lo que hay en la variable "nombres",
        este es inicializado con un valor "null" (nulo) */
        System.out.printf("Mi nombres iniciales son: %s.%n", pc.mostrarNombres());
        System.out.printf("Mis apellidos iniciales son: %s.%n%n", pc.mostrarApellidos());

        System.out.printf("Ahora introduciré mis nombres y mis apellidos, y al último los mostraré.%n%n");

        // introducir mis nombres desde el teclado
        System.out.println("Introduce tus nombres: ");
        String misNombres = entrada.nextLine();
        pc.introducirNombres(misNombres);

        // introducir mis apellidos desde el teclado
        System.out.println("Introduce tus apellidos: ");
        String misApellidos = entrada.nextLine();
        pc.introducirApellidos(misApellidos);

        // muestra el texto final concatenado con las dos variables "nombres" y "apellidos"
        System.out.printf("\n Mis nombres son: %s y mis apellidos son: %s.",
                pc.mostrarNombres(), pc.mostrarApellidos());

    }
}
