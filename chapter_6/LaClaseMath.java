package chapter_6;

public class LaClaseMath {

    public static void main(String[] args) {

        // La clase Math y sus métodos estáticos
        // ejercicio: Calcular el área de un círculo
        double radio = 7;

        /*
        En ésta instrucción llamé a la Clase Math y a sus métodos estáticos que describiré a continuación: PI se utiliza para
        inicializar una variable con el valor exacto de pi y pow se utiliza para elevar a un valor por una determinada potencia
         */
        double areaDelCirculo = (Math.PI * Math.pow(radio, 2)) / 2;

        System.out.printf("El área del circulo es de %.2f cm", areaDelCirculo);

    }

}
