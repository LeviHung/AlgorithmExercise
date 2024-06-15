import javax.swing.*;
import java.awt.*;

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

    while (currentNode != null) {
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

  /*
   * The remove method removes a value from the binary search tree.
   * @param value The value to find.
   * @return True when a node with the value can be removed in the tree,
   *         otherwise, false.
   */	
  public boolean remove(int value)
  {
    if (root == null) {
      return false;
    }

    Node current = root;
    Node parent = null;

    while (current != null) {
      if (value < current.value) {
        parent = current;
        current = current.left;

      } else if (value > current.value) {
        parent = current;
        current = current.right;

      } else {	// value == current.value
        // We have a match, get to work.

        // Option 1: No right child. (1, 14, 44, 55, or 73)
        // if current < parent, 
        //     make current's left child to be parent's left child.
        // if current > parent, 
        //     make current's left child to be parent's right child.
        //                     60
        //         30                   72
        //    14        54                    73
        // 1        38      55
        //             44
        if (current.right == null) {
          if (parent == null) {
            // Remove 60 when the tree doesn't have 72 and 73.
            root = current.left;
            return true;
          }

          if (current.value < parent.value) {
            parent.left = current.left;

          } else {
            parent.right = current.left;
          }

        // Option 2: Right child that doesn't have a left child. 
        //           (38, 54, 60, or 72)
        // if current < parent, parent.left = current.right
        // if current > parent, parent.right = current.right
        // current.right.left = current.left
        //                     60
        //         30                   72
        //    14        54                   73
        // 1        38      55
        //       36    44
        } else if (current.right.left == null) {
          if (parent == null) {
            // Remove 60.
            current.right.left = current.left;
            root = current.right;
            return true;
          }

          if (current.value < parent.value) {
            parent.left = current.right;

          } else {
            parent.right = current.right;
          }
          current.right.left = current.left;

        // Option 3: Right child that have a left child (30, 60, 72)
        //                     60
        //         30                   72
        //    14        54         71        74
        // 1        38      55            73
        //       36    44
        } else {
          // find the right child's the most left child to substitute current. 
          // (60 -> 71, 30 -> 36, 72 -> 73)
          Node mostLeft = current.right.left;
          Node mostLeftParent = current.right;
          while (mostLeft.left != null) {
            mostLeftParent = mostLeft;
            mostLeft = mostLeft.left;
          }
          mostLeftParent.left = mostLeft.right;
          mostLeft.left  = current.left;
          mostLeft.right = current.right;

          if (parent == null) {												// remove 60
            root = mostLeft;

          } else if (current.value < parent.value) {	// remove 30
            parent.left = mostLeft;

          } else {																		// remove 72
            parent.right = mostLeft;
          }
        }
        return true;
      }
    }

    return false;
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

  /**
   * The BTreeDisplay class graphically displays
   * trees in a JPanel. The JPanel is recursively
   * partitioned into a top part dislaying the root,
   * and two lowerparts displaying the left and 
   * right subtrees.
   */	
  private class BTreeDisplay extends JPanel
  {
    /**
     * Constructor.
     * @param tree The root of the binary 
     * tree to display.
     */

    BTreeDisplay(Node tree)
    {           
      setBorder(BorderFactory.createEtchedBorder());
      setLayout(new BorderLayout());
      if (tree != null) {
        String value = String.valueOf(tree.value);  
        int pos = SwingConstants.CENTER;
        JLabel rootLabel = new JLabel(value, pos);                         
        add(rootLabel, BorderLayout.NORTH);
        JPanel panel = new JPanel(new GridLayout(1, 2));
        panel.add(new BTreeDisplay(tree.left));
        panel.add(new BTreeDisplay(tree.right));    
        add(panel);
      }
    }   
  }

  /**
   * The getView method creates and returns a 
   * a graphical view of the binary tree.
   * @return A panel that displays a view of the tree.
   */
  public JPanel getView()
  {
    return new BTreeDisplay(root);       
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