import java.util.Arrays;

public class sortedArray {

    public static boolean isSorted(int[] arr) {

        System.out.println(Arrays.toString(arr));

        if (arr.length == 0 || arr.length == 1) {
            return true;
        } else {

            if (arr[0] > arr[1]) {
                return false;
            } else {
                arr = Arrays.copyOfRange(arr, 1, arr.length);
                boolean result = isSorted(arr);
                return result;
            }
        }
    }

    public static void main(String[] args) {

        int arr[] = { 8, 16, 24, 32, 40, 48, 40 };
        boolean isSorted = isSorted(arr);

        if (isSorted) {
            System.out.println("Array is Sorted!");
        } else {

            System.out.println("Array is Not Sorted!");
        }

    }

}
