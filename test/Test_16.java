package test;

public class Test_16 {

    // variables de instancia estáticas creadas para ser referenciadas por los métodos estáticos posteriores
    private static String nombres = "Alexander Yosimar";
    private static String apellidos = "Cervantes Pineda";
    
    // método estático para invocar a mis nombres cuando los llame
    public static String obtenerNombres() {
        return nombres;
    }
    
    // método estático para invocar a mis apellidos cuando los llame
    public static String obtenerApellidos() {
        return apellidos;
    }
    
}
