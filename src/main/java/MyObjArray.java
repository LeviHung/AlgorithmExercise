import java.util.Arrays;

public class MyObjArray {
  private Object[] data;
  private int capacity;
  private int length;

  /* Constructor
   * In Java, when an ArrayList object is first created, using the no-arg 
   * constructor, it has an initial capacity of 10 items. This capacity is 
   * the number of items it can store without having to increase its size. 
   * When the eleventh item is added, the ArrayList object must increase its 
   * size to accommodate the new item according to the double size of the 
   * initial capacity. Before you add any items to the ArrayList object by 
   * the add method, the ArrayList object’s size is 0. 
   */
  public MyObjArray()
  {
    this.data = new Object[10];
    this.capacity = 10;
    this.length = 0;
  }

  public Object get(int index)
  {
    return data[index];
  }

  public void push(Object obj)
  {
    if (capacity == length) {
      data = Arrays.copyOf(data, capacity * 2);
      capacity *= 2;
     }
    data[length] = obj;
    length++;
  }

  public Object pop()
  {
    Object obj = data[length - 1];
    data[length - 1] = null;
    length--;
    return obj;
  }


  public Object delete(int index) 
  {
    Object obj = data[index];
    shift(index);
    return obj;
  }

  public void shift(int index) 
  {
    for (int i = index; i < length - 1; i++) {
      data[i] = data[i + 1];
    }
    data[length - 1] = null;
    length--;
  }

  /**
   * The toString method returns a String containing the array's data.
   * @return A reference to a String.
   */
  public String toString()
  {
     String str = "";

     for (int i = 0; i< this.length; i++) {
       str += "[" + i + "] " + String.valueOf(this.data[i]) + "\n";
     }

     return str;
  }
}
