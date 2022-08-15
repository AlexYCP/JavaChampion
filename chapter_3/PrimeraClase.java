package chapter_3;

public class PrimeraClase {

    private String nombres; // variable de instancia
    private String apellidos; // variable de instancia

    // Método Setter (establecer): establece mis nombres
    /* 
    Se le atribuye el nombre de parámetro al contenido que existe dentro de los paréntesis,
    después del nombre del método.
     */
    public void introducirNombres(String nombres) {
        this.nombres = nombres;
    }

    // Método Getter (obtener): invoca o llama mis nombres
    public String mostrarNombres() {
        return nombres;
    }

    // Método Setter (establecer): establece mis apellidos
    public void introducirApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    // Método Setter (establecer): invoca o llama a mis apellidos
    public String mostrarApellidos() {
        return apellidos;
    }

}
