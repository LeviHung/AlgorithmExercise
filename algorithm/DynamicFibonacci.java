package algorithm;

import java.util.HashMap;

/**
 * DynamicFibonacci class.
 */
public class DynamicFibonacci 
{
  private static final HashMap<Integer, Integer> cache = new HashMap<>();

  public static int findFibonacci(int n) 
  {
    if (cache.containsKey(n)) {
      return cache.get(n);
    }

    if (n < 2){
      return n;
    }

    cache.put(n, findFibonacci(n - 1) + findFibonacci(n - 2));

    return cache.get(n);
  }

  public static int findFibonacciByArray(int n) 
  {
    int [] answer = new int [n + 1];
    answer[0] = 0;
    answer[1] = 1;

    for (int i = 2; i <= n; i++) {
      answer[i] = answer[i-2] + answer[i-1];
    }

    return answer[n];
  }

}
