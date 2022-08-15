package test;

import java.util.ArrayList;

public class Test_28 {

    public static void main(String[] args) {

        // Test 28
        // ejemplo
        ArrayList<Integer> listaDeObjetos = new ArrayList<>();

        for (int indiceDelObjeto = 1; indiceDelObjeto <= 10; indiceDelObjeto++) {
            listaDeObjetos.add(indiceDelObjeto);

        }
        
        System.out.println("Indice\tObjeto");

        for (int contador = 0; contador < listaDeObjetos.size(); contador++) {
            System.out.printf("%d\t%d%n", contador, listaDeObjetos.get(contador));
        }

    }

}
