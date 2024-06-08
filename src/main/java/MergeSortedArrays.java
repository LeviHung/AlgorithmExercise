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


  /* Merging two sorted arrays.
   */
  public int [] getMergedArray()
  {
    int[] mergedArray = new int[array1.length + array2.length];

    // [0, 3, 4, 31] [4, 6, 30]
    for (int i = 0, idx1 = 0, idx2 = 0; i < mergedArray.length; i++) {
      if (idx1 >= array1.length) {
        mergedArray[i] = array2[idx2];
        idx2++;
      } else if (idx2 >= array2.length) {
        mergedArray[i] = array1[idx1];
        idx1++;
      } else if (array1[idx1] < array2[idx2]) {
        mergedArray[i] = array1[idx1];
        idx1++;
      } else {
        mergedArray[i] = array2[idx2];
        idx2++;
      }  
    }

    return mergedArray;
  }
  /*
   * Another solution for merging two sorted arrays from nimrod46 on GitHub.
   */
  public int [] getMergedArrayByOther()
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
