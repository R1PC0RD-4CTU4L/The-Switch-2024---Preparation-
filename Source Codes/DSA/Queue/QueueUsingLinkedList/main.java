public class main {

    public static void main(String[] args) {
        Queue q1 = new Queue();
        System.out.println(q1.isEmpty());
        q1.enQueue(25);
        q1.enQueue(23);
        q1.enQueue(27);
        q1.enQueue(29);
        q1.enQueue(31);

        q1.showQueue();
        q1.deQueue();

        q1.showQueue();

        q1.deleteQueue();
    }

}
