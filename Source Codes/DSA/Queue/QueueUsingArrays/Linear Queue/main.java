public class main {

    public static void main(String[] args) {

        Queue q1 = new Queue(5);
        q1.enqueue(5);
        q1.enqueue(6);
        q1.enqueue(7);
        q1.enqueue(8);
        q1.enqueue(9);

        q1.showQueue();

        // Overflow
        q1.enqueue(1);
        System.out.println(q1.topOfQueue);

        q1.deQueue();

        q1.showQueue();
        System.out.println(q1.beginningOfQueue);

        q1.deQueue();

        q1.showQueue();
        System.out.println(q1.beginningOfQueue);

        q1.deQueue();

        q1.showQueue();
        System.out.println(q1.beginningOfQueue);

        q1.deQueue();

        q1.showQueue();
        System.out.println(q1.beginningOfQueue);

        System.out.println(q1.peek());

    }

}