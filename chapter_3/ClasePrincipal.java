package chapter_3;

public class ClasePrincipal {

    /*
    En este ejercicio no utilicé a la palabra reservada 'this', ya que no establecí variables de
    instancia y variables locales con el mismo nombre.
     */
    private int numeroUno; // variable de instancia
    private int numeroDos; // variable de instancia
    private int resultado; // variable de instancia

    public void establecerNumeroUno(int n_1) {
        numeroUno = n_1;
    }

    public int obtenerNumeroUno() {
        return numeroUno;
    }

    public void establecerNumeroDos(int n_2) {
        numeroDos = n_2;
    }

    public int obtenerNumeroDos() {
        return numeroDos;
    }

    public void realizarSuma(int r) {
        resultado = r;
    }

    public int imprimirSuma() {
        realizarSuma(numeroUno + numeroDos);
        return resultado;
    }
}
