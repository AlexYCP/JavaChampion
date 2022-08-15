package chapter_4;

import java.util.Scanner;

public class Ejemplo_Algoritmo_1 {

    public static void main(String[] args) {

        // Ejemplo_Algoritmo_1
        /*
        Una universidad ofrece un curso que prepara a los estudiantes para el examen estatal de certificación como corredores de
        bienes raíces. El año pasado, diez de los estudiantes que completaron este curso tomaron el examen. La universidad desea
        saber qué tan bien se desempeñaron sus estudiantes en el examen. A usted se le ha pedido que escriba un programa para
        sintetizar los resultados. Se le dio una lista de estos 10 estudiantes. Junto a cada nombre hay un 1 escrito, si el estudiante
        aprobó el examen, o un 2 si lo reprobó.
        
        Su programa debe analizar los resultados del examen de la siguiente manera:
        1. Introducir cada resultado de la prueba (es decir, un 1 o un 2). Mostrar el mensaje “Escriba el resultado” en la
        pantalla, cada vez que el programa solicite otro resultado de la prueba.
        2. Contar el número de resultados de la prueba, de cada tipo.
        3. Mostrar un resumen de los resultados de la prueba, indicando el número de estudiantes que aprobaron y que
        reprobaron.
        4. Si más de ocho estudiantes aprobaron el examen, imprimir el mensaje “Bono para el instructor!”.
        
        Después de leer cuidadosamente el enunciado del programa, hacemos las siguientes observaciones:
        1.El programa debe procesar los resultados de la prueba para 10 estudiantes. Puede usarse un ciclo controlado por contador,
        ya que el número de resultados de la prueba se conoce de antemano.
        2.Cada resultado de la prueba tiene un valor numérico, ya sea 1 o 2. Cada vez que el programa lee un resultado de la prueba,
        debe determinar si el número es 1 o 2. Nosotros evaluamos un 1 en nuestro algoritmo. Si el número no es 1, suponemos que es un 2.
        3.Dos contadores se utilizan para llevar el registro de los resultados del examen: uno para contar el número de estudiantes que
        aprobaron el examen y otro para contar el número de estudiantes que reprobaron el examen.
        4. Una vez que el programa ha procesado todos los resultados, debe decidir si más de ocho estudiantes aprobaron el examen.
        
        Veamos ahora el refinamiento de arriba a abajo, paso a paso. Comencemos con la representación del pseudocódigo de la cima:
        Analizar los resultados del examen y decidir si debe pagarse un bono o no
        
        Una vez más, la cima es una representación completa del programa, pero es probable que se necesiten varios refinamientos antes
        de que el pseudocódigo pueda evolucionar de manera natural en un programa en Java. Nuestro primer refinamiento es:
        Inicializar variables
        Introducir las 10 calificaciones del examen y contar los aprobados y reprobados
        Imprimir un resumen de los resultados del examen y decidir si debe pagarse un bono
        
        Aquí también, aun cuando tenemos una representación completa del programa, es necesario refinarla.
        Ahora nos comprometemos con variables específicas. Se necesitan contadores para registrar los aprobados y reprobados,
        utilizaremos un contador para controlar el proceso de los ciclos y necesitaremos una variable para guardar la entrada
        del usuario. La variable en la que se almacenará la entrada del usuario no se inicializa al principio del algoritmo,
        ya que su valor proviene del usuario durante cada iteración del ciclo. La instrucción en pseudocódigo:
        Inicializar variables
        
        Puede refinarse de la siguiente manera:
        Inicializar aprobados en cero
        Inicializar reprobados en cero
        Inicializar contador de estudiantes en uno
        
        Observe que sólo se inicializan los contadores al principio del algoritmo. La instrucción en pseudocódigo:
        Introducir las 10 calificaciones del examen, y contar los aprobados y reprobados
        
        ...Requiere un ciclo en el que se introduzca de manera sucesiva el resultado de cada examen. Sabemos de antemano que hay
        precisamente 10 resultados del examen, por lo que es apropiado utilizar un ciclo controlado por contador. Dentro del ciclo
        (es decir, anidado dentro del ciclo), una estructura de selección doble determinará si cada resultado del examen es
        aprobado o reprobado, e incrementará el contador apropiado. Entonces, el refinamiento del pseudocódigo anterior es:
        Mientras el contador de estudiantes sea menor o igual que 10
            Pedir al usuario que introduzca el siguiente resultado del examen
            Recibir como entrada el siguiente resultado del examen
            Si el estudiante aprobó
                Sumar uno a aprobados
            De lo contrario
                Sumar uno a reprobados
            Sumar uno al contador de estudiantes
        
        La instrucción en pseudocódigo:
        Imprimir un resumen de los resultados de los exámenes y decidir si debe pagarse un bono
        
        ...Puede refinarse de la siguiente manera:
        Imprimir el número de aprobados
        Imprimir el número de reprobados

        Si más de ocho estudiantes aprobaron
            Imprimir “Bono para el instructor!”
        
        Segundo refinamiento completo en seudocódigo y conversión a la clase Ejemplo_Algoritmo_1.
        El segundo refinamiento completo aparece en el sig. fragmento, abajo.
        Este pseudocódigo está ahora lo bastante refinado para su conversión a Java. 
        
        Algoritmo final en pseudocódigo:
        int resultadoAprobatorio = 0;
        int resultadoReprobatorio = 0;
        int contador = 1;
        
        Mientras que contador sea menor o igual a 10
            Pedir el resultado del alumno (escribir 1 si aprobó o 2 si reprobó)
            Almacenar el resultado en resultadoDelAlumno
            
            Si resultadoDelAlumno es igual a 1
                Sumar 1 a resultadoAprobatorio
            De lo contrario
                Sumar 2 a resultadoReprobatorio
            
            Sumar uno al contador
            
        Mostrar el resumen de los resultados de la prueba
        
        Si resultadoAprobatorio es mayor o igual a 8
            Imprimir por pantalla "¡Bono para el Instructor!"
        
         */
        Scanner entrada = new Scanner(System.in);

        int resultadoAprobatorio = 0;
        int resultadoReprobatorio = 0;
        int contador = 1;

        while (contador <= 10) {
            System.out.println("Escribe el resultado del alumno:");
            var resultadoDelAlumno = entrada.nextInt();

            if (resultadoDelAlumno == 1) {
                resultadoAprobatorio += 1;
            } else {
                resultadoReprobatorio += 1;
            }

            contador += 1;
        }

        System.out.printf("%nResumen de resultados:%nAlumnos aprobados: %d%nAlumnos reprobados: %d",
                resultadoAprobatorio, resultadoReprobatorio);

        if (resultadoAprobatorio >= 8) {
            System.out.printf("%n%n¡Bono para el Instructor!");
        } else {
            System.out.println("%n%n¡Lo sentimos!, no se obtuvo el número de estudiantes aprobados"
                    + " para posteriormente, otorgarle el bono al Instructor.");
        }

    }
}
