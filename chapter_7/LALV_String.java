package chapter_7;

public class LALV_String {
    
    /*
    La elipsis(...) en la lista de parámetros de un método indica que éste recibe un número variable de argumentos de ese tipo
    específico.
    */

    public static String nombre(String... nombre) {
        String total = "";

        for (String n : nombre) {
            total += n;
        }

        return total;
    }

    public static void main(String[] args) {

        // Lista de argumentos de longitud variable
        String primerNombre = "Alexander ",
                segundoNombre = "Yosimar ",
                primerApellido = "Cervantes ",
                segundoApellido = "Pineda";

        System.out.printf("Mi nombre completo es: %s", nombre(primerNombre, segundoNombre, primerApellido, segundoApellido));

        System.out.printf("%nMis nombres son: %s", nombre(primerNombre, segundoNombre));
        System.out.printf("%nMis apellidos son: %s", nombre(primerApellido, segundoApellido));

    }

}
