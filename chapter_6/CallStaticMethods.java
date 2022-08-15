package chapter_6;

public class CallStaticMethods {

    public static void main(String[] args) {

        // En el sig. método printf imprimí una literal de cadena acompañada por mis dos métodos estáticos
        System.out.printf("Hola, mi nombre es %s y tengo %d años.", StaticMethods.nombrecompleto(), StaticMethods.edad());

    }

}
