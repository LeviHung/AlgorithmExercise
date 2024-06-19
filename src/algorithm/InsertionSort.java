package algorithm;

/**
 * InsertionSort class.
 */
public class InsertionSort {

  public static void sort(int[] array)
  {
    //   0   1  2  3  4  5   6   7    8  9  10 <= index
    // [99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0]
    int unsortedValue;		// The unsorted value
    int scanIndex;				// Used to scan the array

    // The outer loop steps the insert variable through each subscript
    // in the array.
    // Start at 1. The portion of the array consisting of element 0 
    // is already sorted.
    for (int insert = 1; insert < array.length; insert++) {

      // The first element outside the sorted portion is array[insert].
      unsortedValue = array[insert];

      // Start scan at the subscript of the first element in the unsorted part.
      scanIndex = insert;

      // Move the first element in the unsorted part into its proper position
      // within the sorted part.
      // If the array[scanIndex - 1] is greater than unsortedValue,
      // Move the array[scanIndex - 1] to right position.
      while (scanIndex > 0 && array[scanIndex - 1] > unsortedValue) {
        array[scanIndex] = array[scanIndex - 1];
        scanIndex--;
      }

      // Insert the unsorted value in its proper postion.
      array[scanIndex] = unsortedValue;
    }
  }
}
