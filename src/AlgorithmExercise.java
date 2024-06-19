// Levi Hung
// 06/04/24
// Data structures and algorithms in Udemy course

import java.util.Scanner;
import java.util.Objects;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;
import java.util.Random;
import javax.swing.JFrame;
import java.util.Comparator;

import algorithm.FindMatchingPair;
import algorithm.MergeSortedArrays;
import algorithm.CommonItems;
import algorithm.ReverseString;
import array.MyObjArray;
import hashtable.ArrayListHashTable;
import linkedlist.LinkedList;
import linkedlist.DLinkedList;
import stack.ArrayStack;
import stack.LinkedStack;
import queue.ArrayQueue;
import queue.LinkedQueue;
import queue.StackQueue;
import graph.MapGraph;
import tree.BinarySearchTree;
import tree.AVLTree;
import tree.ArrayHeapTree;

import algorithm.Factorial;
import algorithm.Fibonacci;
import algorithm.NaturalOrderComparator;
import algorithm.BubbleSort;
import algorithm.SelectionSort;

// FUNCTION 1-1:
// What is the Big O of the below function? 
// (Hint, you may want to go line by line)
// ANS: It depends on anotherFunction function. If there is not a function
// in the funChallege, the big O will be O(n);

// FUNCTION 1-2:
// Check the executive time for the Recursive Fibonacci method. 

// FUNCTION 1-3:
/* Given 2 arrays, create a function that lets a user know (true/false)
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

// FUNCTION 1-4:
/* Given a collection of numbers and find a matching pair that is equal to
  a sum.
  For example:
  [1, 2, 3, 9], sum = 8, 
  should return false.
  ----------------------
  [1, 2, 4, 4], sum = 8,
  should return true, the matching pair is 4 and 4.
*/

// FUNCTION 2:
/* Design a array class that can store objects and 
 * has the methods related to array operations.
   For exampe:
   thisArray.push("Hi,"),
   thisArray.push("there"),
   thismyArray should show "Hi, there"
*/

// FUNCTION 1-5:
/* Given a string and reverse the string to return it.
   For example:
   str = "Hi, I am Levi Hung."
   The function should return a string ".gnuH iveL ma I ,iH"
*/

//FUNCTION 1-6:
/* Given two sorted arrays consisting of integer numbers and 
 * merge them to return an array.
  For example:
  array1 = [0, 3, 4, 31]
  array2 = [4, 6, 30]
  The function should return [0, 3, 4, 6, 30, 31].
*/

//FUNCTION 3:
// Design a hash table class that can store keys and values.
// it also has some methods related to hash table operations.
// For exampe:
// thisHashTable.set("grapes", 10000),
// thisHashTable.set("apples", 54),
// thisHashTable.set("oranges", 2),
// thisHashTable.get("oranges") should return 10000, 
// thisHashTable.keys() should return an array with "grapes", "apples", and "oranges"

//FUNCTION 1-7-1:
// First Recurring number.
// This function finds the first recurring number from an integer array by using
// a array list hash table.
// For exampe:
// Given an array = [2, 5, 1, 2, 3, 5, 1, 2, 4]:
// It should return 2.
// Given an array = [2, 1, 1, 2, 3, 5, 1, 2, 4]:
// It should return 1.
// Given an array = [2, 3, 4, 5]:
// It should return 0.

// FUNCTION 1-7-2:
// Find the first recurring number by looping through the array
// and fix the problem. 
// For example:
// Given an array = [2, 5, 5, 2, 3, 5, 1, 2, 4]:
// It should return 5, but looping through will return 2.

// FUNCTION 4-1:
// Design a linked list class that can store integers.
// For example:
// 10 -> 5 -> 16 -> null

// FUNCTION 4-2:
// Design a doubly linked list class.
// null <- 10 <-> 5 <-> 16 -> null

// FUNCTION 5:
// Design a stack and queue class that can pop/push, enqueue/dequeue, and peek.
// For example:
// push("Google")
// push("Udemy")
// push(Discord")
// peek(), it should return "Discord".
// pop() and peek(), it should return "Udemy".

// FUNCTION 6-1:
// Design a tree, such as binary search tree that can insert, lookup, and remove.
// For example:
// insert(9)
// insert(4)
// insert(6)
// insert(20)
// insert(170)
// insert(15)
// insert(1)
// The binary search tree shuoud be
//        9
//    4      20
//  1   6  15  170

// FUNCTION 6-2:
// Design a graph that can add nodes, add edges, and show its connections.
// For example: 
// 3 --- 4 --- 5
// |     |     |
// |     |     |
// 1 --- 2     6
//  \   /
//   \ /
//    0

// FUNCTION 7-1
// Write two functions that finds the factorial of any number. One should use 
// recursive, the other should jus use a for loop.

