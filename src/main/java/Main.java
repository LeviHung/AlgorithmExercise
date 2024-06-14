// Levi Hung
// 06/04/24
// Algorithm in Udemy course

import java.util.Scanner;
import java.util.Objects;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

// FUNCTION 1:
// What is the Big O of the below function? 
// (Hint, you may want to go line by line)
// ANS: It depends on anotherFunction function. If there is not a function
// in the funChallege, the big O will be O(n);

// FUNCTION 2:
// Check the executive time for the Recursive Fibonacci method. 

// FUNCTION 3:
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

// FUNCTION 4:
/* Given a collection of numbers and find a matching pair that is equal to
  a sum.
  For example:
  [1, 2, 3, 9], sum = 8, 
  should return false.
  ----------------------
  [1, 2, 4, 4], sum = 8,
  should return true, the matching pair is 4 and 4.
*/

// FUNCTION 5:
/* Design a array class that can store objects and 
 * has the methods related to array operations.
   For exampe:
   thisArray.push("Hi,"),
   thisArray.push("there"),
   thismyArray should show "Hi, there"
*/

// FUNCTION 6:
/* Given a string and reverse the string to return it.
   For example:
   str = "Hi, I am Levi Hung."
   The function should return a string ".gnuH iveL ma I ,iH"
*/

//FUNCTION 7:
/* Given two sorted arrays consisting of integer numbers and 
 * merge them to return an array.
  For example:
  array1 = [0, 3, 4, 31]
  array2 = [4, 6, 30]
  The function should return [0, 3, 4, 6, 30, 31].
*/

//FUNCTION 8:
// Design a hash table class that can store keys and values.
// it also has some methods related to hash table operations.
// For exampe:
// thisHashTable.set("grapes", 10000),
// thisHashTable.set("apples", 54),
// thisHashTable.set("oranges", 2),
// thisHashTable.get("oranges") should return 10000, 
// thisHashTable.keys() should return an array with "grapes", "apples", and "oranges"

//FUNCTION 9:
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

// FUNCTION 9-2:
// Find the first recurring number by looping through the array
// and fix the problem. 
// For example:
// Given an array = [2, 5, 5, 2, 3, 5, 1, 2, 4]:
// It should return 5, but looping through will return 2.

// FUNCTION 10:
// Design a linked list class that can store integers.
// For example:
// 10 -> 5 -> 16 -> null

// FUNCTION 10-2:
// Design a doubly linked list class.
// null <- 10 <-> 5 <-> 16 -> null

// FUNCTION 11:
// Design a stack and queue class that can pop/push, enqueue/dequeue, and peek.
// For example:
// push("Google")
// push("Udemy")
// push(Discord")
// peek(), it should return "Discord".
// pop() and peek(), it should return "Udemy".

// FUNCTION 12:
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


