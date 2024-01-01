public class main {

    public static void main(String[] args) {

        /* Creation of linked list and insertion at first/last */
        DoublyLinkedList dll1 = new DoublyLinkedList();
        dll1.createLinkedList("Cypher");
        dll1.insertNodeAtFirst("Sage");
        dll1.insertNodeAtLast("Killjoy");
        dll1.insertNodeAtLast("Deadlock");

        dll1.printList();

        /* Insertion at a particular position */

        dll1.insertNode("Chamber", 4);
        dll1.printList();

        /* Continuity Test */

        System.out.println(dll1.tail.value);
        System.out.println(dll1.head.value);

        DoublyLinkedList dll2 = new DoublyLinkedList();
        dll2.createLinkedList("Sova");
        dll2.insertNodeAtFirst("Breach");
        dll2.insertNodeAtLast("Skye");
        dll2.insertNodeAtLast("Fade");
        dll2.insertNodeAtLast("Gekko");

        dll2.printList();

        /* Deletion From First, Last, */

        dll2.deleteNodeFromLast();
        dll2.printList();

        /* Continuity Test */

        System.out.println(dll2.tail.value);
        System.out.println(dll2.head.value);

        dll2.deleteNodeFromFirst();
        dll2.printList();

        /* Continuity Test */

        System.out.println(dll2.tail.value);
        System.out.println(dll2.head.value);

        dll1.printList();
        dll1.deleteNode(3);
        dll1.printList();

        /* Continuity Test */

        System.out.println(dll2.tail.value);
        System.out.println(dll2.head.value);

    }
}