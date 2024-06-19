package algorithm;

/**
 * BubbleSort class.
 */
public class BubbleSort {

  public static void sort(int[] array)
  {
    //   0   1  2  3  4  5   6   7    8  9  10 <= index
    // [99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0]
    int tmp = 0;		// Used to swap two elements

    // The outer loop positions last at the last element to 
    // compare during each pass through the array.
    // Initially, last is the index of the last element in the array.
    // During each iteration, last is decreased by one.
    // The loop will find the largest numberr of the rest of the numbers.
    for (int last = array.length - 1; last > 0; last--) {

      // The inner loop steps through the array, 
      // and compares each element with its neighbor.
      // All of the elements from index 0 through last are 
      // involved in the comparsion.
      // If two elements are out of order, they are swapped.
      for (int i = 0; i < last; i++) {

        if (array[i] > array[i + 1]) {
          // Swap the two elements
          tmp          = array[i + 1];
          array[i + 1] = array[i];
          array[i]     = tmp;				
        }
      }
    }
  }
}