// FUNCTION 7-3
// Given a number N return the index value of the Fibonacci sequence, 
// where the sequence is:
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
// the pattern of the sequence is that each value is the sum of the 2 
// previous values, that means that for N = 5 -> 2 + 3.

// FUNCTION 7-5
// Reverse String With Recursion

// FUNCTION 8-1
// Sort arrays by built-in functions.

// FUNCTION 8-2
// Sort an integer array by using Bubble Sort.
// For example:
// numbers = [99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0];
// sorted  = [0, 1, 2, 4, 5, 6, 44, 63, 87, 99, 283];

//FUNCTION 8-3
//Sort an integer array by using Selection Sort.
//For example:
//numbers = [99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0];
//sorted  = [0, 1, 2, 4, 5, 6, 44, 63, 87, 99, 283];

public class AlgorithmExercise {

  public static void main(String[] args) {
    int inputKey;
    int subKey;
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
          do {
            displayAlgorithmExerciseMenu();
            subKey = keyboard.nextInt();
            keyboard.nextLine();
            switch (subKey) {
              case 1:
                firstExercise();;
                break;
              case 2:
                RecursiveFibonacciTimer();
                break;
              case 3:
                do {
                  Object [] usrArray = {'a', 4, "asdf", '7', 'r', null};
                  Object [] cmpArray = {'z', 3, new String("asd"), null, 'x'};

                  displayContainCommonItemsMenu();
                  subKey = keyboard.nextInt();
                  keyboard.nextLine();
                  System.out.println("The user array is " + 
                      Arrays.toString(usrArray));
                  System.out.println("The comp array is " + 
                      Arrays.toString(cmpArray));
                  switch (subKey) {
                    case 1:
                      result = CommonItems.containsByNaivety(usrArray, cmpArray);
                      System.out.println("The result is " + result);
                      break;
                    case 2:
                      result = CommonItems.containsByHashSet(usrArray, cmpArray);
                      System.out.println("The result is " + result);
                      break;
                    case 3:
                      result = CommonItems.containsByMethods(usrArray, cmpArray);
                      System.out.println("The result is " + result);
                      break;
                    default:
                      if (subKey != 0) {
                        System.out.println("Invalid Input!");
                      }
                      break;
                  } 
                } while (subKey != 0);
                break;
              case 4:
                int [] colArray = {1, 2, 3, 4, 4, 5};
                int targetSum = 8;

                System.out.println("The integer array is " + 
                                    Arrays.toString(colArray));
                System.out.println("The sum is " + targetSum);
                result = findMatchingPair(colArray, targetSum);
                System.out.println("The result is " + result);
                break;
              case 5:
                String usrString = "Hi, I am Levi Hung.";

                String revString = ReverseString.reverseString(usrString);
                System.out.println("The user string is    " + usrString);
                System.out.println("The reverse string is " + revString);
                break;
              case 6:
                int [] usrSortedArray2 = {0, 3, 4, 31};
                int [] usrSortedArray1 = {4, 6, 30};

                int [] mergeArray = mergeSortedArray(usrSortedArray1, 
                                                     usrSortedArray2);
                System.out.println("The merge array is");
                for (int i = 0; i < mergeArray.length; i++)
                  System.out.println(i + ": " + mergeArray[i]);

                break;
              case 7:
                do {
                  int [] usrIntegerArray1 = {2, 5, 1, 2, 3, 5, 1, 2, 4};
                  int [] usrIntegerArray2 = {2, 1, 1, 2, 3, 5, 1, 2, 4};
                  int [] usrIntegerArray3 = {2, 3, 4, 5};
                  int [] usrIntegerArray4 = {2, 1, 5, 4, 2, 5, 1, 2, 4};
                  int [] usrIntegerArray5 = {2, 5, 5, 2, 3, 5, 1, 2, 4};
                  int [] usrIntegerArray6 = {2, 5, 4, 4, 5, 2, 1, 2, 4};

                  displayFirstRecurringNumberMenu();
                  subKey = keyboard.nextInt();
                  keyboard.nextLine();
                  System.out.println("The integer array is " + 
                                      Arrays.toString(usrIntegerArray1));
                  System.out.println("The integer array is " + 
                                      Arrays.toString(usrIntegerArray2));
                  System.out.println("The integer array is " + 
                                      Arrays.toString(usrIntegerArray3));
                  System.out.println("The integer array is " + 
                                      Arrays.toString(usrIntegerArray4));
                  System.out.println("The integer array is " + 
                                      Arrays.toString(usrIntegerArray5));
                  System.out.println("The integer array is " + 
                                      Arrays.toString(usrIntegerArray6));

                  switch (subKey) {
                    case 1:
                      System.out.println("The first recurring number is " +  
                                findFirstRecurringNumber(usrIntegerArray1));
                      System.out.println("The first recurring number is " +  
                                findFirstRecurringNumber(usrIntegerArray2));
                      System.out.println("The first recurring number is " +  
                                findFirstRecurringNumber(usrIntegerArray3));
                      System.out.println("The first recurring number is " +  
                                findFirstRecurringNumber(usrIntegerArray4));
                      System.out.println("The first recurring number is " +  
                                findFirstRecurringNumber(usrIntegerArray5));
                      System.out.println("The first recurring number is " +  
                                findFirstRecurringNumber(usrIntegerArray6));
                      break;
                    case 2:
                      System.out.println("The first recurring number is " +  
                             findFirstRecurringNumberByLoop(usrIntegerArray1));
                      System.out.println("The first recurring number is " +  
                             findFirstRecurringNumberByLoop(usrIntegerArray2));
                      System.out.println("The first recurring number is " +  
                             findFirstRecurringNumberByLoop(usrIntegerArray3));
                      System.out.println("The first recurring number is " +  
                             findFirstRecurringNumberByLoop(usrIntegerArray4));
                      System.out.println("The first recurring number is " +  
                             findFirstRecurringNumberByLoop(usrIntegerArray5));
                      System.out.println("The first recurring number is " +  
                             findFirstRecurringNumberByLoop(usrIntegerArray6));
                      break;
                    default:
                      if (subKey != 0) {
                        System.out.println("Invalid Input!");
                      }
                      break;
                  } 
                } while (subKey != 0);
                break;
              case 8:
                break;
              default:
                if (subKey != 0) {
                  System.out.println("Invalid Input!");
                }
                break;
            }
          } while (subKey != 0);
          break;
        case 2:
          buildMyObjArray();
          break;
        case 3:
          buildHashTable();
          break;
        case 4:
          do {
            displayLinkedListMenu();
            subKey = keyboard.nextInt();
            keyboard.nextLine();
            switch (subKey) {
              case 1:
                buildLinkedList();;
                break;
              case 2:
                buildDoublyLinkedList();
                break;
              default:
                if (subKey != 0) {
                  System.out.println("Invalid Input!");
                }
                break;
            }
          } while (subKey != 0);
          break;
        case 5:
          do {
            displayStackQueueMenu();
            subKey = keyboard.nextInt();
            keyboard.nextLine();
            switch (subKey) {
              case 1:
                buildLinkedStack();;
                break;
              case 2:
                buildArrayStack();
                break;
              case 3:
                buildLinkedQueue();
                break;
              case 4:
                buildArrayQueue();
                break;
              case 5:
                buildStackQueue();
                break;
              default:
                if (subKey != 0) {
                  System.out.println("Invalid Input!");
                }
                break;
            }
          } while (subKey != 0);
          break;
        case 6:
          do {
            displayTreeMenu();
            subKey = keyboard.nextInt();
            keyboard.nextLine();
            switch (subKey) {
              case 1:
                buildBinarySearchTree();;
                break;
              case 2:
                buildAVLTree();;
                break;
              case 3:
                buildArrayHeapTree();;
              case 4:
                buildGraph();
                break;
              default:
                if (subKey != 0) {
                  System.out.println("Invalid Input!");
                }
                break;
            }
          } while (subKey != 0);
          break;
        case 7:
          do {
            displayRecursionMenu();
            subKey = keyboard.nextInt();
            keyboard.nextLine();
            int input = 0;

            switch (subKey) {
              case 1:
                System.out.print("Enter a integer: ");
                input = keyboard.nextInt();

                System.out.println("The Factorial of " + input + " is " +
                                   "findFactorial(" + input + ") = " + 
                                   Factorial.findFactorial(input));
                break;
              case 2:
                System.out.print("Enter a integer: ");
                input = keyboard.nextInt();

                System.out.println("The Factorial of " + input + " is " +
                           "findFactorialByIteration(" + input + ") = " + 
                           Factorial.findFactorialByIteration(input));
                break;
              case 3:
                System.out.print("Enter a integer: ");
                input = keyboard.nextInt();

                System.out.println("The Fibonacci of " + input + " is " +
                                   "findFibonacci(" + input + ") = " + 
                                   Fibonacci.findFibonacci(input));
                break;
              case 4:
                System.out.print("Enter a integer: ");
                input = keyboard.nextInt();

                System.out.println("The Fibonacci of " + input + " is " +
                           "findFibonacciByIteration(" + input + ") = " + 
                           Fibonacci.findFibonacciByIteration(input));

              case 5:
                System.out.print("Enter a string: ");
                String strInput = keyboard.nextLine();
                //keyboard.nextLine();

                System.out.println("Reverse string of \"" + strInput + "\" is ");
                System.out.println("reverseByRecursion() = " + 
                                  ReverseString.reverseByRecursion(strInput));

                break;
              default:
                if (subKey != 0) {
                  System.out.println("Invalid Input!");
                }
                break;
            }
          } while (subKey != 0);
          break;

        case 8:
          do {
            displaySortingMenu();
            subKey = keyboard.nextInt();
            keyboard.nextLine();
            switch (subKey) {
              case 1:
                sortByBuiltinFunction();
                break;
              case 2:
                sortByBubbleSort();
                break;
              case 3:
                sortBySelectionSort();
                break;
              default:
                if (subKey != 0) {
                  System.out.println("Invalid Input!");
                }
                break;
            }
          } while (subKey != 0);
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
    System.out.println("\n=========== Main Menu ================");
    System.out.println("1. Basic Algorithm Exercise");
    System.out.println("2. Build an Array");
    System.out.println("3. Build a Hash Table");
    System.out.println("4. Build a Linked List");
    System.out.println("5. Build a Stack and Queue");
    System.out.println("6. Build a Tree and Graph");
    System.out.println("7. Algorithm Recursion");
    System.out.println("8. Algorithm Sorting");
    System.out.println("0. Exit");
    System.out.println("======================================");
    System.out.print("Enter a choice: ");
  }

