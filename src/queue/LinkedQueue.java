package queue;

/**
 * Linked Queue Class
 * This queue class is based on a linked list.
 */
public class LinkedQueue {

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

  }

  private Node front;
  private Node rear;

  /**
   * Constructor
   */
  public LinkedQueue()
  {
    front = null;
    rear = null;
  }

  /**
   * The enqueue method adds a value to the rear node of the queue.
   * @param str The value to be added to the queue.
   */
  public void enqueue(String str) 
  {
    if (rear == null) {
      rear = new Node(str);
      front = rear;

    } else {
      rear.next = new Node(str);
      rear = rear.next;
    }
  }

  /**
   * The dequeue method removes and returns the value at the front node 
   * of the queue.
   * @return The value at front of the queue.
   * @throws Exception When the queue is empty.
   */
  public String dequeue() throws Exception
  {
    if (front == null) {
      throw new Exception("Error! The Stack is empty.");
    }

    String strResult = front.value;
    front = front.next;

    if (front == null) {
      rear = null;
    }

    return strResult;
  }


  /**
   * The peek method returns the value at the front node 
   * of the queue.
   * @return The value at front of the queue.
   * @throws Exception When the queue is empty.
   */
  public String peek() throws Exception
  {
    if (front == null) {
      throw new Exception("Error! The Stack is empty.");
    }

    return front.value;
  }
}
