package chapter_4;

public class IS_Anidada_Logica_1 {

    private String nombre;
    private int c_1;
    private int c_2;
    private int c_3;
    private int c_4;
    private int promedioFinal;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setC_1(int c_1) {
        this.c_1 = c_1;
    }

    public int getC_1() {
        return c_1;
    }

    public void setC_2(int c_2) {
        this.c_2 = c_2;
    }

    public int getC_2() {
        return c_2;
    }

    public void setC_3(int c_3) {
        this.c_3 = c_1;
    }

    public int getC_3() {
        return c_3;
    }

    public void setC_4(int c_4) {
        this.c_4 = c_4;
    }

    public int getC_4() {
        return c_4;
    }

    public void calcularPromedio() {
        promedioFinal = (c_1 + c_2 + c_3 + c_4) / 4;
    }

    public int imprimirResultado() {
        if (promedioFinal >= 9) {
            if (promedioFinal <= 10) {
                System.out.printf("%n%s obtuvo A de calificación.", nombre);
            } else if (promedioFinal >= 8) {
                System.out.printf("%n%s obtuvo B de calificación.", nombre);
            } else if (promedioFinal >= 7) {
                System.out.printf("%n%s obtuvo C de calificación.", nombre);
            } else if (promedioFinal >= 6) {
                System.out.printf("%n%s obtuvo D de calificación.", nombre);
            } else {
                System.out.printf("%n%s obtuvo F de calificación.", nombre);
            }
        }
        return promedioFinal;
    }

}
