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

    public void enqueue(int value) {

        if (isFull()) {

            System.out.println("The Queue Is Full. ");
        } else if (isEmpty()) {
            beginningOfQueue++;
            topOfQueue++;
            arr[topOfQueue] = value;
        } else {

            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Element Inserted At Position " + (topOfQueue));

        }
        /* Total Time Complexity Is O(1) and Space Complexity is O(1) */

    }

    public int deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty.Nothing To Return");
            return -1;
        } else {

            int result = arr[beginningOfQueue];
            beginningOfQueue++;

            if (beginningOfQueue > topOfQueue) {
                topOfQueue = beginningOfQueue = -1;
            }
            return result;

        }
    }

    public void showQueue() {

        for (int i = beginningOfQueue; i <= topOfQueue; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public int peek() {

        if (!isEmpty()) {

            return arr[beginningOfQueue];
        } else {
            System.out.println("Queue is empty!");
            return -1;
        }

    }

    public void deleteQueue() {

        arr = null;
        System.out.println("Queue is Deleted!"); /* O(1) */

        /* Total Time Complexity Is O(1) and Space Complexity is O(1) */

    }

}
