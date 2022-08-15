package chapter_5;

import java.util.Scanner;

public class OLN_NOT {

    public static void main(String[] args) {

        // Operador lógico de negación NOT (!)
        /*
        El operador ! (NOT lógico, también conocido como negación lógica o complemento lógico) "invierte" el significado de una
        condición. A diferencia de los operadores lógicos &&, ||, &, | y ^, que son operadores binarios que combinan dos
        condiciones, el operador lógico de negación es un operador unario que sólo tiene una condición como operando.
        Este operador se coloca antes de una condición para elegir una ruta de ejecución si la condición original
        (sin el operador lógico de negación) es false, como en el siguiente segmento de código, por ejemplo:
         */
        // llamé al método público de entrada de datos de la Clase Scanner
        Scanner entrada = new Scanner(System.in);

        // introduciré desde el teclado el primer número
        System.out.println("Introduce un número:");
        int numero_1 = entrada.nextInt();

        // introduciré desde el teclado el segundo número
        System.out.println("Ahora, introduce otro número:");
        int numero_2 = entrada.nextInt();

        // declaré una variable de tipo boolean ya que, la condición que contiene devolverá true o false
        boolean resultado_1 = !(numero_1 == numero_2);

        // utlicé el especificador de formato '%b' para obtener un resultado booleano
        System.out.printf("Se obtuvo el primer resultado inverso al original:%n"
                + "Condición de tipo uno: !(numero_1 == numero_2) = %b%n", resultado_1);

        /*
        En la mayoría de los casos, puedo evitar el uso de la negación lógica si expreso la condición en forma distinta, con un operador
        relacional o de igualdad apropiado. Por ejemplo, la instrucción anterior también puede escribirse de la siguiente manera:    
         */
        boolean resultado_2 = numero_1 != numero_2;

        System.out.printf("%nSe obtuvo el segundo resultado inverso al original:%n"
                + "Condición de tipo dos: numero_1 != numero_2 = %b", resultado_2);

    }

}
