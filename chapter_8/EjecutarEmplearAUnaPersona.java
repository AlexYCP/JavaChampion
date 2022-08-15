package chapter_8;

public class EjecutarEmplearAUnaPersona {

    public static void main(String[] args) {

        // Demostración de las clases 'EstablecerFecha' y 'EmplearAUnaPersona'
        EstablecerFecha fn = new EstablecerFecha(31, 8, 1998);
        EstablecerFecha fc = new EstablecerFecha(1, 2, 2022);
        EmplearAUnaPersona ep = new EmplearAUnaPersona("Alexander", "Pineda", fn, fc);

        System.out.println(ep);

    }

}
