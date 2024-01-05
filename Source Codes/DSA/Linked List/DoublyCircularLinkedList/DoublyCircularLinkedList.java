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

    public void insertNode(String value, int position) {

        /* Case 1- If linked list is not created before */
        if (head == null) {
            createLinkedList(value);
            return;
        }

        /* Case 2- If node is added at the beginning of the linked list */

        else if (position == 1) {
            insertNodeAtFirst(value);
        }

        /* Case 3- If node is added at the end of the linked list */
        else if (position > sizeOfLinkedList) {
            insertNodeAtLast(value);
        }

        /* Case 4- If position is negative or zero. Invalid Case */
        else {
            insertNodeAtLast(value);
        }

    }

    /* printList() - Prints the linked list */

    public void printList() {

        Node tempNode = head;

        int count = 1;
        while (count != sizeOfLinkedList + 1) {

            if (count == sizeOfLinkedList) {

                System.out.print(tempNode.value + " --> ");
                tempNode = tempNode.next;
                count++;
                continue;
            }
            System.out.print(tempNode.value + " <--> ");
            tempNode = tempNode.next;
            count++;
        }

        System.out.print("HEAD \n");

        /*
         * for (int i = 1; i <= sizeOfLinkedList; i++) {
         * 
         * if (i == sizeOfLinkedList) {
         * System.out.print(tempNode.value + " --> ");
         * tempNode = tempNode.next;
         * continue;
         * }
         * 
         * System.out.print(tempNode.value + " <--> ");
         * tempNode = tempNode.next;
         * }
         * 
         * System.out.print("HEAD \n");
         */
    }

    public void deleteNodeFromFirst() {

        if (head == null) {
            System.out.println("Nothing To Delete!");
        }

        else if (sizeOfLinkedList == 1) {
            head = null;
            tail = null;

            System.out.println("Last Node Deleted. Nothing Else To Delete!");
            sizeOfLinkedList--;
        } else {

            head = head.next;
            tail.next = head;
            sizeOfLinkedList--;
            System.out.println("Node Deleted From First");
        }

    }

    public void deleteNodeFromLast() {

        if (head == null) {
            System.out.println("Nothing To Delete!");
        }

        else if (sizeOfLinkedList == 1) {
            head = null;
            tail = null;

            System.out.println("Last Node Deleted. Nothing Else To Delete!");
            sizeOfLinkedList--;
        } else {

            tail = tail.prev;
            tail.next = head;
            sizeOfLinkedList--;
            System.out.println("Node Deleted From Last!");

        }

    }

    public void deleteNode(int position) {
        if (head == null) {
            System.out.println("Nothing To Delete!");
        }

        else if (sizeOfLinkedList == 1) {
            head = null;
            tail = null;

            System.out.println("Last Node Deleted. Nothing Else To Delete!");
            sizeOfLinkedList--;
        } else if (position == 1) {
            deleteNodeFromFirst();
        } else if (position >= sizeOfLinkedList) {
            deleteNodeFromLast();
        } else if (position <= 0) {
            System.out.println("invalid position");
        } else {

            Node tempNode = head;
            for (int i = 1; i < position - 1; i++) {

                tempNode = tempNode.next;
            }

            Node toBeDeleted = tempNode.next;
            Node nextNode = tempNode.next.next;
            toBeDeleted.prev = null;
            toBeDeleted.next = null;
            tempNode.next = nextNode;
            sizeOfLinkedList--;
            System.out.println("Node Deleted From Position " + position);

        }

    }

    public int searchNode(String value) {
        Node tempNode = head;
        for (int i = 1; i < sizeOfLinkedList; i++) {
            if (tempNode.value == value) {
                System.out.println("Node found at position " + i);
                return i;
            }
        }

        System.out.println("Value Not Found in Linked List!");
        return -1;
    }

    public void deleteLinkedList() {
        head = null;
        tail = null;

        sizeOfLinkedList = 0;
        System.out.println("Linked List Successfully Deleted!");
    }
}
