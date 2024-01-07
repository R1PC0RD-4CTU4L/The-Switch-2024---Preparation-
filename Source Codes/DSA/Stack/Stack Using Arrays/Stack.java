public class Stack {

    int arr[];
    int topOfStack;

    /* Creation Of Stack */

    public Stack(int size) {
        this.arr = new int[size];
        topOfStack = -1;
        System.out.println("Stack is Created With Size " + size);
    }

    /* isEmpty() Method- Checks if stack is empty or not */

    public boolean isEmpty() {
        if (topOfStack == -1) {
            return true;
        }

        return false;
    }

    /* isFull() Method - Checks if the stack is full or not */

    public boolean isFull() {
        if (topOfStack == arr.length - 1) {
            return true;
        }
        return false;
    }

    /* push() method - inserts an element in the stack */

    public void push(int element) {

        if (isFull()) {
            System.out.println("Stack is Full");
        } else {

            arr[topOfStack + 1] = element;
            System.out.println("Element inserted at index " + (topOfStack + 1));
            topOfStack++;
        }

    }

    /* pop() method - removes the last inserted element from the stack. */

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty!Nothing to pop");
            return 0;
        } else {

            int topOfStackElement = arr[topOfStack];

            System.out.println("Element popped is " + arr[topOfStack]);
            topOfStack--;

            return topOfStackElement;

        }
    }

    /* peek() method - returns the last inserted element */

    public int peek() {

        if (isEmpty()) {
            System.out.println("Stack is empty!Nothing to pop");
            return 0;
        } else {

            int topOfStackElement = arr[topOfStack];

            System.out.println(" Current Element is " + arr[topOfStack]);

            return topOfStackElement;

        }

    }

    /* showStack() method - displays the entire stack */

    public void showStack() {
        for (int i = 0; i <= topOfStack; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    /* deleteStack() method - */

    public void deleteStack() {

        topOfStack = -1;
        arr = null;

    }

}