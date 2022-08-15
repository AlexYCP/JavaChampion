package chapter_1;

public class ConceptosGenerales {

    // el método main empieza la ejecución de la aplicación en Java
    public static void main(String[] args) {

        // Este es un comentario de fin de línea
        /*
        Este es un comentario de multiples líneas.
         */
        /**
         * Este es un comentario Javadoc. Este comentario me permite incrustar
         * la documentación de manera directa en mis programas. Dichos
         * comentarios son el formato preferido en la industria. El programa de
         * utilería javadoc (parte del JDK) lee esos comentarios y los utiliza
         * para preparar la documentación de su programa, en formato HTML.
         */
        /*
        Uso de líneas en blanco. Existen tres tipos y son: líneas en blanco, espacios y tabulaciones.
        Estos tipos de espacios sirven para mejorar y facilitar la legibilidad de mis programas,
        en conjunto se les conoce como espacio en blanco.
         */
        // Palabras clave o palabras reservadas
        /*
        Las palabras clave se reservan para uso exclusivo de Java y siempre se escriben en letras
        minúscula. Existen 50 palabras reservadas, 48 siguen vigentes y dos ya no se utilizan.
         */
        // Cadena de carácteres o literal de cadena
        System.out.println("¡Hola, bienvenido a la programación en Java!");
        // se les nombra de esa manera en conjunto a las comillas y a los carácteres que contiene
        // a toda la línea de código se le nombra instrucción
        // un método contiene una o más intruciones que realizan mis tareas
        // las intrucciones terminan en punto y coma, en su mayoría

        // La barra diagonal inversa (\) se conoce como carácter de escape.
        System.out.println("\nSecuencias de escape:\n");
        //
        System.out.println("Nueva línea (\\n).\nColoca el cursor de la pantalla al inicio de la siguiente "
                + "línea.\n");
        //
        System.out.println("Tabulador horizontal (\\t).\tDesplaza el cursor de la pantalla hasta la siguiente "
                + "posición de tabulación.");
        //
        System.out.println("\rRetorno de carro (\\r). Coloca el cursor de la pantalla al inicio de la línea "
                + "actual; no avanza a la siguiente línea.\rCualquier carácter que se imprima después del "
                + "retorno de carro sobrescribe los caracteres previamente impresos en esa línea.");
        //
        System.out.println("\rBarra diagonal inversa. Se usa para imprimir un carácter de barra diagonal "
                + "inversa. Como en los textos de arriba.");
        //
        System.out.println("\r\"Doble comilla. Se usa para imprimir un carácter de doble comilla como en"
                + "éste texto, por ejemplo.\"");

        // Una instrucción es una o más líneas que contienen código.
        // Las partes de las instrucciones que contienen cálculos o un valor asociado se llaman expresiones.
        // Un carácter que se encuentra en medio de dos expresiones se llama operador binario.
        // Toda variable tiene un nombre, un tipo, un tamaño (en bytes) y un valor.
        /*
        Los nombres de las clases, los métodos y las variables son todos identificadores y, por convención,
        usan el mismo esquema de nomenclatura lomo de camello (CamelCase).
         */
 /*
        Las variables declaradas en el cuerpo de un método específico (como main) son variables locales,
        o sea que, los parámetros de un método son variables locales y las variables de instancia 
        son las que se declaran después del nombre de una Clase, pero antes de un método,
        y que no contiene un método main en su cuerpo.
         */
        // Diagrama de Clases en UML
        /*
        . En la industria, los diagramas de UML ayudan a los diseñadores de sistemas a especificar un
        sistema de una forma concisa, gráfica e independiente del lenguaje de programación,
        antes de que los programadores implementen el sistema en un lenguaje de programación específico.
         */
 /* 
        Java se conoce como un lenguaje extensible, ya que se pueden crear todas las Clases que sean
        necesarias para la creación de uno o más programas.
         */
 /*
        Una clase que crea un objeto de otra clase y luego llama a los métodos de ese objeto es una
        clase controladora.
         */
 /*
        En Java, los tipos se dividen en dos categorías: tipos primitivos y tipos por referencia. Los tipos
        primitivos son boolean, byte, char, short, int, long, float y double. Todos los demás tipos son por 
        referencia, por lo cual, las clases que especifican los tipos de los objetos, son tipos por referencia.
         */
 /*
        Una variable de tipo primitivo puede en un momento dado almacenar exactamente un valor de su tipo 
        declarado.
         */
 /*
        Algoritmos:
        Cualquier problema de computación puede resolverse ejecutando una serie de acciones en un orden 
        específico. Un procedimiento para resolver un problema en términos de:
        1. las acciones a ejecutar y
        2. el orden en el que se ejecutan estas acciones
        se conoce como un algoritmo.
        
        Al proceso de especificar el orden en el que se ejecutan las instrucciones (acciones)
        en un programa, se le llama control del programa.
         */
 /*
        Pseudocódigo:
        El pseudocódigo es un lenguaje informal que le ayuda a desarrollar algoritmos sin tener que
        preocuparse por los estrictos detalles de la sintaxis del lenguaje Java, ayuda a "organizar" un
        programa antes de que intente escribirlo en un lenguaje de programación como Java.
        
        Un pseudocódigo preparado cuidadosamente puede convertirse sin problema en mi correspondiente
        programa en Java. Por lo general, el pseudocódigo describe sólo las instrucciones que representan 
        las acciones que ocurren después de convertir un programa de pseudocódigo a Java, y de ejecutarlo
        en una computadora. Dichas acciones podrían incluir la entrada, salida o cálculos.  
         */
 /*
        Instrucciones de repetición en Java
        Java cuenta con tres instrucciones de repetición (también llamadas instrucciones de iteración o
        instrucciones de ciclo) que permiten a los programas ejecutar instrucciones en forma repetida,
        siempre y cuando una condición (llamada la condición de continuación del ciclo) siga siendo
        verdadera. Las instrucciones de repetición son while, do...while, for y las instrucciones for 
        mejoradas.
         */
 /*
        Java sólo tiene tres tipos de estructuras de control, a las cuales nos referiremos de aquí en
        adelante como instrucciones de control: la instrucción de secuencia, las instrucciones de selección
        (tres tipos) y las instrucciones de repetición (tres tipos). Cada programa se forma combinando
        tantas de estas instrucciones como sea apropiado para el algoritmo que implemente el programa.
        Podemos modelar cada una de las instrucciones de control como un diagrama de actividad.
         */
 /*
        Operador condicional (?:)
        Java cuenta con el operador condicional (?:), que en ocasiones puede utilizarse en lugar de una instrucción if...else.
        Este operador puede hacer su código más corto y claro. Es el único operador ternario en Java (un operador que
        utiliza tres operandos). En conjunto, los operandos y el símbolo ?: forman una expresión condicional. Por ejemplo:
        
        System.out.println(calificacionFinal >= 6 ? "Aprobado" : "Reprobado");
        
        El primer operando (a la izquierda del ?) es una expresión booleana (boolean)
        (es decir, una condición que se evalúa a un valor boolean: true o false), el segundo operando (entre el ?
        y :) es el valor de la expresión condicional si la expresión booleana es verdadera (true), y el tercer operando
        (a la derecha del :) es el valor de la expresión condicional si la expresión booleana se evalúa como false.
         */
 /*
        Instrucción de repetición while:
        Una instrucción de repetición le permite especificar que un programa debe repetir una acción mientras
        cierta condición sea verdadera. 
         */
 /*
        Formulación de algoritmos: repetición controlada por un contador.
        
        A la repetición controlada por contador se le llama comúnmente 'repetición definida', ya que el número de repeticiones
        se conoce antes de que el ciclo comience a ejecutarse.
         */
 /*
        Formulación de algoritmos: repetición controlada por un centinela.
        
        A la repetición controlada por centinela a menudo se le llama repetición indefinida, ya que el número
        de repeticiones no se conoce antes de que comience la ejecución del ciclo.
        
        El valor especial denominado valor centinela también es llamado como valor de señal, valor de error o valor de bandera.
        
        -----Observaciones de ingeniería de software:-----
        +Cada refinamiento, así como la cima en sí, es una especificación completa del algoritmo; sólo varía el nivel del detalle.
        +Muchos programas pueden dividirse lógicamente en tres fases: una fase de inicialización, en donde se inicializan las
        variables; una fase de procesamiento, en donde se introducen los valores de los datos y se ajustan las variables del
        programa según sea necesario; y una fase de terminación, que calcula y produce los resultados finales.
        ----- Tip para prevenir errores -----
        Al realizar cálculos de división (/) o residuo (%) en donde el operando derecho pudiera ser cero, debe evaluar
        explícitamente esta posibilidad y manejarla de manera apropiada en su programa (como imprimir un mensaje de error),
        en vez de permitir que ocurra el error.
        -----Observaciones de ingeniería de software:-----
        Puede terminar el proceso de refinamiento de arriba a abajo, paso a paso, cuando haya especificado el algoritmo en pseudocódigo
        con el detalle suficiente como para poder convertir el seudocódigo en Java. Por lo general, la implementación del
        programa en Java después de esto es mucho más sencilla.
        -----Observaciones de ingeniería de software:-----
        Algunos programadores no utilizan herramientas de desarrollo de programas como el pseudocódigo. Ellos sienten que su meta
        final es resolver el problema en una computadora y que el escribir pseudocódigo simplemente retarda la producción de los
        resultados finales. Aunque esto podría funcionar para problemas sencillos y conocidos, tiende a ocasionar graves errores
        y retrasos en proyectos grandes y complejos.
         */
 /*
        Operadores de asignación compuestos:
        Los operadores de asignación compuestos abrevian las expresiones de asignación. Las instrucciones de la forma:
        
        variable = variable operador expresión;
        
        en donde operador es uno de los operadores binarios +, -, *, / o % (o alguno de los otros que veremos más adelante en el
        libro), puede escribirse de la siguiente forma:
        
        variable operador= expresión;
        
        Por ejemplo, puede abreviar la instrucción:
        
        c = c + 3;
        
        mediante el operador de asignación compuesto de suma, +=, de la siguiente manera:
        
        c += 3;
        
        El operador += suma el valor de la expresión que está a la derecha del operador al valor de la variable ubicada a la izquierda 
        del mismo y almacena el resultado en la variable que se encuentra a la izquierda del operador. Por lo tanto, la expresión de 
        asignación c += 3 suma 3 a c.
         */
 /*
        Operadores de incremento y decremento:
        
        Java proporciona dos operadores unarios para sumar 1, o restar 1, al valor de una variable numérica.
        Estos operadores son el operador de incremento unario, ++, y el operador de decremento unario, --.
        Un programa puede incrementar en 1 el valor de una variable llamada c mediante el operador de incremento, ++, en lugar de
        usar la expresión c = c + 1 o c+= 1. A un operador de incremento o decremento que se coloca como prefijo (antes) de una
        variable se le llama operador de preincremento o predecremento, respectivamente. A un operador de incremento o
        decremento que se coloca como postfijo (después) de una variable se le llama operador de postincremento
        o postdecremento, correspondientes. A continuación se explicará con el sig. ejemplo:
        
        Operador de preincremento: ++a, incrementar a en 1, después utilizar el nuevo valor de a en la expresión en que esta
        variable reside.
        
        Operador de predecremento: --a, decrementar a en 1, después utilizar el nuevo valor de a en la expresión en que esta
        variable reside.
        
        Operador de postincremento: y++, usar el valor actual de y en la expresión en la que esta variable reside,
        después incrementar a en 1.
        
        Operador de postdecremento: y--, usar el valor actual de y en la expresión en la que esta variable reside,
        después decrementar a en 1.
        
        Al proceso de utilizar el operador de preincremento (o predecremento) para sumar (o restar) 1 a una variable,
        se le conoce como preincrementar (o predecrementar) la variable. Esto hace que la variable se incremente
        (o decremente) en 1; después el nuevo valor de la variable se utiliza en la expresión en la que aparece.
        Al proceso de utilizar el operador de postincremento (o postdecremento) para sumar (o restar) 1 a una variable,
        se le conoce como postincrementar (o postdecrementar) la variable. Esto hace que el valor actual de la variable
        se utilice en la expresión en la que aparece; después se incrementa (decrementa) el valor de la variable en 1.
        -----Buena práctica de programación:-----
        A diferencia de los operadores binarios, los operadores unarios de incremento y decremento deben colocarse
        enseguida de sus operandos, sin espacios entre ellos.
         */
 /*
        Tipos primitivos:
        La tabla del apéndice D enumera los ocho tipos primitivos en Java. Al igual que sus lenguajes antecesores C y C++,
        Java requiere que todas las variables tengan un tipo, ya sea: char, byte, short, int, long, float y double.
        Es por esta razón que Java se conoce como un lenguaje fuertemente tipificado.
        
        En ejercicios anteriores vimos que a las variables de tipos primitivos que se declaran fuera de un método como variables
        de instancia de una clase se les asignan valores predeterminados de manera automática, a menos que se inicialicen
        en forma explícita. Las variables de instancia de los tipos char, byte, short, int, long, float y double reciben
        el valor 0 de manera predeterminada. Las variables de tipo boolean reciben el valor false de manera predeterminada.
        Las variables de instancia de tipo por referencia (String) se inicializan de manera predeterminada con el valor null.
         */
 /*
        GUI y gráficos:
        Una característica atractiva de Java es su soporte para gráficos, el cual permite a los programadores mejorar sus aplicaciones
        en forma visual.
        
        El sistema de coordenadas de Java:
        Para dibujar en Java, primero debe comprender su sistema de coordenadas, un esquema para identificar puntos en la pantalla.
        De manera predeterminada, la esquina superior izquierda de un componente de la GUI tiene las coordenadas (0, 0). Un par de
        coordenadas está compuesto por una coordenada x (la coordenada horizontal) y una coordenada y (la coordenada vertical).
        La coordenada x es la ubicación horizontal que se desplaza de izquierda a derecha. La coordenada y es la ubicación vertical
        que se desplaza de arriba hacia abajo. El eje x indica cada una de las coordenadas horizontales, y el eje y cada una de las
        coordenadas verticales. Las coordenadas indican en dónde deben mostrarse los gráficos en una pantalla. Las unidades de las
        coordenadas se miden en píxeles. El término píxel significa “elemento de imagen”. Un píxel es la unidad de resolución más
        pequeña de una pantalla.
         */
 /*
        -----Error común de programación:-----
        Error común de programación:
        Debido a que los valores de punto flotante pueden ser aproximados, controlar los ciclos con variables de punto flotante puede
        producir valores imprecisos del contador y pruebas de terminación imprecisas.
        -----Tip para prevenir errores:-----
        Use enteros para controlar los ciclos de contador.
        -----Observación de ingeniería de software:-----
        "Mantener las cosas simples" es un buen consejo para la mayoría del código que usted escriba.
        -----Error común de programación:-----
        Utilizar un operador relacional incorrecto o un valor final incorrecto de un contador de ciclo en la condición de continuación
        de ciclo de una instrucción de repetición, puede producir un error por desplazamiento en uno. Por ejemplo:
        
        En un determinado programa se quiere imprimir por pantalla la secuencia numérica del uno al 10, si la variable global o local
        'a' se inicializa en uno y en la instrucción condicional se especifica lo siguiente: 'a < 10', dicho programa imprimiría una
        secuencia numérica del uno al 9, a este error lógico común se le conoce como error por desplazamiento en uno.
        -----Tip para prevenir errores:-----
        Utilizar el valor final y el operador <= en la condición de un ciclo nos ayuda a evitar los errores por desplazamiento en uno.
        Para un ciclo que imprime los valores del 1 al 10, la condición de continuación de ciclo debe ser contador <= 10, en vez de
        contador < 10 (lo cual produce un error por desplazamiento en uno) o contador < 11 (que es correcto). Muchos programadores
        prefieren el llamado conteo con base cero, en el cual para contar 10 veces, contador se inicializaría en cero y la prueba
        de continuación de ciclo sería contador < 10.
        -----Tip para prevenir errores:-----
        Como se mencionó en el capítulo 4, los enteros pueden desbordarse y producir errores lógicos. Una variable de control de
        ciclo también podría desbordarse. Para evitar esto escriba sus condiciones de ciclo con cuidado.
        -----Error común de programación:-----
        Cuando se declara la variable de control de una instrucción 'for' en la sección de inicialización del encabezado de for,
        si se utiliza la variable de control después del cuerpo de for se produce un error de compilación.
        
        Colocación de expresiones aritméticas en el encabezado de una instrucción for:
        Las porciones correspondientes a la inicialización, la condición de continuación de ciclo y el incremento de una instrucción
        for, pueden contener expresiones aritméticas. Por ejemplo, suponga que 'x = 2' y 'y = 10'. Si 'x' y 'y' no se modifican en
        el cuerpo del ciclo, entonces la instrucción:
        for (int j = x; j <= 4 * x * y; j += y / x)
        es equivalente a la instrucción:
        for (int j = 2; j <= 80; j += 5)
        -----Tip de rendimiento:-----
        En los ciclos, evite cálculos para los cuales el resultado nunca cambia; dichos cálculos por lo general deben colocarse antes
        del ciclo. Muchos de los sofisticados compiladores con optimización de la actualidad colocan este tipo de cálculos fuera de
        los ciclos del código compilado.
        -----Tip para prevenir errores-----
        No utilice variables de tipo double (o float) para realizar cálculos monetarios precisos. La imprecisión de los números de
        punto flotante puede provocar errores. En los ejercicios, aprenderá a usar enteros para realizar cálculos monetarios
        precisos. Java también cuenta con la clase java.math.BigDecimal para este fin, la cual demostraremos en la figura 8.16.
         */
 /*
        Instrucción de selección múltiple:
        La instrucción de selección múltiple switch realiza distintas acciones, con base en los posibles valores de una expresión
        entera constante de tipo byte, short, int o char. A partir de Java SE 7, la expresión también puede ser un objeto String,
        lo cual veremos en una sección posterior.
        -----Error común de programación:-----
        Olvidar una instrucción break cuando se necesita una en una instrucción switch es un error lógico.
        -----Tip para prevenir errores:-----
        En una instrucción switch, asegúrese de probar todos los posibles valores de la expresión de control.
        -----Tip para prevenir errores-----
        Proporcione un caso default en las instrucciones switch. Esto lo hará enfocarse en la necesidad de procesar las condiciones
        excepcionales.
        -----Buena práctica de programación-----
        Aunque cada case y el caso default en una instrucción switch pueden ocurrir en cualquier orden, es conveniente colocar la
        etiqueta default al último. Cuando el caso default se lista al último, no se requiere el break para ese caso.
         */
 /*
        Instrucciones 'break' y 'continue':
        Además de las instrucciones de selección y repetición, Java cuenta con las instrucciones break (que vimos en el contexto de
        la instrucción switch) y continue (que presentamos en esta sección y en el apéndice L en línea) para alterar el flujo de
        control. En la sección anterior mostramos cómo puede utilizarse la instrucción break para terminar la ejecución de una
        instrucción switch. En esta sección veremos cómo utilizar break en las instrucciones de repetición.
        
        Instrucción 'break':
        Cuando la instrucción break se ejecuta en una instrucción while, for, do...while, o switch, ocasiona la salida inmediata de
        esa instrucción. La ejecución continúa con la primera instrucción después de la instrucción de control. Los usos comunes
        de break son para escapar anticipadamente del ciclo, o para omitir el resto de una instrucción switch.
        
        Instrucción 'continue':
        Cuando la instrucción continue se ejecuta en una instrucción while, for o do...while, omite las instrucciones restantes en
        el cuerpo del ciclo y continúa con la siguiente iteración del ciclo. En las instrucciones while y do...while, el programa
        evalúa la prueba de continuación de ciclo justo después de que se ejecuta la instrucción continue. En una instrucción for
        se ejecuta la expresión de incremento y después el programa evalúa la prueba de continuación de ciclo.
        
        En un ejercicio declaramos que la instrucción while puede utilizarse, en la mayoría de los casos, en lugar de for. Esto no
        es verdad cuando la expresión de incremento en while va después de una instrucción continue. En este caso, el incremento
        no se ejecuta antes de que el programa evalúe la condición de continuación de repetición, por lo que while no se ejecuta
        de la misma manera que for.
        -----Observación de ingeniería de software-----
        Algunos programadores sienten que las instrucciones break y continue infringen la programación estructurada. Ya que pueden
        lograrse los mismos efectos con las técnicas de programación estructurada, estos programadores prefieren no utilizar
        instrucciones break o continue.
        -----Observación de ingeniería de software-----
        Existe una tensión entre lograr la ingeniería de software de calidad y lograr el software con el más alto desempeño. A menudo,
        una de estas metas se logra a expensas de la otra. Para todas las situaciones excepto las que demanden el mayor rendimiento,
        aplique la siguiente regla empírica: primero, asegúrese de que su código sea simple y correcto; después hágalo eficiente y
        conciso, pero sólo si es necesario.
         */
 /*
        Operadores lógicos:
        Cada una de las instrucciones if, if...else, while, do...while y for requieren una condición para determinar cómo continuar
        con el flujo de control de un programa. Hasta ahora solo hemos estudiado las condiciones simples, dichas condiciones
        simples se expresan en términos de los operadores relacionales >, <, >= y <=, y los operadores de igualdad == y !=;
        cada expresión solo evalúa una condición. Para evaluar condiciones múltiples en el proceso de tomar una decisión,
        ejecutamos estas pruebas en instrucciones separadas o en instrucciones if o if...else anidadas. En ocasiones,
        las instrucciones de control requieren condiciones más complejas para determinar el flujo de control de un
        programa. Para solucionar ésta problemática utilizaremos los sig. operadores:
        
        Los operadores lógicos de Java nos permiten formar condiciones más complejas, al combinar las condiciones simples. Los
        operadores lógicos son && (AND condicional), || (OR condicional), & (AND lógico booleano), | (OR inclusivo lógico booleano),
        ^ (OR exclusivo lógico booleano) y ! (NOT lógico). [Nota: Los operadores &, | y ^ son también operadores a nivel de bits
        cuando se aplican a operandos enteros. En el apéndice K en línea hablaremos sobre los operadores a nivel de bits.
        -----Error común de programación-----
        En las expresiones que utilizan el operador &&, una condición (a la cual le llamamos condición dependiente) puede requerir que
        otra condición sea verdadera para que la evaluación de la condición dependiente tenga significado. En este caso, la condición 
        dependiente debe colocarse después del operador && para prevenir errores. Considere la expresión (i != 0) && (10/i == 2).
        La condición dependiente (10/i == 2) debe aparecer después del operador && para evitar una posible división entre cero.
        -----Tip para prevenir errores-----
        Por cuestión de claridad, evite las expresiones con efectos secundarios en las condiciones (como las asignaciones).
        Éstos pueden hacer que el código sea más difícil de entender y podrían llegar a producir errores lógicos sutiles.
        -----Tip para prevenir errores-----
        Por lo general las expresiones de asignación (=) no deben usarse en condiciones. Cada condición debe producir un valor boolean
        como resultado; de lo contrario se producirá un error de compilación. En una condición, una asignación se compilará sólo si
        se asigna una expresión boolean a una variable boolean.
         */
 /*
        Resumen sobre programación estructurada:
        Hemos aprendido que la programación estructurada produce programas que son más fáciles de entender, probar,
        depurar y modificar que los programas sin estructura, e incluso probar que son correctos en sentido matemático.
 
        Reglas para formar programas estructurados:
        1. Comenzar con el diagrama de actividad más sencillo.
        2. Cualquier estado de acción puede reemplazarse por dos estados de acción en secuencia.
        3. Cualquier estado de acción puede reemplazarse por cualquier instrucción de control (secuencia de estados de acción, if,
        if...else, switch, while, do...while o for).
        4. Las reglas 2 y 3 pueden aplicarse tantas veces como se desee y en cualquier orden
 
        Tres formas de control:
        La programación estructurada promueve la simpleza. Sólo se necesitan tres formas de control para implementar un algoritmo:
        • secuencia
        • selección
        • repetición
        La estructura de secuencia es trivial. Simplemente enumera las instrucciones a ejecutar en el orden debido. La selección se
        implementa en una de tres formas:
        • instrucción if (selección simple)
        • instrucción if...else (selección doble)
        • instrucción switch (selección múltiple)
        De hecho, es sencillo demostrar que la instrucción if simple es suficiente para ofrecer cualquier forma de selección; todo lo
        que pueda hacerse con las instrucciones if...else y switch puede implementarse si se combinan instrucciones if (aunque tal
        vez no con tanta claridad y eficiencia).
        La repetición se implementa en una de tres maneras:
        • instrucción while
        • instrucción do...while
        • instrucción for
        [Nota: Hay una cuarta instrucción de repetición (la instrucción for mejorada) que veremos en la sección 7.7]. Es sencillo
        demostrar que la instrucción while es suficiente para proporcionar cualquier forma de repetición. Todo lo que puede
        hacerse con las instrucciones do...while y for, puede hacerse también con la instrucción while (aunque tal vez no sea tan
        sencillo).
        Si se combinan estos resultados, se demuestra que cualquier forma de control necesaria en un programa de Java puede expresarse
        en términos de:
        • secuencia
        • instrucción if (selección)
        • instrucción while (repetición)
        y que estos tres elementos pueden combinarse en sólo dos formas: apilamiento y anidamiento. Sin duda, la programación
        estructurada es la esencia de la simpleza.
 
        Conclusión:
        En este capítulo completamos nuestra introducción a las instrucciones de control de Java, las cuales nos permiten controlar
        el flujo de la ejecución en los métodos. El capítulo 4 trató acerca de las instrucciones de control if, if...else y while.
        En este capítulo vimos las instrucciones for, do...while y switch. Aquí le mostramos que es posible desarrollar cualquier
        algoritmo mediante el uso de combinaciones de la estructura de la secuencia, los tres tipos de instrucciones de selección
        (if, if...else y switch) y los tres tipos de instrucciones de repetición (while, do...while y for). En este capítulo y en
        el anterior hablamos de cómo combinar estos bloques de construcción para utilizar las técnicas ya probadas de construcción
        de programas y solución de problemas. Utilizó la instrucción break para salir de una instrucción switch y para terminar de
        inmediato un ciclo, y usó una instrucción continue para terminar la iteración actual de un ciclo y continuar con la siguiente
        iteración del mismo. En este capítulo también se introdujeron los operadores lógicos de Java, que nos permiten utilizar
        expresiones condicionales más complejas en las instrucciones de control.
        En el capítulo 6 analizaremos los métodos con más detalle.
         */
 /*
        La experiencia ha demostrado que la mejor manera de desarrollar y mantener un programa extenso es construirlo a partir de
        pequeñas piezas sencillas, o módulos. A esta técnica se le llama divide y vencerás. Los métodos, que presentamos en el
        capítulo 3, le ayudan a dividir los programas en módulos. En este capítulo estudiaremos los métodos con más detalle.
 
        Módulos de programas en Java:
        Para escribir programas en Java, se combinan los nuevos métodos y clases con los métodos y clases predefinidos, que están
        disponibles en la Interfaz de Programación de Aplicaciones de Java (también conocida como la API de Java o biblioteca de
        clases de Java) y en diversas bibliotecas de clases. Por lo general, las clases relacionadas están agrupadas en paquetes,
        de manera que se pueden importar a los programas y reutilizarse. En la sección 21.4.10 aprenderá a agrupar sus propias clases
        en paquetes. La API de Java proporciona una vasta colección de clases predefinidas que contienen métodos para realizar
        cálculos matemáticos comunes, manipulaciones de cadenas, manipulaciones de caracteres, operaciones de entrada/salida,
        operaciones de bases de datos, operaciones de red, procesamiento de archivos, comprobación de errores y más.
        -----Observación de ingeniería de software-----
        Procure familiarizarse con la vasta colección de clases y métodos que proporciona la API de Java (http://docs.oracle.com/javase/7/docs/api/).
        En la sección 6.8 presentaremos las generalidades sobre varios paquetes comunes. En el apéndice F, en línea, le explicaremos
        cómo navegar por la documentación de la API. Evite reinventar la rueda. Cuando sea posible, reutilice las clases y métodos de
        la API de Java. Esto reduce el tiempo de desarrollo de los programas y evita que se introduzcan errores de programación.
 
        Dividir y vencer con clases y métodos:
        Las clases y los métodos nos ayudan a dividir un programa en módulos, por medio de la separación de sus tareas en unidades
        autónomas. Las instrucciones en los cuerpos de los métodos se escriben sólo una vez, se ocultan de otros métodos y se pueden
        reutilizar desde varias ubicaciones en un programa. Una razón para dividir un programa en módulos usando los métodos es el
        enfoque divide y vencerás, que hace que el desarrollo de programas sea más fácil de administrar, ya que se pueden construir
        programas a partir de piezas pequeñas y simples. Otra razón es la reutilización de software (al usar los métodos existentes
        como bloques de construcción para crear nuevos programas). A menudo se pueden crear programas a partir de métodos estandarizados,
        en vez de tener que crear código personalizado. Por ejemplo, en los programas anteriores no tuvimos que definir cómo leer datos
        del teclado; Java proporciona estas herramientas en la clase Scanner. Una tercera razón es para evitar la repetición de código.
        El proceso de dividir un programa en métodos significativos hace que el programa sea más fácil de depurar y mantener.
        -----Observación de ingeniería de software-----
        Para promover la reutilización de software, cada método debe limitarse de manera que realice una sola tarea bien definida, y
        su nombre debe expresar esa tarea con efectividad.
        -----Tip para prevenir errores-----
        Un método pequeño que lleva a cabo una tarea es más fácil de probar y depurar que uno más grande que realiza muchas tareas.
        -----Observación de ingeniería de software-----
        Si no puede elegir un nombre conciso que exprese la tarea de un método, tal vez esté tratando de realizar diversas tareas en
        un mismo método. Por lo general, es mejor dividirlo en varias declaraciones de métodos más pequeños.
        -----Tip para prevenir errores-----
        Cuando llame a un método que devuelva un valor que indique si el método realizó correctamente su tarea, asegúrese de comprobar
        el valor de retorno de ese método y, si no tuvo éxito, de lidiar con el problema de manera apropiada.
 
        Métodos static:
        Aunque la mayoría de los métodos se ejecutan en respuesta a las llamadas a métodos en objetos específicos, éste no es siempre
        el caso. Algunas veces un método realiza una tarea que no depende del contenido de ningún objeto. Dicho método se aplica a
        la clase en la que está declarado como un todo, y se conoce como método static o método de clase.
        Es común que las clases contengan métodos static convenientes para realizar tareas comunes. Por ejemplo, recuerde que en la
        figura 5.6 utilizamos el método static pow de la clase Math para elevar un valor a una potencia. Para declarar un método
        como static, coloque la palabra clave static antes del tipo de valor de retorno en la declaración del método. Para cualquier
        clase importada en su programa, puede llamar a los métodos static de la clase especificando el nombre de la clase en la que
        está declarado el método, seguido de un punto (.) y del nombre del método, como sigue: NombreClase.nombreMetodo(argumentos);
 
        La Clase Math:
        -----Observación de ingeniería de software-----
        La clase Math es parte del paquete java.lang, que el compilador importa de manera implícita, por lo que no es necesario
        importarla para utilizar sus métodos.
 
        Variables static:
        En la sección 3.2 vimos que cada objeto de una clase mantiene su propia copia de cada variable de instancia de la clase. Hay
        variables para las que cada objeto de una clase no necesita su propia copia independiente (como veremos en breve). Dichas
        variables se declaran como static y también se conocen como variables de clase. Cuando se crean los objetos de una clase
        que contiene variables static, todos los objetos de esa clase comparten una copia de esas variables. En conjunto, las
        variables static y las variables de instancia de una clase se conocen como sus campos. En la sección 8.11 aprenderá
        más sobre los campos static.
 
        ¿Por qué el método main se declara como static?:
        Cuando se ejecuta la máquina virtual de Java (JVM) con el comando java, ésta trata de invocar al método main de la clase que
        usted le especifica; en este punto no se han creado objetos de esa clase. Al declarar a main como static, la JVM puede invocar
        a main sin tener que crear una instancia de la clase. Cuando usted ejecuta su aplicación, especifica el nombre de su clase
        como un argumento para el comando java, como sigue: java NombreClase argumento1 argumento2 …
        La JVM carga la clase especificada por NombreClase y utiliza el nombre de esa clase para invocar al método main. En el comando
        anterior, NombreClase es un argumento de línea de comandos para la JVM, que le indica cuál clase debe ejecutar. Después del
        NombreClase, también puede especificar una lista de objetos String (separados por espacios) como argumentos de línea de
        comandos, que la JVM pasará a su aplicación. Dichos argumentos pueden utilizarse para especificar opciones (por ejemplo, un
        nombre de archivo) para ejecutar la aplicación. Como veremos en el capítulo 7, Arreglos y objetos ArrayList, su aplicación
        puede acceder a esos argumentos de línea de comandos y utilizarlos para personalizar la aplicación.
        -----Observación de ingeniería de software-----
        Los métodos pueden devolver a lo máximo un valor, pero el valor devuelto puede ser una referencia a un objeto que contenga
        muchos valores.
        -----Observación de ingeniería de software-----
        Las variables deben declararse como campos de una clase sólo si se requiere su uso en más de un método de la clase, o si el
        programa debe almacenar sus valores entre las llamadas a los métodos de ella.
        -----Error común de programación-----
        Declarar parámetros del mismo tipo para un método, como float x, y en vez de float x, float y es un error de sintaxis; se
        requiere un tipo para cada parámetro en la lista de parámetros.
 
        Notas sobre cómo declarar y utilizar los métodos:
        Hay tres formas de llamar a un método:
        1. Utilizar el nombre de un método por sí solo para llamar a otro método de la misma clase, como:
        maximo(numero1, numero2, numero3) en la línea 21 de la figura 6.3.
        2. Usar una variable que contiene una referencia a un objeto, seguida de un punto (.) y del nombre del método para llamar a
        un método no static del objeto al que se hace referencia; como la llamada al método en la línea 16 de la figura 3.2,
        miCuenta.obtenerNombre(), que llama a un método de la clase Cuenta desde el método main de PruebaCuenta. (Por lo general a
        los métodos que no son static se les conoce como métodos de instancia).
        3. Utilizar el nombre de la clase y un punto (.) para llamar a un método static de una clase, como:
        Math.sqrt(900.0) en la sección 6.3.
        -----Error común de programación-----
        Declarar un método fuera del cuerpo de la declaración de una clase, o dentro del cuerpo de otro método es un error de sintaxis.
        -----Error común de programación-----
        Volver a declarar un parámetro como una variable local en el cuerpo del método es un error de compilación.
        -----Error común de programación-----
        Olvidar devolver un valor de un método que debe regresar un valor es un error de compilación. Si se especifica un tipo de valor
        de retorno distinto de void, el método debe contener una instrucción return que devuelva un valor consistente con el tipo de
        valor de retorno del método. Devolver un valor de un método cuyo tipo de valor de retorno se haya declarado como void es un
        error de compilación.
 
        La pila de llamadas a los métodos y los marcos de pila:
        Para comprender la forma en que Java realiza las llamadas a los métodos, necesitamos considerar primero una estructura de datos
        (una colección de elementos de datos relacionados) conocida como pila, a la que podemos considerar como una analogía de una
        pila de platos. Cuando se coloca un plato en una pila, por lo general se coloca en la parte superior (lo que se conoce como
        meter el plato en la pila). De manera similar, cuando se extrae un plato de la pila, normalmente se extrae de la parte superior
        (lo que se conoce como sacar el plato de la pila). Las pilas se denominan estructuras de datos “último en entrar, primero en
        salir” (UEPS, LIFO por sus siglas en inglés: last-in, first-out); el último elemento que se mete (inserta) en la pila es el
        primero que se saca (extrae) de ella.
 
        Promoción y conversión de argumentos:
        Otra característica importante de las llamadas a los métodos es la promoción de argumentos; es decir, convertir el valor de un
        argumento, si es posible, al tipo que el método espera recibir en su correspondiente parámetro.
        -----Error común de programación-----
        Convertir un valor de tipo primitivo a otro tipo primitivo puede modificar ese valor si el nuevo tipo no es una promoción
        válida. Por ejemplo, convertir un valor de punto flotante a un valor entero puede introducir errores de truncamiento (pérdida
        de la parte fraccionaria) en el resultado. Por ejemplo, un programa puede llamar al método sqrt de Math con un argumento int,
        aun cuando el método espera recibir un argumento double. La instrucción: System.out.println(Math.sqrt(4)); evalúa Math.sqrt(4)
        correctamente e imprime el valor 2.0. La lista de parámetros de la declaración del método hace que Java convierta el valor int
        4 en el valor double 4.0 antes de pasar ese valor al método sqrt. Dichas conversiones pueden ocasionar errores de compilación,
        si no se satisfacen las reglas de promoción de Java. Estas reglas especifican qué conversiones son permitidas; esto es, qué
        conversiones pueden realizarse sin perder datos. En el ejemplo anterior de sqrt, un int se convierte en double sin modificar
        su valor. No obstante, la conversión de un double a un int trunca la parte fraccionaria del valor double, por consecuencia,
        se pierde parte del valor. La conversión de tipos de enteros largos a tipos de enteros pequeños (por ejemplo, de long a int
        o de int a short) puede también producir valores modificados.
 
        Las reglas de promoción se aplican a las expresiones que contienen valores de dos o más tipos primitivos, así como a los
        valores de tipos primitivos que se pasan como argumentos para los métodos. Cada valor se promueve al tipo “más alto” en la
        expresión. En realidad, la expresión utiliza una copia temporal de cada valor; los tipos de los valores originales permanecen
        sin cambios. La figura 6.4 lista los tipos primitivos y los tipos a los cuales se puede promover cada uno de ellos. Las
        promociones válidas para un tipo dado siempre se realizan a un tipo más alto en la tabla. Por ejemplo, un int puede promoverse
        a los tipos más altos long, float y double.
 
        Promociones permitidas para los tipos primitivos:
 
        Tipo    Promociones válidas
        ---------------------------
        double  Ninguna
        float   double
        long    float o double
        int     long, float o double
        char    int, long, float o double
        short   int, long, float o double (pero no char)
        byte    short, int, long, float or double (pero no char)
        boolean Ninguna (los valores boolean no se consideran números en Java)
 
        Paquetes de la API de Java:
        Como hemos visto, Java contiene muchas clases predefinidas que se agrupan en categorías de clases relacionadas, llamadas
        paquetes. En conjunto, nos referimos a estos paquetes como la Interfaz de Programación de Aplicaciones de Java (API de Java),
        o biblioteca de clases de Java. Una de las principales fortalezas de Java se debe a las miles de clases de la API. Algunos
        paquetes clave de la API de Java que usamos en este libro se describen en la figura 6.5; éstos representan sólo una pequeña
        parte de los componentes reutilizables en la API de Java.
 
        Alcance de las declaraciones:
        -----Buena práctica de programación-----
        Declare las variables lo más cerca posible de donde se vayan a usar la primera vez.
 
        Sobrecarga de métodos:
        Pueden declararse métodos con el mismo nombre en la misma clase, siempre y cuando tengan distintos conjuntos de parámetros
        (que se determinan con base en el número, tipos y orden de los parámetros). A esto se le conoce como sobrecarga de métodos.
        Cuando se hace una llamada a un método sobrecargado, el compilador selecciona el método apropiado mediante un análisis del
        número, tipos y orden de los argumentos en la llamada. Por lo general, la sobrecarga de métodos se utiliza para crear varios
        métodos con el mismo nombre, que realicen la misma tarea o tareas similares, pero con distintos tipos o números de argumentos.
        -----Error común de programación-----
        Declarar métodos sobrecargados con listas de parámetros idénticas es un error de compilación, sin importar que los tipos de los
        valores de retorno sean distintos.
         */
 /*
        La palabra reservada final para declarar variables constantes inmutables:
        Las variables constantes deben inicializarse antes de usarlas, y no pueden modificarse de ahí en adelante, por esto es que se
        consideran valores inmutables. Si trato de modificar una variable final después de inicializarla en su declaración, el
        compilador genera el siguiente mensaje de error: "cannot assign a value to final variable nombreDeLaVariable"
        -----Buena práctica de programación-----
        Las variables constantes también se conocen como constantes con nombre. Con frecuencia mejoran la legibilidad de un programa,
        en comparación con los programas que utilizan valores literales (por ejemplo, 10); una constante con nombre como:
        LONGITUD_DEL_ARREGLO indica sin duda su propósito, mientras que un valor literal podría tener distintos significados, según su
        contexto.
        -----Buena práctica de programación-----
        Las constantes con nombres compuestos por varias palabras deben tener cada palabra separada, una de la otra, por un guion bajo
        (_), como en LONGITUD_DEL_ARREGLO.
        -----Error común de programación-----
        Asignar un valor a una variable final después de inicializarla es un error de compilación. De igual forma, al tratar de acceder
        al valor de una variable final antes de inicializarla se produce un error de compilación como: "variable nombreDeLaVariable
        might not have been initialized".
         */
 /*
        Arreglos:
        En este capítulo presentamos las estructuras de datos, que son colecciones de elementos de datos relacionados. Los objetos
        arreglo son estructuras de datos que consisten en elementos de datos relacionados, del mismo tipo. Los arreglos facilitan el
        procesamiento de grupos de valores relacionados. Los arreglos conservan la misma longitud una vez creados.
 
        Al final de este capítulo le presentaremos una de las estructuras de datos prefabricadas de Java, proveniente de las clases de
        colecciones de la API de Java. Estas colecciones ofrecen mayores capacidades que los arreglos tradicionales; ya que son
        reutilizables, confiables, poderosas y eficientes. Nos enfocaremos en la colección ArrayList. Los objetos ArrayList son
        similares a los arreglos, sólo que proporcionan una funcionalidad mejorada, como el ajuste de tamaño dinámico según sea
        necesario para poder alojar una cantidad mayor o menor de elementos.
 
        Definición:
        Un arreglo es un grupo de variables (llamadas elementos o componentes) que contienen valores del mismo tipo. Los arreglos son
        objetos, por lo que se consideran como tipos de referencia. Como veremos pronto, lo que consideramos por lo general como un
        arreglo es en realidad una referencia a un objeto arreglo en memoria. Los elementos de un arreglo pueden ser tipos primitivos
        o de referencia (incluyendo arreglos, como veremos en la sección 7.11). Para hacer referencia a un elemento específico en un
        arreglo, debemos especificar el nombre de la referencia al arreglo y el número de la posición del elemento dentro del mismo.
        El número de la posición del elemento se conoce formalmente como el índice o subíndice del elemento.
 
        Manejo de excepciones: procesamiento de la respuesta incorrecta
        Una excepción indica un problema que ocurre mientras se ejecuta un programa. El nombre "excepción" sugiere que el problema no
        ocurre con frecuencia; si la "regla" es que una instrucción por lo general se ejecuta en forma correcta, entonces el problema
        representa la "excepción a la regla". El manejo de excepciones nos permite crear programas tolerantes a fallas que pueden
        resolver (o manejar) las excepciones. En muchos casos, esto permite a un programa continuar su ejecución como si no hubiera
        encontrado ningún problema.
 
        Instrucción for mejorada:
        La instrucción for mejorada itera a través de los elementos de un arreglo sin utilizar un contador, con lo cual evita la
        posibilidad de "salirse" del arreglo. En la sección 7.16 le mostraremos cómo usar la instrucción for mejorada con las
        estructuras de datos preconstruidas de la API de Java (conocidas como colecciones).
 
        La sintaxis de una instrucción for mejorada es:
 
        for (parámetro : nombreDelArreglo) {
            instrucción
        }    
 
        en donde parámetro tiene un tipo y un identificador (por ejemplo, int numero), y nombreDelArreglo es el arreglo a través del
        cual se iterará. El tipo del parámetro debe coincidir con el de los elementos en el arreglo.

        La instrucción for mejorada sólo puede utilizarse para obtener elementos del arreglo; no para modificarlos.
        Si su programa necesita modificar elementos, use la instrucción for tradicional, controlada por un contador.
        -----Tip para prevenir errores-----
        La instrucción for mejorada simplifica el código para iterar a través de un arreglo, mejorando la legibilidad del código y
        eliminando varias posibilidades de error, como especificar de manera inapropiada el valor inicial de la variable de control,
        la prueba de continuación de ciclo y la expresión de incremento.
 
        Comparación entre paso por valor y paso por referencia:
        El ejemplo anterior demostró la forma en que se pasan los arreglos y los elementos de arreglos de tipos primitivos a los
        métodos. Ahora veremos con más detalle la forma en que se pasan los argumentos a los métodos en general. En muchos lenguajes de
        programación, dos de las formas de pasar argumentos en las llamadas a métodos son el paso por valor y el paso por referencia
        (también conocidas como llamada por valor y llamada por referencia). Cuando se pasa un argumento por valor, se pasa una copia
        del valor del argumento al método que se llamó. Este método trabaja exclusivamente con la copia. Las modificaciones a la copia
        del método que se llamó no afectan el valor de la variable original en el método que hizo la llamada.
 
        Cuando se pasa un argumento por referencia, el método que se llamó puede acceder de manera directa al valor del argumento en el
        método que hizo la llamada, y puede modificar esos datos si es necesario. El paso por referencia mejora el rendimiento, al
        eliminar la necesidad de copiar cantidades de datos posiblemente extensas.
 
        A diferencia de otros lenguajes, Java no permite a los programadores elegir el paso por valor o el paso por referencia, ya que
        todos los argumentos se pasan por valor. Una llamada a un método puede pasar dos tipos de valores: copias de valores primitivos
        (como valores de tipo int y double) y copias de referencias a objetos. Los objetos en sí no pueden pasarse a los métodos.
        Cuando un método modifica un parámetro de tipo primitivo, las modificaciones a ese parámetro no tienen efecto en el valor
        original del argumento en el método que hizo la llamada.
        -----Observación de ingeniería de software-----
        Un arnés de prueba (o aplicación de prueba) es responsable de crear un objeto de la clase que se probará así como de
        proporcionarle datos, los cuales podrían provenir de cualquiera de varias fuentes. Los datos de prueba pueden colocarse
        directamente en un arreglo con un inicializador de arreglos, pueden provenir del usuario mediante el teclado, de un archivo
        (como veremos en el capítulo 15), de una base de datos (como veremos en el capítulo 24, en inglés) o de una red (capítulo 28,
        en inglés, también en el sitio Web del libro). Después de pasar estos datos al constructor de la clase para instanciar el
        objeto, este arnés de prueba debe llamar al objeto para probar sus métodos y manipular sus datos. La recopilación de datos en
        el arnés de prueba permite a la clase ser más reutilizable y manipular datos provenientes de varias fuentes.
 
        Arreglos multidimensionales:
        Los arreglos multidimensionales de dos dimensiones se utilizan con frecuencia para representar tablas de valores, con datos
        ordenados en filas y columnas. Para identificar un elemento específico de una tabla, debemos especificar dos índices. Por
        convención, el primero identifica la fila del elemento y el segundo su columna. Los arreglos que requieren dos índices para
        identificar un elemento específico se llaman arreglos bidimensionales (los arreglos multidimensionales pueden tener más de dos
        dimensiones). Java no soporta los arreglos multidimensionales directamente, pero permite al programador especificar arreglos
        unidimensionales, cuyos elementos sean también arreglos unidimensionales, con lo cual se obtiene el mismo efecto. La figura
        7.16 ilustra un arreglo bidimensional a, que contiene tres filas y cuatro columnas (es decir, un arreglo de tres por cuatro).
        En general, a un arreglo con m filas y n columnas se le llama arreglo de m por n.
 
        Listas de argumentos de longitud variable:
        Con las listas de argumentos de longitud variable podemos crear métodos que reciben un número no especificado de argumentos.
        Un tipo que va precedido por una elipsis(...) en la lista de parámetros de un método indica que éste recibe un número variable
        de argumentos de ese tipo específico. Este uso de la elipsis puede ocurrir sólo una vez en una lista de parámetros, y la
        elipsis, junto con su tipo y el nombre del parámetro, debe colocarse al final de la lista. Aunque podemos utilizar la
        sobrecarga de métodos y el paso de arreglos para realizar gran parte de lo que se logra con las listas de argumentos de
        longitud variable, es más conciso utilizar una elipsis en la lista de parámetros de un método.
        -----Error común de programación-----
        Colocar una elipsis para indicar una lista de argumentos de longitud variable en medio de una lista de parámetros es un error
        de sintaxis. La elipsis sólo puede colocarse al final de la lista de parámetros.
 
        Uso de argumentos de línea de comandos:
        En muchos sistemas, es posible pasar argumentos desde la línea de comandos a una aplicación mediante el parámetro String[] de
        main, el cual recibe un arreglo de objetos String. Por convención, a este parámetro se le llama args. Cuando se ejecuta una
        aplicación con el comando java, Java pasa los argumentos de línea de comandos que aparecen después del nombre de la clase en el
        comando java al método main de la aplicación, en forma de objetos String en el arreglo args. El número de argumentos que se
        pasan desde la línea de comandos se obtiene accediendo al atributo length del arreglo. Los usos comunes de los argumentos de
        línea de comandos incluyen pasar opciones y nombres de archivos a las aplicaciones.
 
        La clase Arrays:
        Gracias a la clase Arrays no tenemos que reinventar la rueda, ya que proporciona métodos static para las manipulaciones comunes
        de arreglos. Estos métodos incluyen sort para ordenar un arreglo (es decir, acomodar los elementos en orden ascendente),
        binarySearch para buscar en un arreglo ordenado (determinar si un arreglo contiene un valor específico y, de ser así, en dónde
        se encuentra este valor), equals para comparar arreglos y fill para colocar valores en un arreglo. Estos métodos están
        sobrecargados para los arreglos de tipo primitivo y los arreglos de objetos. Nuestro enfoque en esta sección está en usar las
        herramientas integradas que proporciona la API de Java. En el capítulo 19, Búsqueda, ordenamiento y Big O, veremos cómo
        implementar nuestros propios algoritmos de búsqueda y ordenamiento, los cuales son de gran interés para los investigadores y
        estudiantes de ciencias computacionales.
        -----Tip para prevenir errores-----
        Al comparar el contenido de arreglos, use siempre Arrays.equals(arreglo1, arreglo2), que compara el contenido de dos arreglos,
        en vez de arreglo1.equals(arreglo2), que compara si arreglo1 y arreglo2 hacen referencia al mismo objeto arreglo.
        -----Error común de programación-----
        Pasar un arreglo desordenado al método binarySearch es un error lógico; el valor devuelto es indefinido.
 
        Java SE 8: el método parallelSort de la clase Arrays:
        Ahora la clase Arrays tiene varios métodos "paralelos" que aprovechan el hardware multinúcleo. El método parallelSort de Arrays
        puede ordenar los arreglos grandes con más eficiencia en sistemas multinúcleo. En la sección 23.12 crearemos un arreglo muy
        grande y usaremos características de la API de fecha/hora de Java SE 8 para comparar cuánto tiempo se requiere para ordenar el
        arreglo con los métodos sort y parallelSort.
 
        receptáculo; al declarar un nuevo objeto ArrayList, hay que reemplazarlo con el tipo de elementos que deseamos que contenga el
        objeto ArrayList. Por ejemplo:
 
        ArrayList<String> lista;
 
        declara a lista como una colección ArrayList que sólo puede almacenar objetos String. Las clases con este tipo de receptáculo
        que se pueden usar con cualquier tipo se conocen como clases genéricas. Sólo se pueden usar tipos no primitivos para declarar
        variables y crear objetos de clases genéricas. Sin embargo, Java cuenta con un mecanismo (conocido como boxing) que permite
        envolver valores primitivos como objetos para usarlos con clases genéricas. Así, por ejemplo:
 
        ArrayList<Integer> enteros;
 
        declara a enteros como un objeto ArrayList que puede almacenar sólo objetos Integer. Si coloca un valor int en un
        ArrayList<Integer>, el valor int es envuelto (boxed) como objeto Integer, y cuando obtiene un objeto Integer de un
        ArrayList<Integer>, para luego asignar el objeto a una variable int, el valor int dentro del objeto es desenvuelto (unboxed).
        
        En los capítulos 16 y 20 hablaremos sobre otras clases de colecciones genéricas y sobre genéricos. La figura 7.23 muestra
        algunos métodos comunes de la clase ArrayList<T>.
 
        Método      Descripción
        add         Agrega un elemento al final del objeto ArrayList.
        clear       Elimina todos los elementos del objeto ArrayList.
        contains    Devuelve true si el objeto ArrayList contiene el elemento especificado; en caso contrario, devuelve false.
        get         Devuelve el elemento en el índice especificado.
        indexOf     Devuelve el índice de la primera ocurrencia del elemento especificado en el objeto ArrayList.
        remove      Sobrecargado. Elimina la primera ocurrencia del valor especificado o del elemento en el subíndice especificado.
        size        Devuelve el número de elementos almacenados en el objeto ArrayList.
        trimToSize  Recorta la capacidad del objeto ArrayList al número actual de elementos.
 
        Java SE 7: notación de diamante (<>) para crear un objeto de una clase genérica:
        Considere la línea 10 de la figura 7.24:
        
        ArrayList<String> elementos = new ArrayList<String>();
 
        Observe que ArrayList<String> aparece en la declaración de la variable y en la expresión de creación de instancia de clase.
        Java SE 7 introdujo la notación de diamante (<>) para simplificar instrucciones como ésta. Al usar <> en una expresión de
        creación de instancia de clase para un objeto de una clase genérica, indicamos al compilador que debe determinar lo que
        pertenece en los paréntesis angulares. En Java SE 7 y versiones superiores, la instrucción anterior puede escribirse así:

        ArrayList<String> elementos = new ArrayList<>();
 
        Cuando el compilador encuentra el diamante (<>) en la expresión de creación de instancia de clase, usa la declaración de la
        variable elementos para determinar el tipo de elemento (String) de ArrayList; a esto se le conoce como inferir el tipo del
        elemento.
        */
        /*
        Ejemplo práctico de la clase tiempo:
        -----Observación de ingeniería de software-----
        Para un método como establecerTiempo en la figura 8.1, valide todos los argumentos del método antes de usarlos para establecer
        los valores de las variables de instancia. Con esto se asegura de que los datos del objeto se modifiquen sólo si todos los 
        argumentos son válidos.
        -----Observación de ingeniería de software-----
        En el capítulo 3 vimos que los métodos declarados con el modificador de acceso private pueden ser llamados sólo por otros
        métodos de la clase en la que se declaran los métodos private. Por lo general a dichos métodos se les conoce como métodos
        utilitarios o métodos ayudantes, ya que se usan comúnmente para dar soporte a la operación de los otros métodos de la clase.
        -----Observación de ingeniería de software-----
        Las clases simplifican la programación, ya que el cliente sólo puede utilizar los métodos public expuestos por la clase. Dichos
        miembros por lo general están orientados a los clientes, en vez de estar dirigidos a la implementación. Los clientes nunca se
        percatan de (ni se involucran en) la implementación de una clase. Por lo general se preocupan por lo que hace la clase, pero no
        por cómo lo hace.
        -----Observación de ingeniería de software-----
        Las interfaces cambian con menos frecuencia que las implementaciones. Cuando cambia una implementación, el código que depende
        de ella debe cambiar de manera acorde. Si se oculta la implementación se reduce la posibilidad de que otras partes del programa
        se vuelvan dependientes de los detalles de la implementación de la clase.
 
        Control del acceso a los miembros:
        Los modificadores de acceso public y private controlan el acceso a las variables y a los métodos de una clase. En el capítulo 9
        presentaremos el modificador de acceso adicional protected. El principal propósito de los métodos public es presentar a los
        clientes de la clase una vista de los servicios que proporciona (es decir, la interfaz public de la clase). Los clientes de la
        clase no necesitan preocuparse por la forma en que ésta realiza sus tareas. Por esta razón, las variables y métodos private de
        una clase (es decir, sus detalles de implementación) no son accesibles para sus clientes.
 
        -----Error común de programación-----
        Cuando un método que no es miembro de una clase trata de acceder a un miembro private de ésta, se produce un error de
        compilación.
 
        Referencias a los miembros del objeto actual mediante la referencia this:
        Cada objeto puede acceder a una referencia a sí mismo mediante la palabra clave this (también conocida como referencia this).
        Cuando se hace una llamada a un método de instancia para un objeto específico, el cuerpo del método utiliza en forma implícita
        la palabra clave this para hacer referencia a las variables de instancia y a otros métodos. Esto permite al código de la clase
        saber qué objeto se debe manipular.
 
        -----Tip para prevenir errores-----
        La mayoría de los IDE emitirán una advertencia si usa x = x; en vez de this.x = x;. La instrucción x = x; se conoce por lo
        general como "no-op" (sin operación).
 
        -----Tip de rendimiento-----
        Para conservar la memoria, Java mantiene sólo una copia de cada método por clase; todos los objetos de la clase invocan a este
        método. Por otro lado, cada objeto tiene su propia copia de las variables de instancia de la clase. Cada método de la clase
        utiliza en forma implícita la referencia this para determinar el objeto específico de la clase que se manipulará.
 
        Ejemplo práctico de la clase Tiempo: constructores sobrecargados:
        Como sabe, puede declarar su propio constructor para especificar cómo deben inicializarse los objetos de una clase. A
        continuación demostraremos una clase con varios constructores sobrecargados que permiten a los objetos de esa clase
        inicializarse de distintas formas. Para sobrecargar los constructores, sólo hay que proporcionar varias declaraciones del
        constructor con distintas firmas.
 
        -----Error común de programación-----
        Es un error de sintaxis utilizar this en el cuerpo de un constructor para llamar a otro de los constructores de la misma clase,
        si esa llamada no es la primera instrucción en el constructor. También se produce un error de compilación cuando un método
        trata de invocar a un constructor directamente, mediante this.
 
        -----Observación de ingeniería de software-----
        Cuando un objeto de una clase tiene una referencia a otro objeto de la misma clase, el primer objeto puede acceder a todos los
        datos y métodos del segundo (incluyendo los que sean private).
 
        -----Tip para prevenir errores-----
        Asegúrese de no incluir un tipo de valor de retorno en la definición de un constructor. Java permite que otros métodos de la
        clase, además de sus constructores, tengan el mismo nombre de la clase y especifiquen tipos de valores de retorno. Dichos
        métodos no son constructores, por lo que no se llaman cuando se crea una instancia de un objeto de la clase.
 
        -----Error común de programación-----
        Si un programa intenta inicializar un objeto de una clase al pasar el número incorrecto de tipos de argumentos a su constructor,
        ocurre un error de compilación.
 
        Observaciones acerca de los métodos Establecer y Obtener:
        Los métodos establecer se conocen comúnmente como métodos mutadores, porque por lo general cambian el estado de un objeto; es
        decir, modifican los valores de las variables de instancia. Los métodos obtener se conocen en general como métodos de acceso o
        métodos de consulta.
 
        -----Observación de ingeniería de software-----
        Las clases nunca deben tener datos public no constantes, pero si declaran datos como public static final, los clientes de su
        clase podrán tener acceso a las constantes. Por ejemplo, la clase Math ofrece las constantes public static final llamadas:
        Math.E y Math.PI.
 
        -----Tip para prevenir errores-----
        No proporcione constantes public static final si es probable que los valores de esas constantes cambien en versiones futuras de
        su software.
 
        -----Observación de ingeniería de software-----
        Cuando sea apropiado, proporcione métodos public para cambiar y obtener los valores de las variables de instancia private. Esta
        arquitectura ayuda a ocultar la implementación de una clase a sus clientes, lo cual mejora la capacidad de modificación de un
        programa.
        
        -----Tip para prevenir errores-----
        Utilizar métodos establecer y obtener nos ayuda a crear clases que sean más fáciles de depurar y mantener. Si sólo un método
        realiza una tarea específica, como establecer una variable de instancia en un objeto, es más fácil depurar y mantener esa clase.
        Si la variable de instancia no se establece en forma apropiada, el código que modifica la variable de instancia se localiza en
        el cuerpo de un método establecer. Así, sus esfuerzos de depuración pueden enfocarse en ese método.
 
        Composición:
        Una clase puede tener referencias a objetos de otras clases como miembros. A dicha capacidad se le conoce como composición y
        algunas veces como "relación tiene un". Por ejemplo, un objeto de la clase RelojAlarma necesita saber la hora actual y la hora
        en la que se supone sonará su alarma, por lo que es razonable incluir dos referencias a objetos Tiempo como miembros del objeto
        RelojAlarma.

        Tipos enum:
        En la figura 6.8 presentamos el tipo básico enum, que define a un conjunto de constantes que se representan como
        identificadores únicos. En ese programa, las constantes enum representaban el estado del juego.

        En esta sección hablaremos sobre la relación entre los tipos enum y las clases. Al igual que las clases, todos los tipos enum
        son tipos por referencia. Un tipo enum se declara con una declaración enum, la cual es una lista separada por comas
        de constantes enum. La declaración puede incluir, de manera opcional, otros componentes de las clases tradicionales, como
        constructores, campos y métodos (como veremos en un momento). Cada declaración enum declara a una clase enum con las
        siguientes restricciones:
        1. Las constantes enum son implícitamente final.
        2. Las constantes enum son implícitamente static.
        3. Cualquier intento por crear un objeto de un tipo enum con el operador new produce un error de compilación.
 
        Las constantes enum pueden emplearse en cualquier parte en donde sea posible utilizar las constantes, como en las etiquetas
        case de las instrucciones switch, y para controlar las instrucciones for mejoradas.
 
        -----Error común de programación-----
        En una declaración enum, es un error de sintaxis declarar constantes enum después de los constructores, campos y métodos del
        tipo de enum.
 
        Recolección de basura:
        Todo objeto utiliza recursos del sistema, como la memoria. Necesitamos una manera disciplinada de regresarlos al sistema cuando
        ya no se necesitan; de lo contrario, podrían ocurrir "fugas de recursos" que impidan que nuestro programa, o tal vez hasta
        otros programas, los utilicen. La máquina virtual de Java (JVM) realiza la recolección de basura en forma automática para
        reclamar la memoria ocupada por los objetos que ya no se usan. Cuando ya no hay más referencias a un objeto, éste se convierte
        en candidato para la recolección de basura. Por lo general, esto ocurre cuando la JVM ejecuta su recolector de basura. Por lo
        tanto, las fugas de memoria que son comunes en otros lenguajes como C y C++ (debido a que en esos lenguajes la memoria no se
        reclama de manera automática) son menos probables en Java; sin embargo, aún pueden ocurrir algunas, aunque con menos magnitud.
        También pueden ocurrir otros tipos de fugas de recursos. Por ejemplo, una aplicación podría abrir un archivo en disco para
        modificar el contenido. Si la aplicación no cierra el archivo, ninguna otra aplicación puede utilizarlo sino hasta que termine
        la que lo abrió.

        -----Observación de ingeniería de software-----
        Muchas clases de la API de Java (como la clase Scanner y las clases que leen de archivos o los escriben en el disco)
        proporcionan métodos clase o dispose que los programadores pueden llamar para liberar recursos cuando ya no se necesitan
        en un programa.

        Miembros de clase static:
        Cada objeto tiene su propia copia de todas las variables de instancia de la clase. En ciertos casos, sólo debe compartirse una
        copia de cierta variable entre todos los objetos de una clase. En esos casos se utiliza un campo static (al cual se le conoce
        como una variable de clase). Una variable static representa información en toda la clase, ya que todos los objetos de la clase
        comparten la misma pieza de datos. La declaración de una variable static comienza con la palabra clave static.

        -----Observación de ingeniería de software-----
        Use una variable static cuando todos los objetos de una clase tengan que utilizar la misma copia de la variable.

        -----Observación de ingeniería de software-----
        Las variables de clase y los métodos static existen, y pueden utilizarse, incluso aunque no se hayan instanciado objetos de esa
        clase.

        -----Error común de programación-----
        Si un método static llama a un método de instancia en la misma clase sólo con el nombre del método, se produce un error de
        compilación. De manera similar, si un método static trata de acceder a una variable de instancia en la misma clase únicamente
        con el nombre de la variable, se produce un error de compilación.

        -----Error común de programación-----
        Hacer referencia a this en un método static es un error de compilación.

        -----Buena práctica de programación-----
        Para invocar a cualquier método static, utilice el nombre de la clase y un punto (.) para enfatizar que el método que se está
        llamando es un método static.

        Declaración de importación static:
        En la sección 6.3 aprendió acerca de los campos y métodos static de la clase Math. Para acceder a estos campos y métodos,
        anteponemos a cada uno de ellos el nombre de la clase Math y un punto (.). Una declaración de importación static nos permite
        importar los miembros static de una clase o interfaz, para poder acceder a ellos mediante sus nombres no calificados en nuestra
        clase; es decir, el nombre de la clase y el punto (.) no se requieren para usar un miembro static importado.

        Formas de importación static:
        Una declaración static import tiene dos formas: una que importa un miembro static específico (que se conoce como declaración de
        importación static individual) y una que importa a todos los miembros static de una clase (que se conoce como declaración de
        importación static sobre demanda). La siguiente sintaxis importa un miembro static específico:
        import static nombrePaquete.NombreClase.nombreMiembroEstático;
        en donde nombrePaquete es el paquete de la clase (por ejemplo, java.lang), NombreClase es el nombre de la clase (por ejemplo,
        Math) y nombreMiembroEstático es el nombre del campo o método static (por ejemplo, PI o abs). La siguiente sintaxis importa
        todos los miembros static de una clase:
        import static nombrePaquete.NombreClase.*;
        El asterisco (*) indica que todos los miembros static de la clase especificada deben estar disponibles para usarlos en el
        archivo. Las declaraciones de importación static sólo importan miembros de clase static. Las instrucciones import regulares
        deben usarse para especificar las clases utilizadas en un programa.

        -----Error común de programación-----
        Si un programa trata de importar métodos de clase static que tengan la misma firma, o campos static que tengan el mismo nombre,
        de dos o más clases, se produce un error de compilación.

        Variables de instancia final:
        El principio del menor privilegio es fundamental para la buena ingeniería de software. En el contexto de una aplicación, el
        principio establece que al código sólo se le debe otorgar tanto privilegio y acceso como necesite para llevar a cabo su tarea
        designada, pero no más. Esto hace a sus programas más robustos, al evitar que el código modifique por accidente (o de manera
        intencional) los valores de las variables y haga llamadas a métodos que no deben ser accesibles.
 
        Veamos ahora cómo se aplica este principio a las variables de instancia. Algunas de ellas necesitan modificarse, mientras que
        otras no. Usted puede utilizar la palabra clave final para especificar que una variable no puede modificarse (es decir, que
        sea una constante) y que cualquier intento por modificarla sería un error. Por ejemplo:
        private final int INCREMENTO;
        declara una variable de instancia final (constante) llamada INCREMENTO, de tipo int. Dichas variables se pueden inicializar al
        momento de declararse. De lo contrario, se debe hacer en cada uno de los constructores de la clase. Al inicializar las
        constantes en los constructores, cada objeto de la clase puede tener un valor distinto para la constante. Si una variable
        final no se inicializa en su declaración o en cada constructor, se produce un error de compilación.
 
        -----Observación de ingeniería de software-----
        Declarar una variable deinstancia como final ayuda a hacer valer el principio del menor privilegio. Si una variable de
        instancia no debe modificarse, declárela como final para evitar su modificación. Por ejemplo, en la figura 8.8, las variables
        de instancia nombre, apellido, fechaNacimiento y fechaContratacion nunca se modifican después de inicializarse, por lo que
        deben declararse como final. Implementaremos esta práctica en todos los programas de aquí en adelante. En el capítulo 23,
        Concurrency, verá los beneficios adicionales de final.
 
        -----Error común de programación-----
        Tratar de modificar una variable de instancia final después de inicializarla es un error de compilación.
 
        -----Tip para prevenir errores-----
        Los intentos por modificar una variable de instancia final se atrapan en tiempo de compilación, en vez de producir errores en
        tiempo de ejecución. Siempre es preferible sacar los errores en tiempo de compilación, si es posible, en vez de permitir que
        se pasen hasta el tiempo de ejecución (en donde la experiencia nos ha demostrado que la reparación es a menudo mucho más
        costosa).
 
        -----Observación de ingeniería de software-----
        Un campo final también debe declararse como static, si se inicializa en su declaración con un valor que sea el mismo para
        todos los objetos de la clase. Después de la inicialización, su valor ya no puede cambiar. Por lo tanto, no es necesario tener
        una copia independiente del campo para cada objeto de la clase. Al hacer a ese campo static, se permite que todos los objetos
        de la clase compartan el campo final.
 
        Acceso a paquetes:
        Si al momento de declarar la clase no se especifica un modificador de acceso como public, protected o private (hablaremos
        sobre protected en el capítulo 9) para un método o variable, se considerará que tiene acceso a nivel de paquete.
 
        En un programa que consiste de una declaración de clase, esto no tiene un efecto específico. No obstante, si un programa
        utiliza varias clases del mismo paquete (es decir, un grupo de clases relacionadas), éstas pueden acceder directamente a los
        miembros con acceso a nivel de paquete de cada una de las otras clases, a través de referencias a objetos de las clases
        apropiadas, o en el caso de los miembros static, a través del nombre de la clase. Raras veces se utiliza el acceso a nivel de
        paquete.
 
        Uso de BigDecimal para cálculos monetarios precisos:
        En capítulos anteriores, demostramos los cálculos monetarios usando valores de tipo double. En el cap 5 ítulo 5 hablamos sobre
        el hecho de que algunos valores double se representan de manera aproximada.
 
        Cualquier aplicación que requiera cálculos precisos de punto flotante (como los de las aplicaciones financieras) debe mejor
        usar la clase BigDecimal (del paquete java.math).
 */
        /*
        HERENCIA:
        Miembros protected:
        En el capítulo 8 hablamos sobre los modificadores de acceso public y private. Los miembros public de una clase son accesibles
        en cualquier parte en donde el programa tenga una referencia a un objeto de esa clase, o una de sus subclases. Los miembros
        private de una clase son accesibles sólo dentro de la misma clase. En esta sección presentaremos el modificador de acceso
        protected. El uso del acceso protected ofrece un nivel intermedio de acceso entre public y private. Los miembros protected de
        una superclase pueden ser utilizados por los miembros de esa superclase, por los de sus subclases y por los de otras clases en
        el mismo paquete; es decir, los miembros protected también tienen acceso a nivel de paquete.
        
        Todos los miembros public y protected de una superclase conservan su modificador de acceso original cuando se convierten en
        miembros de la subclase (por ejemplo, los miembros public de la superclase se convierten en miembros public de la subclase, y
        los miembros protected de la superclase se vuelven miembros protected de la subclase). Los miembros private de una superclase
        no pueden utilizarse fuera de la propia clase. En cambio, están ocultos en sus subclases y se pueden utilizar sólo a través de
        los métodos public o protected heredados de la superclase.
        
        Los métodos de una subclase pueden referirse a los miembros public y protected que se hereden de la superclase con sólo
        utilizar los nombres de los miembros. Cuando un método de la subclase sobrescribe al método heredado de la superclase, este
        último puede utilizarse desde la subclase si se antepone a su nombre la palabra clave super y un punto (.) como separador. En 
        la sección 9.4 hablaremos sobre el acceso a los miembros sobrescritos de la superclase.
        
        -----Observación de ingeniería de software-----
        Los métodos de una subclase no pueden tener acceso directo a los miembros private de su superclase. Una subclase puede
        modificar el estado de las variables de instancia private de la superclase sólo a través de los métodos que no sean private,
        que se proporcionan en la superclase y que son heredados por la subclase.
        
        -----Observación de ingeniería de software-----
        Declarar variables de instancia private ayuda a los programadores a probar, depurar y modificar correctamente los sistemas.
        Si una subclase puede acceder a las variables de instancia private de su superclase, las clases que hereden de esa subclase
        podrían acceder a las variables de instancia también. Esto propagaría el acceso a las que deberían ser variables de instancia
        private, y se perderían los beneficios del ocultamiento de la información.
        
        -----Tip para prevenir errores-----
        Aunque la anotación @Override es opcional, declare los métodos sobrescritos con ella para asegurar en tiempo de compilación
        que haya definido sus firmas correctamente. Siempre es mejor encontrar errores en tiempo de compilación que en tiempo de
        ejecución. Por esta razón, los métodos toString de la figura 7.9 y los ejemplos del capítulo 8 deberían haberse declarado con
        @Override.
        
        -----Error común de programación-----
        Es un error de compilación sobrescribir un método con un modificador de acceso más restringido; un método public de la
        superclase no puede convertirse en un método protected o private en la subclase; un método protected de la superclase no
        puede convertirse en un método private en la subclase. Hacer esto sería quebrantar la relación "es un", en la que se requiere
        que todos los objetos de la subclase puedan responder a las llamadas a métodos que se hagan a los métodos public declarados en
        la superclase. Si un método public pudiera sobrescribirse como protected o private, los objetos de la subclase no podrían
        responder a las mismas llamadas a métodos que los objetos de la superclase. Una vez que se declara un método como public en
        una superclase, el método sigue siendo public para todas las subclases directas e indirectas de esa clase.
        
        -----Observación de ingeniería de software-----
        Con la herencia, las variables de instancia y los métodos comunes de todas las clases de la jerarquía se declaran en una
        superclase. La subclase hereda las modificaciones que se realizan en estas características comunes de la superclase. Sin la
        herencia, habría que modificar todos los archivos de código fuente que contengan una copia del código en cuestión.
        
        -----Observación de ingeniería de software-----
        En la etapa de diseño en un sistema orientado a objetos, a menudo encontrará que ciertas clases están muy relacionadas entre
        sí. Debe "excluir" las variables de instancia y los métodos comunes, y colocarlos en una superclase. Después hay que usar la
        herencia para desarrollar subclases, especializándolas con capacidades más allá de las que hereden de la superclase.
        
        -----Observación de ingeniería de software-----
        Al declarar una subclase no se afecta el código fuente de su superclase. La herencia preserva la integridad de la superclase.
        
        -----Observación de ingeniería de software-----
        Anteriormente aprendió que no se debe llamar a los métodos de instancia de una clase desde sus constructores; le diremos por
        qué en el capítulo 10. Llamar al constructor de una superclase desde el constructor de una subclase no contradice este consejo.
        
        -----Observación de ingeniería de software-----
        Use el modificador de acceso protected cuando una superclase deba proporcionar un método sólo a sus subclases y a otras clases
        en el mismo paquete, pero no a otros clientes.
        
        -----Observación de ingeniería de software-----
        Al declarar variables de instancia private (en vez de protected) en la superclase, se permite que la implementación de la
        superclase para estas variables de instancia cambie sin afectar las implementaciones de las subclases.
        
        -----Tip para prevenir errores-----
        Cuando sea posible, no incluya variables de instancia protected en una superclase. En vez de ello, incluya métodos no private
        que accedan a las variables de instancia private. Esto ayudará a asegurar que los objetos de la clase mantengan estados
        consistentes.
        
        -----Error común de programación-----
        Cuando el método de una superclase se sobrescribe en una subclase, por lo general la versión de esta última llama a la versión
        de la superclase para que realice una parte del trabajo. Si no se antepone al nombre del método de la superclase la palabra
        clave super y el separador punto (.) al llamar al método de la superclase, entonces el método de la subclase se llamaría a sí
        mismo, lo cual podría generar un error conocido como recursividad infinita, que en un momento dado provocaría un
        desbordamiento de la pila de llamadas a métodos: un error fatal en tiempo de ejecución. Cuando la recursividad se usa en forma
        correcta, es una herramienta poderosa que veremos en el capítulo 18.
        
        -----Observación de ingeniería de software-----
        Java asegura que, aun si un constructor no asigna un valor a una variable de instancia, de todas formas ésta se inicializa con
        su valor predeterminado (es decir, 0 para los tipos numéricos primitivos, false para los tipos boolean y null para las
        referencias).
        */
        /*
        POLIMORFISMO:
        -----Observación de ingeniería de software-----
        El polimorfismo nos permite tratar con las generalidades y dejar que el entorno en tiempo de ejecución se encargue de los
        detalles específicos. Podemos ordenar a los objetos que se comporten en formas apropiadas para ellos, sin necesidad de
        conocer sus tipos específicos, siempre y cuando éstos pertenezcan a la misma jerarquía de herencia.
        
        -----Observación de ingeniería de software-----
        El polimorfismo promueve la extensibilidad, ya que el software que invoca el comportamiento polimórfico es independiente de
        los tipos de los objetos a los cuales se envían los mensajes. Es posible incorporar en un sistema nuevos tipos de objetos que
        puedan responder a las llamadas de los métodos existentes, sin necesidad de modificar el sistema base. Sólo el código cliente
        que crea instancias de los nuevos objetos debe modificarse para dar cabida a los nuevos tipos.
        
        -----Observación de ingeniería de software-----
        Aunque está permitida, por lo general es mejor evitar la conversión descendente.
        
        Clases y métodos abstractos:
        Cuando pensamos en un tipo de clase, asumimos que los programas crearán objetos de ese tipo. En algunos casos es conveniente
        declarar clases (conocidas como clase abstractas) para las cuales el programador nunca creará instancias de objetos. Puesto
        que sólo se utilizan como superclases en jerarquías de herencia, nos referimos a ellas como superclases abstractas. Estas
        clases no pueden utilizarse para instanciar objetos ya que, como veremos pronto, las clases abstractas están incompletas. Las
        subclases deben declarar las "piezas faltantes" para convertirse en clases "concretas", a partir de las cuales podemos
        instanciar objetos. De lo contrario, estas subclases también serán abstractas. En la sección 10.5 demostraremos las clases
        abstractas.
        
        Propósito de las clases abstractas:
        El propósito de una clase abstracta es proporcionar una superclase apropiada, a partir de la cual puedan heredar otras clases
        y, por ende, compartir un diseño común.
        
        Declaración de una clase abstracta y de métodos abstractos:
        Para hacer una clase abstracta, ésta se declara con la palabra clave abstract. Por lo general, esta clase contiene uno o más
        métodos abstractos. Un método abstracto es un método de instancia con la palabra clave abstract en su declaración, como en:
        
        public abstract void dibujar(); // método abstracto
        
        Los métodos abstractos no proporcionan implementaciones. Una clase que contiene uno o más métodos abstractos debe declararse
        de manera explícita como abstract, aun si esa clase contiene métodos concretos (no abstractos). Cada subclase concreta de una
        superclase abstracta también debe proporcionar implementaciones concretas de cada uno de los métodos abstractos de la
        superclase. Los constructores y los métodos static no pueden declararse como abstract. Los constructores no se heredan, por lo
        que nunca podría implementarse un constructor abstract. Aunque los métodos static que no son private se heredan, no pueden
        sobrescribirse. Como el propósito de los métodos abstract es sobrescribirlos para procesar objetos con base en sus tipos, no
        tendría sentido declarar un método static como abstract.
        
        Observación de ingeniería de software 10.4
        Una clase abstracta declara los atributos y comportamientos comunes (tanto abstractos como concretos) de las diversas clases
        en una jerarquía de clases. Por lo general, una clase abstracta contiene uno o más métodos abstractos, que las subclases deben
        sobrescribir si van a ser concretas. Las variables de instancia y los métodos concretos de una clase abstracta están sujetos a
        las reglas normales de la herencia.
        
        Error común de programación 10.1
        Tratar de instanciar un objeto de una clase abstracta es un error de compilación.
        
        Error común de programación 10.2
        Si no se implementan los métodos abstractos de una superclase en una subclase, se produce un error de compilación, a menos que
        la subclase también se declare como abstract.
        
        -----Tip para prevenir errores-----
        Hemos dicho que no debe llamar a los métodos de instancia de una clase desde sus constructores (puede llamar a los métodos
        static de la clase y hacer la llamada requerida a uno de los constructores de la superclase). Si sigue este consejo, evitará
        el problema de llamar a los métodos sobrescritos de la clase, ya sea de manera directa o indirecta, lo cual puede provocar
        errores en tiempo de ejecución.
        
        -----Tip para prevenir errores-----
        Hemos dicho que no debe llamar a los métodos de instancia de una clase desde sus constructores (puede llamar a los métodos
        static de la clase y hacer la llamada requerida a uno de los constructores de la superclase). Si sigue este consejo, evitará
        el problema de llamar a los métodos sobrescritos de la clase, ya sea de manera directa o indirecta, lo cual puede provocar
        errores en tiempo de ejecución.
        
        -----Error común de programación-----
        Asignar una variable de la superclase a una variable de la subclase es un error de compilación.
        
        -----Error común de programación-----
        Al realizar una conversión descendente sobre una referencia, se produce una excepción ClassCastException si, en tiempo de
        ejecución, el objeto al que se hace referencia no tiene una relación es-un con el tipo especificado en el operador de
        conversión.
        
        -----Observación de ingeniería de software-----
        Aunque el método que se vaya a llamar depende del tipo en tiempo de ejecución del objeto al que una variable hace referencia,
        puede utilizarse una variable para invocar sólo a los métodos que sean miembros del tipo de ésta, lo cual verifica el
        compilador.
        
        Asignaciones permitidas entre variables de la superclase y la subclase:
        
        Hemos visto tres maneras apropiadas de asignar referencias de una superclase y de una subclase a las variables de sus tipos:
        1. Asignar una referencia de la superclase a una variable de ésta es un proceso simple y directo.
        2. Asignar una referencia de la subclase a una variable de ésta es un proceso simple y directo.
        3. Asignar una referencia de la subclase a una variable de la superclase es seguro, ya que el objeto de la subclase es un
        objeto de su superclase. No obstante, la variable de la superclase puede usarse para referirse sólo a los miembros de la
        superclase. Si este código hace referencia a los miembros que pertenezcan sólo a la subclase, a través de la variable de la
        superclase, el compilador reporta errores.
        
        Métodos y clases final:
        En las secciones 6.3 y 6.10 vimos que las variables pueden declararse como final para indicar que no pueden modificarse una
        vez que se inicializan. Dichas variables representan valores constantes. También es posible declarar métodos, parámetros de
        los métodos y clases con el modificador final.
        
        Los métodos final no se pueden sobrescribir:
        Un método final en una superclase no puede sobrescribirse en una subclase. Esto garantiza que todas las subclases directas e
        indirectas en la jerarquía utilicen la implementación del método final. Los métodos que se declaran como private son
        implícitamente final, ya que es imposible sobrescribirlos en una subclase. Los métodos que se declaran como static también
        son implícitamente final. La declaración de un método final nunca puede cambiar, por lo cual todas las subclases utilizan la
        misma implementación del método, y las llamadas a los métodos final se resuelven en tiempo de compilación; a esto se le conoce
        como vinculación estática.
        
        Las clases final no pueden ser superclases:
        Una clase final no se puede extender para crear una subclase. Todos los métodos en una clase final son implícitamente final.
        
        Ya hemos hablado sobre declarar variables, métodos y clases como final, y hemos enfatizado que si algo puede ser final, debe
        ser final. Los compiladores pueden realizar varias optimizaciones cuando saben que algo es final. Cuando estudiemos la
        concurrencia en el capítulo 23, verá que las variables final facilitan en gran medida la paralelización de sus programas para
        usarse en los procesadores multinúcleo de la actualidad.
        
        -----Error común de programación-----
        Tratar de declarar una subclase de una clase final es un error de compilación.
        
        Observación de ingeniería de software
        En la API de Java, la vasta mayoría de clases no se declara como final. Esto permite la herencia y el polimorfismo. Sin
        embargo, en algunos casos es importante declarar las clases como final; generalmente por razones de seguridad. Además,
        a menos que diseñe con cuidado una clase para extenderse, debe declarar la clase como final para evitar errores (a menudo
        sutiles).
        
        Una explicación más detallada de los problemas con las llamadas a métodos desde los constructores:
        No llame desde los constructores a los métodos que puedan sobrescribirse. Al crear un objeto de una subclase, esto podría
        provocar que se llamara un método sobrescrito antes de que se inicializara por completo el objeto de la subclase.
        
        Recuerde que al construir el objeto de una subclase, su constructor llama primero a uno de los constructores de la superclase
        directa. Si el constructor de la superclase llama a un método que pueda sobrescribirse, el constructor de la superclase
        llamará a la versión de la subclase de ese método, antes de que el cuerpo del constructor de la subclase tenga la oportunidad
        de ejecutarse. Esto podría provocar errores sutiles y difíciles de detectar si el método de la subclase que se llamó depende
        de una inicialización que aún no se haya realizado en el cuerpo del constructor de la subclase.

        Es aceptable llamar a un método static desde un constructor. Por ejemplo, un constructor y un método establecer realizan a
        menudo la misma validación para una variable de instancia específica. Si el código de validación es breve, es aceptable
        duplicarlo en el constructor y el método establecer. Si se requiere una validación más extensa, defina un método de validación
        static (por lo general un método ayudante private) y luego llámelo desde el constructor y el método establecer. También es
        aceptable que un constructor llame a un método de instancia final, siempre y cuando el método no llame de manera directa o
        indirecta un método de instancia que pueda sobrescribirse.
        
        Creación y uso de interfaces:
        [Nota: como está escrita, esta sección y su código se aplican en Java SE 7. Las mejoras a la interfaz de Java SE 8 se
        presentan en la sección 10.10 y se describen con más detalle en el capítulo 17].
        
        Estandarización de las interacciones:
        Las interfaces definen y estandarizan las formas en que pueden interactuar las cosas entre sí, como las personas y los
        sistemas. Por ejemplo, los controles en una radio sirven como una interfaz entre los usuarios de la radio y sus componentes
        internos. Los controles permiten a los usuarios realizar un conjunto limitado de operaciones (por ejemplo, cambiar la
        estación, ajustar el volumen, seleccionar AM o FM), y distintas radios pueden implementar los controles de distintas formas
        (por ejemplo, el uso de botones, perillas, comandos de voz). La interfaz especifica qué operaciones debe permitir la radio
        que realicen los usuarios, pero no cómo deben hacerse.
        
        Los objetos de software se comunican a través de interfaces:
        Los objetos de software también se comunican a través de interfaces. Una interfaz de Java describe un conjunto de métodos que
        pueden llamarse sobre un objeto; por ejemplo, para indicar al objeto que realice cierta tarea, o que devuelva cierta pieza de
        información. El siguiente ejemplo presenta una interfaz llamada PorPagar, la cual describe la funcionalidad de cualquier
        objeto que deba ser "capaz de recibir un pago" y, por lo tanto, debe ofrecer un método para determinar el monto de pago
        vencido apropiado. La declaración de una interfaz empieza con la palabra clave interface y sólo puede contener constantes y
        métodos abstract. A diferencia de las clases, todos los miembros de la interfaz deben ser public, y las interfaces no pueden
        especificar ningún detalle de implementación, como las declaraciones de métodos concretos y variables de instancia. Todos los
        métodos que se declaran en una interfaz son de manera implícita public abstract, y todos los campos son implícitamente public,
        static y final.
        
        -----Buena práctica de programación-----
        De acuerdo con la Especificación del lenguaje Java, es un estilo apropiado declarar los métodos abstract de una interfaz sin
        las palabras clave public y abstract, ya que son redundantes en las declaraciones de los métodos de la interfaz. De manera
        similar, las constantes de una interfaz deben declararse sin las palabras clave public, static y final, ya que también son
        redundantes.
        
        Uso de una interfaz:
        Para utilizar una interfaz, una clase concreta debe especificar que implementa a esa interfaz y debe declarar cada uno de sus
        métodos con la firma especificada en la declaración de la interfaz. Para especificar que una clase implementa a una interfaz,
        agregamos la palabra clave implements y el nombre de la interfaz al final de la primera línea de la declaración de nuestra
        clase. Una clase que no implementa a todos los métodos de la interfaz es una clase abstracta, y debe declararse como abstract.
        Implementar una interfaz es como firmar un contrato con el compilador que diga, "Declararé todos los métodos especificados por
        la interfaz, o declararé mi clase como abstract".
        
        -----Error común de programación-----
        Si no declaramos ningún método de una interfaz en una clase concreta que implemente a esa interfaz, se produce un error de
        compilación indicando que la clase debe declararse como abstract.
        
        */
 
    } // fin del método main
} // fin de la clase 'ConceptosGenerales'
