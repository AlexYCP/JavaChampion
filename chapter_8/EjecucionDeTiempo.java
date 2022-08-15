package chapter_8;

public class EjecucionDeTiempo {

    public static void main(String[] args) {

        //
        // creo e inicializo al objeto 'tiempo'
        LogicaDeTiempo tiempo = new LogicaDeTiempo();

        imprimirTiempo("Después de crear el objeto \"tiempo\":", tiempo);

        // modifico el tiempo e imprimo el tiempo actualizado
        tiempo.establecerTiempo(13, 27, 6);
        imprimirTiempo("Después de llamar al método público \"establecerTiempo\":", tiempo);

        // establezco el tiempo con valores inválidos
        try {
            tiempo.establecerTiempo(100, 100, 100); // valoress fuera del rango establecido
        } catch (IllegalArgumentException e) {
            System.out.printf("Excepción: %s%n", e.getMessage());
        }

        // muestro el tiempo después de establecer valores inválidos
        imprimirTiempo("Después de llamar al método público \"establecerTiempo\" con valores inválidos o fuera del rango"
                + " establecido:", tiempo);

    }

    private static void imprimirTiempo(String texto, LogicaDeTiempo tiempo) {
        System.out.printf("%s%nTiempo universal: %s%nTiempo estándar: %s%n%n", texto, tiempo.formatoUniversal(), tiempo.toString());
    }

}
