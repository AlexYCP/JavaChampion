package chapter_8;

public class CS_EjecucionDeTiempo {

    public static void main(String[] args) {

        // Constructores sobrecargados
        // formato de tiempo
        CS_LogicaDeTiempo tiempo_1 = new CS_LogicaDeTiempo(); // 00:00:00
        CS_LogicaDeTiempo tiempo_2 = new CS_LogicaDeTiempo(1); // 01:00:00
        CS_LogicaDeTiempo tiempo_3 = new CS_LogicaDeTiempo(9, 26); // 02:26:00
        CS_LogicaDeTiempo tiempo_4 = new CS_LogicaDeTiempo(17, 43, 59); // 05:43:59
        CS_LogicaDeTiempo tiempo_5 = new CS_LogicaDeTiempo(tiempo_4); // 05:43:59

        imprimirTiempo("tiempo_1: todos los argumentos se establecieron de forma predeterminda", tiempo_1);
        imprimirTiempo("tiempo_2: hora especificada; minuto y segundo establecidos de forma predeteminada", tiempo_2);
        imprimirTiempo("tiempo_3: hora y minuto especificados; segundo establecido de forma predeterminada", tiempo_3);
        imprimirTiempo("timepo_4: hora, minuto y segundo especificados", tiempo_4);
        imprimirTiempo("tiempo_5: se especificó el objeto \"CS_LogicaDeTiempo\" con el nombre \"tiempo_4\"", tiempo_5);

        // test
        try {
            CS_LogicaDeTiempo tiempo_6 = new CS_LogicaDeTiempo(25, 63, 84);
        } catch (IllegalArgumentException e) {
            System.out.printf("%nExcepción al inicializar \"tiempo_6\": %s%n", e.getMessage());
        }

    }

    private static void imprimirTiempo(String encabezado, CS_LogicaDeTiempo tiempo) {
        System.out.printf("%s%nFormato de hora universal: %s%nFormato de hora: %s%n",
                encabezado, tiempo.crearFormatoDeHoraUniversal(), tiempo.crearFormatoDeHora());
    }

}
