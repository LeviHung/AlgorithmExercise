// Levi Hung
// 06/10/24
// Data Structure of Doubly Linked Lists

/**
 * LinkedList Class
 */
public class DLinkedList {

  /**
   * The node class stores an element and a reference to the next node.
   */
  private class Node {
    private int value;
    private Node next;
    private Node prev;
    /**
     * Constructor.
     * @param value The element to store in the node.
     */
    Node(int value)
    {
      this.value = value;
      this.next = null;
      this.prev = null;
    }
  }

  private Node first;	// List head. First element in the list.
  private Node last;	// List tail. Last element in the list.

  /**
   * Constructor.
   */
  public DLinkedList()
  {
    first = null;
    last = null;
  }

  /**
   * The isEmpty method checks to see if the list is empty.
   * @return true or false
   */
  public boolean isEmpty()
  {
    return (first == null);
  }

  /**
   *  The size method returns the length of the list.
   *  @param number The number of elements in the list.
   */
  public int size()
  {
    if (this.isEmpty()) {
      return 0;
    }
    int number = 1;
    Node current = first;
    while (current.next != null) {
      current = current.next;			
      number++;
    }

    return number;
  }

  /**
   *  The append method adds an element in the tail of the list.
   *  @param value The value of the element.
   */
  public void append(int value)
  {
    if (isEmpty()) {
      first = new Node(value);
      last = first;

    } else {
      last.next = new Node(value);
      last.next.prev = last;
      last = last.next;
    }
  }

  /**
   *  The prepend method adds an element in the head of the list.
   *  @param value The value of the element.
   */
  public void prepend(int value)
  {
    if (isEmpty()) {
      first = new Node(value);
      last = first;

    } else {
      Node newNode = new Node(value);
      newNode.next = first;
      newNode.prev = null;
      first.prev = newNode;
      first = newNode;
    }
  }

  /**
   *  The insert method inserts an element in the index of the list.
   *  @param index The index of the element.
   *  @param value The value of the element.
   */
  public void insert(int index, int value)
  {
    if (index < 0 || index > size() - 1) {
      throw new IndexOutOfBoundsException(index);
    }

    if (index == 0) {
      prepend(value);

    } else if (index == size() - 1) {
      append(value);

    } else {
      Node newNode = new Node(value);

      Node pred = first;
      for (int i = 0; i < index - 1; i++) {
        pred = pred.next;
      }

      newNode.next = pred.next;
      pred.next.prev = newNode;
      pred.next = newNode;
      newNode.prev = pred;
    }	
  }

  /**
   *  The remove method removes an element in the index of the list.
   *  @param index The index of the element.
   */
  public void remove(int index)
  {
    if (index < 0 || index > size() - 1) {
      throw new IndexOutOfBoundsException(index);
    }

    if (index == 0) {		
      if (size() == 1) {
        first = null;
        last = null;

      } else {
        first.next.prev = null;
        first = first.next;
      }

    } else {

      Node pred = first;
      for (int i = 0; i < index - 1; i++) {
        pred = pred.next;
      }

      pred.next = pred.next.next;

      if (pred.next == null) {
        last = pred;

      } else {
        pred.next.prev = pred;
      }
    }	
  }

  /**
   *  The getList method gets an array of the elements in the list.
   *  return array The array of the elements.
   */
  public int[] getList()
  {
    int[] array = new int [size()];
    int idx = 0;

    Node currentNode = this.first;

    while (currentNode != null) {
      array[idx] = currentNode.value;
      idx++;
      currentNode = currentNode.next;
    }

    return array;
  }


  /**
   *  The getList method gets an array of the elements in the list.
   *  return array The array of the elements.
   */
  public int[] getListBackward()
  {
    int[] array = new int [size()];
    int idx = 0;

    Node currentNode = this.last;

    while (currentNode != null) {
      array[idx] = currentNode.value;
      idx++;
      currentNode = currentNode.prev;
    }

    return array;
  }
}

