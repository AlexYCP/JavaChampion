package chapter_4;

public class IS_Doble_1 {

    public static void main(String[] args) {

        // Instrucción de selección doble.
        IS_Doble_Logica_1 promedio = new IS_Doble_Logica_1();
        promedio.setC_matematicas(10);
        promedio.setC_ingles(9);
        promedio.setC_biologia(8);
        promedio.setC_computacion(10);
        promedio.calcularPromedio();
        promedio.imprimirPromedio();

    }
}
