public class DoublyCircularLinkedList {

    Node head;
    Node tail;
    int sizeOfLinkedList;

    /* getSizeOfLinkedList() */

    /* createLinkedList() creates a Doubly Linked List */

    public void createLinkedList(String value) {
        Node newNode = new Node();
        newNode.value = value;
        head = newNode;
        tail = newNode;
        tail.next = head;
        sizeOfLinkedList++;
        System.out.println("Linked List is Created!");
    }

    public int getSizeOfLinkedList() {
        return sizeOfLinkedList;
    }

    /*
     * Insert Node
     * 
     * 1.Insert Node At First
     * 2.Insert Node At Last
     * 3.Insert Node At Any Given Position
     */

    public void insertNodeAtFirst(String value) {

        /* Case 1- If linked list is not created before */
        if (head == null) {
            createLinkedList(value);
            return;
        }

        /* General Case */
        else {

            Node newNode = new Node();
            newNode.value = value;
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            tail.next = head;

            sizeOfLinkedList++;
            System.out.println("Node inserted At First!");

        }
    }

    /* Insert Node At Last! */

    public void insertNodeAtLast(String value) {

        /* Case 1- If linked list is not created before */
        if (head == null) {
            createLinkedList(value);
            return;
        }

        /* General Case */

        else {

            Node newNode = new Node();
            newNode.value = value;
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            tail.next = head;

            sizeOfLinkedList++;

            System.out.println("Node inserted At Last!");

        }
    }

    /* insertNode(String value,int position) Insert Node At Any Given Position */

    /* printList() - Prints the linked list */

    public void printList() {

    }

}
