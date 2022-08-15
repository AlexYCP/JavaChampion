package chapter_10;

public class Factura implements Pagar {

    // campos
    private final String numeroDePieza;
    private final String descripcionDePieza;
    private double precioPorArticulo;
    private int cantidadDeArticulos;

    // constructor
    public Factura(String numeroDePieza, String descripcionDePieza, double precioPorArticulo, int cantidadDeArticulos) {
        if (precioPorArticulo <= 0.0) {
            throw new IllegalArgumentException("Error. El precio por artículo debe de ser mayor a $0.0");
        }
        if (cantidadDeArticulos <= 0) {
            throw new IllegalArgumentException("Error. La cantidad de artículos debe de ser mayor a 0");
        }

        this.numeroDePieza = numeroDePieza;
        this.descripcionDePieza = descripcionDePieza;
        this.precioPorArticulo = precioPorArticulo;
        this.cantidadDeArticulos = cantidadDeArticulos;
    }

    // devuelve el número de la pieza
    public String obtenerNumeroDePieza() {
        return numeroDePieza;
    }

    // devuelve la descripción de la pieza
    public String obtenerDescripcionDePieza() {
        return descripcionDePieza;
    }

    // establece el precio por artículo
    public void establecerPrecioPorArticulo(double precioPorArticulo) {
        if (precioPorArticulo <= 0.0) {
            throw new IllegalArgumentException("Error. El precio por artículo debe de ser mayor a $0.0");
        }

        this.precioPorArticulo = precioPorArticulo;
    }

    // devuelve el precio por artículo
    public double obtenerPrecioPorArticulo() {
        return precioPorArticulo;
    }

    // establece la cantidad de artículos
    public void establecerCantidadDeArticulos(int cantidadDeArticulos) {
        if (cantidadDeArticulos <= 0) {
            throw new IllegalArgumentException("Error. La cantidad de artículos debe de ser mayor a 0");
        }

        this.cantidadDeArticulos = cantidadDeArticulos;
    }

    // devuelve la cantidad de artículos
    public int obtenerCantidadDeArticulos() {
        return cantidadDeArticulos;
    }

    // método sobrescrito
    @Override
    public String toString() {
        return String.format("Factura:%nNúmero de pieza: #%s%nDescripción de pieza: %s%nPrecio por artículo: $%.2f%nCantidad de artículos: %d",
                obtenerNumeroDePieza(), obtenerDescripcionDePieza(), obtenerPrecioPorArticulo(), obtenerCantidadDeArticulos());
    }

    // método requerido para realizar el contrato con la interfaz 'Pagar'
    @Override
    public double obtenerElMontoDelPago() {
        return obtenerPrecioPorArticulo() * obtenerCantidadDeArticulos();
    }

}
