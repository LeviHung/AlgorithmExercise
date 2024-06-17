package algorithm;

/**
 * ReverseString class.
 */
public class ReverseString {
  /**
   * The reverse function
   * time complexity of O(b) - linear
   * space complexity of O(a) - linear
   * @param str - the user string
   * @return A reverse string
   */
  public static String reverse(String str)
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
  public static String reverseString(String string) 
  {
    String result = "";
    final int length = string.length();
    for (int i = length - 1; i >= 0; i--) {
      result += string.charAt(i);
    }
    return result;
  }

  public static String reverseStringWithReelJava(String string) 
  {
    return new StringBuilder(string).reverse().toString();
  }

  public static String recursiveReversal (String str) 
  {
    if (str.length() == 0)  //breakpoint for recursion
       return "";
    return recursiveReversal(str.substring(1)) + str.charAt(0);
  }
}
