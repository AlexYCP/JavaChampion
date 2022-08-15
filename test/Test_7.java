package test;

public class Test_7 {

    public static void main(String[] args) {

        // Test 7
        /*
        En este análisis me doy cuenta que, Cuando se incrementa o decrementa una variable en una instrucción por sí sola, las formas
        de preincremento y postincremento tienen el mismo efecto, y las formas de predecremento y postdecremento también tienen el
        mismo efecto.
         */
        int preincrementarDiez = 10,
                postincrementarDiez = 10,
                predecrementarDiez = 10,
                postdecrementarDiez = 10;

        ++preincrementarDiez;
        postincrementarDiez++;

        --predecrementarDiez;
        postdecrementarDiez--;

        System.out.printf("Valor: 10%n%nPreincremento: %d%nPostincremento: %d%nPredecremento: %d%nPostdecremento: %d",
                preincrementarDiez, postincrementarDiez, predecrementarDiez, postdecrementarDiez);

    }
}
