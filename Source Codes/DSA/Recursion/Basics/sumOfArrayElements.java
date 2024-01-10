import java.util.Arrays;

public class sumOfArrayElements {

    public static int sum(int[] arr) {

        if (arr.length == 0)
            return 0;

        if (arr.length == 1)
            return arr[0];

        return arr[0] + sum(Arrays.copyOfRange(arr, 1, arr.length));

    }

    public static void main(String[] args) {

        int arr[] = { 2, 5, 4, 6, 1, 6, 7 };
        System.out.println(sum(arr));

    }

}
