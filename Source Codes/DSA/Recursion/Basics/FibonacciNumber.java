public class FibonacciNumber {

    public static int fibonaaciNumber(int n) {

        // base case
        if (n == 1) {

            return 0;

        }
        if (n == 2) {
            return 1;
        }
        return fibonaaciNumber(n - 2) + fibonaaciNumber(n - 1);

    }

    public static void main(String[] args) {

        System.out.println("Find Fibonacci Number Using Recursion");
        System.out.println(fibonaaciNumber(8));

    }
}