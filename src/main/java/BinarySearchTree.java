/**
 * BinarySearchTree Class
 */
public class BinarySearchTree extends BinaryTree
{
  /**
   * Constructor
   */
  public BinarySearchTree()
  {
    root = null;
  }

  /*
   * The insert method inserts a value into the binary search tree.
   * @param value The value inserted.
   */
  public void insert(int value)
  {
    if (root == null) {
      root = new Node(value);
      return;
    } 

    Node currentNode = root;
    while (true) {
      if (value < currentNode.value) {
        if (currentNode.left == null) {
          currentNode.left = new Node(value);
          return;
        }
        currentNode = currentNode.left;

      } else {
        if(currentNode.right == null) {
          currentNode.right = new Node(value);			
           return;
        }
        currentNode = currentNode.right;
      }
    }
  }

  /*
   * The lookup method finds a value from the binary search tree.
   * @param value The value to find.
   * @return True when a node with the value is in the tree, otherwise, false.
   */
  public boolean lookup(int value)
  {
    if (root == null) {
      return false;
    }

    Node currentNode = root;

    while(currentNode != null) {
      if (value < currentNode.value) {
        currentNode = currentNode.left;

      } else if (value > currentNode.value) {
        currentNode = currentNode.right;

      } else {
        return true;
      }
    }

    return false;
  }

  public void remove(int vaule)
  {

  }

  public void printTree()
  {
    inorder(root);
  }
  /**
   * Inorder traversal of a binary tree rooted at a node.
   * @param btree : The root of the binary tree.
   */
  static public void inorder(Node btree)
  {
     if (btree != null) {
         inorder(btree.left);
         System.out.print(btree.value + " ");
         inorder(btree.right);
     }
  }
}


/**
Base binary tree class
*/
class BinaryTree
{
  protected Node root;

  // Check if the binary tree is empty.
  public boolean isEmpty()
  {
    return root == null;
  }    
}


/**
Node class.
*/
class Node
{
  int value;
  Node left, right;

  // Constructor for leaf nodes.
  Node(int value)
  {
    this.value = value;
    this.left  = null;
    this.right = null;
  }

  // Constructor for non-leaf nodes.
  Node(int value, Node leftChild, Node rightChild)
  {
    this.value = value;
    this.left  = leftChild;
    this.right = rightChild;
  }
}