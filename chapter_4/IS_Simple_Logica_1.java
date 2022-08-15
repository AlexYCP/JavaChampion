package chapter_4;

public class IS_Simple_Logica_1 {

    // materias escolares
    private int c_matematicas;
    private int c_español;
    private int c_fisica;
    private int c_historia;
    private int promedioEscolar;

    // establecer las calificaciones con los métodos Getter y Setter
    // calificación de matemáticas
    public void setC_matematicas(int matematicas) {
        c_matematicas = matematicas;
    }

    public int getC_matematicas() {
        return c_matematicas;
    }

    // calificación de español
    public void setC_español(int español) {
        c_español = español;
    }

    public int getC_español() {
        return c_español;
    }

    // calificación de fisica
    public void setC_fisica(int fisica) {
        c_fisica = fisica;
    }

    public int getC_fisica() {
        return c_fisica;
    }

    // calificación de historia
    public void setC_historia(int historia) {
        c_historia = historia;
    }

    public int getC_historia() {
        return c_historia;
    }

    // método para calcular el promedio
    public void calcularPromedio() {
        promedioEscolar = (c_matematicas + c_español + c_fisica + c_historia) / 4;
    }

    /*
    método para verificar si aprobé o no con ayuda de la instrucción de selección simple y mostrar
    el resultado por pantalla.
     */
    public void imprimirPromedio() {
        if (promedioEscolar >= 6) {
            System.out.printf("Aprobado con %s de calificación.", promedioEscolar);
        }
    }

}
