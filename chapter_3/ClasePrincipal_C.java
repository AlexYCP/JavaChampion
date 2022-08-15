package chapter_3;

public class ClasePrincipal_C {

    private String nombre; // variable de instancia

    // Constructor
    public ClasePrincipal_C(String nombre) {
        this.nombre = nombre;
    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public String obtenerNombre() {
        return nombre;
    }

}
