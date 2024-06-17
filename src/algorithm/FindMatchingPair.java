// Levi Hung
// 06/06/24
// Algorthim for Google Coding Interview
// https://youtu.be/XKu_SEDAykw

package algorithm;
import java.util.HashSet;

/**
    FindMatchingPair class 
 */
public class FindMatchingPair 
{
  private int [] array;
  private int sum;
  private int [] matchingArray;

  /**
   * Constructor
   * @param array An array of collection of integer numbers.
   * @param sum The target sum.
   */
  public FindMatchingPair(int [] array, int sum)
  {
    // Modified: Assign the array argument to the array field. 
    /*
    this.array = new int[array.length];
    for (int i = 0; i < array.length; i++) {
      this.array[i] = array[i];
    }
    */
    this.array = array;
    this.sum = sum;	
    matchingArray = new int[2];
  }

  public int getSum()
  {
    return sum;
  }

  public int [] getPair()
  {
    return matchingArray;
  }

  public boolean findMatchingPair()
  {
    HashSet<Object> compArray = new HashSet<>();

    for (int i = 0; i < array.length; i++) {
      if(compArray.contains(array[i])) {
        matchingArray[0] = sum - array[i];
        matchingArray[1] = array[i];
        return true;
      }
      compArray.add(sum - array[i]);
    }

    return false;
  }
}