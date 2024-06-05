// Levi Hung
// 06/04/24
// Algorthim in Udemy course

import java.util.Scanner;
// What is the Big O of the below function? 
// (Hint, you may want to go line by line)
// ANS: It depends on anotherFunction function. If there is not a function
// in the funChallege, the big O will be O(n);


public class Main {
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
    System.out.println("\n==============================");
    System.out.println("1. First Algorthm Exercise");
    System.out.println("2. Recursive Fibonacci Timer");
    System.out.println("0. Exit");
    System.out.println("==============================");
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

}
