package chapter_7;

import java.util.ArrayList;

public class ColeccionArrayList_2 {

    public static void main(String[] args) {

        // La Clase ArrayList y su forma actualizada de declarar una Clase genérica
        // ejemplo
        // la notación de diamante que aparece por sí sola (<>), indica que infiero en el tipo del elemento del objeto (String)
        ArrayList<String> listaDeObjetos_1 = new ArrayList<>();
        ArrayList<Integer> listaDeObjetos_2 = new ArrayList<>();

        listaDeObjetos_1.add("uno");
        listaDeObjetos_1.add("dos");
        listaDeObjetos_1.add("tres");
        listaDeObjetos_1.add("cuatro");
        listaDeObjetos_1.add("cinco");
        listaDeObjetos_1.add("seis");
        listaDeObjetos_1.add("siete");
        listaDeObjetos_1.add("ocho");
        listaDeObjetos_1.add("nueve");
        listaDeObjetos_1.add("diez");

        for (int indiceDeObjetoInteger = 1; indiceDeObjetoInteger <= 10; indiceDeObjetoInteger++) {
            listaDeObjetos_2.add(indiceDeObjetoInteger);
        }

        resultadoString(listaDeObjetos_1, "Lista de objetos de tipo String: ");
        resultadoInteger(listaDeObjetos_2, "Lista de objetos de tipo Integer: ");

        /*
        listaDeObjetos_1.clear();
        listaDeObjetos_2.clear();
        
        resultadoString(listaDeObjetos_1, "Se eliminó la lista de objetos de tipo String");
        resultadoInteger(listaDeObjetos_2, "Se eliminó la lista de objetos de tipo Integer");
         */
        System.out.print("Lista de objetos de tipo String ejecutada por instrucción de repetición for controlada por un contador: ");

        for (int contador = 0; contador < listaDeObjetos_1.size(); contador++) {
            System.out.printf("%s, ", listaDeObjetos_1.get(contador));
        }

        System.out.print("\nLista de objetos de tipo Integer ejecutada por instrucción de repetición for controlada por un contador: ");

        for (int contador = 0; contador < listaDeObjetos_2.size(); contador++) {
            System.out.printf("%d, ", listaDeObjetos_2.get(contador));
        }

        /*
        System.out.printf("%nIndice de los objetos ArrayList de tipo String: ", listaDeObjetos_1.indexOf(0));
        System.out.printf("%nIndice de los objetos ArrayList de tipo Integer: ", listaDeObjetos_2.indexOf(0));
         */
        System.out.printf("%nLa lista de objetos de tipo String contiene %d elementos", listaDeObjetos_1.size());
        System.out.printf("%nLa lista de objetos de tipo Integer contiene %d elementos", listaDeObjetos_2.size());

        System.out.printf("%nLa lista de objetos de tipo String %s contiene al número uno", listaDeObjetos_1.contains("uno")
                ? "si" : "no");

        System.out.printf("%nLa lista de objetos de tipo Integer %s contiene al número dos", listaDeObjetos_2.contains(2)
                ? "si" : "no");

        /*
        listaDeObjetos_1.remove("tres");
        System.out.print("\nSe removió el número tres de la lista de objetos de tipo String, lista actualizada:\n");
        
        listaDeObjetos_2.remove(3);
        System.out.print("\nSe removió el número cuatro de la lista de objetos de tipo String, lista actualizada:\n");
        
         */
        System.out.println("\nLista de objetos de tipo String:");
        imprimirResultadoConEncabezado("\nIndice\tObjeto\n", listaDeObjetos_1);

        System.out.printf("%nCantidad de objetos de tipo String: %s", listaDeObjetos_1.size());

        System.out.println("\nLista de objetos de tipo Integer:");
        imprimirResultadoConEncabezado(listaDeObjetos_2, "\nIndice\tObjeto\n");

        System.out.printf("%nCantidad de objetos de tipo Integer: %d", listaDeObjetos_2.size());

    }

    public static void resultadoString(ArrayList<String> objetos, String texto) {
        System.out.print(texto);

        for (String objeto : objetos) {
            System.out.printf("%s, ", objeto);
        }

        System.out.println("");
    }

    public static void resultadoInteger(ArrayList<Integer> objetos, String texto) {
        System.out.print(texto);

        for (int objeto : objetos) {
            System.out.printf("%d, ", objeto);
        }

        System.out.println("");
    }

    public static void imprimirResultadoConEncabezado(String encabezado, ArrayList<String> listaDeObjetos) {
        System.out.printf(encabezado);

        for (int contador = 0; contador < listaDeObjetos.size(); contador++) {
            System.out.printf("%d\t%s%n", contador, listaDeObjetos.get(contador));
        }
    }

    public static void imprimirResultadoConEncabezado(ArrayList<Integer> listaDeObjetos, String encabezado) {
        System.out.printf(encabezado);

        for (int contador = 0; contador < listaDeObjetos.size(); contador++) {
            System.out.printf("%d\t%d%n", contador, listaDeObjetos.get(contador));
        }
    }

}
