import java.util.Arrays;

public class binarySearch {

    public static boolean binarySearch(int arr[], int element, int start, int end) {

        int mid = (start + end) / 2;

        if (arr.length == 0)
            return false;

        if (arr[mid] == element)
            return true;

        if (element < arr[mid]) {

            end = mid;
            arr = Arrays.copyOfRange(arr, start, end);
            start = 0;
            end = arr.length;
            return binarySearch(arr, element, start, end);
        }
        if (element > arr[mid]) {
            start = mid + 1;
            arr = Arrays.copyOfRange(arr, start, end);
            start = 0;
            end = arr.length;
            return binarySearch(arr, element, start, end);
        }

        return false;

    }

    public static void main(String[] args) {

        int[] sortedArray = { 12, 14, 18, 19, 21, 26 };
        System.out.println(binarySearch(sortedArray, 25, 0, sortedArray.length));

    }

}
