package test;

public class Test_36 {

    public static void main(String[] args) {

        // Test 36
        // ejemplo
        Test_35 test = new Test_35();

        System.out.printf("Resultado después de instanciar:%n%s%n", test);

        test.miNombre = "Green Linter";
        test.miEstatura = 1.87;

        System.out.printf("%nResultado depués de modificar los campos:%n%s", test);

    }

}
