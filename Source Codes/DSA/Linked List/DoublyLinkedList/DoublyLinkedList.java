public class DoublyLinkedList {

    Node head;
    Node tail;
    int sizeOfLinkedList;

    public Node createLinkedList(String value) {
        Node newNode = new Node();
        newNode.value = value;

        head = newNode;
        tail = newNode;
        tail.next = null;
        sizeOfLinkedList++;

        System.out.println("Linked List Created!");
        return head;

    }

    /* getSizeOfLinkedList() - Returns the size of the linked list */

    public int getSizeOfLinkedList() {
        return sizeOfLinkedList;
    }

    /*
     * Inserting Nodes
     * 
     * 1.insertNodeAtFirst()
     * 2.insertNodeAtLast()
     * 3.insertNode()
     */

    /* insertNodeAtFirst(String value) */

    public void insertNodeAtFirst(String value) {

        /* Case 1- If linked list doesnt exist */

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
            sizeOfLinkedList++;
            System.out.println("New node added at First!");
        }

    }

    /* insertNodeAtLast(String value) */

    public void insertNodeAtLast(String value) {

        /* Case 1- If linked list doesnt exist */

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
            newNode.next = null;
            tail = newNode;

            sizeOfLinkedList++;
            System.out.println("Node Added At Last!");
        }
    }

    /* insertNode(String value,int position) */

    public void insertNode(String value, int position) {

        /* Case 1- If linked list doesnt exist */

        if (head == null) {
            createLinkedList(value);

            return;

        }
        /* If position =1 , i.e insertion at first position */
        else if (position == 1) {

            insertNodeAtFirst(value);
        }
        /* If position >=sizeOfLinkedList , i.e insertion at last position */
        else if (position >= sizeOfLinkedList) {
            insertNodeAtLast(value);
        } else if (position <= 0) {
            System.out.println("Negative Values And 0 not accepted!");
        }

        /* General Case */
        else {

            Node newNode = new Node();
            newNode.value = value;

            Node tempNode = head;

            for (int i = 1; i < position - 1; i++) {
                tempNode = tempNode.next;

            }

            Node nextNode = tempNode.next;
            tempNode.next = newNode;
            newNode.prev = tempNode;
            newNode.next = nextNode;
            nextNode.prev = newNode;
            sizeOfLinkedList++;
            System.out.println("Node inserted at position " + position);

        }

    }

    /* printList() - prints the entire linked list */

    public void printList() {
        Node tempNode = head;

        for (int i = 1; i <= sizeOfLinkedList; i++) {

            if (i == sizeOfLinkedList) {
                System.out.print(tempNode.value + " --> ");
                continue;
            }
            System.out.print(tempNode.value + " <--> ");
            tempNode = tempNode.next;
        }
        System.out.print("NULL \n");
    }

    /*
     * Deleting Nodes
     * 
     * 1.deleteNodeFromFirst()
     * 2.deleteNodeFromLast()
     * 3.deleteNode()
     */

    /*
     * deleteNodeFromFirst() - Deletes a node from the beginning of the linked list
     */

    public void deleteNodeFromFirst() {

        /* If Linked List Doesnt Exist */
        if (head == null) {
            System.out.println("Nothing To Delete!");
        }
        /* If only one node exists */
        else if (sizeOfLinkedList == 1) {

            head = null;
            tail = null;
            sizeOfLinkedList--;
            System.out.println("Last Node Deleted! Nothing Else To Delete!");

        }

        /* General Case */
        else {
            Node firstNode = head;
            Node newFirstNode = head.next;

            firstNode.next = null;
            newFirstNode.prev = null;
            head = newFirstNode;
            sizeOfLinkedList--;
            System.out.println("Deleted Node From First");

        }
    }

    /*
     * deleteNodeFromLast() - Deletes a node from the end of the linked list
     */

    public void deleteNodeFromLast() {
        /* If Linked List Doesnt Exist */
        if (head == null) {
            System.out.println("Nothing To Delete!");
        }
        /* If only one node exists */
        else if (sizeOfLinkedList == 1) {

            head = null;
            tail = null;
            sizeOfLinkedList--;
            System.out.println("Last Node Deleted! Nothing Else To Delete!");

        }
        /* General Case */
        else {
            Node secondLastNode = tail.prev;
            secondLastNode.next = null;
            tail.prev = null;
            tail = secondLastNode;
            sizeOfLinkedList--;
            System.out.println("Last Node Deleted!");

        }
    }

    public void deleteNode(int position) {

        /* If Linked List Doesnt Exist */
        if (head == null) {
            System.out.println("Nothing To Delete!");
        }
        /* If only one node exists */
        else if (sizeOfLinkedList == 1) {

            head = null;
            tail = null;
            sizeOfLinkedList--;
            System.out.println("Last Node Deleted! Nothing Else To Delete!");

        }
        /* If position =1. Delete node from first */
        else if (position == 1) {

            deleteNodeFromFirst();

        }

        /* If position >=size of linked list. Delete node from last */
        else if (position >= sizeOfLinkedList) {

            deleteNodeFromLast();
        }

        /* If position <=0 . Invalid case */
        else if (position <= 0) {

            System.out.println("Invalid position supplied");
        }

        else {

            Node tempNode = head;

            for (int i = 1; i < position - 1; i++) {
                tempNode = tempNode.next;
            }

            Node nextNode = tempNode.next.next;
            Node toBeDeleted = tempNode.next;

            toBeDeleted.next = null;
            toBeDeleted.prev = null;

            tempNode.next = nextNode;
            nextNode.prev = tempNode;
            sizeOfLinkedList--;
            System.out.println("Node deleted from position " + position);
        }

    }

    /* searchNode(String value) - searches a Node from the list */

    public int searchNode(String value) {
        Node tempNode = head;
        for (int i = 1; i <= sizeOfLinkedList; i++) {
            if (tempNode.value == value) {
                System.out.println("Node found at position " + i);
                return i;
            }

        }

        System.out.println("Node doesnt exist in this Linked List!");
        return -1;
    }

    /* deleteLinkedList() -Deletes the linked list */

    public void deleteLinkedList() {
        head = null;
        tail = null;
        sizeOfLinkedList = 0;
        System.out.println("Linked List Successfully Deleted!");
    }

}
