public class TCAQueue {

    int[] arr;
    int topOfQueue;
    int beginningOfQueue;

    public TCAQueue(int size) {

        arr = new int[size]; /* O(1) */

        topOfQueue = -1; /* O(1) */
        beginningOfQueue = -1; /* O(1) */
        System.out.println("Queue successfully created with size " + size); /* O(1) */

        /* Total Time Complexity Is O(1) and Space Complexity is O(n) */
    }

    public boolean isFull() {
        if (topOfQueue == arr.length - 1) { /* O(1) */
            return true;
        }
        return false;
        /* Total Time Complexity Is O(1) and Space Complexity is O(1) */
    }

    public boolean isEmpty() { /* O(1) */
        if (topOfQueue == -1) {
            return true;
        }
        return false;

        /* Total Time Complexity Is O(1) and Space Complexity is O(1) */
    }

}
