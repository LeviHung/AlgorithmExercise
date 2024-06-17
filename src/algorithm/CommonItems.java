package algorithm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.stream.Stream;

/**
 * CommonItems class.
 */
public class CommonItems {

  /**
  * A "naive" approach for solving the question, with
  * time complexity of O(a * b) - exponential
  * space complexity of O(1) - constant.
  * @param array1 the first input array.
  * @param array2 the second input array.
  * @return A boolean indicating whether two arrays have any common items.
  */
  public static boolean containsByNaivety(Object [] array1, Object [] array2)
  {
    //boolean result = false;
    for (int i = 0; i < array1.length; i++) {
      for (int j = 0; j < array2.length; j++) {
        if (Objects.equals(array1[i], array2[j])) {
          // BugFix: If the object of the array is null, it will throw a NullPointerException.
          //if (array1[i].equals(array2[j])) {

          // Modified: Use return immediately instead of setting result variable.
          //result = true;
          return true;
        }
      }
    }
    return false;
    //return result;
  }

  /**
  * Use Hash Set method to check whether the two arrays have common items.
  * time complexity of O(b) - linear
  * space complexity of O(a) - linear
  * @param array1 the first input array.
  * @param array2 the second input array.
  * @return A boolean indicating whether two arrays have any common items.
  */
  public static boolean containsByHashSet(Object [] array1, Object [] array2)
  {
    HashSet<Object> mapArray1 = new HashSet<>();

    // loop through first array and create a hash set, 
    // where keys are the items in the array
    for (int i = 0; i < array1.length; i++) {
      mapArray1.add(array1[i]);
    }

    // loop through the second array and check if the item in second array
    // exists in the hash set. 
    for (int j = 0; j < array2.length; j++) {
      if (mapArray1.contains(array2[j])) {
        return true;
      }
    }
    return false;
  }

  /**
   * A better and cleaner solution which use a Hast set and Stream method.
   * time complexity of O(b) - linear
   * space complexity of O(a) - linear
   * @param array1 - the first input array
   * @param array2 - the second input array
   * @return A boolean indicating whether those two arrays have any common items
   */
  public static boolean containsByMethods(Object [] array1, Object [] array2)
  {
    HashSet<Object> mapArray1 = new HashSet<>(Arrays.asList(array1));
    return Stream.of(array2).anyMatch(mapArray1::contains);
  }
}
