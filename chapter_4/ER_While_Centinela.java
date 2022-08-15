package chapter_4;

import java.util.Scanner;

public class ER_While_Centinela {

    public static void main(String[] args) {

        // Estructura de repetición While.
        
        /* 
        El desarrollo del algoritmo con el método de refinamiento de arriba a abajo, paso a paso: la cima, el primer refinamiento
        y el segundo refinamiento consta de los sig. pasos:
         */
        /*
        Formulación de algoritmos: repetición controlada por un centinela.
        -----
        Generalicemos el problema para los promedios de una clase. Considere el siguiente problema:
        ----- Algoritmo en pseudocódigo del problema a resolver: -----
        Desarrollar un programa que calcule el promedio de una clase y procese las calificaciones para un número
        arbitrario de estudiantes cada vez que se ejecute.
        -----
        Desarrollo del algoritmo en pseudocódigo con el método de refinamiento de arriba a abajo, paso
        a paso: la cima, el primer refinamiento y el segundo refinamiento.
        
        Vamos a desarrollar el programa para promediar clases con una técnica llamada refinamiento de arriba a abajo, paso a paso,
        la cual es esencial para el desarrollo de programas bien estructurados. Comenzamos con una representación en pseudocódigo
        de la cima, una sola instrucción que transmite la función del programa en general:
        ----- Algoritmo en pseudocódigo del problema a resolver: -----
        Determinar el promedio de la clase para el examen.
        -----
        La cima es, en efecto, la representación completa de un programa. Por desgracia, la cima pocas veces transmite los detalles
        suficientes como para escribir un programa en Java. Por lo tanto, ahora comenzaremos el proceso de refinamiento.
        Dividiremos la cima en una serie de tareas más pequeñas y las listaremos en el orden en el que se van a realizar.
        Esto arroja como resultado el siguiente primer refinamiento:
        ----- Algoritmo en pseudocódigo del problema a resolver: -----
        Inicializar variables
        Introducir, sumar y contar las calificaciones del examen
        Calcular e imprimir el promedio de la clase
        -----
        Este refinamiento utiliza sólo la estructura de secuencia; los pasos aquí mostrados deben ejecutarse en orden,
        uno después del otro.
        -----Observaciones de ingeniería de software:-----
        +Cada refinamiento, así como la cima en sí, es una especificación completa del algoritmo; sólo varía el nivel del detalle.
        +Muchos programas pueden dividirse lógicamente en tres fases: una fase de inicialización, en donde se inicializan las
        variables; una fase de procesamiento, en donde se introducen los valores de los datos y se ajustan las variables del
        programa según sea necesario; y una fase de terminación, que calcula y produce los resultados finales.
        -----
        Cómo proceder al segundo refinamiento:
        
        La anterior observación de ingeniería de software es a menudo todo lo que usted necesita para el primer refinamiento en el
        proceso de arriba a abajo. Para avanzar al siguiente nivel de refinamiento (es decir, el segundo refinamiento),
        nos comprometemos a usar variables específicas. En este ejemplo necesitamos el total actual de los números,
        una cuenta de cuántos números se han procesado, una variable para recibir el valor de cada calificación
        a medida que el usuario las vaya introduciendo, y una variable para almacenar el promedio calculado.
        ----- Algoritmo en pseudocódigo del problema a resolver: -----
        Inicializar las variables.
        ----- Puede mejorarse como sigue: -----
        Inicializar total en cero
        Inicializar contador en cero
        -----
        Sólo las variables total y contador necesitan inicializase antes de que puedan utilizarse. Las variables promedio y
        calificación (para el promedio calculado y la entrada del usuario, respectivamente) no necesitan inicializarse,
        ya que sus valores se reemplazarán a medida que se calculen o introduzcan.
        ----- Algoritmo en pseudocódigo del problema a resolver: -----
        Introducir, sumar y contar las calificaciones del examen
        -----
        Requiere una estructura de repetición que introduzca cada calificación en forma sucesiva. No sabemos de antemano cuántas
        calificaciones van a procesarse, por lo que utilizaremos la repetición controlada por centinela. El usuario introduce
        las calificaciones, una a la vez. Después de introducir la última calificación, el usuario introduce el valor centinela.
        El programa evalúa el valor centinela después de la introducción de cada calificación, y termina el ciclo cuando se
        introduce el valor centinela. Entonces, el segundo refinamiento de la instrucción anterior en pseudocódigo sería:
        ----- Algoritmo en pseudocódigo del problema a resolver: -----
        Pedir al usuario que introduzca la primera calificación
        Recibir como entrada la primera calificación (puede ser el centinela)
        
        Mientras el usuario no haya introducido aún el centinela
            Sumar esta calificación al total actual
            Sumar uno al contador de calificaciones
            Pedir al usuario que introduzca la siguiente calificación
            Recibir como entrada la siguiente calificación (puede ser el centinela)
        -----
        El pseudocódigo es solamente una herramienta informal para desarrollar programas.
        ------ Algoritmo en pseudocódigo del problema a resolver: -----
        Calcular e imprimir el promedio de la clase
        ---- Puede mejorarse de la siguiente manera: -----
        Si el contador no es igual a cero
            Asignar al promedio el total dividido entre el contador
            Imprimir el promedio
        de lo contrario
            Imprimir “No se introdujeron calificaciones”
        -----
        Aquí tenemos cuidado de evaluar la posibilidad de una división entre cero: un error lógico que, si no se detecta,
        haría que el programa fallara o produjera resultados inválidos.
        ----- Algoritmo en pseudocódigo completo -----
        Inicializar total en cero
        Inicializar contador en cero
        
        Pedir al usuario que introduzca la primera calificación
        Recibir como entrada la primera calificación (puede ser el centinela)

        Mientras el usuario no haya introducido aún el centinela
            Sumar esta calificación al total actual
            Sumar uno al contador de calificaciones
            Pedir al usuario que introduzca la siguiente calificación
            Recibir como entrada la siguiente calificación (puede ser el centinela)

        Si el contador no es igual que cero
            Asignar al promedio el total dividido entre el contador
            Imprimir el promedio
        de lo contrario
            Imprimir “No se introdujeron calificaciones”
        -----
        En el algoritmo anterior, incluimos líneas en blanco y sangría en el pseudocódigo para facilitar su lectura.
        Las líneas en blanco separan los algoritmos en sus fases y accionan las instrucciones de control; la sangría
        enfatiza los cuerpos de las estructuras de control.
        
        El algoritmo en pseudocódigo resuelve el problema más general para promediar una clase.
        Este algoritmo se desarrolló después de aplicar dos niveles de refinamiento.
        En ocasiones se requieren más niveles.
         */
        
        /*
        Ejemplo del ejercicio descrito anteriormente e implementación de la repetición controlada por centinela:
        
        Aunque cada calificación es un valor entero, existe la probabilidad de que el cálculo del promedio produzca un número con un
        punto decimal; en otras palabras, un número real (es decir, de punto flotante). El tipo int no puede representar un número
        de este tipo, por lo que esta clase utiliza el tipo double para ello.
        También veremos que las estructuras de control pueden apilarse una encima de otra (en secuencia). La instrucción while
        va seguida por una instrucción if...else en secuencia.
         */
        Scanner entrada = new Scanner(System.in);

        // fase de inicialización
        int total = 0;
        int contador = 0;

        // fase de procesamiento
        System.out.println("Escribe tu calificación o escribe -1 para terminar:");
        int calificacion = entrada.nextInt();

        // itera hasta recibir el valor centinela (-1) del usuario
        while (calificacion != -1) {
            total = total + calificacion;
            contador += 1;
            System.out.println("Escribe tu calificación o escribe -1 para terminar:");
            calificacion = entrada.nextInt();
        }

        // fase de terminación
        if (contador != 0) {
            double promedio = (double) total / contador;
            System.out.printf("El total de las calificaciones introducidas es de: %d.%n", total);
            System.out.printf("El promedio general es de: %.2f.", promedio);
        } else {
            System.out.println("No se introdujeron calificaciones.");
        }

    }
}
