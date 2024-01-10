public class FindFactorial {

    public static int Factorial(int n) {

        if (n == 0)
            return 1;
        if (n < 0) {
            System.out.println("Negatives Not Accepted!");
            return -1;
        }

        return n * Factorial(n - 1);

    }

    public static void main(String[] args) {

        System.out.println(Factorial(9));

    }

}
