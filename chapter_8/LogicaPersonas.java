package chapter_8;

public class LogicaPersonas {

    // campos o miembros
    private static int cuenta = 0;
    private String nombre;
    private String apellido;

    // constructor
    public LogicaPersonas(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;

        ++cuenta;

        System.out.printf("Constructor de 'LogicaPersonas': nombre: %s %s; cuenta: %d%n", nombre, apellido, cuenta);
    }

    // método de acceso
    public String obtenerNombre() {
        return nombre;
    }

    // método de acceso
    public String obtenerApellido() {
        return apellido;
    }

    // método de acceso
    public static int obtenerCuenta() {
        return cuenta;
    }

}
