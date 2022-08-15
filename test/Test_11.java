package test;

public class Test_11 {

    public static void main(String[] args) {

        // Test 11
        int n = 0;

        while (n < 10) {
            ++n;

            if (n <= 9) {
                if (n == 5) {
                    continue;
                }
                System.out.printf("%d, ", n);
            } else {
                System.out.printf("%d.", n);
            }

        }

    }

}
