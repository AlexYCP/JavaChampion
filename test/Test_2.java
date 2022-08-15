package test;

public class Test_2 {

    public static void main(String[] args) {

        /*
        En esta clase pude invocar a los métodos con el modificador de acceso 'static' sin crear
        un objeto con el nombre de la clase en la que se crearon.
         */
        Test_1.establecerNombre("Alex");
        System.out.println(Test_1.obtenerNombre());

    }
}
