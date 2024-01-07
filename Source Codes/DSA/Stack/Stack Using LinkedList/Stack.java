public class Stack {

    SinglyLinkedList sll;

    public Stack(int value) {

        sll = new SinglyLinkedList();
        sll.createLinkedList(value);
        System.out.println("Stack Created!");
    }

    public boolean isEmpty() {
        if (sll.head == null) {

            return true;
        }

        else
            return false;
    }

    public void push(int value) {
        sll.insertNodeAtFirst(value);
    }

    public void pop() {
        sll.deleteNodeFromFirst();
    }

    public void showStack() {
        sll.printList();
    }

    public int peek() {

        System.out.println(sll.head.value);
        return sll.head.value;
    }

    public void deleteStack() {
        sll.deleteLinkedList();
    }

}