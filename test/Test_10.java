package test;

public class Test_10 {

    public static void main(String[] args) {

        // Test 10
        int y = 0;

        do {
            ++y;

            if (y == 5) {
                continue;
            }

            System.out.printf("%d, ", y);
        } while (y < 10);

    }

}
