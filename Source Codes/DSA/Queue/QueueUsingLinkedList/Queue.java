public class Queue {

    LinkedList ll1;

    public Queue() {
        ll1 = new LinkedList();
        System.out.println("Queue Is Created Successfully!");
    }

    /* isEmpty() Method */

    public boolean isEmpty() {
        if (ll1.head == null) {
            System.out.println("Queue is Empty");
            return true;
        } else
            return false;
    }

    /* enQueue Method */

    public void enQueue(int element) {

        ll1.insertNodeAtLast(element);
    }

    public int deQueue() {

        if (isEmpty()) {
            System.out.println("The Queue Is Empty!");
            return -1;
        } else {
            int result = ll1.head.value;
            ll1.deleteNodeFromFirst();
            return result;
        }
    }

    public void showQueue() {
        ll1.printList();
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Nothing To Show");
            return -1;
        } else {

            return ll1.head.value;
        }
    }

    public void deleteQueue() {
        ll1.deleteLinkedList();
        System.out.println("Queue Is Deleted ");
    }
}
