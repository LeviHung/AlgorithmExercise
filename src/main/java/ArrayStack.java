
/**
 * Array Stack Class
 * This stack class is based on an array.
 */
public class ArrayStack {

  private int top;				// Stack top pointer 
  private String array[];	// Holds stack elements

  /**
   * Constructor.
   * @param size The capacity of the stack.
   */
  public ArrayStack(int size)
  {
    top = 0;
    array = new String [size];
  }

  /**
   * The push method pushes a value onto the stack.
   * @param str The value to push onto the stack.
   * @throws Exception When the stack is full.
   */
  public void push(String str) throws Exception 
  {
    if (top >= array.length) {
      throw new Exception("Error! The stack is full.");			
    }

    array[top] = str;
    top++;
  }

  /**
   * The pop method pops a value off the stack.
   * @return The value popped.
   * @throws Exception When the stack is empty.
   */
  public String pop() throws Exception
  {
    if (top == 0) {
      throw new Exception("Error! The Stack is empty.");
    }

    top--;

    return array[top];
  }

  /**
   * The peek method returns the value at the top of the stack.
   * @return The value at the top of the stack.
   * @throws Exception When the stack is empty.
   */
  public String peek() throws Exception
  {
    if (top == 0) {
      throw new Exception("Error! The Stack is empty.");
    }

    return array[top - 1];
  }

  /**
   * 
   * @return True if the stack is empty. Otherwise false. 
   */
  public boolean isEmpty()
  {
    return (top == 0);
  }
}
