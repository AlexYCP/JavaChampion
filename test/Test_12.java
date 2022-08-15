package test;

public class Test_12 {

    public static void main(String[] args) {

        // Test 12
        for (int n = 1; n <= 10; n++) {
            
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
