package algorithm;

public class Fibonacci {

  public static int findFibonacci(int n)
  {	//[0]	[1] [2] [3] [4] [5] [6] [7] [8]
    // 0,  1,  1,  2,  3,  5,  8, 13, 21, 34, 55, 89, 144, ...
    if (n <= 1) {
      return n;
    }
    return findFibonacci(n - 1) + findFibonacci(n - 2);
  }

  public static int findFibonacciByIteration(int n)
  {
    int value = 0;
    int preValue = 0;
    int tmp = 0;
    for (int i = 2; i <= n; i++) {
      if (i == 2) {
        preValue = 1;
        value = 1;

      } else {							// 3	4	 5
        tmp = value;				// 1	2	 3
        value += preValue;	// 2	3  5
        preValue = tmp;			// 1	2	 3
      }
    }

    return value;
  }
}
