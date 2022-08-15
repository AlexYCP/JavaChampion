package test;

import java.util.Scanner;

public class Test_20 {

    // método estático para guardar mi nombre
    public static String guardarNombresYApellidos(String... nombres) {
        String total = "";
        
        for (String nombre : nombres) {
            total += nombre;
        }
        
        return total;
    }

    // método estático sobrecargado para guardar mi edad
    public static int guardarNumero(int edad) {
        return edad;
    }

    // método estático sobrecargado para guardar mi número favorito
    public static int guardarNumero(short numeroFavorito) {
        return numeroFavorito;
    }
    
    public static void main(String[] args) {

        // Test 20
        Scanner entrada = new Scanner(System.in);
        
        String nombreCompleto = "Alexander Yosimar Cervantes Pineda",
                nombres = "Alexander Yosimar ",
                apellidos = "Cervantes Pineda";
        
        int edad = 23,
                numeroFavorito = 7;
        
        System.out.printf("Mi nombre completo es %s, tengo la edad de %d años y mi número favorito es el %d",
                guardarNombresYApellidos(nombreCompleto), guardarNumero(edad), guardarNumero(numeroFavorito));
        
        System.out.printf("%nMis apellidos son %s y tengo %d años de edad", guardarNombresYApellidos(apellidos), guardarNumero(edad));
        
        System.out.printf("%nMis nombres son %sy mi número favorito es el %d",
                guardarNombresYApellidos(nombres), guardarNumero(numeroFavorito));
        
    }
    
}
