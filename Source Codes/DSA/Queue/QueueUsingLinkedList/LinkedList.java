public class LinkedList {
    Node head;
    Node tail;
    int sizeOfLinkedList;

    /* Method 1- createLinkedList(int val) Creates A Linked List */

    public Node createLinkedList(int value) {
        Node newNode = new Node();
        newNode.value = value;
        newNode.next = null;
        head = newNode;
        tail = newNode;
        sizeOfLinkedList++;
        System.out.println("Linked List  is created");

        return head;

    }

    /* Insertion of Nodes At End */

    public void insertNodeAtLast(int value) {

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
            newNode.next = null;
            tail = newNode;
            sizeOfLinkedList++;
            System.out.println("Node Inserted At Last");

        }
    }

    public void printList() {
        Node tempNode = head;
        /*
         * Using While Loop
         * 
         * while (tempNode != null) {
         * System.out.print(tempNode.value + " --> ");
         * tempNode = tempNode.next;
         * }
         * System.out.print("NULL \n");
         * 
         */

        /* Using For Loop */

        for (int i = 1; i <= sizeOfLinkedList; i++) {
            System.out.print(tempNode.value + " --> ");
            tempNode = tempNode.next;
        }

        System.out.print("NULL \n");

    }

    public void deleteNodeFromFirst() {
        if (head == null) {
            System.out.println("Nothing To Delete! Linked List is Empty!");
        } else if (sizeOfLinkedList == 1) {
            head = null;
            tail = null;
            sizeOfLinkedList--;
            System.out.println("Last Node Deleted!");
        } else {

            head = head.next;
            sizeOfLinkedList--;
            System.out.println("Node Deleted From First!");
        }
    }

    public void deleteLinkedList() {
        head = null;
        tail = null;
        sizeOfLinkedList = 0;
        System.out.println("Linked List Deleted!");
    }

}
