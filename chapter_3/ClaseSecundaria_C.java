package chapter_3;

public class ClaseSecundaria_C {

    public static void main(String[] args) {

        ClasePrincipal_C constructor_1 = new ClasePrincipal_C("Alexander Yosimar");
        ClasePrincipal_C constructor_2 = new ClasePrincipal_C("María de Jesús");

        System.out.printf("Mi nombre es %s%n", constructor_1.obtenerNombre());
        System.out.printf("El nombre de mi madre es %s%n", constructor_2.obtenerNombre());

    }
}
