package chapter_4;

public class IS_Doble_Logica_1 {

    private int c_matematicas;
    private int c_ingles;
    private int c_biologia;
    private int c_computacion;
    private int promedioUniversitario;

    public void setC_matematicas(int matematicas) {
        c_matematicas = matematicas;
    }

    public int getC_matematicas() {
        return c_matematicas;
    }

    public void setC_ingles(int ingles) {
        c_ingles = ingles;
    }

    public int getC_ingles() {
        return c_ingles;
    }

    public void setC_biologia(int biologia) {
        c_biologia = biologia;
    }

    public int getC_biologia() {
        return c_biologia;
    }

    public void setC_computacion(int computacion) {
        c_computacion = computacion;
    }

    public int getC_computacion() {
        return c_computacion;
    }

    public void calcularPromedio() {
        promedioUniversitario = (c_matematicas + c_ingles + c_biologia + c_computacion) / 4;
    }

    public void imprimirPromedio() {
        if (promedioUniversitario >= 6) {
            System.out.printf("%nMuy bien, aprobaste con %d de calificación.", promedioUniversitario);
        } else {
            System.out.printf("%nLo sentimos, reprobaste con %d de calificación.", promedioUniversitario);
        }
    }

}
