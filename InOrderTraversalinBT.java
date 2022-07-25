.................
Main.java
.................
class Main{
    public static void main(String [] args){
       BinaryTreeLL binaryTree = new BinaryTreeLL(); 
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

       N1.left = N2;
       N1.right = N3;
       N2.left = N4;
       N2.right = N5;
       N3.left = N6;
       N3.right = N7;
       N4.left = N8;
       N4.right = N9;
       binaryTree.root = N1;

       binaryTree.inOrder(binaryTree.root);
    }
}
..................................
BinaryNode.java
..................................
public class BinaryNode{
    public String value;
    public BinaryNode left;
    public BinaryNode right;
    public int height;
}
...............................
BinaryTreeLL.java
...............................
public class BinaryTreeLL {
    BinaryNode root;

    public BinaryTreeLL(){
        this.root = null;
    }

    // PreOrder Traversal

    void preOrder(BinaryNode node){
        if(node == null){
            return;
        }
        System.out.print(node.value+ " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    //InOrder Traversal

    void inOrder(BinaryNode node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.value+ " ");
        inOrder(node.right);
    }
}

...........
//////finish///////////
