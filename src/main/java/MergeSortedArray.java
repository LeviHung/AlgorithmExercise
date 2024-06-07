/*
 * MergeSortedArray Class
 */

public class MergeSortedArrays {
  private int [] array1;
  private int [] array2;

  public MergeSortedArrays(int [] array1, int[] array2)
  {
    this.array1 = array1;
    this.array2 = array2;
  }

  /*
   * Another solution for merging two sorted arrays from nimrod46 on GitHub.
   */
  public int [] getMergeArrayByOther()
  {
    final int[] mergedArray = new int[array1.length + array2.length];
    int j = 0, k = 0;
    for (int i = 0; i < mergedArray.length; i++) {
      if (j != array1.length && (k == array2.length || array1[j] < array2[k])) {
        mergedArray[i] = array1[j];
        j++;
      } else {
        mergedArray[i] = array2[k];
        k++;
      }
    }
    return mergedArray;
  }

}
