.................
Main.java
.................
class Main{
    public static void main(String [] args){
       BinaryTreeLL binaryTree = new BinaryTreeLL(); 
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
}


...........
//////finish///////////
