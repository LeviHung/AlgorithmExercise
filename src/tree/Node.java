package tree;
/**
 * Node class.
 */
public class Node
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