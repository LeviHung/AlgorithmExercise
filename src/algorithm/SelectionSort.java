package algorithm;

/**
 * SelectSort Class.
 */
public class SelectionSort {

  public static void sort(int[] array)
  {
    //   0   1  2  3  4  5   6   7    8  9  10 <= index
    // [99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0]
    int minIndex;		// Element index with the smallest value
    int minValue;		// The smallest value found in the scan
    int start;			// Starting position of the scan

    // The outer loop iterates once for each element in the array.
    // The start variable marks the postion where the scan should begin.
    for (start = 0; start < array.length - 1; start++) {

      // Assume the first element is the smallest value.
      minIndex = start;
      minValue = array[start];			

      // Scan the array. 
      // Start at the 2nd element and look for the smallest value.
      for (int i = start + 1; i < array.length; i++) {

        // Find the smallest value in the array.
        if (array[i] < minValue) {
          minIndex = i;
          minValue = array[i];
        }
      }

      // Swap the element with the smallest value with the first element in
      // the scannable value (start position).
      array[minIndex] = array[start];
      array[start]    = minValue;
    }
  }
}
