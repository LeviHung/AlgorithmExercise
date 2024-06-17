package queue;

/**
 * Array Queue Class
 * This queue class is based on an array.
 */
public class ArrayQueue {

  private int front;			// Queue front pointer 
  private int rear;				// Queue rear pointer 
  private int number;			// The amount of items in the queue
  private String array[];	// Holds queue elements

  /**
   * Constructor.
   * @param size The capacity of the queue.
   */
  public ArrayQueue(int size)
  {
    front = 0;
    rear = 0;
    number = 0;
    array = new String [size];
  }

  /**
   * The enqueue method enqueues a value onto the queue.
   * @param str The value to enqueue into the queue.
   * @throws Exception When the queue is full.
   */
  public void enqueue(String str) throws Exception 
  {
    if (number >= array.length) {
      throw new Exception("Error! The queue is full.");			
    }

    array[rear] = str;
    number++;
    rear++;

    if (rear >= array.length) {
      rear = 0;
    }
  }

  /**
   * The dequeue method dequeues a value off the queue.
   * @return The value dequeued.
   * @throws Exception When the queue is empty.
   */
  public String dequeue() throws Exception
  {
    if (number == 0) {
      throw new Exception("Error! The queue is empty.");
    }

    String strResult = array[front];
    number--;
    front++;

    if (front >= array.length) {
      front = 0;
    }

    return strResult;
  }

  /**
   * The peek method returns the value at the front of the queue.
   * @return The value at the front of the queue.
   * @throws Exception When the queue is empty.
   */
  public String peek() throws Exception
  {
    if (number == 0) {
      throw new Exception("Error! The queue is empty.");
    }

    return array[front];
  }
}
