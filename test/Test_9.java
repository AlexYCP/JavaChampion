package test;

public class Test_9 {

    public static void main(String[] args) {

        // Test 9
        int a = 0;

        while (a < 10) {
            ++a;

            if (a == 5) {
                continue;
            }

            System.out.printf("%d, ", a);
        }

    }

}
