public class main {

    public static void main(String[] args) {

        BinaryNode N1 = new BinaryNode();
        N1.value = "N1";
        BinaryNode N2 = new BinaryNode();
        N2.value = "N2";
        BinaryNode N3 = new BinaryNode();
        N3.value = "N3";
        BinaryNode N4 = new BinaryNode();
        N4.value = "N4";
        BinaryNode N5 = new BinaryNode();
        N5.value = "N5";
        BinaryNode N6 = new BinaryNode();
        N6.value = "N6";
        BinaryNode N7 = new BinaryNode();
        N7.value = "N7";
        BinaryNode N8 = new BinaryNode();
        N8.value = "N8";
        BinaryNode N9 = new BinaryNode();
        N9.value = "N9";

        BinaryTree bt = new BinaryTree();
        bt.rootNode = N1;

        N1.leftChild = N2;
        N1.rightChild = N3;
        N2.leftChild = N4;
        N2.rightChild = N5;
        N3.leftChild = N6;
        N3.rightChild = N7;
        N4.leftChild = N8;
        N4.rightChild = N9;

        bt.preOrderTraversal(N1);
        System.out.println();
        bt.inOrderTraversal(N1);
        System.out.println();
        bt.postOrderTraversal(N1);
        System.out.println();
        bt.levelOrderTraversal();

        bt.insertNode("N10");
        bt.insertNode("N11");
        bt.insertNode("N12");
        bt.levelOrderTraversal();
    }

}