  public static void displayAlgorithmExerciseMenu()
  {
    System.out.println("\n----- Basic Algorithm Exercise -------");
    System.out.println("1. First Exercise");
    System.out.println("2. Recursive Fibonacci Timer");
    System.out.println("3. Contain Common Items");
    System.out.println("4. Find Matching Pair with Sum");
    System.out.println("5. Reverse String By Iteration");
    System.out.println("6. Merge Two Sorted Arrays");
    System.out.println("7. Find the First Recurring Number");
    System.out.println("0. Go Back");
    System.out.println("--------------------------------------");
    System.out.print("Enter a choice: ");
  }

  public static void displayContainCommonItemsMenu()
  {
    System.out.println("\n----- Contain Common Items -----------");
    System.out.println("1. Contain Common Items By Naivety");
    System.out.println("2. Contain Common Items By Hash Set");
    System.out.println("3. Contain Common Items By Methods");
    System.out.println("0. Go Back");
    System.out.println("--------------------------------------");
    System.out.print("Enter a choice: ");
  }

  public static void displayFirstRecurringNumberMenu()
  {
    System.out.println("\n----- First Recurring Number ---------");
    System.out.println("1. Find the First Recurring Number");
    System.out.println("2. Find the First Recurring Number by For Loop");
    System.out.println("0. Go Back");
    System.out.println("--------------------------------------");
    System.out.print("Enter a choice: ");
  }

