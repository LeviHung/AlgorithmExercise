// Levi Hung
// 06/04/24
// Algorithm in Udemy course

import java.util.Scanner;
import java.util.Objects;
import java.util.HashSet;
import java.util.Arrays;
import java.util.stream.Stream;

// FUNCTION 1:
// What is the Big O of the below function? 
// (Hint, you may want to go line by line)
// ANS: It depends on anotherFunction function. If there is not a function
// in the funChallege, the big O will be O(n);

// FUNCTION 2:
// Check the executive time for the Recursive Fibonacci method. 

// FUNCTION 3, 4, 5:
/* Given 2 arrays, create a function that let a user know (true/false)
  whether these two arrays contain any common items
  For Example:
  const array1 = ['a', 'b', 'c', 'x'];
  const array2 = ['z', 'y', 'i'];
  should return false.
  -----------
  const array1 = ['a', 'b', 'c', 'x'];
  const array2 = ['z', 'y', 'x'];
  should return true.
  2 parameters - arrays - no size limit
  return true or false
*/

// FUNCTION 6
/* Given a collection of numbers and find a matching pair that is equal to
  a sum.
  For example:
  [1, 2, 3, 9], sum = 8, 
  should return false.
  ----------------------
  [1, 2, 4, 4], sum = 8,
  should return true, the matching pair is 4 and 4.
*/

public class Main {
  private static Object [] usrArray = {'a', 4, "asdf", '7', 'r', null};
  private static Object [] cmpArray = {'z', 3, new String("asd"), null, 'x'};
  private static int [] colArray = {1, 2, 4, 4};
  private static int targetSum = 8;

  public static void main(String[] args) {
    int inputKey;
    boolean result;

    // Create a Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);

    do {
      // Display a console menu. 
      displayMenu();

      // Get the user's input.
      inputKey = keyboard.nextInt();
      keyboard.nextLine();

      switch (inputKey) {
        case 1:
          firstExercise();
          break;
        case 2:
          RecursiveFibonacciTimer();
          break;
        case 3:
          result = containCommonItemsByNaivety(usrArray, cmpArray);
          System.out.println("The result is " + result);
          break;
        case 4:
          result = containCommonItemsByHashSet(usrArray, cmpArray);
          System.out.println("The result is " + result);
          break;
        case 5:
          result = containCommonItemsByMethods(usrArray, cmpArray);
          System.out.println("The result is " + result);
          break;
        case 6:
          result = findMatchingPair(colArray, targetSum);
          System.out.println("The result is " + result);
          break;

        default:
          if (inputKey != 0) {
            System.out.println("Invalid Input!");
          }
          break;
      }
    } while (inputKey != 0);
  }

  /**
    * The displayMenu method displays a console menu.
    */
  public static void displayMenu()
  {
    System.out.println("\n======================================");
    System.out.println("1. First Algorthm Exercise");
    System.out.println("2. Recursive Fibonacci Timer");
    System.out.println("3. Contain Common Items By Naivety");
    System.out.println("4. Contain Common Items By Hash Set");
    System.out.println("5. Contain Common Items By Methods");
    System.out.println("6. Find Matching Pair With Sum");
    System.out.println("0. Exit");
    System.out.println("======================================");
    System.out.print("Enter a choice: ");
  }

  public static void firstExercise()
  {    
    System.out.println("First Algorithm Exercise!");
    int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    int result = funChallenge(array);
    System.out.println("result = " + result);
  }

  public static int funChallenge(int [] input)
  {
    int a = 10;
    a = 50 + 3;

    for (int i = 0; i < input.length; i++) {
      // call another Function
      // anothorFunction();
      boolean stranger = true;
      a ++;
    }

    return a;
  }

  /**
   * This program times calls to the recursive Fibonacci method
   * for 6 consecutive calls and displays the results.
   */

  public static void RecursiveFibonacciTimer()
  {
    // Get the starting argument
    System.out.println("Enter a positive integer:");
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();

    // Variables used to determine time for a function call
    long currentTime = System.currentTimeMillis();
    long previousTime;
    long elapsedTime = 0;

    for (int k = 0; k <= 5; k++)
    {
      // Record time before function call
      previousTime = currentTime;
      System.out.print("The Fibonacci term at position ");
      System.out.print((number + k)  + " is " );

      // Compute and print fib term for the next argument
      System.out.println(fib(number + k));

      // Record time after function call
      currentTime = System.currentTimeMillis();

      // Compute and print elapsed time in seconds
      elapsedTime = (currentTime - previousTime)/1000;
      System.out.println("Computed in " + elapsedTime + " seconds.");
    }
  }
  /**
  * Computes a term of the Fibonacci sequence
  * @param n
  * @return nth term of the sequence
  */
  public static long fib(long n)
  {
     if (n <=1)
         return 1;
     else
         return fib(n-2) + fib(n-1);
  }

  /**
  * A "naive" approach for solving the question, with
  * time complexity of O(a * b) - exponential
  * space complexity of O(1) - constant.
  * @param array1 the first input array.
  * @param array2 the second input array.
  * @return A boolean indicating whether two arrays have any common items.
  */
  public static boolean containCommonItemsByNaivety(Object [] array1, Object [] array2)
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
  public static boolean containCommonItemsByHashSet(Object [] array1, Object [] array2)
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
  public static boolean containCommonItemsByMethods(Object [] array1, Object [] array2)
  {
    HashSet<Object> mapArray1 = new HashSet<>(Arrays.asList(array1));
    return Stream.of(array2).anyMatch(mapArray1::contains);
  }

  /**
   * Create a FindMatchingPair object and get the result and matching pair by calling 
   * its method.
   * time complexity of O(b) - linear
   * space complexity of O(a) - linear
   * @param array1 - the collection of numbers
   * @param sum - the target sum
   * @return A boolean indicating whether the array have the matching pair with the sum
   */
  public static boolean findMatchingPair(int [] array, int sum)
  {
    boolean result = false;
    FindMatchingPair fmp = new FindMatchingPair(array, sum);

    if(fmp.findMatchingPair()) {
      System.out.println("The matching pair is " + fmp.getPair()[0] + 
                         " and " + fmp.getPair()[1]);
      return true;
    }
    return false;
  }
}
