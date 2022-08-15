package chapter_6;

public class StaticMethods {

    // variables de instancia estáticas para ser referenciadas por los métodos estáticos posteriores
    static String nombreCompleto = "Alexander Yosimar Cervantes Pineda";
    static int edad = 23;

    // método estático para invocar a mi nombre completo cuando lo llame
    public static String nombrecompleto() {
        return nombreCompleto;
    }

    // método estático para invocar a mi edad cuando lo llame
    public static int edad() {
        return edad;
    }

}
