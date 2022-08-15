package chapter_3;

import java.util.Scanner;

public class CuentaBancaria {

    private String nombre;
    private double saldo;
    private double deposito;
    private double retiro;

    Scanner entrada = new Scanner(System.in);

    public CuentaBancaria() {
        System.out.println("Hola, bienvenido a Pineda´s Bank.");

        System.out.println("Introduce tu nombre:");
        nombre = entrada.nextLine();

        System.out.println("Deposita tu capital:");
        deposito = entrada.nextDouble();

        if (deposito > 0.0) {
            saldo = deposito;
        }

        System.out.printf("Tu saldo actual es de: $%.2f%n", saldo);

        System.out.println("¿Cuanto dinero deseas añadir a tu cuenta bancaria?");
        deposito = entrada.nextDouble();

        if (deposito > 0.0) {
            saldo = saldo + deposito;
        }

        System.out.printf("Tu saldo actual es de: $%.2f%n", saldo);

        System.out.println("¿Cuánto dinero deseas retirar de tu cuenta bancaria?");
        retiro = entrada.nextDouble();

        if (retiro <= saldo) {
            saldo = saldo - retiro;
        }

        System.out.printf("Tu saldo actual es de: $%.2f", saldo);

    }

}
