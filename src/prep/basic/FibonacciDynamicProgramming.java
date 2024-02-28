package prep.basic;

import java.util.HashMap;
import java.util.Map;

public class FibonacciDynamicProgramming {

    private static Map<Integer, Integer> memo = new HashMap<>();

    public static void main(String[] args) {
        int n = 10; // Change n to the desired Fibonacci number
        System.out.println("Fibonacci of " + n + ": " + fibonacci(n));
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        if (memo.containsKey(n)) {
            return memo.get(n);
        } else {
            int result = fibonacci(n - 1) + fibonacci(n - 2);
            memo.put(n, result);
            return result;
        }
    }
}