public class Main {
  private static Object [] usrArray = {'a', 4, "asdf", '7', 'r', null};
  private static Object [] cmpArray = {'z', 3, new String("asd"), null, 'x'};
  private static int [] colArray = {1, 2, 3, 4, 4, 5};
  private static int targetSum = 8;
  private static String usrString = "Hi, I am Levi Hung.";
  private static int [] usrSortedArray2 = {0, 3, 4, 31};
  private static int [] usrSortedArray1 = {4, 6, 30};
  private static int [] usrIntegerArray1 = {2, 5, 1, 2, 3, 5, 1, 2, 4};
  private static int [] usrIntegerArray2 = {2, 1, 1, 2, 3, 5, 1, 2, 4};
  private static int [] usrIntegerArray3 = {2, 3, 4, 5};
  private static int [] usrIntegerArray4 = {2, 1, 5, 4, 2, 5, 1, 2, 4};
  private static int [] usrIntegerArray5 = {2, 5, 5, 2, 3, 5, 1, 2, 4};
  private static int [] usrIntegerArray6 = {2, 5, 4, 4, 5, 2, 1, 2, 4};

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
          firstExercise();
          break;
        case 2:
          RecursiveFibonacciTimer();
          break;
        case 3:
          do {
            displayContainCommonItemsMenu();
            subKey = keyboard.nextInt();
            keyboard.nextLine();
            System.out.println("The user array is " + 
                Arrays.toString(usrArray));
            System.out.println("The comp array is " + 
                Arrays.toString(cmpArray));
            switch (subKey) {
              case 1:
                result = containCommonItemsByNaivety(usrArray, cmpArray);
                System.out.println("The result is " + result);
                break;
              case 2:
                result = containCommonItemsByHashSet(usrArray, cmpArray);
                System.out.println("The result is " + result);
                break;
              case 3:
                result = containCommonItemsByMethods(usrArray, cmpArray);
                System.out.println("The result is " + result);
                break;
              default:
                if (subKey != 0) {
                  System.out.println("Invalid Input!");
                }
                break;
            } 
          }while (subKey != 0);
          break;
        case 4:
          System.out.println("The integer array is " + 
                              Arrays.toString(colArray));
          System.out.println("The sum is " + targetSum);
          result = findMatchingPair(colArray, targetSum);
          System.out.println("The result is " + result);
          break;
        case 5:
          buildMyObjArray();
          break;
        case 6:
          String revString = reverseString(usrString);
          System.out.println("The user string is    " + usrString);
          System.out.println("The reverse string is " + revString);
          break;
        case 7:
          int [] mergeArray = mergeSortedArray(usrSortedArray1, usrSortedArray2);
          System.out.println("The merge array is");
          for (int i = 0; i < mergeArray.length; i++)
            System.out.println(i + ": " + mergeArray[i]);
          break;
        case 8:
          buildHashTable();
          break;
        case 9:
          do {
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

        case 10:
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

        case 11:
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
        case 12:
          do {
            displayTreeMenu();
            subKey = keyboard.nextInt();
            keyboard.nextLine();
            switch (subKey) {
              case 1:
                buildBinarySearchTree();;
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
    System.out.println("\n======================================");
    System.out.println("1. First Algorthm Exercise");
    System.out.println("2. Recursive Fibonacci Timer");
    System.out.println("3. Contain Common Items");
    System.out.println("4. Find Matching Pair with Sum");
    System.out.println("5. Build a Object Array");
    System.out.println("6. Reverse String");
    System.out.println("7. Merge Two Sorted Arrays");
    System.out.println("8. Build a Hash Table");
    System.out.println("9. Find the First Recurring Number");
    System.out.println("10. Build a Linked List");
    System.out.println("11. Build a Stack and Queue");
    System.out.println("12. Build a tree");
    System.out.println("0. Exit");
    System.out.println("======================================");
    System.out.print("Enter a choice: ");
  }

  public static void displayContainCommonItemsMenu()
  {
    System.out.println("\n--------------------------------------");
    System.out.println("1. Contain Common Items By Naivety");
    System.out.println("2. Contain Common Items By Hash Set");
    System.out.println("3. Contain Common Items By Methods");
    System.out.println("0. Exit");
    System.out.println("--------------------------------------");
    System.out.print("Enter a choice: ");
  }

  public static void displayFirstRecurringNumberMenu()
  {
    System.out.println("\n--------------------------------------");
    System.out.println("1. Find the First Recurring Number");
    System.out.println("2. Find the First Recurring Number by For Loop");
    System.out.println("0. Exit");
    System.out.println("--------------------------------------");
    System.out.print("Enter a choice: ");
  }

  public static void displayLinkedListMenu()
  {
    System.out.println("\n--------------------------------------");
    System.out.println("1. Build a Linked List");
    System.out.println("2. Build a Doubly Linked List");
    System.out.println("0. Exit");
    System.out.println("--------------------------------------");
    System.out.print("Enter a choice: ");
  }


  public static void displayStackQueueMenu()
  {
    System.out.println("\n--------------------------------------");
    System.out.println("1. Build a Linked Stack");
    System.out.println("2. Build a Array Stack");
    System.out.println("3. Build a Linked Queue");
    System.out.println("4. Build a Array Queue");
    System.out.println("5. Build a Stack Queue");
    System.out.println("0. Exit");
    System.out.println("--------------------------------------");
    System.out.print("Enter a choice: ");
  }

  public static void displayTreeMenu()
  {
    System.out.println("\n--------------------------------------");
    System.out.println("1. Build a Binary Search Tree");
    System.out.println("0. Exit");
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
   * The reverseString function
   * time complexity of O(b) - linear
   * space complexity of O(a) - linear
   * @param str - the user string
   * @return A reverse string
   */
  public static String reverseString(String str)
  {
    if (str == null || !(str instanceof String)) {
      System.out.println("The string is null or it is not a string type");
      return null;
    }

    char [] revStrArray = new char[str.length()];
    int idxItems = str.length() - 1;
    for (int i = idxItems, j = 0; i >= 0; i--, j++) {
      revStrArray[j] = str.charAt(i);
    }

    StringBuilder revStr = new StringBuilder();
    revStr.append(revStrArray); 
    return revStr.toString();
  }

  /**
   * Other functions for reversing string from nimrod46 on GitHub.
   */
  public static String ReverseString(String string) 
  {
    String result = "";
    final int length = string.length();
    for (int i = length - 1; i >= 0; i--) {
      result += string.charAt(i);
    }
    return result;
  }

  public static String ReverseStringWithReelJava(String string) 
  {
    return new StringBuilder(string).reverse().toString();
  }

  public static String recursiveReversal (String str) 
  {
    if (str.length() == 0)  //breakpoint for recursion
       return "";
    return recursiveReversal(str.substring(1)) + str.charAt(0);
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
    MyArrayListHashTable myHashTable = new MyArrayListHashTable(50);
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
    MyArrayListHashTable myHashTable = new MyArrayListHashTable(array.length);

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


  }  
}