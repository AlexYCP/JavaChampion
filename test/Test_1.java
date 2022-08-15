package test;

public class Test_1 {

    /*
    El modificador de acceso 'static' me permite invocarlo desde otra clase sin haber creado
    un objeto con el nombre de la clase en la que se creó.
     */
    static String nombre; // variable de instancia

    public static void establecerNombre(String name) {
        nombre = name;
    }

    public static String obtenerNombre() {
        return nombre;
    }

}
