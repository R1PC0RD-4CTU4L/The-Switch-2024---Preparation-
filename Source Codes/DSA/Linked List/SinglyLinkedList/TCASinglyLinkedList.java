public class TCASinglyLinkedList {

    Node head;
    Node tail;
    int sizeOfLinkedList;

    /* Method 1- createLinkedList(int val) Creates A Linked List */

    public Node createLinkedList(int value) {
        Node newNode = new Node(); /* O(1) */
        newNode.value = value; /* O(1) */
        newNode.next = null; /* O(1) */
        head = newNode; /* O(1) */
        tail = newNode; /* O(1) */
        sizeOfLinkedList++; /* O(1) */
        System.out.println("Linked List  is created"); /* O(1) */

        return head; /* O(1) */

        /* Total Time Complexity - O(1) */

    }

    /*
     * Insertion Of Nodes In Linked list
     * 
     * 1.Insert Node At Beginning
     * 2.Insert Node At End
     * 3.Insert Node At Any Given Position
     */

    /* Method 2 - insertNodeAtFirst(int value) */

    public void insertNodeAtFirst(int value) {
        /* Case 1- If linked list is not created before */

        if (head == null) {
            createLinkedList(value); /* O(1) */
            return;
        }

        /* General Case */
        else {

            Node newNode = new Node();/* O(1) */
            newNode.value = value;/* O(1) */
            newNode.next = head;/* O(1) */
            head = newNode;/* O(1) */
            sizeOfLinkedList++;/* O(1) */

            System.out.println("Node Inserted At First!");/* O(1) */
        }
        /* Total Time Complexity - O(1) */
    }

    /* Method 3 - insertNodeAtLast(int value) */
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

    /* Method 4 - insertNode(int value,int position) */

    public void insertNode(int value, int position) {

        /* Corner Cases */

        /* Case 1- If linked list is not created before */

        if (head == null) {
            createLinkedList(value); /* O(1) */
            return;
        }

        /* Case 2- If position =1. Insertion At 1st position */
        if (position == 1) {
            insertNodeAtFirst(value);/* O(1) */
            return;
        }

        /* Case 3- If position > sizeOfLinkedList. Insertion At last position */
        if (position > sizeOfLinkedList) {
            insertNodeAtLast(value); /* O(1) */
            return;
        }

        /* Case 4- If position <=0 . Invalid Insertion Attempt */
        if (position <= 0) {
            System.out.println("Invalid Position! Try Again. "); /* O(1) */

        }

        /* General Case */

        else {

            Node tempNode = head; /* O(1) */

            for (int i = 1; i < position - 1; i++) {

                tempNode = tempNode.next; /* O(n) */

            }

            Node toBeInserted = new Node(); /* O(1) */
            toBeInserted.value = value; /* O(1) */

            Node nextNode = tempNode.next; /* O(1) */
            tempNode.next = toBeInserted; /* O(1) */
            toBeInserted.next = nextNode; /* O(1) */
            sizeOfLinkedList++; /* O(1) */
            System.out.println("Node inserted at position " + position); /* O(1) */

        }

        /* Total Time Complexity - O(n) */

    }

    /* Method 5 - printList() */

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

        for (int i = 1; i <= sizeOfLinkedList; i++) { /* O(n) */
            System.out.print(tempNode.value + " --> ");/* O(1) */
            tempNode = tempNode.next;/* O(1) */
        }

        System.out.print("NULL \n");/* O(1) */

        /* Total Time Complexity Is O(n) */

    }

    /*
     * Deletion Of Nodes In Linked list
     * 
     * 1.Delete Node From Beginning
     * 2.Delete Node From End
     * 3.Delete Node From Any Given Position
     */

    /* Deletion of Nodes From Beginning */

    public void deleteNodeFromFirst() {
        if (head == null) {
            System.out.println("Nothing To Delete! Linked List is Empty!"); /* O(1) */
        } else if (sizeOfLinkedList == 1) {
            head = null;/* O(1) */
            tail = null;/* O(1) */
            sizeOfLinkedList--;/* O(1) */
            System.out.println("Last Node Deleted!");/* O(1) */
        } else {

            head = head.next; /* O(1) */
            sizeOfLinkedList--;/* O(1) */
            System.out.println("Node Deleted From First!");/* O(1) */
        }

        /* Total Time Complexity Is O(1) */
    }

    /* Deletion of Nodes From End */

    public void deleteNodeFromLast() {
        if (head == null) {
            System.out.println("Nothing To Delete! Linked List is Empty!"); /* O(1) */
        } else if (sizeOfLinkedList == 1) {
            head = null;/* O(1) */
            tail = null;/* O(1) */
            sizeOfLinkedList--;/* O(1) */
            System.out.println("Last Node Deleted!");/* O(1) */
        } else {

            Node secondLastNode = head;

            for (int i = 1; i < sizeOfLinkedList - 1; i++) {
                secondLastNode = secondLastNode.next; /* O(n-1) */
            }

            tail = secondLastNode;/* O(1) */
            tail.next = null;/* O(1) */
            sizeOfLinkedList--;/* O(1) */
            System.out.println("Node Deleted From Last!");/* O(1) */
        }

        /* Total Time Complexity Is O(n) */
    }

    /* Deletion of Nodes From Any Given Position */

    public void deleteNode(int position) {

        /* Case 1 - If Linked List Doesnt Exist */
        if (head == null) {
            System.out.println("Nothing To Delete! Linked List is Empty!");
            /* If position of Deletion is at position 1 */
        } else if (position == 1) {
            deleteNodeFromFirst();
        }
        /* If position of Deletion is greater than size of Linked List */
        else if (position >= sizeOfLinkedList) {
            deleteNodeFromLast();
        }
        /* If position is 0 or negative */
        else if (position <= 0) {
            System.out.println("Invalid Index Provided! 0s and negatives not allowed");
        }
        /* General Case */
        else {

            Node tempNode = head;

            for (int i = 1; i < position - 1; i++) {
                tempNode = tempNode.next;
            }
            Node toBeDeleted = tempNode.next;
            Node nextNode = toBeDeleted.next;
            tempNode.next = nextNode;
            sizeOfLinkedList--;
            System.out.println("Node Deleted From Position " + position);

        }
    }

    /*
     * searchNode(int val)- Searching Of Nodes. Returns position of node if present.
     * Else returns -1
     */

    public int searchNode(int value) {
        Node tempNode = head;
        for (int i = 1; i <= sizeOfLinkedList; i++) {
            if (tempNode.value == value) {
                System.out.println("Value Found At Position " + i);
                return i;
            }
            tempNode = tempNode.next;
        }
        System.out.println("Value Not Found In Linked List! ");
        return -1;
    }

    /* Reverse Linked List - Reverses the linked list */
    public void reverseLinkedList() {

        tail = head;
        Node previousNode = null;
        Node currentNode = head;
        Node nextNode = head.next;

        while (currentNode != null) {
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;

            if (nextNode != null) {
                nextNode = nextNode.next;
            }
        }
        System.out.println("LinkedList Reversed!");

        head = previousNode;
    }

    /* deleteLinkedList() - Deletes the entire linked list */

    public void deleteLinkedList() {
        head = null;
        tail = null;
        sizeOfLinkedList = 0;
        System.out.println("Linked List Deleted!");
    }
}