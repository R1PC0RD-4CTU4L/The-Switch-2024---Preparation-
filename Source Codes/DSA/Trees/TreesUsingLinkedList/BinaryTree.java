import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    BinaryNode rootNode;

    public BinaryTree() {

        this.rootNode = null;
    }

    /* Pre Order Traversal */

    public void preOrderTraversal(BinaryNode node) {
        if (node == null) {
            return;
        }

        System.out.print(node.value + " ");
        preOrderTraversal(node.leftChild);
        preOrderTraversal(node.rightChild);
    }

    /* Pre Order Traversal */

    public void inOrderTraversal(BinaryNode node) {

        if (node == null) {
            return;
        }
        preOrderTraversal(node.leftChild);
        System.out.print(node.value + " ");
        preOrderTraversal(node.rightChild);
    }

    /* Pre Order Traversal */

    public void postOrderTraversal(BinaryNode node) {

        if (node == null) {
            return;
        }
        preOrderTraversal(node.leftChild);
        preOrderTraversal(node.rightChild);
        System.out.print(node.value + " ");

    }

    /* Level Order Traversal */

    public void levelOrderTraversal() {

        if (rootNode == null) {
            return;
        } else {

            Queue<BinaryNode> q1 = new LinkedList<BinaryNode>();
            q1.add(rootNode);

            while (!q1.isEmpty()) {

                BinaryNode presentNode = q1.remove();
                System.out.print(presentNode.value + " ");

                if (presentNode.leftChild != null) {

                    q1.add(presentNode.leftChild);
                }
                if (presentNode.rightChild != null) {

                    q1.add(presentNode.rightChild);
                }
            }
        }

    }

    /* Insert Node */

    public void insertNode(String value) {

        if (rootNode == null) {
            this.rootNode.value = value;
        } else {

            BinaryNode newNode = new BinaryNode();
            newNode.value = value;

            Queue<BinaryNode> q2 = new LinkedList<BinaryNode>();
            q2.add(rootNode);

            while (!q2.isEmpty()) {

                BinaryNode currentNode = q2.remove();

                if (currentNode.leftChild == null) {

                    currentNode.leftChild = newNode;
                    System.out.println("Successfully Inserted!");
                    break;
                } else if (currentNode.rightChild == null) {
                    currentNode.rightChild = newNode;
                    System.out.println("Successfully Inserted!");
                    break;
                } else {

                    q2.add(currentNode.leftChild);
                    q2.add(currentNode.rightChild);
                }
            }
        }
    }

}