  public static void displayLinkedListMenu()
  {
    System.out.println("\n----- Build a Linked List ------------");
    System.out.println("1. Build a Linked List");
    System.out.println("2. Build a Doubly Linked List");
    System.out.println("0. Go Back");
    System.out.println("--------------------------------------");
    System.out.print("Enter a choice: ");
  }


  public static void displayStackQueueMenu()
  {
    System.out.println("\n----- Build a Stack and Queue --------");
    System.out.println("1. Build a Linked Stack");
    System.out.println("2. Build an Array Stack");
    System.out.println("3. Build a Linked Queue");
    System.out.println("4. Build an Array Queue");
    System.out.println("5. Build a Stack Queue");
    System.out.println("0. Go Back");
    System.out.println("--------------------------------------");
    System.out.print("Enter a choice: ");
  }

  public static void displayTreeMenu()
  {
    System.out.println("\n----- Build a Tree and Graph ---------");
    System.out.println("1. Build a Binary Search Tree");
    System.out.println("2. Build an AVL Tree");
    System.out.println("3. Build an Array Heap Tree");
    System.out.println("4. Build Graph");
    System.out.println("0. Go Back");
    System.out.println("--------------------------------------");
    System.out.print("Enter a choice: ");
  }  

  public static void displayRecursionMenu()
  {
    System.out.println("\n----- Algorithm Recursion ------------");
    System.out.println("1. Find Factorial By Recursion");
    System.out.println("2. Find Facotiral By Iteration");
    System.out.println("3. Find Fibonacci By Recursion");
    System.out.println("4. Find Fibonacci By Iteration");
    System.out.println("5. Reverse String By Recursion");
    System.out.println("0. Go Back");
    System.out.println("--------------------------------------");
    System.out.print("Enter a choice: ");
  }  

