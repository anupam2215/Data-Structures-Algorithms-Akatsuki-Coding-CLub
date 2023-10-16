import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    private static Map<Integer, Long> memo = new HashMap<>();

    public static long calculateFibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        long result = calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
        memo.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        int n = 10; // Change this to calculate the nth Fibonacci number

        long fibN = calculateFibonacci(n);

        System.out.println("Fibonacci(" + n + ") = " + fibN);
    }
}
