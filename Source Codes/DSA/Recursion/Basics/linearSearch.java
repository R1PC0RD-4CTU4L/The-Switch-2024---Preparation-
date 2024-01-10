import java.util.Arrays;

public class linearSearch {

    public static boolean searchElement(int arr[], int key) {

        if (arr.length == 0)
            return false;

        if (arr[0] == key)
            return true;

        return searchElement(Arrays.copyOfRange(arr, 1, arr.length), key);

    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 5, 4, 6, 3 };
        int key = 4;

        if (searchElement(arr, key)) {
            System.out.println("Element Exists In Array");
        } else {
            System.out.println("Element Doesnt Exists In Array");
        }

    }

}
