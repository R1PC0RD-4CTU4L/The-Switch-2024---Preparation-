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
        if (beginningOfQueue == -1 || beginningOfQueue == arr.length) {
            return true;
        }
        return false;
    }

    public void enqueue(int value) {

        if (isFull()) {

            System.out.println("The Queue Is Full. ");
        } else {

            arr[topOfQueue + 1] = value;
            System.out.println("Element Inserted At Position " + (topOfQueue + 1));
            topOfQueue++;
        }

    }

    public void dequeu()[
        
    ]

}
