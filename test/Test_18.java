package test;

public class Test_18 {

    public static void main(String[] args) {

        // Método stático o método de Clase
        // ejemplo
        // llamo al método estático 'getNombreCompleto' para imprimir por pantalla mi nombre
        // sintaxis: nombreDeLaClase.nombreDelMetodoEstatico(argumentos);
        System.out.printf("Mis nombres son %s, mis apellidos son %s y mi nombre completo es %s",
                Test_16.obtenerNombres(), Test_16.obtenerApellidos(), Test_17.nombreCompleto());

    }

}
