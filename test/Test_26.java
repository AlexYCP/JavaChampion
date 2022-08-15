package test;

import java.util.ArrayList;

public class Test_26 {

    public static void main(String[] args) {

        // Test 26
        // ejemplo
        ArrayList<Integer> objetos = new ArrayList<>();

        objetos.add(1);
        objetos.add(2);
        objetos.add(3);
        objetos.add(4);
        objetos.add(5);
        objetos.add(6);

        imprimirResultado(objetos, "Indice\tElemento%n");

    }

    public static void imprimirResultado(ArrayList<Integer> objetos, String encabezado) {
        System.out.printf(encabezado);

        for (int contador = 0; contador < objetos.size(); contador++) {
            System.out.printf("%d\t%d%n", contador, objetos.get(contador));
        }

    }

}
