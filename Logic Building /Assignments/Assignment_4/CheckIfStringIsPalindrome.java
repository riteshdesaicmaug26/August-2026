import java.util.Scanner;

public class CheckIfStringIsPalindrome {

  public static void main(String[] args) {
  
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a string: ");
    String str = sc.nextLine();

    str = str.toLowerCase();

    str = str.replaceAll("[^a-z0-9]", "");

    String reverse = "";
    
    for(int i = str.length() - 1; i >= 0; i--) {
      reverse = reverse + str.charAt(i);
    }

    
    if(str.equals(reverse)) {
      System.out.println("The string '" + str + "' is a palindrome.");
    }
    else {
      System.out.println("The string " + str + " is not a palindrome.");
    }
  
  }
}