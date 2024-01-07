public class main {

    public static void main(String[] args) {

        Stack s1 = new Stack(15);
        s1.push(13);
        s1.push(10);
        s1.push(19);
        s1.push(17);
        s1.showStack();

        s1.pop();
        s1.showStack();
        s1.peek();

    }

}
