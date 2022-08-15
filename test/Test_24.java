package test;

import java.util.Arrays;

public class Test_24 {

    public static void main(String[] args) {

        // Test 24
        // ejemplo
        int[] clave_1 = {12345};
        int[] clave_2 = {12345};

        boolean comparacionDeClaves = Arrays.equals(clave_1, clave_2);

        System.out.printf("clave_1 %s clave_2", comparacionDeClaves ? "es igual a" : "no es igual a");

    }

}
