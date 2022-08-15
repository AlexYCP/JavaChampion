package test;

public class Test_13 {

    public static void main(String[] args) {

        // Test 13
        int n = 0;

        do {
            ++n;

            if (n <= 9) {
                if (n == 5) {
                    continue;
                }
                System.out.printf("%d, ", n);
            } else {
                System.out.printf("%d.", n);
            }

        } while (n < 10);

    }

}
