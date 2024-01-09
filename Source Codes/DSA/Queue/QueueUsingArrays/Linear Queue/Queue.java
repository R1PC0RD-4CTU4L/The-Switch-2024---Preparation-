public class Queue {
    int[] arr;
    int topOfQueue;
    int beginningOfQueue;

    public Queue(int size) {

        arr = new int[size];

        topOfQueue = -1;
        beginningOfQueue = -1;
        System.out.println("Queue successfully created with size " + size);
    }

    public boolean isFull() {
        if (topOfQueue == arr.length - 1) {
            return true;
        }
        return false;

    }

    public boolean isEmpty() {
        if (topOfQueue == -1 || beginningOfQueue == arr.length) {
            return true;
        }
        return false;
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
        System.out.println("Queue is Deleted!");

    }

}
