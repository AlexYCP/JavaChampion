package chapter_3;

public class Nombre {

    private String nombre; // variable de instancia

    /*
    Aquí creo una variable local con un parámetro de tipo String que se llamará al igual que la variable de
    instancia 'nombre'.
     */
    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public String obtenerNombre() {
        return nombre;
    }

}
