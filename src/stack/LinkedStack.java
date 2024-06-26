package stack;

/**
 * Linked Stack Class
 * This stack class is based on a linked list.
 */
public class LinkedStack {

  /**
   * The node class stores an element and a reference to the next node.
   */
  private class Node {
    private String value;
    private Node next;

    /**
     * Constructor.
     * @param value The element to store in the node.
     */
    Node(String value)
    {
      this.value = value;
      this.next = null;
    }
    /**
     * Constructor.
     * @param value The element to store in the node.
     * @param node The reference next node.
     */
    Node(String value, Node next)
    {
      this.value = value;
      this.next = next;
    }
  }

  private Node top;

  /**
   * Constructor
   */
  public LinkedStack()
  {
    top = null;
  }

  public void push(String str) 
  {
    top = new Node(str, top);
  }

  public String pop() throws Exception
  {
    if (top == null) {
      throw new Exception("Error! The Stack is empty.");
    }

    String strResult = top.value;
    top = top.next;

    return strResult;
  }

  public String peek() throws Exception
  {
    if (top == null) {
      throw new Exception("Error! The Stack is empty.");
    }

    return top.value;
  }

}