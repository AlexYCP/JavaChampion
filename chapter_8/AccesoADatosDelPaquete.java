package chapter_8;

public class AccesoADatosDelPaquete {

    public static void main(String[] args) {

        // Acceso a nivel de paquete
        //
        DatosDelPaquete dp = new DatosDelPaquete();

        // imprimo la representación String de 'DatosDelPaquete'
        System.out.printf("Resultado después de instanciar:%n%s", dp);

        // modifico los datos con acceso a nivel de paquete del objeto 'dp'
        dp.nombre = "Batman";
        dp.estatura = 1.84;

        System.out.printf("%nResultado después de modificar los campos:%n%s", dp);

    }

}

// clase con variables de instancia con acceso a nivel de paquete
class DatosDelPaquete {

    String nombre;
    double estatura;

    public DatosDelPaquete() {
        nombre = "Alexander Yosimar";
        estatura = 1.85;
    }

    // devuelvo la representación String del objeto 'DatosDelPaquete'
    @Override
    public String toString() {
        return String.format("Hola, mi nombre es %s y mido %.2f cm", nombre, estatura);
    }

}
