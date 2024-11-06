public class Fibonacci {

    // Recursive approach to generate and print Fibonacci series
    public static void fibonacciSeriesRecursive(int n) {
        System.out.print("Recursive Fibonacci series up to " + n + " terms: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }
        System.out.println();
    }

    // Helper method for recursive Fibonacci calculation
    private static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Non-recursive approach (iterative) to generate and print Fibonacci series
    public static void fibonacciSeriesIterative(int n) {
        System.out.print("Iterative Fibonacci series up to " + n + " terms: ");
        if (n <= 0) {
            System.out.println();
            return;
        }
        
        int prev = 0, curr = 1;
        System.out.print(prev + " ");
        if (n > 1) {
            System.out.print(curr + " ");
        }

        for (int i = 2; i < n; i++) {
            int next = prev + curr;
            System.out.print(next + " ");
            prev = curr;
            curr = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 10; // Change this value to generate a different length of Fibonacci series

        // Recursive Fibonacci series
        fibonacciSeriesRecursive(n);
        
        // Iterative Fibonacci series
        fibonacciSeriesIterative(n);
    }
}
