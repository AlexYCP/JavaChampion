package chapter_8;

public class EmplearAUnaPersona {

    // Establecer
    private String primerNombre;
    private String primerApellido;
    private EstablecerFecha fechaDeNacimiento;
    private EstablecerFecha fechaDeContratacion;

    /*
    creo el constructor 'EmplearAUnaPersona', creo dos parámetros que hacen referencia a un objeto de tipo String y creo dos parámetros
    más que ahora hacen referencia a un objeto 'EstablecerFecha'
     */
    public EmplearAUnaPersona(String primerNombre, String primerApellido,
            EstablecerFecha fechaDeNacimiento, EstablecerFecha fechaDeContratacion) {
        // asigno los parámetros a sus variables de instancia para inicializar los respectivos valores
        this.primerNombre = primerNombre;
        this.primerApellido = primerApellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.fechaDeContratacion = fechaDeContratacion;
    }

    // devuelve un objeto String de la sig. forma: nombre, fecha de nacimiento, fecha de contratación
    @Override
    public String toString() {
        return String.format("Nombre: %s %s%nFecha de nacimiento: %s%nFecha de contratación: %s",
                primerNombre, primerApellido, fechaDeNacimiento, fechaDeContratacion);
    }

}
