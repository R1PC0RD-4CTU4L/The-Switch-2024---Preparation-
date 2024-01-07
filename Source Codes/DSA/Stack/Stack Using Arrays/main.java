public class main {

    public static void main(String[] args) {

        Stack s1 = new Stack(5);

        System.out.println(s1.isEmpty());

        s1.push(5);
        s1.push(2);
        s1.push(7);
        s1.push(8);
        s1.push(9);

        s1.showStack();

        s1.pop();
        s1.showStack();
        System.out.println(s1.topOfStack);
        s1.peek();

        s1.pop();
        s1.showStack();
        System.out.println(s1.topOfStack);
        s1.peek();

    }

}
