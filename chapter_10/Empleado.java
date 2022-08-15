package chapter_10;

public abstract class Empleado implements Pagar {

    // campos
    private final String nombre;
    private final String apellido;
    private final String numeroDeSeguroSocial;

    // constructor
    public Empleado(String nombre, String apellido, String numeroDeSeguroSocial) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDeSeguroSocial = numeroDeSeguroSocial;
    }

    // devuelve mi nombre
    public String obtenerNombre() {
        return nombre;
    }

    // devuelve mi apellido
    public String obtenerApellido() {
        return apellido;
    }

    // devuelve mi número de seguro social
    public String obtenerNumeroDeSeguroSocial() {
        return numeroDeSeguroSocial;
    }

    // método sobrescrito
    @Override
    public String toString() {
        return String.format("Nombre: %s%nApellido: %s%nNúmero de seguro social: %s",
                obtenerNombre(), obtenerApellido(), obtenerNumeroDeSeguroSocial());
    }

    /*
    Aún no implementaré el método 'obtenerElMontoDelPago' de la interfaz 'Pagar', porque aún no especifico para qué tipo de cálculo lo
    usaré, pero declaro la clase como 'abstract' porque como mencioné antes, no he implementado dicho método y para no generar un error
    de compilación. Y todo esto para que futuras clases concretas directas o indirectas no tengan que implementar cada una a la
    interfaz para utilizar su método. Solo con el hecho de heredar a esta clase, tendrán el privilegio de implementar el método de
    dicha interfaz.
     */
}
