public class main {

    public static void main(String[] args) {

        DoublyCircularLinkedList dcll = new DoublyCircularLinkedList();
        dcll.insertNodeAtFirst("Cypher");
        dcll.insertNodeAtLast("Jett");
        dcll.insertNodeAtLast("Sage");
        dcll.insertNodeAtLast("Brimstone");
        dcll.insertNodeAtLast("Raze");
        dcll.insertNodeAtLast("Phoenix");
        dcll.insertNodeAtLast("Omen");

        dcll.printList();

        dcll.deleteNodeFromFirst();
        dcll.printList();

        System.out.println(dcll.tail.value);
        System.out.println(dcll.tail.next.value);
        System.out.println(dcll.head.value);

        dcll.deleteNodeFromLast();
        dcll.printList();

        System.out.println(dcll.tail.value);
        System.out.println(dcll.tail.next.value);
        System.out.println(dcll.head.value);

    }

}
