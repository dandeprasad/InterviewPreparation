package prep.basic;

public class Fibonacci {

    public static void main(String[] args) {
        int n = 10; // Change n to the desired Fibonacci number
        System.out.println("Fibonacci of " + n + ": " + fibonacci(n));
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}

