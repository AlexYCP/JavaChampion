package chapter_3;

import java.util.Scanner;

public class PruebaCuenta {

    public static void main(String[] args) {

        Cuenta cuenta_1 = new Cuenta("Alexander", 50.00);
        Cuenta cuenta_2 = new Cuenta("Alejandro", -7.53);

        // muestro el saldo inicial de cada objeto
        cuenta_1.imprimirSaldo();
        cuenta_2.imprimirSaldo();

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escriba el monto a depositar para Cuenta 1:");
        double montoDeposito = entrada.nextDouble();

        System.out.printf("Sumando $%.2f al saldo de Cuenta 1...%n", montoDeposito);
        cuenta_1.establecerDeposito(montoDeposito);

        // muestra los saldos de las dos cuentas bancarias
        cuenta_1.imprimirSaldo();
        cuenta_2.imprimirSaldo();

        System.out.println("Escriba el monto a depositar para Cuenta 2:");
        montoDeposito = entrada.nextDouble();

        System.out.printf("Sumando $%.2f al saldo de Cuenta 2...%n", montoDeposito);
        cuenta_2.establecerDeposito(montoDeposito);

        // muestra los saldos de las dos cuentas bancarias
        cuenta_1.imprimirSaldo();
        cuenta_2.imprimirSaldo();

        // retiro de dinero de mi saldo total
        // especifico la cantidad de dinero que deseo retirar de la Cuenta 1
        System.out.println("Escribe la cantidad a retirar de la Cuenta 1:");
        double retiroMonetario = entrada.nextDouble();

        // se ejecuta el retiro de dinero para la Cuenta 1
        System.out.printf("Retirando $%.2f de la Cuenta 1...%n", retiroMonetario);
        cuenta_1.retirarDinero(retiroMonetario);

        // muestro los saldos actualizados de las dos cuentas
        cuenta_1.imprimirSaldo();
        cuenta_2.imprimirSaldo();

        // ahora, especifico la cantidad de dinero que deseo retirar de la Cuenta 2
        System.out.println("Escribe la cantidad a retirar de la Cuenta 2:");
        retiroMonetario = entrada.nextDouble();

        // se ejecuta el retiro de dinero para la Cuenta 2
        System.out.printf("Retirando $%.2f de la Cuenta 2...%n", retiroMonetario);
        cuenta_2.retirarDinero(retiroMonetario);

        // muestro los saldos actualizados de las dos cuentas
        cuenta_1.imprimirSaldo();
        cuenta_2.imprimirSaldo();

    }
}
