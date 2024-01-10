public class reverseANumber {

    static int reverseNum;

    public static int reverse(int n) {

        if (n == 0)
            return 0;

        int dig = n % 10;
        reverseNum = reverseNum * 10 + dig;

        return reverse(n / 10);

    }

    public static void main(String[] args) {

        reverse(852);
        System.out.println(reverseNum);

    }

}
