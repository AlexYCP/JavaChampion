package chapter_8;

public enum LogicaDelLibro {
    // declaro constantes de tipo enum
    JHTP("Java How To Program", "2015"),
    CHTP("C How To Program", "2013"),
    IW3HTP("Internet World Wide Web How To Program", "2012"),
    CPPHTP("C++ How To Program", "2014"),
    VBHTP("Visual Basic How To Program", "2014"),
    VSHARPHTP("Visual Sharp How To Program", "2014");

    // variables de instancia constantes o campos constantes
    private final String titulo;
    private final String anioDelCopyright;

    // constructor de la clase constante
    LogicaDelLibro(String titulo, String anioDelCopyright) {
        this.titulo = titulo;
        this.anioDelCopyright = anioDelCopyright;
    }

    // método de acceso para el campo 'titulo'
    public String obtenerTitulo() {
        return titulo;
    }

    // método de acceso para el campo 'obtenerAnioDelCopyright'
    public String obtenerAnioDelCopyright() {
        return anioDelCopyright;
    }
}
