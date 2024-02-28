package prep.basic;

public class LCMExample {

    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 18;

        // Calculate and print LCM
        int lcmResult = lcm(num1, num2);
        System.out.println("LCM of " + num1 + " and " + num2 + ": " + lcmResult);
    }

    // Method to calculate GCD using the Euclidean Algorithm
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }

    // Method to calculate LCM using the formula: LCM(a, b) = |a * b| / GCD(a, b)
    private static int lcm(int a, int b) {
        return Math.abs(a * b) / gcd(a, b);
    }
}
