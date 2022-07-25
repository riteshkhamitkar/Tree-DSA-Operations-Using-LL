.................
Main.java
.................
class Main{
    public static void main(String [] args){
       BinaryTreeLL binaryTree = new BinaryTreeLL(); 
        binaryTree.insert("N1");
        binaryTree.insert("N2");
        binaryTree.insert("N3");
        binaryTree.insert("N4");
        binaryTree.insert("N5");
        binaryTree.insert("N6");
        binaryTree.levelOrder();
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
import java.util.LinkedList;
import java.util.Queue;
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

    
    void postOrder(BinaryNode node){
        if(node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value+ " ");
    }

    //Level order Traversal

    void levelOrder(){
        Queue <BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            System.out.print(presentNode.value+ " ");
            if(presentNode.left != null){
                queue.add(presentNode.left);
            }
            if(presentNode.right != null){
                queue.add(presentNode.right);
            }
        }
    }

    //Search Method

    public void search(String value){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            if(presentNode.value == value){
                System.out.println("The value " + value+ " is found in Tree!");
                return;
            }else{
                if(presentNode.left != null){
                    queue.add(presentNode.left);
                }
                if(presentNode.right!=null){
                    queue.add(presentNode.right);
                }
            }
        }
        System.out.println("The value "+ value+ " not found!");
    }

    //Insert method

    void insert(String value){
        BinaryNode newNode = new BinaryNode();
        newNode.value = value;
        if(root == null){
            root = newNode;
            System.out.println("Inserted new node at root!");
            return;
        }
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            if(presentNode.left == null){
                presentNode.left = newNode;
                System.out.println("Successfully Inserted!");
                break;
            }else if(presentNode.right == null){
                presentNode.right =newNode;
                System.out.println("Successfully Inserted!");
                break;
        } else {
            queue.add(presentNode.left);
            queue.add(presentNode.right);
        }
    }
   }
 }

...........
//////finish///////////
