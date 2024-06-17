package queue;
import stack.ArrayStack;
/**
 * Stack Queue Class
 * This queue class is based on stacks.
 */
public class StackQueue {

  private ArrayStack stack;
  private ArrayStack stackAux;
  int number;
  int numberAux;

  public StackQueue(int size)
  {
    stack = new ArrayStack(size);
    stackAux = new ArrayStack(size);
    number = 0;
    numberAux = 0;
  }

  public void enqueue (String value) throws Exception
  {
    number++;
    stack.push(value);
  }

  public String dequeue() throws Exception
  {
    if (stack.isEmpty() && stackAux.isEmpty()) {
      //throw new Exception("Error! The queue is empty.");
      return null;
    }

    try {
      if (stackAux.isEmpty()) {
        while (!stack.isEmpty()) {
          stackAux.push(stack.pop());
        }
      }

    } catch (Exception e) {

    }

    return stackAux.pop();
  }

  public String peek() throws Exception
  {
    if (stack.isEmpty() && stackAux.isEmpty()) {
      //throw new Exception("Error! The queue is empty.");
      return null;
    }

    try {
      if (stackAux.isEmpty()) {
        while (!stack.isEmpty()) {
          stackAux.push(stack.pop());
        }
      }

    } catch (Exception e) {

    }

    return stackAux.peek();
  }
}
