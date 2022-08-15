package chapter_10;

public abstract class SA_Empleado {

    // Superclase Abstracta (SA_Empleado)
    // campos
    private final String primerNombre;
    private final String primerApellido;
    private final String numeroDeSeguroSocial;

    // constructor
    public SA_Empleado(String primerNombre, String primerApellido, String numeroDeSeguroSocial) {
        this.primerNombre = primerNombre;
        this.primerApellido = primerApellido;
        this.numeroDeSeguroSocial = numeroDeSeguroSocial;
    }

    // método para obtener mi nombre
    public String obtenerPrimerNombre() {
        return primerNombre;
    }

    // método para obtener mi apellido
    public String obtenerPrimerApellido() {
        return primerApellido;
    }

    // método para obtener mi número de seguro social
    public String obtenerNumeroDeSeguroSocial() {
        return numeroDeSeguroSocial;
    }

    // método abstracto para las subclases concretas e indirectas
    public abstract double calcularIngresos(); // aquí no hay implementación, aún...
    
    // método sobrescrito para devolver representación String del objeto 'SA_Empleado'
    @Override
    public String toString() {
        return String.format("Nombre: %s %s%nNúmero de Seguro Social: %s", primerNombre, primerApellido, numeroDeSeguroSocial);
    }

}
