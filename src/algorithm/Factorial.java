package algorithm;

public class Factorial {

  public static int findFactorial(int number)
  {
    if (number <= 1) {
      return 1;
    }

    return number * findFactorial(number - 1);
  }

  public static int findFactorialByIteration(int number)
  {
    int value = 1;

    for (int i = 2; i <= number; i++) {
      value *= i;
    }
    return value;
  }
}
