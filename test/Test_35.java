package test;

public class Test_35 {

    // Test 35
    // ejemplo
    String miNombre;
    double miEstatura;

    public Test_35() {
        miNombre = "Alexander Yosimar Cervantes Pineda";
        miEstatura = 1.85;
    }

    @Override
    public String toString() {
        return String.format("Hola a todos, mi nombre es %s y mido %.2f cm", miNombre, miEstatura);
    }

}
