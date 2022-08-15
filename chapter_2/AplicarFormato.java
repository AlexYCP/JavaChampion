package chapter_2;

public class AplicarFormato {

    public static void main(String[] args) {

        // Métodos absolutos para imprimir texto.
        System.out.println("A continuación, los métodos absolutos para mostrar texto por pantalla::");
        System.out.printf("%s%n%s%n%s%n",
                "System.out.println();",
                "System.out.print();",
                "System.out.printf();");

        // Cómo imprimir texto con "printf"
        /*
        La línea 21 llama al método System.out.println para mostrar la salida del programa.
        La llamada al método especifica tres argumentos. Cuando un método requiere varios argumentos,
        éstos se colocan en una lista separada por comas. Al proceso de llamar a un método también se le
        conoce como invocar un método.
         */
        System.out.printf("%s%n%s%n", "Bienvenido", "Alexander");
        /* 
        Al contenido de cualquiera de los tres métodos para imprimir texto por pantalla se les atribuye 
        el nombre de argumento (si es solo uno)o argumentos (si son más de uno).
         */

    }
}
