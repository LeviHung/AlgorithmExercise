// Levi Hung
// 06/04/24
// Algorthim in Udemy course

// What is the Big O of the below function? 
// (Hint, you may want to go line by line)
// ANS: It depends on anotherFunction function. If there is not a function
// in the funChallege, the big O will be O(n);

public class Main {
  public static void main(String[] args) {
    System.out.println("First Algorithm Exercise!");
    int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    int result = funChallenge(array);
    System.out.print("result = " + result);
  }

  public static int funChallenge(int [] input)
  {
    int a = 10;
    a = 50 + 3;

    for (int i = 0; i < input.length; i++)
    {
      // call another Function
      // anothorFunction();
      boolean stranger = true;
      a ++;
    }
    return a;
  }
}
