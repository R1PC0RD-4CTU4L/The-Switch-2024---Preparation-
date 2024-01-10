public class sumOfDigitsOfNumber {

    public static int sumOfDigits(int n) {

        int sum = 0;
        // base case
        if (n == 0) {
            return 0;
        }

        int dig = n % 10;
        sum = sum * 10 + dig;
        return sum + sumOfDigits(n / 10);

    }

    public static void main(String[] args) {

        System.out.println(sumOfDigits(5698));

    }

}