  public static void displaySortingMenu()
  {
    System.out.println("\n----- Algorithm Sorting --------------");
    System.out.println("1. Sort By Built-in Function");
    System.out.println("2. Sort By Bubble Sort");
    System.out.println("3. Sort By Selection Sort");
    System.out.println("0. Go Back");
    System.out.println("--------------------------------------");
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
   * Create a FindMatchingPair object and get the result and matching pair by calling 
   * its method.
   * time complexity of O(b) - linear
   * space complexity of O(a) - linear
   * @param array1 - the collection of numbers
   * @param sum - the target sum
   * @return A boolean indicating whether the array has the matching pair with the sum
   */
  public static boolean findMatchingPair(int [] array, int sum)
  {
    FindMatchingPair fmp = new FindMatchingPair(array, sum);

    if(fmp.findMatchingPair()) {
      System.out.println("Matching pair is " + fmp.getPair()[0] + 
                         " and " + fmp.getPair()[1]);
      return true;
    }
    return false;
  }

  public static void buildMyObjArray()
  {
    MyObjArray myArray = new MyObjArray();
    myArray.push("Hi, ");
    myArray.push("there! ");
    //myArray.delete(0);
    System.out.println(myArray.toString());
  }



  /**
   * Create a MergeSortedArrays object and get the merged array by its method.
   * time complexity of O(b) - linear
   * space complexity of O(a) - linear
   * @param array1 - the sorted array 1
   * @param array1 - the sorted array 2
   * @return A merged array.
   */
  public static int [] mergeSortedArray(int [] array1, int [] array2)
  {
    MergeSortedArrays msa = new MergeSortedArrays(array1, array2);

    return msa.getMergedArray();
  }

  public static void buildHashTable()
  {
    ArrayListHashTable myHashTable = new ArrayListHashTable(50);
    //MyHashTable myHashTable = new MyHashTable(50);

    myHashTable.set("grapes", 10000);
    myHashTable.set("apples", 58);
    myHashTable.set("oranges", 2);
    System.out.println("The amount of grapes is " + myHashTable.get("grapes"));
    System.out.println("The amount of apples is " + myHashTable.get("apples"));
    System.out.println("The amount of oranges is " + myHashTable.get("oranges"));


    ArrayList<String> strList = myHashTable.getKeys();
    for (int i = 0; i < strList.size(); i++) {
      System.out.println(i + ": " + strList.get(i).toString());
    }
  }

  /**
   * Create a MyArrayListHashTable object and get the first recurring number of 
   * an integer array..
   * time complexity of O(n) - linear
   * space complexity of O(n) - linear
   * @param array1 - the integer array
   * @return the first recurring number
   */
  public static int findFirstRecurringNumber(int [] array)
  {
    ArrayListHashTable myHashTable = new ArrayListHashTable(array.length);

    for (int i = 0; i < array.length; i++) {
      if (myHashTable.get(Integer.toString(array[i])) == 0) {
        myHashTable.set(Integer.toString(array[i]), 1);
      } else {
        return array[i];
      }	
    }

    return 0;
  }	

  /**
   * Fnd the first recurring number of an integer array by looking through the
   * array.
   * time complexity of O(n^2) - exponential
   * space complexity of O(n) - constant
   * @param array1 - the integer array
   * @return the first recurring number
   */
  public static int findFirstRecurringNumberByLoop(int [] array)
  {
    int idx = 0;
    int minIdx = array.length;
    int [] found = new int[array.length];

    for (int i = 0; i < array.length ; i++) {
      for (int j = i + 1; j < array.length; j++) {
        if (array[i] == array[j]) {
          // Assign found array with the first index of the recurring number.
          found[i] = j;
          break;
        }
      }
    }

    // Find the minimun index of the recurring number 
    // that will be the first recurring number.
    for (int i = 0; i < array.length; i++) {
      if (found[i] > 0 && minIdx > found[i]) {
        minIdx = found[i];
        idx = i;
      }
    }
    return array[idx];
  }	

  public static void buildLinkedList()
  {
    System.out.print("LinkedList():\t");
    LinkedList myLL = new LinkedList();
    System.out.println(Arrays.toString(myLL.getList()));

    System.out.print("append(10):\t");
    myLL.append(10);
    System.out.println(Arrays.toString(myLL.getList()));

    System.out.print("append(5):\t");
    myLL.append(5);
    System.out.println(Arrays.toString(myLL.getList()));

    System.out.print("append(16):\t");
    myLL.append(16);
    System.out.println(Arrays.toString(myLL.getList()));

    System.out.print("prepend(1):\t");
    myLL.prepend(1);
    System.out.println(Arrays.toString(myLL.getList()));

    System.out.print("insert(2, 99):\t");    
    myLL.insert(2, 99);
    System.out.println(Arrays.toString(myLL.getList()));

    System.out.print("remove(0):\t");    
    myLL.remove(0);
    System.out.println(Arrays.toString(myLL.getList()));
    myLL.remove(3);

    System.out.print("remove(3):\t");    
    System.out.println(Arrays.toString(myLL.getList())); 
  }

  public static void buildDoublyLinkedList()
  {
    System.out.print("DLinkedList():");
    DLinkedList myDLL = new DLinkedList();
    System.out.println(Arrays.toString(myDLL.getListBackward()));

    System.out.println("append(10):");
    myDLL.append(10);
    System.out.println(Arrays.toString(myDLL.getList()));
    System.out.println(Arrays.toString(myDLL.getListBackward()));

    System.out.println("append(5):");
    myDLL.append(5);
    System.out.println(Arrays.toString(myDLL.getList()));
    System.out.println(Arrays.toString(myDLL.getListBackward()));

    System.out.println("append(16):");
    myDLL.append(16);
    System.out.println(Arrays.toString(myDLL.getList()));
    System.out.println("" + Arrays.toString(myDLL.getListBackward()));

    System.out.println("prepend(1):");
    myDLL.prepend(1);
    System.out.println(Arrays.toString(myDLL.getList()));
    System.out.println(Arrays.toString(myDLL.getListBackward()));

    System.out.println("insert(2, 99):");    
    myDLL.insert(2, 99);
    System.out.println(Arrays.toString(myDLL.getList()));
    System.out.println(Arrays.toString(myDLL.getListBackward()));

    System.out.println("remove(0):");    
    myDLL.remove(0);
    System.out.println(Arrays.toString(myDLL.getList()));
    System.out.println(Arrays.toString(myDLL.getListBackward()));

    System.out.println("remove(3):");    
    myDLL.remove(3);    
    System.out.println(Arrays.toString(myDLL.getList()));
    System.out.println(Arrays.toString(myDLL.getListBackward()));
  }

  public static void buildLinkedStack()
  {
    LinkedStack myStack = new LinkedStack();
    System.out.println("push(\"Google\")");
    myStack.push("Google");

    System.out.println("push(\"Udemy\")");
    myStack.push("Udemy");

    System.out.println("push(\"Discord\")");
    myStack.push("Discord");


    try {
      System.out.print("peek():\t");
      System.out.println(myStack.peek());

      System.out.print("pop():\t");
      System.out.println(myStack.pop());

      System.out.print("peek():\t");
      System.out.println(myStack.peek());

      System.out.print("pop():\t");
      System.out.println(myStack.pop());

      System.out.print("peek():\t");
      System.out.println(myStack.peek());

      System.out.print("pop():\t");
      System.out.println(myStack.pop());

      System.out.print("pop():\t");
      System.out.println(myStack.pop());

    } catch (Exception e) {
      System.out.println("Error! The Stack is empty.");
    }    	
  }

  public static void buildArrayStack()
  {
    ArrayStack myStack = new ArrayStack(3);

    try {	
      System.out.println("push(\"Google\")");
      myStack.push("Google");

      System.out.println("push(\"Udemy\")");
      myStack.push("Udemy");

      System.out.println("push(\"Discord\")");
      myStack.push("Discord");

      System.out.print("peek():\t");
      System.out.println(myStack.peek());

      System.out.print("pop():\t");
      System.out.println(myStack.pop());

      System.out.print("peek():\t");
      System.out.println(myStack.peek());

      System.out.print("pop():\t");
      System.out.println(myStack.pop());

      System.out.print("peek():\t");
      System.out.println(myStack.peek());

      System.out.print("pop():\t");
      System.out.println(myStack.pop());

      System.out.println("push(\"Google\")");
      myStack.push("Google");

      System.out.println("push(\"Udemy\")");
      myStack.push("Udemy");

      System.out.println("push(\"Discord\")");
      myStack.push("Discord");

      System.out.println("push(\"LinkedIn\")");
      myStack.push("LinkedIn");

    } catch (Exception e) {
      System.out.println(e.getMessage());
    }    	
  }

  public static void buildLinkedQueue()
  {
    LinkedQueue myQueue = new LinkedQueue();
    System.out.println("enqueue(\"Google\")");
    myQueue.enqueue("Google");

    System.out.println("enqueue(\"Udemy\")");
    myQueue.enqueue("Udemy");

    System.out.println("enqueue(\"Discord\")");
    myQueue.enqueue("Discord");


    try {
      System.out.print("peek():\t\t");
      System.out.println(myQueue.peek());

      System.out.print("dequeue():\t");
      System.out.println(myQueue.dequeue());

      System.out.print("peek():\t\t");
      System.out.println(myQueue.peek());

      System.out.print("dequeue():\t");
      System.out.println(myQueue.dequeue());

      System.out.print("peek():\t\t");
      System.out.println(myQueue.peek());

      System.out.print("dequeue():\t");
      System.out.println(myQueue.dequeue());

      System.out.print("dequeue():\t");
      System.out.println(myQueue.dequeue());

    } catch (Exception e) {
      System.out.println("Error! The Queue is empty.");
    }    	
  }

  public static void buildArrayQueue()
  {
    ArrayQueue myQueue = new ArrayQueue(3);

    try {	
      System.out.println("enqueue(\"Google\")");
      myQueue.enqueue("Google");

      System.out.println("enqueue(\"Udemy\")");
      myQueue.enqueue("Udemy");

      System.out.println("enqueue(\"Discord\")");
      myQueue.enqueue("Discord");

      System.out.print("peek():\t\t");
      System.out.println(myQueue.peek());

      System.out.print("dequeue():\t");
      System.out.println(myQueue.dequeue());

      System.out.print("peek():\t\t");
      System.out.println(myQueue.peek());

      System.out.print("dequeue():\t");
      System.out.println(myQueue.dequeue());

      System.out.print("peek():\t\t");
      System.out.println(myQueue.peek());

      System.out.print("dequeue():\t");
      System.out.println(myQueue.dequeue());

      System.out.println("enqueue(\"Google\")");
      myQueue.enqueue("Google");

      System.out.println("enqueue(\"Udemy\")");
      myQueue.enqueue("Udemy");

      System.out.println("enqueue(\"Discord\")");
      myQueue.enqueue("Discord");

      System.out.println("enqueue(\"LinkedIn\")");
      myQueue.enqueue("LinkedIn");

    } catch (Exception e) {
      System.out.println(e.getMessage());
    }    	
  }

  public static void buildStackQueue()
  {
    StackQueue myQueue = new StackQueue(3);

    try {	
      System.out.print("dequeue():\t");
      System.out.println(myQueue.dequeue());


      System.out.println("enqueue(\"Google\")");
      myQueue.enqueue("Google");

      System.out.println("enqueue(\"Udemy\")");
      myQueue.enqueue("Udemy");

      System.out.println("enqueue(\"Discord\")");
      myQueue.enqueue("Discord");

      System.out.print("peek():\t\t");
      System.out.println(myQueue.peek());

      System.out.print("dequeue():\t");
      System.out.println(myQueue.dequeue());

      System.out.print("peek():\t\t");
      System.out.println(myQueue.peek());

      System.out.print("dequeue():\t");
      System.out.println(myQueue.dequeue());

      System.out.print("peek():\t\t");
      System.out.println(myQueue.peek());

      System.out.print("dequeue():\t");
      System.out.println(myQueue.dequeue());

      System.out.println("enqueue(\"Google\")");
      myQueue.enqueue("Google");

      System.out.println("enqueue(\"Udemy\")");
      myQueue.enqueue("Udemy");

      System.out.println("enqueue(\"Discord\")");
      myQueue.enqueue("Discord");

      System.out.println("enqueue(\"LinkedIn\")");
      myQueue.enqueue("LinkedIn");

    } catch (Exception e) {
      System.out.println(e.getMessage());
    }    	
  }

  public static void buildBinarySearchTree()
  {
    BinarySearchTree myTree = new BinarySearchTree();

    /*
    System.out.println("insert(9), (4), (6), (20), (170), (15), (1)");

    myTree.insert(9);
    myTree.insert(4);
    myTree.insert(6);
    myTree.insert(20);
    myTree.insert(170);
    myTree.insert(15);
    myTree.insert(1);

    System.out.println("Inorder traversal of the binary search tree:");
    myTree.printTree();
    System.out.println("");

    System.out.println("lookup(1): " + myTree.lookup(1));
    System.out.println("lookup(2): " + myTree.lookup(2));
    */

    //                     60
    //         30                   72
    //    14        54         71        74
    // 1        38      55            73
    //       36    44
    myTree.insert(60);
    myTree.insert(30);
    myTree.insert(72);
    myTree.insert(14);
    myTree.insert(54);
    myTree.insert(71);
    myTree.insert(74);
    myTree.insert(1);
    myTree.insert(38);
    myTree.insert(55);
    myTree.insert(73);
    myTree.insert(36);
    myTree.insert(44);

    System.out.println("The binary search tree:");
    myTree.printTree();
    System.out.println("");

    System.out.println("remove(60): ");
    myTree.remove(60);
    //myTree.remove(30);
    //myTree.remove(72);
    System.out.println("The binary search tree:");
    myTree.printTree();
    System.out.println("");

    String title = "Graphical Display of Binary Tree";		
    JFrame bFrame = new JFrame(title);                  
    bFrame.add(myTree.getView());
    bFrame.pack();
    bFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    bFrame.setVisible(true);

  }  

  public static void buildAVLTree()
  {
    AVLTree myTree = new AVLTree();

    /*
    //                   50
    //            40            60
    //       30              55       70
    //  20              
    // LL imbalance =>
    //                   50
    //            30            60
    //       20       40     55       70
    System.out.println("insert(50), (40), (60), (30), (55), (70), (20)");
    myTree.add(50);
    myTree.add(40);
    myTree.add(60);
    myTree.add(30);
    myTree.add(55);
    myTree.add(70);
    myTree.add(20);
    */

    //                   40
    //            20            45
    //       10        30
    //              25              
    // LR imbalance =>
    //                   30
    //            20            40
    //       10        25             45

    System.out.println("insert(40), (20), (45), (10), (30), (25)");
    myTree.add(40);
    myTree.add(20);
    myTree.add(45);
    myTree.add(10);
    myTree.add(30);
    myTree.add(25);

    String title = "Graphical Display of AVL Tree";		
    JFrame bFrame = new JFrame(title);                  
    bFrame.add(myTree.getView());
    bFrame.pack();
    bFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    bFrame.setVisible(true);

  }    

  public static void buildArrayHeapTree()
  {
    // Create and display an array of random integers
    Random randy = new Random();
    int [ ] array = new int[10];

    System.out.println("Here is the array to be sorted:");
    for (int i = 0; i < array.length; i++) {
      array[i] = randy.nextInt(100);   
        System.out.print(array[i] + "  ");
    }

    // Create a heap of integers and use it to sort the array
    ArrayHeapTree myHeap = new ArrayHeapTree();       
    for (int x : array) {
      myHeap.add(x);
    }

    for (int i = 0; i < array.length; i++) {
      array[i] = myHeap.removeMin();
    }

    // Print the array
    System.out.println("\nHere is the sorted array:");
    for (int x : array) {
      System.out.print(x + "  ");       
    }
    System.out.println("");
  }

  public static void buildGraph()
  {

     MapGraph myGraph = new MapGraph();

    //   3 --- 4 --- 5
    //   |     |     |
    //   |     |     |
    //   1 --- 2     6
    //    \   /
    //     \ /
    //      0

     System.out.println("addNode(0), (1), (2), (3), (4), (5), (6)");
     myGraph.addNode("0");
     myGraph.addNode("1");
     myGraph.addNode("2");
     myGraph.addNode("3");
     myGraph.addNode("4");
     myGraph.addNode("5");
     myGraph.addNode("6");
     System.out.println("addEdge(3, 1), (3, 4), (4, 2), (4, 5)");
     System.out.println("addEdge(1, 2), (1, 0), (0, 2), (6, 5)");
     myGraph.addEdge("3", "1");
     myGraph.addEdge("3", "4");
     myGraph.addEdge("4", "2");
     myGraph.addEdge("4", "5");
     myGraph.addEdge("1", "2");
     myGraph.addEdge("1", "0");
     myGraph.addEdge("0", "2");
     myGraph.addEdge("6", "5");

     System.out.println("The graph:");
     myGraph.showConnections();
  }

  public static void sortByBuiltinFunction()
  {
    String [] stringArray = {"Blue", "Humpback", "Belugo"};
    int [] numberArray = {40, 1, 5, 200};
    String [] numericStringArray = {"80", "9", "700"};

    System.out.print("stringArray = ");
    for (String str: stringArray) {
      System.out.print(str + " ");
    }  	
    System.out.println("");

    Arrays.sort(stringArray);
    System.out.print("sort(stringArray) = ");
    for (String str: stringArray) {
      System.out.print(str + " ");
    }
    System.out.println("");

    System.out.print("numberArray = ");
    for (int num: numberArray) {
      System.out.print(num + " ");
    }
    System.out.println("");

    Arrays.sort(numberArray);
    System.out.print("sort(numberArray) = ");
    for (int num: numberArray) {
      System.out.print(num + " ");
    }
    System.out.println("");


    System.out.print("numericStringArray = ");
    for (String str: numericStringArray) {
      System.out.print(str + " ");
    }
    System.out.println("");

    Arrays.sort(numericStringArray);
    System.out.print("sort(numericStringArray) without compare = ");
    for (String str: numericStringArray) {
      System.out.print(str + " ");
    }
    System.out.println("");

    System.out.println("sort(numericStringArray) with NaturalOrderComparator:");
    List<String> orig = Arrays.asList(numericStringArray);

    System.out.println("Original = " + orig);

    // This file uses unchecked or unsafe operations.
    //Collections.sort(orig, new NaturalOrderComparator());

    System.out.println("Sorted =   " + orig + " (Must unmark unsafe code)");
  }

  public static void sortByBubbleSort()
  {
    int [] number = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};

    System.out.print("Original number array =   ");

    for (int num: number) {
      System.out.print(num + " ");
    }
    System.out.println("");

    BubbleSort.sort(number);
    System.out.print("BubbleSort.sort(number) = ");
    for (int num: number) {
      System.out.print(num + " ");
    }
    System.out.println("");
  }

  public static void sortBySelectionSort()
  {
    int [] number = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0, 7};

    System.out.print("Original number array =      ");

    for (int num: number) {
      System.out.print(num + " ");
    }
    System.out.println("");

    SelectionSort.sort(number);
    System.out.print("SelectionSort.sort(number) = ");
    for (int num: number) {
      System.out.print(num + " ");
    }
    System.out.println("");
  }
}