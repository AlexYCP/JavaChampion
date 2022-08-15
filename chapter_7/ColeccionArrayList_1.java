package chapter_7;

import java.util.ArrayList;

public class ColeccionArrayList_1 {

    public static void main(String[] args) {

        // La Clase ArrayList
        // creo un objeto ArrayList de objetos String usando la notación de diamante '<>'
        ArrayList<String> objetoString = new ArrayList<String>();

        // utilizo al método público 'add' de la clase ArrayList para añadir los sig. nombres de colores
        objetoString.add("rojo"); // añado a 'rojo' en una lista
        objetoString.add(0, "azul"); // añado a 'azul' a la posición 0 (índice) en una lista

        System.out.print("Contenido de la lista 'objetoString' ejecutada por estructura de repetición for controlada por un"
                + " contador: ");

        /*
        utilizo dos métodos públicos de la clase ArrayList: 'size' y 'get'; el primero para obtener la longitud de elementos del objeto
        ArrayList; y el segundo para llamar al elemento en el índice especificado
         */
        for (int elemento = 0; elemento < objetoString.size(); elemento++) {
            System.out.printf("%s, ", objetoString.get(elemento));
        }

        mostrarElementos(objetoString, "\nContenido de la lista 'objetoString' ejecutada por estructura de repetición for mejorada: ");

        // agrego dos nuevos nombres de colores a mi arreglo
        objetoString.add("blanco");
        objetoString.add("negro");

        mostrarElementos(objetoString, "\nNuevos colores añadidos a la lista de objetos String: ");

        // utilizo al método público 'remove' de la clase ArrayList para eliminar los dos sig. elementos de mi objeto ArrayList
        objetoString.remove("rojo");
        objetoString.remove(2);

        System.out.print("\nSe eliminaron los dos nombres de colores: rojo y negro");
        
        mostrarElementos(objetoString, "\nLista de elementos actualizada: ");

        /*
        utilizo al método público 'contains' de la clase ArrayList para verificar si los dos sig. nombres de colores están en mi objeto
        ArrayList apoyandome del operador ternario condicional (?:)
         */
        System.out.printf("%nEl color azul%s está en la lista%n", objetoString.contains("azul") ? "" : " no");
        System.out.printf("El color rojo%s está en la lista%n", objetoString.contains("rojo") ? "" : " no");

        // utilizo al método publico 'size' de la clase ArrayList para obtener el tamaño de elementos de mi objeto ArrayList
        System.out.printf("El tamaño de la lista es de %d elementos", objetoString.size());

    }

    public static void mostrarElementos(ArrayList<String> elementos, String literalDeCadena) {
        System.out.print(literalDeCadena);

        for (String elemento : elementos) {
            System.out.printf("%s, ", elemento);
        }
    }

}
